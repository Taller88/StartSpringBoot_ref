package startsb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import startsb.dto.BoardDto;
import startsb.service.BoardService;

@Api(description = "게시판 REST API")
@RestController
public class RestBoardApiController {

	@Autowired
	private BoardService boardService;
	
	@ApiOperation(value = "게시글 목록 조회")
	@RequestMapping(value="/api/board", method=RequestMethod.GET)
	public List<BoardDto> openBoardList() throws Exception{
		return boardService.selectBoardList();
	}
	
	@ApiOperation(value = "게시글 쓰기")
	@RequestMapping(value="/api/board/write" ,method=RequestMethod.POST)
	public void insertBoard(@RequestBody BoardDto board) throws Exception{
		boardService.insertBoard(board);
	}
	
	@ApiOperation(value = "게시글 상세 목록 조회")
	@RequestMapping(value="/api/board/{boardIdx}" ,method=RequestMethod.GET)
	public BoardDto openBoardDetail(@PathVariable("boardIdx") @ApiParam("게시글 번호")int boardIdx) throws Exception{
		return boardService.openBoardDetail(boardIdx);
	}
	
	
	@ApiOperation(value = "게시글 상세 내용 수정")
	@RequestMapping(value="/api/board/{boardIdx}", method=RequestMethod.PUT)
	public String updateBoard(@RequestBody BoardDto board) throws Exception{
		boardService.updateBoard(board);
		return "redirect:/board";
	}
	
	@ApiOperation(value = "게시글 삭제")
	@RequestMapping(value="/api/board/{boardIdx}", method=RequestMethod.DELETE)
	public String deleteBoard(@PathVariable("boardIdx") @ApiParam("게시글 번호")int boardIdx) throws Exception{
		boardService.deleteBoard(boardIdx);
		return "redirect:/board";
	}
	
}

