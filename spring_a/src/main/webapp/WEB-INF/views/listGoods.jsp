<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp_dynamicQuery</title>
</head>
<body>
	<h2>상품목록</h2>
	<hr>
	<form action="listGoods.do" method="post">
		상품명 : <input type = "text" name="keyword">
		<input type="submit" value="검색">
	</form>
	
	<table border="1" width="80%">
		<thead>
			<tr>
				<th><a href="listGoods.do?orderField=no ">상품번호</a></th>
				<th><a href="listGoods.do?orderField=name ">상품이름</a></th>
				<th><a href="listGoods.do?orderField=qty ">상품수량</a></th>
				<th><a href="listGoods.do?orderField=price ">상품가격</a></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="g" items="${list }">
				<tr>
					<td>${g.no }</td>
					<td><a href="detailGoods.do?no=${g.no }">${g.name }</a></td>
					<td>${g.qty }</td>
					<td>${g.price }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>