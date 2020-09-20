package startsb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import startsb.dto.BoardDto;

@Mapper
public interface BoardMapper {
	List<BoardDto> selectBoardList() throws Exception;
	void insertBoard(BoardDto board) throws Exception;
}
