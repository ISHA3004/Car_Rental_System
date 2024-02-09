/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carRental;

import java.util.*;
public class CarRentalSystem {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;
    
    public CarRentalSystem()
    {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }
    
    public void addCar(Car car){
        cars.add(car);
    }
    
    public List<Car> getCarsList(){
        return cars;
    }
    
    public List<Customer> getCustomersList(){
        return customers;
    }
    
    public void addCustomer(Customer cust){
        customers.add(cust);
    }
    
    
    public boolean rentCar(Car car,Customer cust,int days){
        if(car.isAvailable())
        {
            car.rent();
            rentals.add(new Rental(car,cust,days));
            return true;
        }
        return false; 
    }
    
    public boolean returnCar(Car car){
        Rental rentalToRemove = null;
        System.out.println("1");
        for(Rental rental:rentals)
        {
            System.out.println("2");
            if(rental.getCar() == car){
                rentalToRemove = rental;
                System.out.println("3");
                break;
            }     
        }
        if(rentalToRemove != null){
            rentals.remove(rentalToRemove);
            car.returnCar();
            System.out.println("4");
            return true;
        }
        return false;
    }
            
}
