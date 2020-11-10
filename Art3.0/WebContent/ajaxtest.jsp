<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Weather App</title>
</head>
<body>
  <div id="weather"></div>
  <script>
  
    function makeRequest() {
      xhr = new XMLHttpRequest();
      xhr.onload= function() {
        // 這邊處理傳回來的東西
      }
      xhr.open('GET','<c:url value='/04/seatSearch.ctrl' />', true )  
      console.log(this.responseText); 
      xhr.send()
      }
      makeRequest();

      xhr.onload= function() {
          // 這邊處理傳回來的東西
    	 
        }
  </script>
</body>
</html>