package kosta.mvc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long alramId;
	
	@ManyToOne
	private Recruit recruit;
	
	private boolean isNew;
}