<%-- 
    Document   : result
    Created on : Oct 22, 2015, 2:53:39 PM
    Author     : Rin
--%>

<%@ page import="java.util.*" %>

<html>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<body>
<h1 align="left">Your Result</h1>
<p>
<%
  List styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
    out.print(it.next());
  }
%>
</p>

<a href ="https://en.wikipedia.org/wiki/Main_Page" class = button > Information Source </a>
<a href ="/SpaceDemo" class = button> Try something else! </a>




</body>
</html>