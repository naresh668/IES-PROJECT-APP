package com.ashokit.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "DC_PLANS")
public class DcPlanEntity {

	/*@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	@Column(name = "DCPLAN_ID")
	private Integer dcPlanId;*/
     @Id
	@Column(name = "CASE_ID")
	private String caseId;
	@Column(name = "FIRST_NAME")

	private String firstName;
	@Column(name = "LAST_NAME")

	private String lastName;

	@Column(name = "USER_PLAN")

	private String userPlan;

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public String getUserPlan() {
		return userPlan;
	}

	public void setUserPlan(String userPlan) {
		this.userPlan = userPlan;
	}

	

	
}
