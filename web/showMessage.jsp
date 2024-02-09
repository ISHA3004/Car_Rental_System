<%
    if(request.getAttribute("status") == "failed")
        out.println("Wrong Login credentials");
    else
    {%>
    
        <%@page contentType="text/html" pageEncoding="UTF-8"%>

        <!DOCTYPE html>
        <html>
            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>JSP Page</title>
                <link rel="stylesheet" href="showmessage.css"/>
            </head>
            <body>
                <div class="head">Car Rental</div>
                <div class="bodydet">
                    <div class="cont">
                        <div class="message">
                            <p class="details">Car is provided on rent with daily charges varying in accordance with rented car</p>
                            <a href="showRentCars.jsp" class="dir">Take a Car on Rent</a>
                        </div>
                        <div class="message">
                            <p class="details">Return the car which is taken on rent</p>
                            <a href="showCarReturnForm.jsp" class="dir">Return car</a>
                        </div>
                    </div>
                </div>
                
            </body>
        </html>
    <%}%>


