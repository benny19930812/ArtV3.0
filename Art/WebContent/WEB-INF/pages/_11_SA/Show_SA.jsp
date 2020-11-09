<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script>
	$(document).ready(function() {
		$('#table11').DataTable();
	});
</script>
<div>
	<span> <a href="GoCreate">新增</a>&nbsp;&nbsp; <a href="GoDel">刪除</a>&nbsp;&nbsp;
		<a href="GoSearch">查詢</a>&nbsp;&nbsp; <a
		href="myStreetArtistPage.ctrl">總覽</a>
	</span>
</div>
<h1 align="center">街頭藝人總覽</h1>
<table id="table11" class="display">
	<thead>
		<tr>
			<th>編號</th>
			<th>藝名</th>
			<th>來自</th>
			<th>表演項目</th>
			<th>分類</th>
		</tr>
	</thead>

	<tbody>
		<c:forEach var="searchSA" varStatus="stat" items="${BeanList_SA}">
			<tr>
				<td>${searchSA.id_SA }</td>
				<td>${searchSA.name_SA }</td>
				<td>${searchSA.country_SA }</td>
				<td>${searchSA.theme_SA }</td>
				<td>${searchSA.classification_SA }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>