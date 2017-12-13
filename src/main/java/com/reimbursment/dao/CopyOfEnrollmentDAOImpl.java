package com.reimbursment.dao;
/*package com.enrollment.dao;

import java.util.ArrayList;
import java.util.List;

import com.enrollment.model.Enrollment;

public class CopyOfEnrollmentDAOImpl implements IEnrollmentDAO{
	

	@Override
	public Enrollment getEnrollmentById(String receptId) {
		Enrollment enMember = new Enrollment();
		enMember.setReceiptId("25");
		enMember.setProjectName("GRS");
		enMember.setOfficeLocation("Hyderabad");
		if(enMember.getReceiptId() == receptId){
			return enMember;
		}
		
		Enrollment unEnMember = new Enrollment();
		unEnMember.setReceiptId("Receipt ID not found");
		return unEnMember;
	}

	@Override
	public List<Enrollment> getEnrollmentByList() {
		List<Enrollment> enList = new ArrayList<Enrollment>();
		
		for(int i=0; i<10; i++){
			Enrollment e=new Enrollment();
			e.setId(i);
			e.setName("test" + i);
			e.setMessage("success");
			enList.add(e);
		}
			
		return enList;
	}

	@Override
	public Enrollment addEnrollmentUser(Enrollment enrollment) {
		Enrollment addedUser = new Enrollment();
		addedUser.setId(enrollment.getId());
		addedUser.setName(enrollment.getName());
		addedUser.setMessage(enrollment.getMessage());
		return addedUser;
	}


}
*/