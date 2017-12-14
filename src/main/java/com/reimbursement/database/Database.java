package com.reimbursement.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.reimbursment.model.Reimbursment;
import com.reimbursment.model.User;

public class Database {
	
	public static Map<String, Reimbursment> mapOfReimbursments = new HashMap<String, Reimbursment>();
	public static List<Reimbursment> listOfreimbursments = new ArrayList<Reimbursment>();
	
	public static List<User> users = new ArrayList<User>();
	public static Map<String, User> usersMap = new HashMap<String, User>();
	
	static {
		String[] rtiwaryPrivileges = {"ADMIN","EMP"};
		users.add(new User("rtiwary", "rtiwary", new ArrayList<String>(Arrays.asList(rtiwaryPrivileges))));
		String[] nKadaliPrivileges = {"EMP"};
		users.add(new User("nkadali", "nkadali", new ArrayList<String>(Arrays.asList(nKadaliPrivileges))));
		
		for(User u : users)
			usersMap.put(u.getUserName(), u);
		
		
		listOfreimbursments.add(new Reimbursment("REIMB1001", "GRS", new Date(), "Hyderabad", "test Type", "REC1001", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("REIMB1002", "GRS", new Date(), "Hyderabad", "test Type", "REC1002", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("REIMB1003", "GRS", new Date(), "Hyderabad", "test Type", "REC1003", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("REIMB1004", "GRS", new Date(), "Hyderabad", "test Type", "REC1004", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("REIMB1005", "GRS", new Date(), "Hyderabad", "test Type", "REC1005", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("REIMB1006", "GRS", new Date(), "Hyderabad", "test Type", "REC1006", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("REIMB1007", "GRS", new Date(), "Hyderabad", "test Type", "REC1007", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		listOfreimbursments.add(new Reimbursment("REIMB1008", "GRS", new Date(), "Hyderabad", "test Type", "REC1008", new Date(), " test conveyanceDetails", "9 AM", "7 PM", "test amt", "test", "test", "ram", "test"));
		
		for(Reimbursment r : listOfreimbursments){
			mapOfReimbursments.put(r.getReimbursementId(), r);
		}
	}
}	
