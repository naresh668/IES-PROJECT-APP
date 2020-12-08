package com.ashokit.ies.ar.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.ies.ar.dao.UserRepository;
import com.ashokit.ies.ar.domain.SsnAccount;
import com.ashokit.ies.ar.domain.UserAccount;
import com.ashokit.ies.ar.entity.UserEntity;

@Service
public class UserServiceImpls implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<UserAccount> findAllApplicants() {

		List<UserAccount> accounts = new ArrayList<UserAccount>();
		Iterable<UserEntity> userEntity = userRepo.findAll();

		userEntity.forEach(acc -> {
			UserAccount userAcc = new UserAccount();
			BeanUtils.copyProperties(acc, userAcc);
			accounts.add(userAcc);
		});
		return accounts;
	}

	/*@Override
	public String saveUser(UserAccount userAccount) {
		String num = userAccount.getSsnNum();
		boolean flag = checkCitizenState(num);
		if (flag == true) {
			UserEntity userEnt = new UserEntity();
			BeanUtils.copyProperties(userAccount, userEnt);
			UserEntity savedEntity = userRepo.save(userEnt);
			if (savedEntity != null) {
				return savedEntity.getUserId();
			} else {
				return "something wron to save";
			}
		} else {
			return "something wrong but near to get it";
		}
	}*/

	/*private boolean checkCitizenState(String ssn) {
		String endPointUrl = "http://localhost:9998/ssnVerifySubmit?ssnNum=" + ssn;
		RestTemplate rt = new RestTemplate();
		try {
			ResponseEntity<SsnAccount> forEntity = rt.getForEntity(endPointUrl, SsnAccount.class);
			int statusCode = forEntity.getStatusCodeValue();
			if (statusCode == 200) {
				SsnAccount ssnAccount = forEntity.getBody();
				if (ssnAccount.getStateName().equals("kentucky"))
					return true;
			}
		} catch (Exception e) {

			return false;
		}
		return false;

	}*/
	
	public String saveUser(UserAccount userAccount) {
		String num = userAccount.getSsnNum();
		boolean flag = checkCitizenState(num);
		if (flag == true) {
			UserEntity userEnt = new UserEntity();
			BeanUtils.copyProperties(userAccount, userEnt);
			userEnt.setStatus("Active");
			UserEntity savedEntity = userRepo.save(userEnt);
			if (savedEntity != null) {
				return savedEntity.getUserId();
			} 
			return null;
		} else {
			return null;
		}
	}

	private boolean checkCitizenState(String ssn) {
		String endPointUrl = "http://localhost:9998/ssnVerifySubmit?ssnNum=" + ssn;
		RestTemplate rt = new RestTemplate();
		try {
			ResponseEntity<SsnAccount> forEntity = rt.getForEntity(endPointUrl, SsnAccount.class);
			int statusCode = forEntity.getStatusCodeValue();
			if (statusCode == 200) {
				SsnAccount ssnAccount = forEntity.getBody();
				if (ssnAccount.getStateName().equals("kentucky"))
					return true;
			}
		} catch (Exception e) {

			return false;
		}
		return false;

	}
	
		
		
		
}
		
		
		
		
		
		
		
		
		
		