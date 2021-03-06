package kosta.mvc.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequiredSkillDTO {
	
	private Long reqSkillsId;
	
	private SkillsDTO skill;
	
	private RecruitFormDTO recruitForm;
}
