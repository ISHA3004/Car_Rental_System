
<%@page import="carRental.Car"%> 
<%@page import="java.util.List"%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="showrentcars.css"/>
    </head>
    <body>
        <div class="head">Cars available</div>
        <% 
            List<Car> cars = (List<Car>)session.getAttribute("Cars");%>
            <table border="2" class="tablecss">
                <tr class="trow">
                    <th>CarId</th>
                    <th>CarName</th>
                    <th>CarModel</th>
                    <th>CarRent</th>
                </tr>
                
                 <%for(Car car:cars)
                {
                    if(car.isAvailable())
                    {%>
                        <tr class="trow">
                            <td class="tdata"><%= car.getCarId() %></td>
                            <td class="tdata"><%= car.getCarName() %></td>
                            <td class="tdata"><%= car.getCarModel() %></td>
                            <td class="tdata"><%= car.getCarRent() %></td>
                        </tr>
                        
                    <%}
                }%>
                
            </table>
                <div class="cont">
                    <div class="rentheader">Rent a car</div>
                    
                        <form action="rentCar" method="get" class="formcss">
                            <div class="inpbox">
                                <input type="text" name="carid" placeholder="Enter car id" class="inp">
                            </div>
                            <div class="inpbox">
                                <input type="text" name="numdays" placeholder="Enter rent days" class="inp">
                            </div>
                            <input type="submit" value="Rent" class="rentbtn">
                        </form>
                    
        
                </div>
                
    </body>
</html>
