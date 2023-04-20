<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>get result</title>
  </head>
	<body>
		<h1>Get Result</h1>
<%
   Map<String, String> map = (Map<String, String>) request.getAttribute("map");
	for( String key : map.keySet() ){
		out.println("<h1>" + key +" : " + map.get(key)+"<h1>");	
	}	
%>
	
<hr>

<h3>
 job : <%=map.get("job") %><br>
 pageNo : <%=map.get("pageNo") %><br>
 searchWoard : <%=map.get("searchWord") %><br>
</h3>


	
	</body>
</html>