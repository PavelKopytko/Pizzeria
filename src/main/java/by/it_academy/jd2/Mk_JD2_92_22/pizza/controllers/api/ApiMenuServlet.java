package by.it_academy.jd2.Mk_JD2_92_22.pizza.controllers.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto.MenuDTO;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api.IMenuService;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api.ServiceFactory;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenu;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ApiMenuServlet", urlPatterns = "/api/menu")
public class ApiMenuServlet extends HttpServlet {


    private IMenuService service;
    private final ObjectMapper mapper;

    public ApiMenuServlet() {
        this.service = ServiceFactory.getInstance().getMenuService();
        this.mapper = new ObjectMapper();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        List<IMenu> menus = service.getMenu();

        PrintWriter writer = resp.getWriter();
        writer.write(this.mapper.writeValueAsString(menus));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        List<IMenu> menus = service.getMenu();

        MenuDTO menuDTO = this.mapper.readValue(req.getInputStream(), MenuDTO.class);


        this.service.save(menuDTO);

        resp.setStatus(201);


    }

}
