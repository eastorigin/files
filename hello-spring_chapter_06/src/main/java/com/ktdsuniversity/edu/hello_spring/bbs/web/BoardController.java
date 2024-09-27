package com.ktdsuniversity.edu.hello_spring.bbs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ktdsuniversity.edu.hello_spring.bbs.service.BoardService;
import com.ktdsuniversity.edu.hello_spring.bbs.vo.BoardListVO;
import com.ktdsuniversity.edu.hello_spring.bbs.vo.WriteBoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board/list") // http://localhost:8080/board/list
	public String viewBoardList(Model model) {
		
		BoardListVO boardListVO = this.boardService.getAllBoard();
		
		model.addAttribute("boardListVO", boardListVO);
		
		return "board/boardlist";
	}
	
	@GetMapping("/board/write")
	public String viewBoardWritePage() {
		return "board/boardwrite";
	}
	
	@PostMapping("/board/write")
	public String doSomething(WriteBoardVO writeBoardVO) {
		this.boardService.createNewBoard(writeBoardVO);
		return "redirect: /board/list";
	}
}
