<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
</head>
<body>

Location Area Information: ${location} <br><br>

<%-- Observation Stats: <br>
  - Observation Location Name: ${obsName} <br>
  - Current Temperature: ${obsTemp}&#176;F<br>
  - Current Dew Point: ${obsDewp}&#176;F
  
  

<br><br>
Time: ${time} --%>

<br><br>
Search by Latitude and Longitude:
<form action="/search">
<input type="number" placeholder="Lat." min="-90" max="90" name="latitude"/>
<input type="number" placeholder="Long." min="-180" max="180" name="longitude"/>
<input type="submit" />


</form>

</body>
</html>