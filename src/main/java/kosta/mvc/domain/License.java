package kosta.mvc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import kosta.mvc.DTO.LicenseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class License {
	
	public License(LicenseDTO licenseDTO){
		this.licenseId = licenseDTO.getLicenseId();
		this.licenseAt = licenseDTO.getLicenseAt();
		this.licenseName = licenseDTO.getLicenseName();
		this.licenseContent = licenseDTO.getLicenseContent();
		this.resume = new Resume(licenseDTO.getResume());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long licenseId;
	private String licenseAt;
	private String licenseName;
	private String licenseContent;
	
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;
}
