package startsb.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDto {
	int boardIdx;
	String title;
	String contents;
	int hitCnt;
	String creatorId;
	LocalDateTime createdDatetime;
	String updaterId;
	LocalDateTime updatedDatetime;
}
