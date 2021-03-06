package kosta.mvc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import kosta.mvc.DTO.RecruitPlanDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecruitPlan {
	
	public RecruitPlan(RecruitPlanDTO recruitPlanDTO){
		this.recruitPlanId = recruitPlanDTO.getRecruitPlanId();
		this.recruitPlanDetail = recruitPlanDTO.getRecruitPlanDetail();
		this.company = new Companys(recruitPlanDTO.getCompany());
		this.position = new Positions(recruitPlanDTO.getPosition());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recruitPlanId;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	private Companys company;
	
	@ManyToOne
	@JoinColumn(name="position_id")
	private Positions position;
	
	private String recruitPlanDetail;
}
