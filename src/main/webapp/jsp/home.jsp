<%@ page import="by.bsuir.hostel.model.Administration" %>
<%@ page import="java.util.List" %>
<%@ page import="by.bsuir.hostel.model.Informations" %>
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
        <div id="sidebar">
            <div id="sidebar_top"></div>
            <div id="sidebar_text">

                <h2>Director:</h2>

<big>
                <% List<Administration> administrationList= (List) request.getAttribute("director");
                    for (Administration administration: administrationList) {
                        out.println("<br>" + administration.getLastName() + " ");
                        out.print(administration.getName() + " ");
                        out.print(administration.getFatherName()+ " "+"<br>");
                        out.print("<br>");
                        out.println("Phone:  " + administration.getPhone()+"<br>");
                        out.println("Mobile phone:+375" + administration.getMobilePhone()+"<br>");
                    }
                %>
</big>
                <h2>Secretary</h2>
                <big>
                    <% administrationList= (List) request.getAttribute("secretary");
                        for (Administration administration: administrationList) {
                            out.println("<br>" + administration.getLastName() + " ");
                            out.print(administration.getName() + " ");
                            out.print(administration.getFatherName()+ " "+"<br>");
                            out.print("<br>");
                            out.println("Phone:  " + administration.getPhone()+"<br>");
                            out.println("Mobile phone:+375" + administration.getMobilePhone()+"<br>");
                        }
                    %>
                </big>
            </div>
            <div id="sidebar_bottom"></div>
        </div>
        <div id="text">
            <h1><strong>Welcome</strong></h1>

            <% List<Informations> informationsList = (List) request.getAttribute("infOne");
                for (Informations inf : informationsList) {
                    out.println(inf.getCriteriaList().toString());
                }
            %>

            <h1>By decision of the commission:
            </h1>

            <% List<Informations> informationsList2 = (List) request.getAttribute("infTwo");
                for (Informations inf : informationsList2) {
                    out.println(inf.getCriteriaList().toString());
                }
            %>
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
