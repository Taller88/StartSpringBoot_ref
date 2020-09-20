package startsb.service;

import java.util.List;

import startsb.dto.BoardDto;

public interface BoardService {

	List<BoardDto> selectBoardList() throws Exception;
	
}
