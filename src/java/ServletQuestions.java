/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ServletQuestions extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             out.println("<%-- \n" +
"    Document   : result\n" +
"    Created on : 05.06.2022, 11:07:09\n" +
"    Author     : Admin\n" +
"--%>\n" +
"\n" +
"<%@page contentType=\"text/html\" pageEncoding=\"UTF-8\"%>\n" +
"<!DOCTYPE html>\n" +
"<html lang=\"ru\">\n" +
"    <head>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"initial-scale=1.0, width=device-width\">\n" +
"        <title>Kursach</title>\n" +
"        <link rel=\"stylesheet\" type= \"text/css\" href=\"css/style.css\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class=\"first_block\">\n" +
"            <div class=\"bg_gradient blur\">\n" +
"                <div class=\"container\">\n" +
"                    <div class=\"space\"></div>\n" +
"                    <h1 class=\"placeName\"></h1>\n" +
"                    <img class=\"placeImg\" id=\"placeImg\" src=\"\" alt=\"\" >\n" +
"                    <h2 class=\"placeDiscription\"></h2>\n" +
"                    <div class=\"space\"></div>\n" +
"                    <h2 class=\"placeAdress\"></h2>\n" +
"                    \n" +
"                    <a href=\"index.jsp\" class=\"btn again\">Пройти еще раз</a>\n" +
"                </div>\n" +
"                \n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <script src=\"JSON\\places.json\"></script>\n" +
"        <script>\n" +
"            window.onload = function () {\n" +
"    ans = sessionStorage.getItem('answers');\n" +
"    res = {}\n" +
"    var maxId = 0;\n" +
"    maxNum = 0;\n" +
"    for (let i = 0; i < ans.length; i++) {\n" +
"        if (res[ans[i]] != undefined && ans[i] != ',') {\n" +
"            res[ans[i]]++;\n" +
"            if (res[ans[i]] > maxNum) {\n" +
"                maxNum = res[ans[i]];\n" +
"                maxId = ans[i];\n" +
"            }\n" +
"        } else {\n" +
"            res[ans[i]] = 1;\n" +
"        }\n" +
"\n" +
"    }\n" +
"    console.log(ans);\n" +
"    console.log(res);\n" +
"\n" +
"    fetch('JSON/places.json')\n" +
"        .then(response => response.json())\n" +
"        .then(function (places) {\n" +
"            const random = (min, max) => Math.floor(Math.random() * (max - min)) + min;\n" +
"            var cat = \"comfy\";\n" +
"            switch (Number(maxId)) {\n" +
"                case 0:\n" +
"                    cat = \"comfy\";\n" +
"                    break;\n" +
"                case 1:\n" +
"                    cat = \"active\";\n" +
"                    break;\n" +
"                case 2:\n" +
"                    cat = \"regular\";\n" +
"                    break;\n" +
"                case 3:\n" +
"                    cat = \"unique\";\n" +
"                    break;\n" +
"                default:\n" +
"                    cat = \"def\";\n" +
"                    break;\n" +
"            }\n" +
"            console.log(maxId);\n" +
"            console.log(cat);\n" +
"            var pos = random(0,places[cat].length);\n" +
"            document.querySelector(\".placeName\").innerHTML = places[cat][pos]['name'];\n" +
"            document.querySelector(\".placeDiscription\").innerHTML = places[cat][pos]['discription'];\n" +
"            document.querySelector(\".placeAdress\").innerHTML = places[cat][pos]['adress'];\n" +
"            document.getElementById(\"placeImg\").src = places[cat][pos]['image'];\n" +
"        });\n" +
"\n" +
"}\n" +
"        </script>\n" +
"    </body>\n" +
"</html>\n" +
"");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
