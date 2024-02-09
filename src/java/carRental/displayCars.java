/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package carRental;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;
/**
 *
 * @author ISHA MISTRY
 */
@WebServlet(name = "displayCars", urlPatterns = {"/displayCars"})
public class displayCars extends HttpServlet {

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
       //CarRentalSystem crs = new CarRentalSystem();
//        Car car1 = new Car("C001","Kia","Hyundai",500);
//        Car car2 = new Car("C002","Ertiga","Suzuki",300);
//        Car car3 = new Car("C003","Zest","Tata",450);
//        crs.addCar(car1);
//        crs.addCar(car2);
//        crs.addCar(car3);
//        List<Car> cars = crs.getCarsList();
//        HttpSession session=request.getSession();  
//       session.setAttribute("Cars",cars);
       RequestDispatcher dispatcher = request.getRequestDispatcher("showRentCars.jsp");
       dispatcher.forward(request,response);
    }

    
}
