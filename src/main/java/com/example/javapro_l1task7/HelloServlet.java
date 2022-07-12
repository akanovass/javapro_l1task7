package com.example.javapro_l1task7;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" " +
                "integrity=\"sh" + "a384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body style='background-color:#e6e6e6'>");
        out.println("<div class='container'>");
        out.println("<div class='row nt-3 mt-3'>");
        out.println("<div class='col-6' style='border: 1px #d1d1d1 solid; border-radius:7px; padding-top:10px; background-color:white;'>");
        out.println("<form action='/result' method='get'>");
        out.println("<table class=\"table table-borderless\">");
        out.println("<tr>");
        out.println("<td>NAME:</td>");
        out.println("<td><input type='text' name='user_name' placeholder='Insert name' style='width:388px;'></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>SURNAME:</td>");
        out.println("<td><input type='text' name='user_surname' placeholder='Insert surname' style='width:388px;'></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<tr>");
        out.println("<td>CLUB:</td>");
        out.println("<td><select name='club' style='width:388px;'><option>Real Madrid CF</option><option>Barselona FC</option><option>Liverpool FC</option> </select></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>SALARY:</td>");
        out.println("<td><input type='text' name='price' placeholder='Insert price' style='width:388px;'></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>TRANSFER PRICE:</td>");
        out.println("<td><input type='text' name='transferPrice' placeholder='Insert transfer price' style='width:388px;'></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td></td>");
        out.println("<td style='text-align:right;'><button style='border:1px solid blue; background-color:blue; color:white;'>ADD FOOTBALLER</button></td>");
        out.println("</table>");
        out.println("</form>");
        out.println("</div></div>");

        out.println("<div class='row nt-3 mt-3'>");
        out.println("<div class='col-4 ' style='border: 1px #d1d1d1 solid; border-radius:7px; padding-top:10px; background-color:white;'>");

        ArrayList<Footballer> footballers = DBManager.getAllFootballers();
        for( Footballer f : footballers){
            out.println("<h2 style='color:green;'>" +f.getName() + " " + f.getSurname() + "</h2>");
            out.println("<h4 style='color:blue;'>" + "Club: " + f.getClub() + "</h4>");
            out.println("<h4 style='color:red;'>" + "Salary: " + f.getSalary() + " EUR" + "</h4>");
            out.println("<h4 style='color:red;'>" + "Transfer price: " +f.getTransferPrice() + " EUR" + "</h4><br><br>");
        }
        out.println("</div></div>");
        out.println("</div>");
        out.println("</body></html>");
    }
}