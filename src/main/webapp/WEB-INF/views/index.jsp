<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<head>
<title>메인 페이지</title>
</head>
 
<body>
    <%-- 
        경로는 "xxx", "/xxx", "./xxx", "../xxx"가 있으며 
        localhost:8080/aaa/에서 요청시 각각 다음과 같이 이동한다.
            - xxx -> 상대경로 : localhost:8080/aaa/xxx
            - /xxx -> 루트경로에 붙음 : localhost:8080/xxx 
            - ./xxx -> 상대경로 : localhost:8080/aaa/xxx
            - ../xxx -> 이전폴더 : localhost:8080/xxx 
    --%>
    <a href="boardIndex">게시판</a>
    <a href="userIndex">유저</a>
</body>