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
		<form action="s17_modify" method="post">
			<input type="hidden" name="bId" value="${contentView.bId}">
			<tr>
				<td width="100"> 번호 </td>
				<td width="400"> ${contentView.bId} </td>
			</tr>
			<tr>
				<td> 히트 </td>
				<td> ${contentView.bHit} </td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="bName" value="${contentView.bName}"></td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" value="${contentView.bTitle}"></td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea rows="10" name="bContent" >${contentView.bContent}</textarea></td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="수정"> &nbsp;&nbsp; <a href="s17_list">목록보기</a> &nbsp;&nbsp; <a href="s17_delete?bId=${contentView.bId}">삭제</a> &nbsp;&nbsp; <a href="s17_replyView?bId=${contentView.bId}">답변</a></td>
			</tr>
		</form>
	</table>
</body>
</html>