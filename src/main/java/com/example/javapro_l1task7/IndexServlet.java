package com.example.javapro_l1task7;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/result")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String club = request.getParameter("club");
        int salary = Integer.parseInt(request.getParameter("price"));
        int transferPrice = Integer.parseInt(request.getParameter("transferPrice"));

        Footballer footballer = new Footballer(DBManager.getIndex(),name,surname,salary,club,transferPrice);
        DBManager.addFootballer(footballer);

        response.sendRedirect("/");

    }
}
