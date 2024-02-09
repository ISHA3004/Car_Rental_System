/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package carRental;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/returnCar"})
public class returnCar extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String rcarid = request.getParameter("rcarid");
        CarRentalSystem crs = new CarRentalSystem();
        HttpSession session=request.getSession();
        
        Car carToReturn = null;
        List<Rental> rentals = (List<Rental>)session.getAttribute("Rentals");
        List<Car> cars = (List<Car>)session.getAttribute("Cars");
//        
//        for(Car car:cars)
//        {
//            System.out.println("ki "+car.getCarId()+" ksk "+car.isAvailable());
//        }
        Rental rentalToRemove = null;
        for(Rental rental:rentals)
        {
            if((rental.getCar()).getCarId().equals(rcarid))
            {
                carToReturn = rental.getCar();
                rentalToRemove = rental;
                break;
            }
        }
        
        if(carToReturn != null)
        {
            //System.out.println("Car return hui ki nai "+crs.returnCar(carToReturn));
            rentals.remove(rentalToRemove);
            session.setAttribute("Rentals",rentals);
            
            cars.add(carToReturn);
            session.setAttribute("Cars",cars);
            
            session.setAttribute("ReturnedCar", carToReturn);
            RequestDispatcher dispatcher = request.getRequestDispatcher("showReturnCarDetails.jsp");
            dispatcher.forward(request,response);
        } 
    }


}
