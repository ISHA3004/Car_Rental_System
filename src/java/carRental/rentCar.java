/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package carRental;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ISHA MISTRY
 */
@WebServlet(urlPatterns = {"/rentCar"})
public class rentCar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        HttpSession session=request.getSession();
        String carid = request.getParameter("carid");
        String numdays = request.getParameter("numdays");
        
        CarRentalSystem crs = new CarRentalSystem();
//        
//        List<Customer> cust = new ArrayList<>();
//        session.setAttribute("Customers",cust);
//        
//        List<Rental> rentals = new ArrayList<>();
//        session.setAttribute("Rentals",rentals);
//        
        List<Rental> rentals = (List<Rental>)session.getAttribute("Rentals");
        
        List<Customer> cust = (List<Customer>)session.getAttribute("Customers");
        Customer newCustomer = new Customer("CUST"+cust.size()+1,(String)session.getAttribute("name"));
        
        
        Car selectedCar=null;
        List<Car> cars = (List<Car>)session.getAttribute("Cars");
        
        for(Car car:cars)
        {
            System.out.println(car.getCarId());
        }
        for(Car car:cars)
        {
            if(car.getCarId().equals(carid))
            {
                System.out.println(car.getCarId());
                selectedCar = car;
                break;
            }
        }
        
        if(selectedCar != null)
        {
            cars.remove(selectedCar);
//            Car ncar = new Car(selectedCar.getCarId(),selectedCar.getCarName(),selectedCar.getCarModel(),selectedCar.getCarRent());
//            ncar.rent();
//            cars.add(ncar);
            System.out.println("Car size is "+cars.size());
            session.setAttribute("Cars",cars);
            for(Car car:cars)
            {
                System.out.println(car.getCarId());
            }
            
            rentals.add(new Rental(selectedCar,newCustomer,Integer.valueOf(numdays)));
            session.setAttribute("Rentals",rentals);
            
            session.setAttribute("Selectedcar", selectedCar);
            session.setAttribute("TotalRent", selectedCar.calculateTotalRent(Integer.valueOf(numdays)));
            session.setAttribute("NewCustomer", newCustomer);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("showRentDetails.jsp");
            dispatcher.forward(request,response);
        }
        
            
    }

}
