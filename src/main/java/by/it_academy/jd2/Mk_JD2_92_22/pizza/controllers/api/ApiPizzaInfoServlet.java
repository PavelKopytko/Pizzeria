package by.it_academy.jd2.Mk_JD2_92_22.pizza.controllers.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto.PizzaInfoDTO;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api.IPizzaInfoService;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api.ServiceFactory;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ApiPizzaInfoServlet", urlPatterns = "/api/pizza-info")
public class ApiPizzaInfoServlet extends HttpServlet {


    private IPizzaInfoService service;
    private final ObjectMapper mapper;

    public ApiPizzaInfoServlet() {
        this.service = ServiceFactory.getInstance().getPizzaInfoService();
        this.mapper = new ObjectMapper();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        List<IPizzaInfo> pizzaInfos = service.get();

        PrintWriter writer = resp.getWriter();
        writer.write(this.mapper.writeValueAsString(pizzaInfos));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
       resp.setContentType("text/html; charset=UTF-8");

       List<IPizzaInfo> pizzaInfos = service.get();

       PizzaInfoDTO createDTO = this.mapper.readValue(req.getInputStream(), PizzaInfoDTO.class);


       this.service.save(createDTO);

       resp.setStatus(201);


    }

}
