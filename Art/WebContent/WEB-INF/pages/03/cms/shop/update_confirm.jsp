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

.colorGray {
	color: #9D9D9D;
	font-size: 12px;
}
</style>
<meta charset="UTF-8">
<title>文藝商店 管理系統 更新商店資料</title>
</head>
<body>
<%-- 	<jsp:include page="/fragment/top.jsp" /> --%>
	<h2>文藝商店 管理系統</h2>
	<h3>更新商店資料</h3>
		
	<c:if test="${acShopsSerachMsg != null}">
		<div align='center'>
			<p>${acShopsSerachMsg}</p>
		</div>
	</c:if>

	<c:if test="${acShopsList != null}">
		<form method="post" action="<c:url value = "/03/cms/shop/UpdateCreativeShop.ctrl"/>">
			<c:forEach items="${acShopsList}" var="acShopsList" varStatus="vs">
				<label>商店編號:</label>
				<p>${acShopsList.shopId}</p>
				<input type="hidden" name="shopId" value="${acShopsList.shopId}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray"></p>

				<label>商店名稱:</label>
				<input type="text" placeholder="請輸入商店名稱 " name="name"
					value="${acShopsList.name}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">店名不可空白</p>

				<label>代表圖像連結網址:</label>
				<input type="text" placeholder="請輸入圖片網址" name="representImage"
					value="${acShopsList.representImage}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">連結網址不可空白</p>

				<label>商店簡介:</label>
				<textarea placeholder="請輸入簡介內容" name="intro"
					style="width: 500px; height: 80px;">${acShopsList.intro}</textarea>
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">簡介內容不可空白</p>

				<label>商店所在的縣市名:</label>
				<input type="text" placeholder="請輸入縣市名" name="cityName"
					value="${acShopsList.cityName}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">範例: 臺北市 信義區 (中間需空2格)</p>

				<!-- ====================================================== -->

				<label>商店地址:</label>
				<input type="text" placeholder="請輸入商店地址" name="address"
					value="${acShopsList.address}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">範例: 市府路45號</p>


				<label>經度:</label>
				<input type="text" placeholder="請輸入經度" name="longitude"
					value="${acShopsList.longitude}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">可空白</p>

				<label>緯度:</label>
				<input type="text" placeholder="請輸入緯度" name="latitude"
					value="${acShopsList.latitude}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">可空白</p>

				<label>營業時間:</label>
				<input type="text" placeholder="請輸入營業時間" name="openTime"
					value="${acShopsList.openTime}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">無格式要求</p>

				<label>連絡電話:</label>
				<input type="text" placeholder="請輸入連絡電話" name="phone"
					value="${acShopsList.phone}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">不可空白、無格式要求</p>

				<!-- ====================================================== -->

				<label>傳真號碼:</label>
				<input type="text" placeholder="請輸入傳真號碼" name="fax"
					value="${acShopsList.fax}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">可空白、無格式要求</p>

				<label>電子郵件:</label>
				<input type="text" placeholder="請輸入電子郵件" name="email"
					value="${acShopsList.email}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">可空白</p>

				<label>Facebook網址:</label>
				<input type="text" placeholder="請輸入facebook 網址" name="facebook"
					value="${acShopsList.facebook}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">可空白</p>

				<label>商店網站網址:</label>
				<input type="text" placeholder="請輸入網址" name="website"
					value="${acShopsList.website}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">可空白</p>

				<label>點擊次數:</label>
				<input type="text" placeholder="請輸入點擊次數" name="clicks"
					value="${acShopsList.clicks}">
				<span id=idsp class="colorGray"></span>
				<br>
				<p class="colorGray">可空白</p>

				<!-- ====================================================== -->
				<button type="submit">資料送出</button>
			</c:forEach>
		</form>
	</c:if>
	<div align='center'>
		<a
			href="<c:url value='/03/cms/shop/Index' />">返回系統首頁</a>
	</div>
</body>
</html>
