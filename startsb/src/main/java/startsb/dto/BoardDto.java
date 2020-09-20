package startsb.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="BoardDto: 게시글 내용", description = "게시글 내용")
@Data
public class BoardDto {
	@ApiModelProperty(value="게시글 번호")
	int boardIdx;
	
	@ApiModelProperty(value="게시글 제목")
	String title;
	
	@ApiModelProperty(value="게시글 내용")
	String contents;
	
	@ApiModelProperty(value="게시글 조회수")
	int hitCnt;
	
	@ApiModelProperty(value="게시글 작성자")
	String creatorId;
	
	@ApiModelProperty(value="게시글 생성날짜")
	LocalDateTime createdDatetime;
	
	@ApiModelProperty(value="게시글 수정자")
	String updaterId;

	@ApiModelProperty(value="게시글 수정날짜")
	LocalDateTime updatedDatetime;
}
