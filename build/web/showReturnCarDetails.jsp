<%@page import="carRental.Car"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="showreturndetails.css"/>
    </head>
    <body>
        <div class="head">Car Return Details</div>
        <%
            Car returnedCar = (Car)session.getAttribute("ReturnedCar");
            String name = (String)session.getAttribute("name");
        %>
        <div class="details">
            <p class="info">Car returned by : <%= name %></p>
            <p class="info">Car id : <%= returnedCar.getCarId()%></p>
            <p class="info">Car Name : <%= returnedCar.getCarName()%></p>
            <p class="info">Car Model : <%= returnedCar.getCarModel()%></p>
        </div>
    </body>
</html>
