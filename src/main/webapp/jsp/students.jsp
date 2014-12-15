<%@ page import="by.bsuir.hostel.model.Administration" %>
<%@ page import="java.util.List" %>
<%@ page import="by.bsuir.hostel.model.Informations" %>
<%@ page import="by.bsuir.hostel.model.Student" %>
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
            <li><a href="#">pricing</a></li>
            <li><a href="contacts">Contacts</a></li>
        </ul>
    </div>
</div>
<!--end header -->
<!-- main -->
<div id="main">
    <div id="content">

        <div id="text">
            <h1><strong>Students in Hostels </strong></h1><br>
        </div>

        <center>
            <big>
                <table border="1">
                    <tr>
                        <th>Last name</th>
                        <th>Name</th>
                        <th>Father name</th>
                        <th>Number group</th>
                        <th>Birthday</th>
                        <th>Type</th>
                    </tr>
                    <% List<Student> studentList = (List) request.getAttribute("students");
                        for (Student student : studentList) {
                            out.print("<tr>");
                            out.print("<td>" + student.getLastName() + "</td>");
                            out.print("<td>" + student.getName() + "</td>");
                            out.print("<td>" + student.getFatherName() + "</td>");
                            out.print("<td>" + student.getGroupe() + "</td>");
                            out.print("<td>" + student.getBirthday().toString() + "</td>");
                            out.print("<td>" + "<a href= /studentsf/"+ student.getType().getId()+">"+ student.getType().getType().toString() +"</a>"+ "</td>");
                            out.print("</tr>");
                        }
                  %>

                </table>
            </big></center>

    </div>
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
