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
����  �б�   ����   �󼼺���</br>
2011 1�б� ${grades1} <a href="${pageContext.request.contextPath}/semester?year=20111"> ��ũ</a></br>

2011 2�б� ${grades2} <a href="${pageContext.request.contextPath}/semester?year=20112"> ��ũ</a></br>

2015 1�б� ${grades3} <a href="${pageContext.request.contextPath}/semester?year=20151"> ��ũ</a></br>

2015 2�б� ${grades4} <a href="${pageContext.request.contextPath}/semester?year=20152""> ��ũ</a></br>

2016 1�б� ${grades5} <a href="${pageContext.request.contextPath}/semester?year=20161"> ��ũ</a></br>

2016 2�б� ${grades6} <a href="${pageContext.request.contextPath}/semester?year=20162""> ��ũ</a></br>

</body>
</html>