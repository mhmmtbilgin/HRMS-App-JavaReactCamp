package mbilgin.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "jobs")
@NoArgsConstructor // parametresiz constuctoru eklemeye yarar
@AllArgsConstructor // buda parametreli constructoru ekler 
public class JobPosition {	
 //@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "jobs_name")
	private String title;
	
}