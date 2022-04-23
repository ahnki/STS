package com.bbs.ex;

import java.util.ArrayList;

import org.springframework.ui.Model;

public class S17_BListCommand implements S17_BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		S17_BDao dao = new S17_BDao();
		ArrayList<S17_BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);
	}

}
