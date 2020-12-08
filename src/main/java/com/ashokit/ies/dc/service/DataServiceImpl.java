package com.ashokit.ies.dc.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.ar.dao.UserRepository;
import com.ashokit.ies.ar.domain.UserAccount;
import com.ashokit.ies.ar.entity.UserEntity;
import com.ashokit.ies.dc.dao.DcCaseRepository;
import com.ashokit.ies.dc.dao.DcPlanRepository;
import com.ashokit.ies.dc.dao.IncomeDtlsRepository;
import com.ashokit.ies.dc.domain.IncomeDetails;
import com.ashokit.ies.dc.domain.UserPlan;
import com.ashokit.ies.dc.entity.DcCasesEntity;
import com.ashokit.ies.dc.entity.DcPlanEntity;
import com.ashokit.ies.dc.entity.IncomeDtlsEntity;



@Service
public class DataServiceImpl implements DataService{

	
	
	
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private DcCaseRepository dcCaseRepo;
	
	@Autowired
	private DcPlanRepository dcPlanRepo;
	
	@Autowired
	private IncomeDtlsRepository incomeRepo;

	@Override
	public UserAccount isAppNumValid(String id) {
		Optional<UserEntity> findUser = userRepo.findById(id);
		if(findUser.isPresent()) {
		UserEntity userEnt=findUser.get();
		UserAccount userAcc=new UserAccount();
		BeanUtils.copyProperties(userEnt, userAcc);
		return userAcc;
		}
		return null;
	}

	@Override
	public String saveCase(UserAccount user) {
		// TODO Auto-generated method stub

		DcCasesEntity dcCase = new DcCasesEntity();

		BeanUtils.copyProperties(user, dcCase);

		DcCasesEntity dcCaseEnt = dcCaseRepo.save(dcCase);
		if (dcCaseEnt != null) {

			return dcCaseEnt.getCaseId();
		}

		return null;

	}

	@Override
	public String saveCitizenPlan(UserPlan userPlan) {
		// TODO Auto-generated method stub
		DcPlanEntity dcPlan=new DcPlanEntity();
		BeanUtils.copyProperties(userPlan, dcPlan);
		
		DcPlanEntity dcPlanEnt=dcPlanRepo.save(dcPlan);
		if(dcPlanEnt != null) {
			
			return dcPlanEnt.getCaseId();
		}
		return null;
	}

	@Override
	public String saveCitizenIncome(IncomeDetails incomeDtls) {
		IncomeDtlsEntity incomeEnt=new IncomeDtlsEntity();
		
		BeanUtils.copyProperties(incomeDtls, incomeEnt);
		
		IncomeDtlsEntity incomeDtlsEnt=incomeRepo.save(incomeEnt);
		
		if(incomeDtlsEnt !=null) {
			return incomeDtlsEnt.getCaseId();
		}
		return null;
	}




}















