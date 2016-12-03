<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
	<form method="get" action="${pageContext.request.contextPath}/docreate">
		<table class="formtable">
			<tr>
				<td class="label">과목:</td>
				<td class="control"><input name="title" type="text" />
				</td>
				
			</tr>
			<tr>
				<td class="label">코드:</td>
				<td class="control"><input name="code" type="text" />
				</td>
			</tr>
			<tr>
				<td class="label">학점:</td>
				<td class="control"><input name="grades" type="text" />
				</td>
			</tr>
			<tr>
				<td class="label">구분:</td>
				<td class="control"><input name="type" type="text" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input value="수강신청" type="submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>