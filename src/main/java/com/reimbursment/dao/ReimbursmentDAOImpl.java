package com.reimbursment.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import com.reimbursment.model.Reimbursment;
import static com.reimbursement.database.Database.*; 

@Component
public class ReimbursmentDAOImpl implements IReimbursmentDAO{
	
	
	@Override
	public Reimbursment getReimbursment(String receptId) {
		if(mapOfReimbursments.get(receptId) != null)
			return mapOfReimbursments.get(receptId);
		else
			return null;
	}

	@Override
	public List<Reimbursment> reimbursementlist() {
		return listOfreimbursments;
	}

	@Override
	public List<Reimbursment> addReimbursement(Reimbursment reimbursment) {
		listOfreimbursments.add(new Reimbursment(reimbursment.getReimbursementId(), 
				reimbursment.getProjectName(), new Date(), reimbursment.getOfficeLocation(), 
				reimbursment.getReimType(), reimbursment.getReceiptId(), new Date(), reimbursment.getConveyanceDetails(), 
				reimbursment.getTimeIn(), reimbursment.getTimeOut(), reimbursment.getAmount(), reimbursment.getStatus(), 
				reimbursment.getEmpComments(), reimbursment.getAppliedManager(), reimbursment.getMgrComments()));
		return listOfreimbursments;
	}

}
