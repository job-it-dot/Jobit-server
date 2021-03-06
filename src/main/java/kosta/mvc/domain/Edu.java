package kosta.mvc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import kosta.mvc.DTO.EduDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Edu {
	
	public Edu(EduDTO eduDTO){
		this.eduId = eduDTO.getEduId();
		this.eduJoinAt = eduDTO.getEduJoinAt();
		this.eduGraduateAt = eduDTO.getEduGraduateAt();
		this.eduStatus = eduDTO.getEduStatus();
		this.eduName = eduDTO.getEduName();
		this.eduDetail = eduDTO.getEduDetail();
		this.resume = new Resume(eduDTO.getResume());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eduId;
	private String eduJoinAt;
	private String eduGraduateAt;
	private int eduStatus;
	private String eduName;
	private String eduDetail;
	
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;
}
