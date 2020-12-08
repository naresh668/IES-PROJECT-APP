package com.ashokit.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "DC_CASES")
@Entity
public class DcCasesEntity {

	@Id
	@Column(name = "CASE_ID")
	
	@GenericGenerator(name="CAS_NUM_gen",strategy = "com.ashokit.ies.generator.CaseIdGenerator")
	@GeneratedValue(generator = "CAS_NUM_gen")
	private String caseId;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "SSN_NUM")
	private String ssnNum;

	@Column(name = "FIRST_NAME")
	private String firstName;

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSsnNum() {
		return ssnNum;
	}

	public void setSsnNum(String ssnNum) {
		this.ssnNum = ssnNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
