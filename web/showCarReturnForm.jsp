
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="showreturnform.css"/>
    </head>
    <body>
        <div class="head">Return Car</div>
        <form action="returnCar" method="get" class="formc">
            <div class="inpbox">
                 <input type="text" name="rcarid" placeholder="Enter car id to return" class="inp">
            </div>
            <input type="submit" value="Return" class="retbtn">
        </form>
    </body>
</html>
