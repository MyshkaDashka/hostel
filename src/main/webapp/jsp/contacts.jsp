<%@ page import="by.bsuir.hostel.model.Informations" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!--
Author: Reality Software
Website: http://www.realitysoftware.ca
Note: This is a free template released under the Creative Commons Attribution 3.0 license,
which means you can use it in any way you want provided you keep the link to the author intact.
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <link href="/style.css" rel="stylesheet" type="text/css" /></head>
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

        <div id="text">
            <h1><strong>Information</strong></h1>
            <% List<Informations> informationsList3 = (List) request.getAttribute("infTree");
                for (Informations inf : informationsList3) {
                    out.println(inf.getCriteriaList().toString());
                }
            %>
        </div>
        <div class="contact-left">
            <div id="contact-form">
                <form id="email" method="post" action="#">
                    <p><b>Name:</b><br> <input type="text" size="75" name="name"></p>
                    <p><b>E-mail:</b><br><input type="text" size="75" name="email"></p>
                    <p><b>Text:</b><br><textarea name="data" cols="75" rows="20"></textarea></p>
                    <br><input id="submit-button" class="button gray stripe" type="submit" name="submit" value="Send Message" />
                </form>

            </div>
        </div>
        <div class="contact-right">
            <div class="one-half">
                <big>
                <h3>Hostel 1</h3>
                <p>Street:
                    <%
                        out.print(request.getAttribute("street"));
                    %><br />
                    House: <%
                        out.print(request.getAttribute("house"));
                    %> <br />
                    <br />
                    <span class="highlight3">Director's phone:</span> <%
                        out.print(request.getAttribute("dirPhone"));
                    %>  <br />
                    <span class="highlight3">Secretary's Phone:</span> <%
                        out.print(request.getAttribute("secPhone"));
                    %>  </p></big>
            </div>
            <div class = "map">
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2349.354721123241!2d27.594131003706064!3d53.92544164790216!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dbcf09584a03b5%3A0x7dbad5687dcd4d7a!2z0ZbQvdGC0Y3RgNC90LDRgiDihJYxINCR0JTQo0nQoCwg0LLRg9C7adGG0LAg0K_QutGD0LHQsCDQmtC-0LvQsNGB0LAgMjgsINCc0ZbQvdGB0LosINCR0LXQu9Cw0YDRg9GB0Yw!5e0!3m2!1sru!2sru!4v1418246001062" width="400" height="250" frameborder="0" style="border:0"></iframe>
            </div>
        </div>

    </div>

    <!-- footer -->
    <div id="footer">
        <div id="left_footer">&copy; Copyright 2008<strong> Colorus </strong>design </div>
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
