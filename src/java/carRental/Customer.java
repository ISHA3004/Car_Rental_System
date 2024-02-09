/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carRental;
public class Customer {
    private String cust_id;
    private String cust_name;
    
    public Customer(String cust_id,String cust_name)
    {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
    }
    
    public String getCustomerId(){
        return cust_id;
    }
    
    public String getCustomerName(){
        return cust_name;
    }
}
