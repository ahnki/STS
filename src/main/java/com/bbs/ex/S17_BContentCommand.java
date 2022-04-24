package com.bbs.ex;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;



public class S17_BContentCommand implements S17_BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		
		S17_BDao dao = new S17_BDao();
		S17_BDto dto = dao.contentView(bId);
		
		model.addAttribute("contentView", dto);
	}

}
