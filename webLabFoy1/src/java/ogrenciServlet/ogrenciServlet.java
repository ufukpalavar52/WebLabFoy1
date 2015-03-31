

package ogrenciServlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Toshiba
 */
public class ogrenciServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        
     
        ogrenciBean ogrenci = new ogrenciBean();
        request.setAttribute("ogrenci", ogrenci);
        
        
        ogrenci.setOgrenciNo(request.getParameter("ogrenciNo"));
        ogrenci.setOgrenciAd(request.getParameter("ogrenciAd"));
        ogrenci.setOgrenciSoyad(request.getParameter("ogrenciSoyad"));
        
        ogrenci.setOgrenciEposta(request.getParameter("ogrenciEposta"));
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("bilgi.jsp?id="+request.getParameter("ogrenciBolum"));
        dispatcher.forward(request, response);
    }

    
    

}
