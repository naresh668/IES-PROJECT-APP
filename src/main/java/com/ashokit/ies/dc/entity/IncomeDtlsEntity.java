package com.ashokit.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DC_INCOME")
public class IncomeDtlsEntity {

	
	
	
	
	
	
	
	@Id
	@Column(name="CASE_ID")
	private String caseId;
	@Column(name="INDIVD_NAME")
	private String individName;
	@Column(name="IS_WORKING")
	private String isWorking;
	
	@Column(name="OTHER_INCOME")
	private Long otherIncome;


	public String getCaseId() {
		return caseId;
	}


	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}


	public String getIndividName() {
		return individName;
	}


	public void setIndividName(String individName) {
		this.individName = individName;
	}


	public String getIsWorking() {
		return isWorking;
	}


	public void setIsWorking(String isWorking) {
		this.isWorking = isWorking;
	}


	public Long getOtherIncome() {
		return otherIncome;
	}


	public void setOtherIncome(Long otherIncome) {
		this.otherIncome = otherIncome;
	}


	
}
