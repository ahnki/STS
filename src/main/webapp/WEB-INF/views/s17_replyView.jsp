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
		<form action="s17_reply" method="post">
			<input type="hidden" name="bId" value="${replyView.bId}">
			<input type="hidden" name="bGroup" value="${replyView.bGroup}">
			<input type="hidden" name="bStep" value="${replyView.bStep}">
			<input type="hidden" name="bIndent" value="${replyView.bIndent}">
			<tr>
				<td> 번호 </td>
				<td> ${replyView.bId} </td>
			</tr>
			<tr>
				<td> 히트 </td>
				<td> ${replyView.bHit} </td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="bName" value="${replyView.bName}"></td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" value="${replyView.bTitle}"></td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea rows="10"  name="bContent">${replyView.bContent}</textarea></td>
			</tr>
			<tr >
				<td colspan="2"><input type="submit" value="답변"> <a href="s17_list" >목록</a></td>
			</tr>
		</form>
	</table>
</body>
</html>