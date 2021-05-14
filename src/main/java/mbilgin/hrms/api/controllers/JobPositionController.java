package mbilgin.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mbilgin.hrms.business.abstracts.JobPositionService;
import mbilgin.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobs")
public class JobPositionController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		
		return this.jobPositionService.getAll();
		
	}
	

}
