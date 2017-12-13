package com.reimbursment.service;

import java.util.List;

import com.reimbursment.model.Reimbursment;

public interface IReimbursmentService {
	
	public Reimbursment getReimbursment(String id);
	public List<Reimbursment> reimbursementlist();
	public List<Reimbursment> addReimbursement(Reimbursment reimbursment);
}
