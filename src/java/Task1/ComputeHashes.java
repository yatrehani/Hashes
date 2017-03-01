package Task1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Yat Rehani
 * Last modified: 9/23/2016
 * 
 */
@WebServlet(name = "ComputeHashes",
        urlPatterns = {"/ComputeHashes"})
public class ComputeHashes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String inputText = request.getParameter("inputText");
        String inputAlgo = request.getParameter("inputAlgo");
           
        try{

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Project1Task1</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Input Text:</h3>" +inputText+ "<br><h3>Hash Function:</h3>"+inputAlgo+"<br><h3>Hash Value(base64):</h3>"+javax.xml.bind.DatatypeConverter.printBase64Binary(MessageDigest.getInstance(inputAlgo).digest(inputText.getBytes("UTF-8")))+"<br><h3>Hash Value(hexadecimal):</h3>"+javax.xml.bind.DatatypeConverter.printHexBinary(MessageDigest.getInstance(inputAlgo).digest(inputText.getBytes("UTF-8"))));
        out.println("</body>");
        out.println("</html>");
    }
        
        catch(NoSuchAlgorithmException exception){
            exception.printStackTrace();
        }
        
    }

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

}
