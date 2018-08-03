package com.RESngos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String resId;
	@Column(name="resName")
	private String resName;
	
	private String resAddress;
	private String resEmail;
	private String resOwner;
	private String resMob;

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResAddress() {
		return resAddress;
	}

	public void setResAddress(String resAddress) {
		this.resAddress = resAddress;
	}
	public String getResEmail() {
		return resEmail;
	}

	public void setResEmail(String resEmail) {
		this.resEmail = resEmail;
	}
	public String getResOwner() {
		return resOwner;
	}

	public void setResOwner(String resOwner) {
		this.resOwner = resOwner;
	}
	public String getResMob() {
		return resMob;
	}

	public void setResMob(String resMob) {
		this.resMob = resMob;
	}

	@Override
	public String toString() {
		return "Restaurant [resId=" + resId + ", resName:" + resName +", resMob:" + resMob +", resAddress:" + resAddress +", resEmail:" + resEmail +", resOwner:" + resOwner + "]";
	}


}
