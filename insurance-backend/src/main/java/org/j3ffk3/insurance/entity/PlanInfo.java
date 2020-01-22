package org.j3ffk3.insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAN_INFO")
public class PlanInfo {

	/**
	 * Constructor
	 * @param planCode
	 * @param planName
	 * @param planType
	 * @param planDesc
	 */
	public PlanInfo(String planCode, String planName, String planType, String planDesc) {
		super();
		this.planCode = planCode;
		this.planName = planName;
		this.planType = planType;
		this.planDesc = planDesc;
	}
	
	public PlanInfo() {
		
	}

	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/**
	 * 險種代碼
	 */
	@Column(name = "PLAN_CODE")
	private String planCode;

	/**
	 * 險種名稱
	 */
	@Column(name = "PLAN_NAME")
	private String planName;

	/**
	 * 顯種類別
	 */
	@Column(name = "PLAN_TYPE")
	private String planType;

	/**
	 * 險種說明
	 */
	@Column(name = "PLAN_DESC")
	private String planDesc;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getPlanDesc() {
		return planDesc;
	}

	public void setPlanDesc(String planDesc) {
		this.planDesc = planDesc;
	}

}
