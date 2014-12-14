<%@ page import="by.bsuir.hostel.model.Administration" %>
<%@ page import="java.util.List" %>
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
        <div id="sidebar">
            <div id="sidebar_top"></div>
            <div id="sidebar_text">

                <h2>Sidebar header</h2>


                <p><strong>Lorem Lipsum</strong> dolor sit amet, consectetuer adipiscing elit. <a href="#">Nullam
                    pharetra</a> tempus nunc. Donec feugiat lorem nec odio. Mauris vitae nisi sed mi rhoncus ultrices.
                </p>

                <h2>Sidebar header</h2>

                <p><strong>Lorem Lipsum</strong> dolor sit amet, consectetuer adipiscing elit. <a href="#">Nullam
                    pharetra</a> tempus nunc. Donec feugiat lorem nec odio. Mauris vitae nisi sed mi rhoncus ultrices.
                </p>

                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nullam pharetra tempus nunc. Donec feugiat
                    lorem nec odio. Mauris vitae nisi sed mi rhoncus ultrices.</p>
            </div>
            <div id="sidebar_bottom"></div>
        </div>
        <div id="text">
            <h1><strong>Welcome</strong></h1>

            <%--<% List<Administration> list = (List) request.getAttribute("admList");--%>
            <%--for (Administration adm: list){--%>
            <%--out.println(adm.getName().toString());--%>
            <%--}--%>
            <%--%>--%>

            <c:forEach items="${admList}" var="adm">
                <c:out value="${adm.name}"/>
            </c:forEach>

            <h2>The list of criteria for the granting of places in hostels BSUIR: </h2>
            <ul>
                <li>shall, in accordance with the legislation of the right to receive an extraordinary residential
                    social use;
                </li>
                <li>included in the database of talented youth and database of talented young people - for the period of
                    study;
                </li>
                <li>eliminated from the living quarters in a dormitory because:</li>
                <li>- With the passage of military service, focus on alternative service call to serve in the reserve,
                    military and special charges, military service under the first contract as soldiers, sailors,
                    sergeants and petty officers that when the service is restored in BSUIR;
                </li>
                <li>- With the direction BSUIR for higher or postgraduate education in educational institution,
                    organization implements educational programs of postgraduate education, are in another village, and
                    after deduction of these educational institutions, organizations in BSUIR recovered;
                </li>
            </ul>
            <h1>Lorem ipsum dolor
            </h1>

            <p><strong>Lorem ipsum</strong> dolor sit amet, consectetuer adipiscing elit. Phasellus ornare condimentum
                sem. Nullam a eros. Vivamus vestibulum hendrerit arcu. Integer a orci. Morbi nonummy semper est. Donec
                at risus sed velit porta dictum. Maecenas condimentum orci aliquam nunc. Morbi nonummy tellus in nibh.
                Suspendisse orci eros, dapibus at, ultrices at, egestas ac, tortor. Suspendisse fringilla est id erat.
                Praesent et libero. Proin nisi felis, euismod a, tempus varius, elementum vel, nisl. Fusce non magna sit
                amet enim suscipit feugiat. Fusce et leo.</p>

            <p><strong>Pellentesque eu massa.</strong> Praesent sed enim sed ante tempus mollis. Vestibulum est. Aenean
                pellentesque fringilla orci. Vestibulum tellus velit, tristique at, malesuada in, tempus sed, urna.
                Fusce pharetra. In elit libero, eleifend blandit, egestas nec, lacinia sit amet, mauris. Sed nec tortor
                nec metus interdum tempor. Aliquam convallis faucibus turpis. Sed lacinia nibh. Etiam blandit odio in
                metus. Sed quis nibh eu velit ullamcorper vulputate. Nulla facilisi. Aenean eget massa dignissim orci
                aliquet laoreet. Nulla nisi nisl, blandit vel, pharetra ac, interdum quis, tellus. Nam tincidunt porta
                mauris. In aliquet turpis sit amet erat. Aenean volutpat felis eu odio. </p>
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
