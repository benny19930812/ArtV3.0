<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<style>
html, body {
	margin: 0;
	padding: 0;
	background: #FFFFFF;
	font-family: "Helvetica", "Arial", "微軟正黑體", sans-serif;
}

h2, h3 {
	text-indent: 80px;
	text-align: left;
	font-style: normal;
}

form {
	width: 1000px;
	margin: auto;
	padding: 20px;
	border-color: transparent;
	display: block;
	background-color: #F5F1E3;
	padding: 20px;
}

table {
	width: 1000px;
	margin: auto;
	padding: 20px;
	border-color: transparent;
	display: block;
	background-color: #F5F1E3;
	padding: 20px;
}

.colorGray {
	color: #9D9D9D;
	font-size: 12px;
}
</style>
<meta charset="UTF-8">
<title>文藝商店 管理系統 新增商店預約</title>
</head>
<body>
	<%-- 	<jsp:include page="/fragment/top.jsp" /> --%>
	<h2>文藝商店 管理系統</h2>
	<h3>新增商店預約</h3>
	<form method="post"
		action="<c:url value = "/03/cms/reservation/CreateReservation.ctrl"/>">

		<label>會員帳號:</label> <input type="text" placeholder=""
			name="memberId"> <span id=idsp class="colorGray"></span> <br />
		<p class="colorGray"></p>

		<label>會員姓名:</label> <input type="text" placeholder="請輸入圖片網址"
			name="name"> <span id=idsp class="colorGray"></span> <br />
		<p class="colorGray">連結網址可空白</p>

		<label>商店編號:</label>
		<textarea placeholder="請輸入簡介內容" name="shopId"
			style="width: 500px; height: 80px;"></textarea>
		<span id=idsp class="colorGray"></span> <br />

		<label>商店名稱:</label> <input type="text" placeholder="請輸入縣市名"
			name="shopName"> <span id=idsp class="colorGray"></span> <br />

		<!-- ====================================================== -->

		<label>預約人姓名:</label> <input type="text" placeholder="請輸入預約人姓名"
			name="customerName"> <span id=idsp class="colorGray"></span>
		<br />
		<p class="colorGray">範例: 市府路45號</p>

		<label>大人人數:</label> <input type="text" placeholder="請輸入經度"
			name="adultsNum"> <span id=idsp class="colorGray"></span> <br />
		<p class="colorGray">可空白</p>

		<label>小孩人數:</label> <input type="text" placeholder="請輸入緯度"
			name="childrenNum"> <span id=idsp class="colorGray"></span> <br />
		<p class="colorGray">可空白</p>

		<label>總人數:</label> <input type="text" placeholder="請輸入營業時間"
			name="amount"> <span id=idsp class="colorGray"></span> <br />
		<p class="colorGray">可空白、無格式要求</p>

		<label>預約時段:</label> <input type="text" placeholder="請輸入連絡電話"
			name="startTime"> <span id=idsp class="colorGray"></span> <br />
		<p class="colorGray">可空白、無格式要求</p>

		<!-- ====================================================== -->

		<label>活動結束時間:</label> <input type="text" placeholder="請輸入傳真號碼"
			name="endTime"> <span id=idsp class="colorGray"></span> <br />
		<p class="colorGray">可空白、無格式要求</p>

		<label>活動時長:</label> <input type="text" placeholder="請輸入傳真號碼"
			name="endTime"> <span id=idsp class="colorGray"></span> <br />
		<p class="colorGray">可空白、無格式要求</p>
		
		
		

		<!-- ====================================================== -->

		<button type="submit">資料送出</button>

	</form>
	<div align='center'>
		<a href="<c:url value='/03/cms/reservation/IndexPage' />">返回系統首頁</a>
	</div>

</body>
</html>
