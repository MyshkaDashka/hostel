<%@ page import="by.bsuir.hostel.model.Hostels" %>
<%@ page import="java.util.List" %>
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
    <div id="logo"><a href="#"></a><img src="../images/AllHostels.png" width="359" height="40"></div>
    <div id="menu">
        <ul>
            <li><a href="home">Home</a></li>
            <li><a href="aboutPage">Hostels</a></li>
            <li><a href="#">services</a></li>
            <li><a href="#">pricing</a></li>
            <li><a href="contacts">Contacts</a></li>
        </ul>
    </div>
</div>
<!--end header -->
<!-- main -->
<div id="main">
    <div id="content">
        <div id="sidebarOne">
            <div id="sidebar_text">
                <h2><br>Hostel 1.</h2> <br>
                <center><img src="images/hostel1.jpg" width="600" height="400"></center>
                <br>

                <p><big>
                    <% List<Hostels> hostelsList = (List) request.getAttribute("hostel1");
                        for (Hostels hostel : hostelsList) {
                            out.println(hostel.getComments().toString());
                        }
                    %>
                </big>
                </p>

                <h2><br>Hostel 2.</h2> <br>

                <center><img src="images/hostel2.jpg" width="600" height="400"></center>
                <br>

                <p><big>
                    <% hostelsList = (List) request.getAttribute("hostel2");
                        for (Hostels hostel : hostelsList) {
                            out.println(hostel.getComments().toString());
                        }
                    %>
                </big>
                </p>

                <h2><br>Hostel 3.</h2> <br>
                <center><img src="images/hostel3.jpg" width="600" height="400"></center>
                <br>

                <p><big>
                    <% hostelsList = (List) request.getAttribute("hostel3");
                        for (Hostels hostel : hostelsList) {
                            out.println(hostel.getComments().toString());
                        }
                    %>
                </big>
                </p>

                <h2><br>Hostel 4.</h2> <br>
                <center><img src="images/hostel4.jpg" width="600" height="400"></center>
                <br>

                <p><big>
                    <% hostelsList = (List) request.getAttribute("hostel4");
                        for (Hostels hostel : hostelsList) {
                            out.println(hostel.getComments().toString());
                        }
                    %>
                </big>
                </p></div>
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
