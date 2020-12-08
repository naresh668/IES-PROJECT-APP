package com.ashokit.ies.co.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="co_triggers")
public class CoTriggersEntity {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="trg_id")
	private Integer trgId;
	@Column(name="case_num")
	private String caseNum;
	@Column(name="create_dt ")
	private Date createDate;
	@Column(name="trg_status")

	private String trgStatus;
	@Column(name="update_dt")
	private  Date updateDate;
	public Integer getTrg_id() {
		return trgId;
	}
	public void setTrg_id(Integer trgId) {
		this.trgId = trgId;
	}
	public String getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(String caseNum) {
		this.caseNum = caseNum;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getTrgStatus() {
		return trgStatus;
	}
	public void setTrgStatus(String trgStatus) {
		this.trgStatus = trgStatus;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
	

}
