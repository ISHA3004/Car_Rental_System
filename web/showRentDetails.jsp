<%@page import="carRental.Car"%>
<%@page import="carRental.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="showrentdetails.css">
    </head>
    <body>
        <div class="head">Car Rent Details</div>
        <%
            Car scar = (Car)session.getAttribute("Selectedcar");
            double totalRent = (double)session.getAttribute("TotalRent");
            Customer newcust = (Customer)session.getAttribute("NewCustomer");
        %>
        <div class="details">
            <p class="info">Customer Id : <%= newcust.getCustomerId() %></p>
            <p class="info">Customer Name : <%= newcust.getCustomerName() %></p>
            <p class="info">Car id : <%= scar.getCarId() %></p>
            <p class="info">Car Name : <%= scar.getCarName() %></p>
            <p class="info">Car Model : <%= scar.getCarModel() %></p>
            <p class="info">Total Rent : <%= totalRent%></p>
        </div>
        <div class="dir">
            <a href="showMessage.jsp" class="dirmsg">Go to home page</a>
        </div>
    </body>
</html>
