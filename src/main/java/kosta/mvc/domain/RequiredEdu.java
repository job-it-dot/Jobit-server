package kosta.mvc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import kosta.mvc.DTO.RequiredEduDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequiredEdu {
	
	public RequiredEdu(RequiredEduDTO requiredEduDTO){
		this.requiredEduId = requiredEduDTO.getRequiredEduId();
		this.reqEduGrade = requiredEduDTO.getReqEduGrade();
		this.reqEduName = requiredEduDTO.getReqEduName();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long requiredEduId;
	private int reqEduGrade;
	private String reqEduName;
}
