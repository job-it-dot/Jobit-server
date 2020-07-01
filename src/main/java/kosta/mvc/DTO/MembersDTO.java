package kosta.mvc.DTO;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MembersDTO {
	
	private Long memberId;
	private Long kakaoId;
	private String memberEmail;
	private String memberPassword;
	private int memberStatus;
	private Timestamp memberJoinDate;
}