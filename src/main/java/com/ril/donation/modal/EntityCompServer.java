package com.ril.donation.modal;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="DT_EntityCompServer")
@EntityListeners(AuditingEntityListener.class)

public class EntityCompServer 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EntityCompServerID",nullable=false,length=11)
	private Integer entityCompServerid;
	
	@Column(name="CompanyCode",nullable=false,length=4)
	private String companyCode;
	
	@Column(name="EntityCode",nullable=false,length=4)
	private String entityCode;
	
	@Column(name="ServerCode",nullable=false,length=4)
	private String serverCode;
	
	@Column(name="IsActive",nullable=false,length=1)
	private boolean isActive;
	
	@Column(name="IsDelete",nullable=false,length=1)
     private boolean isDelete;
	
	@Column(name="CreatedBy",nullable=false,length=50)
    private String createdBy;
	
	@Column(name="CreatedOn",nullable=false)
	@CreationTimestamp
    private LocalDateTime createdOn;
	
	@Column(name="UpdatedBy",nullable=false,length=50)
    private String updatedBy;
	
	@Column(name="UpdatedOn",nullable=false)
	@UpdateTimestamp
    private LocalDateTime updatedOn;
	
	@Column(name="Timestamp",nullable=false)
	private LocalDateTime  timestamp;
	
	
	
	public EntityCompServer() {
		super();
		// TODO Auto-generated constructor stub
	}



	

	



	


	public Integer getEntityCompServerid() {
		return entityCompServerid;
	}












	public void setEntityCompServerid(Integer entityCompServerid) {
		this.entityCompServerid = entityCompServerid;
	}












	public String getCompanyCode() {
		return companyCode;
	}



	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}



	public String getEntityCode() {
		return entityCode;
	}



	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}



	public String getServerCode() {
		return serverCode;
	}



	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}



	public boolean getIsActive() {
		return isActive;
	}



	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}



	public boolean getIsDelete() {
		return isDelete;
	}



	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}



	public String getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}



	


	public String getUpdatedBy() {
		return updatedBy;
	}



	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}





	public LocalDateTime getCreatedOn() {
		return createdOn;
	}





	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}





	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}





	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}





	public LocalDateTime getTimestamp() {
		return timestamp;
	}





	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}



	


	
	
	
}
