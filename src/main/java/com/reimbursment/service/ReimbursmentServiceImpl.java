package com.reimbursment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reimbursment.dao.IReimbursmentDAO;
import com.reimbursment.model.Reimbursment;

@Service
public class ReimbursmentServiceImpl implements IReimbursmentService{
	
	@Autowired
	IReimbursmentDAO reimbursmentDAO;

	@Override
	public Reimbursment getReimbursment(String receptId) {
		return reimbursmentDAO.getReimbursment(receptId);
	}
	
	
	@Override
	public List<Reimbursment> reimbursementlist() {
		return reimbursmentDAO.reimbursementlist();
	}
	
	@Override
	public List<Reimbursment> addReimbursement(Reimbursment reimbursment) {
		return reimbursmentDAO.addReimbursement(reimbursment);
	}
	
}
