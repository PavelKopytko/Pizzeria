package by.it_academy.jd2.Mk_JD2_92_22.pizza.controllers.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto.MenuRowDTO;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api.IMenuRowService;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api.ServiceFactory;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ApiMenuRowServlet", urlPatterns = "/api/menu-row")
public class ApiMenuRowServlet extends HttpServlet {


    private IMenuRowService service;
    private final ObjectMapper mapper;

    public ApiMenuRowServlet() {
        this.service = ServiceFactory.getInstance().getMenuRowService();
        this.mapper = new ObjectMapper();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        List<IMenuRow> menuRows = service.get();

        PrintWriter writer = resp.getWriter();
        writer.write(this.mapper.writeValueAsString(menuRows));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        List<IMenuRow> menuRows = service.get();

        MenuRowDTO menuRowDTO = this.mapper.readValue(req.getInputStream(), MenuRowDTO.class);


        this.service.save(menuRowDTO);

        resp.setStatus(201);


    }

}
