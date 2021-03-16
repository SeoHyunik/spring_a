<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>상품상세</h2>
	<hr>
	상품번호: ${g.no }<br>
	상품이름: ${g.name }<br>
	상품수량: ${g.qty }<br>
	상품가격: ${g.price }<br>
	상품사진: <br>
	<img src="img/${g.fname }" width="100" height="100">

</body>
</html>