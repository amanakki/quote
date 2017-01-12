<%--
  Created by IntelliJ IDEA.
  User: Akki
  Date: 12/24/2016
  Time: 9:11 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <script  src="http://code.jquery.com/jquery-2.2.1.min.js" type="text/javascript"></script>
    <title>Random Quote</title>
    <g:javascript library="prototype" />
</head>

<body>
<ul id="menu">
    <li>
        <g:remoteLink action="ajaxRandom" update="quote">
            Next Quote
        </g:remoteLink>
    </li>
        <li>
        <g:remoteLink action="testRandom" update="quote">
            Test Quote
        </g:remoteLink>
    </li>
    <li>
        <g:link action="index">
            Admin
        </g:link>
    </li>
</ul>
<div id="   quote">
    <q>${quote.content}</q>
    <p>${quote.author}</p>
</div>
</body>
</html>