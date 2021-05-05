package com.cg.ucaa.service;

import java.util.List;

import com.cg.ucaa.exception.ApplicantNotFoundException;
import com.cg.ucaa.models.ApplicantModel;

//interface in service layer
public interface IApplicantService {
	ApplicantModel registerApplicant(ApplicantModel applicant) throws ApplicantNotFoundException;
	
	ApplicantModel updateApplicant(ApplicantModel applicant) throws  ApplicantNotFoundException;
	
	boolean removeApplicant(Long applicantId) throws  ApplicantNotFoundException;
	
	ApplicantModel viewApplicant(Long applicantId) throws ApplicantNotFoundException;
	
	List<ApplicantModel> viewAllApplicants();

}
