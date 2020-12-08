package com.ashokit.ies.dc.service;

import com.ashokit.ies.ar.domain.UserAccount;
import com.ashokit.ies.dc.domain.IncomeDetails;
import com.ashokit.ies.dc.domain.UserPlan;

public interface DataService {

	
	
	
	
	
	    public UserAccount isAppNumValid(String id);

		public String saveCase(UserAccount user);

		public String saveCitizenPlan(UserPlan userPlan);

		public String saveCitizenIncome(IncomeDetails incomeDtls);

	

}
