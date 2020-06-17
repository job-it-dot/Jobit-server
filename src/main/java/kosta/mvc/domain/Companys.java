package kosta.mvc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Companys{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long companyId;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Members member;
	
	@ManyToOne
	@JoinColumn(name="company_type_id")
	private CompanyType companyType;
	private String companyName;
	private String companyDetail;
	private int companyEmployeeCount;
	private Date companyPremiumAt;
	private int companyPoints;
	
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<CompanyImage> companyImages  = new ArrayList<CompanyImage>();
	
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<Perchase> perchases = new ArrayList<Perchase>();
	
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<CompanyAddr> companyAddrs = new ArrayList<CompanyAddr>();
	
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<Recruit> recruits = new ArrayList<Recruit>();
	
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<RecruitPlan> recruitPlans = new ArrayList<RecruitPlan>();

}
