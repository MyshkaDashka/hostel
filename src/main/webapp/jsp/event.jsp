<%@ page import="java.util.List" %>
<%@ page import="by.bsuir.hostel.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<html xmlns="http://www.w3.org/1999/xhtml">


<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link href="/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<!-- header -->
<div id="header">

    <div id="logo"><a href="#"></a><img src="../images/Company.png" width="359" height="40"></div>
    <div id="menu">
        <ul>
            <li><a href="home">Home</a></li>
            <li><a href="aboutPage">Hostels</a></li>
            <li><a href="students">Students</a></li>
            <li><a href="event">Events</a></li>
            <li><a href="contacts">Contacts</a></li>
        </ul>
    </div>
</div>
<!--end header -->
<!-- main -->
<div id="main">
    <div id="content">
        <center>
            <h3></h3>

            <p><img src="images/bal2.png" width="600" height="200"></p>
            <br>
            <% List<Event> eventList = (List) request.getAttribute("eventList");
                for (Event event : eventList) {
                    out.print("<h1>" + event.getName() + "</h1>");
                    out.print("<p><strong>Date event: </strong><h2> " + event.getDate() + "</h2></p>");
                    out.print("<p><strong>Description: </strong>" + event.getDescription() + "</p>");
                    out.print("<img src = \"images/razd.jpg\" width=\"300\" height=\"100\" >");
                }
            %>

            <big>
                <%--<p><strong>Students organizators:</strong><%--%>
                <%--List<Student> studentList = (List)request.getAttribute("students");--%>
                <%--for (Student student: studentList){--%>
                <%--out.print(student.getLastName() + " "+ student.getName() + " " + student.getFatherName()+--%>
                <%--";");--%>
                <%--}--%>
                <%--%></p>--%>
            </big></center>
    </div>
    <!-- footer -->
    <div id="footer">
        <div id="left_footer">&copy; Copyright 2008<strong> Colorus </strong>design</div>
        <div id="right_footer">

            <!-- Please do not change or delete this link. Read the license! Thanks. :-) -->
            Design by <a href="http://www.realitysoftware.ca" title="Website Design">Reality Software</a>
            | <a href="http://free-templates.ru">free-templates.ru</a>
        </div>
    </div>
    <!-- end footer -->
</div>
<!-- end main -->

</body>
</html>
