<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
연도  학기   학점   상세보기</br>
2011 1학기 ${grades1} <a href="${pageContext.request.contextPath}/semester?year=20111"> 링크</a></br>

2011 2학기 ${grades2} <a href="${pageContext.request.contextPath}/semester?year=20112"> 링크</a></br>

2015 1학기 ${grades3} <a href="${pageContext.request.contextPath}/semester?year=20151"> 링크</a></br>

2015 2학기 ${grades4} <a href="${pageContext.request.contextPath}/semester?year=20152""> 링크</a></br>

2016 1학기 ${grades5} <a href="${pageContext.request.contextPath}/semester?year=20161"> 링크</a></br>

2016 2학기 ${grades6} <a href="${pageContext.request.contextPath}/semester?year=20162""> 링크</a></br>

</body>
</html>