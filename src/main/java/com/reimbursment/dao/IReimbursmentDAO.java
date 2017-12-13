package com.reimbursment.dao;

import java.util.List;

import com.reimbursment.model.Reimbursment;

public interface IReimbursmentDAO {
	public Reimbursment getReimbursment(String id);
	public List<Reimbursment> reimbursementlist();
	public List<Reimbursment> addReimbursement(Reimbursment reimbursment);

}
