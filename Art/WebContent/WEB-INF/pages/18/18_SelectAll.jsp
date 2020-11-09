<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table id="myTable" class="table table-bordered" width="100%"
							cellspacing="0">
							<thead>
								<tr>
									<th>課程編號</th>
									<th>課程名稱</th>
									<th>課程售價</th>
									
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th>課程編號</th>
									<th>課程名稱</th>
									<th>課程售價</th>
									
								</tr>
							</tfoot>
								<tbody>
							<c:forEach var="cList" varStatus="stat" items="${cList}">
									<tr>
										<td>${cList.id}</td>
										<td>${cList.title}</td>
										<td>${cList.price}</td>
										
									</tr>
							</c:forEach>
								</tbody>
						</table>
<script>
$(document).ready( function () {
    $('#myTable').DataTable({

    	
    } );
} );
</script>
</body>
</html>
