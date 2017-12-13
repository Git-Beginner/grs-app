package com.reimbursment.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import com.reimbursment.model.Reimbursment;

@Component
public class ReimbursmentDAOImpl implements IReimbursmentDAO{
	
	public static Map<String, Reimbursment> reimbursments = new HashMap<String, Reimbursment>();
	public static List<Reimbursment> listOfreimbursments = new ArrayList<Reimbursment>();
	
	static {
		reimbursments.put("REC1001", new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1001", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		reimbursments.put("REC1002", new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1002", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		reimbursments.put("REC1003", new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1003", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		
		
		
		listOfreimbursments.add(new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1001", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1002", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1003", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1004", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1005", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1006", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1007", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("GRS", new Date(), "Hyderabad", "test Type", "REC1008", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
	}
	
	
	
	
	@Override
	public Reimbursment getReimbursment(String receptId) {
		if(reimbursments.get(receptId) != null)
			return reimbursments.get(receptId);
		else
			return new Reimbursment("NO PROJECT", new Date(), "NONE", "NONE", "RECEIPT ID NOT FOUND", new Date(), "NONE", "NONE", "NONE", "NONE", "REIMBURSMENT NOT FOUND", "NONE", "NONE", "REIMBURSMENT NOT FOUND");
	}

	@Override
	public List<Reimbursment> reimbursementlist() {
		return listOfreimbursments;
	}

	@Override
	public List<Reimbursment> addReimbursement(Reimbursment reimbursment) {
		listOfreimbursments.add(new Reimbursment(reimbursment.getProjectName(), new Date(), reimbursment.getOfficeLocation(), reimbursment.getReimType(), reimbursment.getReceiptId(), new Date(), reimbursment.getConveyanceDetails(), reimbursment.getTimeIn(), reimbursment.getTimeOut(), reimbursment.getAmount(), reimbursment.getStatus(), reimbursment.getEmpComments(), reimbursment.getAppliedManager(), reimbursment.getMgrComments()));
		return listOfreimbursments;
	}

}
