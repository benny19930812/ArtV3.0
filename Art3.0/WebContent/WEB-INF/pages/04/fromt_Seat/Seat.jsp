<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.sofa{
	width: 60px;
	border-width: 3px;
	border-style: dashed;
	border-color: #FFFFFF;
}
.sofa1 {
	width: 60px;
}
.sofademo {
	width: 60px;
}
.progressbar{
	width: 200px;
}


</style>
</head>
<body>
	<c:set var="seat" value="${requestScope.seat}" />

<div class="container">
	<table>
	<tr >
		<td class="progressbar">Step 1</td>
		<td class="progressbar">Step 2</td>
		<td class="progressbar">Step 3</td>
		<td class="progressbar">Step 4</td>
	</tr>
	<tr>
	<td  colspan="4" style="width: 50%">
		<div class="progress">
<!-- 		28  -->
		<a class="process-wizard-dot"></a>
  		<div class="progress-bar progress-bar-striped bg-info" role="progressbar" style="width: 3%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
		</div>
	</td>

	</tr>
	<tr>
		<td>選擇區域</td>
		<td>選擇張數</td>
		<td>購票確認</td>
		<td>完成訂購</td>
	</tr>
	</table>
	
	
	<h1>座位表</h1>
	<h2>請勾選位置</h2>
	<p>請在灰色空位上點選您要的位置</p>
	<table>
	<tr>
		<td>座位資訊</td>
		<td></td>
	</tr>
	<tr>
		<td>已選擇的排號資訊 </td>
		<td></td>
	</tr>
	<tr>
		<td>本次已選 2 位</td>
		<td></td>
	</tr>
	</table>


	<table>
		
		<tr>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A1}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A2}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A3}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A4}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A5}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A6}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A7}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A8}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A9}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.A10}"></td>

		</tr><br><br>
		<tr>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B1}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B2}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B3}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B4}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B5}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B6}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B7}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B8}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B9}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.B10}"></td>

		</tr>
		<tr>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C1}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C2}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C3}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C4}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C5}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C6}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C7}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C8}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C9}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.C10}"></td>

		</tr>
		<tr>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D1}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D2}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D3}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D4}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D5}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D6}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D7}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D8}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D9}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.D10}"></td>

		</tr>
		
		<tr>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E1}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E2}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E3}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E4}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E5}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E6}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E7}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E8}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E9}"></td>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofa${seat.E10}"></td>

		</tr>
	</table>
	<br>
	<br>
	<table>
		<tr>
			<td><img src="<c:url value='/images/04/sofaOff.png' />" alt="" title="" class="sofademo">空位</td>
			<td><img src="<c:url value='/images/04/sofa.png' />" alt="" title="" class="sofademo">已售出</td>
			<td><img src="<c:url value='/images/04/sofaTick.png' />" alt="" title=""class="sofademo">已加入購物車</td>
		</tr>
	</table>
	
</div>	
	
<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous"></script>
 	<script> 
 	//將已劃位的位置改為sofa.png
 	 $(".sofa1").attr("src", "<c:url value='/images/04/sofa.png' />");

 	    //點擊更換圖片 利用圖片src的value來判斷 		
 	    $(".sofa").mouseover(function() {
			$(this).css("border-color", "#FFAC55");
 		}).mouseout(function() {
 			$(this).css("border-color", "#FFFFFF")
 		}).click(function() {
 			if ($(this).attr("src") == "<c:url value='/images/04/sofaOff.png' />") {
 				$(this).attr("src", "<c:url value='/images/04/sofaTick.png' />")
 			} else {
 				$(this).attr("src", "<c:url value='/images/04/sofaOff.png' />")
 			}
 		});
 </script> 
<script>

</script>

</body>
</html>