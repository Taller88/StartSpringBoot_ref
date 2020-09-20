package startsb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import startsb.dto.BoardDto;
import startsb.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/board/openBoardList.do")
	public ModelAndView openBoardList() throws Exception{
		ModelAndView mv=new ModelAndView("board/boardList");//board/boardList.html 을 의미 
		//Thymeleaf와 같은 템플릿을 사용할 경우 스프링 부트의 자동 설정기능으로 .html을 생략할 수 있다. 
		
		List<BoardDto> list=boardService.selectBoardList();
		mv.addObject("list", list);
		return mv;
	}
}
