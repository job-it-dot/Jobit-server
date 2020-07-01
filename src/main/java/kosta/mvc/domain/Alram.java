package kosta.mvc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import kosta.mvc.DTO.AlramDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Alram {
	
	public Alram(AlramDTO alramDTO){
		this.alramId = alramDTO.getAlramId();
		this.isNew = alramDTO.isNew();
		this.recruit = new Recruit(alramDTO.getRecruit());
		this.user = new Users(alramDTO.getUser());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long alramId;
	
	@ManyToOne
	@JoinColumn(name="recruit_id")
	private Recruit recruit;
	
	private boolean isNew;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users user;
}
