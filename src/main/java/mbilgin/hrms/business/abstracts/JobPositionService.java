package mbilgin.hrms.business.abstracts;

import java.util.List;
import mbilgin.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();

}
