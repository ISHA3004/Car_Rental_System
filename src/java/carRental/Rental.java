/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carRental;
public class Rental {
    private Car car;
    private Customer cust;
    private int days;
    
    public Rental(Car car,Customer cust,int days)
    {
        this.car = car;
        this.cust = cust;
        this.days = days;
    }
    
    public Car getCar(){
        return car;
    }
    
    public Customer getCust(){
        return cust;
    }
    
    public int getDays(){
        return days;
    }
}
