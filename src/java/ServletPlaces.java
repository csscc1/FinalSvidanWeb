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
public class ServletPlaces extends HttpServlet {

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
            out.println("<html lang=\"ru\">\n" +
"    <head>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"initial-scale=1.0, width=device-width\">\n" +
"        <title>Kursach</title>\n" +
"        <link rel=\"stylesheet\" type= \"text/css\" href=\"css/style.css\">\n" +
"    </head>\n" +
"    \n" +
"    <body>\n" +
"        <div class=\"first_block questions_block\">\n" +
"            <div class=\"bg_gradient blur\">\n" +
"                <img src=\"img/Subtract.png\" alt=\"\" class=\"UpHeart\">\n" +
"                <img src=\"img/Heart.png\" alt=\"\" class=\"DownHeart\">\n" +
"                <div class=\"container_questions\">\n" +
"                    <div class=\"question_main\">\n" +
"                        <div class=\"question_text\">\n" +
"                            <h2 class=\"question_font\"></h2>\n" +
"                        </div>\n" +
"                        <div>\n" +
"                            <p>Выбери один ответ</p>\n" +
"                        </div>\n" +
"                        <div>\n" +
"                            <ul class=\"answer\"></ul>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    \n" +
"                    <div class=\"btn_row\">\n" +
"                        <a href=\"#\" id=\"prBtn\" class=\"btn prev\">Предыдущий вопрос</a>\n" +
"                    </div>\n" +
"                    \n" +
"                </div>\n" +
"                \n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <script src=\"JSON\\places.json\"></script>      \n" +
"        <script src=\"scripts\\main.js\"></script>\n" +
"    </body>\n" +
"</html>");
           
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
