/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carRental;
public class Car {
    private String car_id;
    private String car_name;
    private String car_model;
    private int car_rent;
    private boolean isAvailable;
    
    public Car(String car_id,String car_name,String car_model,int car_rent)
    {
        this.car_id = car_id;
        this.car_name = car_name;
        this.car_model = car_model;
        this.car_rent = car_rent;
        this.isAvailable = true;
    }
    
    public String getCarId(){
            return car_id;
    }
    
    public String getCarName(){
            return car_name;
    }
    
    public String getCarModel(){
            return car_model;
    }
    
    public int getCarRent(){
            return car_rent;
    }
    
    public boolean isAvailable(){
        return isAvailable;
    }
    public double calculateTotalRent(int rental_days){
        return car_rent*rental_days;
    }
   
    public void rent(){
        isAvailable = false;
    }
    
    public void returnCar(){
        isAvailable = true;
    }
         
}
