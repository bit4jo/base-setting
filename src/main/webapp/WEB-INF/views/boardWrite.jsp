<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="boardWriteAction" method="post">
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" size="30"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="contents" size="30"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입력">
					&nbsp;&nbsp; <a href="boardList">목록보기</a>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>