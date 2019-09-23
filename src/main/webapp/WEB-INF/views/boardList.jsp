<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>삭제</td>
	<tr>
	<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.idx}</td>
			<td>${dto.title}</td>
			<td>${dto.contents}</td>
			<td><a href="boardDelete?idx=${dto.idx}">X</a></td>
		<tr>
	</c:forEach>
	<a href="boardWrite">글쓰기</a>
</table>
</body>
</html>