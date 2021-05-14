package mbilgin.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mbilgin.hrms.business.abstracts.JobPositionService;
import mbilgin.hrms.dataAccess.abstracts.JobPositionDao;
import mbilgin.hrms.entities.concretes.JobPosition;

@Service
public class JobPositonManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositonManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
	}
	
	

}
