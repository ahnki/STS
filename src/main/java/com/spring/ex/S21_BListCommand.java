package com.spring.ex;

import java.util.ArrayList;

import org.springframework.ui.Model;

public class S21_BListCommand implements S21_BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		S21_BDao dao = new S21_BDao();
		ArrayList<S21_BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);
	}

}