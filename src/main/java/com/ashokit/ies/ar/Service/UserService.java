package com.ashokit.ies.ar.Service;

import java.util.List;

import com.ashokit.ies.ar.domain.UserAccount;
import com.ashokit.ies.ar.entity.UserEntity;

public interface UserService {
	
	
	public String saveUser(UserAccount userAccount);

	public List<UserAccount> findAllApplicants();

}
