package com.nt.bean;

public class JobApplicationResult {
	private JobApplication jobid;
 
	public JobApplicationResult(JobApplication jobid) {
		this.jobid = jobid;
	}

	public String appliedMessage() {
		return "Applied Suucessfully having no   ::"+jobid.jobidno();
	}

}
