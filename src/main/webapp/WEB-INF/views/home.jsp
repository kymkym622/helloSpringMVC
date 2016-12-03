<%@ page contentType="text/html;charset=euc-kr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<p><a href="${pageContext.request.contextPath}/classes"> 학기별 이수 학점</a>
<p><a href="${pageContext.request.contextPath}/type">이수 구분별 학점 조회</a>
<p><a href="${pageContext.request.contextPath}/application"> 수강신청 하기</a>
<p><a href="${pageContext.request.contextPath}/inquiry"> 수강신청 조회</a>


</body>
</html>
