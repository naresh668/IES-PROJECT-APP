package com.ashokit.ies.co.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name="BATCH_RUN_DTLS")
public class BatchRunDtlsEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="BATCH_RUN_SEQ")
	private Integer batchRunId;
	@Column(name="BATCH_NAME")
	private String  batchName;
	@Column(name="BATCH_RUN_STATUS")
	private String batchRunStatus;
	@Column(name="END_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	@Column(name="START_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Column(name="INSTANCE_NUM")
    private Integer  instanceNum;
	
	
	




	public Integer getBatchRunId() {
		return batchRunId;
	}




	public void setBatchRunId(Integer batchRunId) {
		this.batchRunId = batchRunId;
	}




	public String getBatchName() {
		return batchName;
	}




	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}




	public String getBatchRunStatus() {
		return batchRunStatus;
	}




	public void setBatchRunStatus(String batchRunStatus) {
		this.batchRunStatus = batchRunStatus;
	}




	public Date getEndDate() {
		return endDate;
	}




	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}




	public Date getStartDate() {
		return startDate;
	}




	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}




	public Integer getInstanceNum() {
		return instanceNum;
	}




	public void setInstanceNum(Integer instanceNum) {
		this.instanceNum = instanceNum;
	}  
	
	
	

}



