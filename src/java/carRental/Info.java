/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package carRental;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ISHA MISTRY
 */
@WebServlet(urlPatterns = {"/Info"})
public class Info extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        List<Car> cars = new ArrayList<>();
        
        RequestDispatcher dispatcher=null;
        if(fname != null && lname != null)
        {
            int i,c=0;
            for(i=0;i<fname.length();i++)
            {
               char chr = fname.charAt(i);
               if(!Character.isLetter(chr))
                   break;
            }
            if(i==fname.length())
                c++;
            
            for(i=0;i<lname.length();i++)
            {
               char chr = lname.charAt(i);
               if(!Character.isLetter(chr))
                   break;
            }
            if(i==lname.length())
                c++;
            
            if(c==2)
            {
                request.setAttribute("status","success");
                HttpSession session=request.getSession();  
                session.setAttribute("name",fname+" "+lname); 
                
               Car car1 = new Car("C001","Kia","Hyundai",500);
                Car car2 = new Car("C002","Ertiga","Suzuki",300);
                Car car3 = new Car("C003","Zest","Tata",450);
                cars.add(car1);
                cars.add(car2);
                cars.add(car3);
//                List<Car> cars = crs.getCarsList();
//                HttpSession session=request.getSession();  
               session.setAttribute("Cars",cars);
               
               List<Customer> cust = new ArrayList<>();
                session.setAttribute("Customers",cust);

                List<Rental> rentals = new ArrayList<>();
                session.setAttribute("Rentals",rentals);
            }
            else
            {
                request.setAttribute("status","failed");
            }
            dispatcher  = request.getRequestDispatcher("showMessage.jsp");
            dispatcher.forward(request,response);
            
        }
        
    }

}
