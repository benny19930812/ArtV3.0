<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">
	<br>
	<div class=title>
		<h3 align="center" style="margin-top: 20px;">查詢藝文商店</h3>
	</div>
	<div class="back" align="right">
		<form action="<c:url value='/03/cms/shop/Index'/> " method="get">
			<div class="submitButton">
				<input type="submit" class="" name="submit" value="返回 藝文商店管理">
			</div>
		</form>
	</div>
	<br>
	<div class=content>
		<form method="post"
			action="<c:url value="/03/cms/shop/DeleteCreativeShopByName.ctrl"/>">
			<table id="03A"
				class="display table table-bordered table-hover table-blue">
				<thead>
					<tr>
						<th>商店名稱查詢</th>
				</thead>
				<tbody>
					<tr>
						<td><input type="text" placeholder="請輸入商店名稱 " name="name"></td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</form>
		<br>
		<form method="post"
			action="<c:url value="/03/cms/shop/DeleteCreativeShopById.ctrl"/>">
			<table id="03B"
				class="display table table-bordered table-hover table-blue">
				<thead>
					<tr>
						<th>商店代號查詢</th>
				</thead>
				<tbody>
					<tr>
						<td><input type="text" placeholder="請輸入商店代號 " name="shopId">
						</td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</div>






	<form method="post" action="<c:url value="/03/cms/shop/SearchCreativeShopByName.ctrl"/>">
		<label>請輸入商店名稱: </label> <input type="text" placeholder="請輸入商店名稱 "
			name="name"> <span id=idsp class="colorGray"></span> <br />
	</form>
	<form method="post" action="<c:url value="/03/cms/shop/SearchCreativeShopById.ctrl"/>">
		<label>請輸入商店編號: </label> <input type="text" placeholder="請輸入商店編號 "
			name="shopId" id="shopId" > <span id=idsp2 class="colorGray"></span> <br />
	</form>
<%-- 	<form method="post" action="<c:url value="/03/cms/SearchAllCreativeShops.ctrl"/>"> --%>
<!-- 		<button type="submit">查詢全部商店資料</button> -->
<!-- 	</form> -->
	<form>
		<table>
			<tr><td><a href="<c:url value='/03/cms/shop/Index' />">返回系統首頁</a></td></tr>
		</table>
	</form>
</body>
</html>