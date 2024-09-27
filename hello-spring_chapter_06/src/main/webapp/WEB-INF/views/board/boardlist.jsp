<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상황판</title>
</head>
<body>
	<h1>게시글의 수 : ${boardListVO.boardCnt}</h1>
	<br/>
	<h1>조회된 게시글의 수 : ${boardListVO.boardList.size() }</h1>
</body>
</html>