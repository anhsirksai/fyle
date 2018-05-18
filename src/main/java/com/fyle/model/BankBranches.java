package com.fyle.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_branches")

public class BankBranches {

	@Id
    private String ifsc;
	
	private long bank_id;
	
	private String branch;
	
	private String address;
	
	private String city;
	
	private String district;
	
	private String state;
	
	private String bank_name;

	/**
	 * @return the ifsc
	 */
	public String getIfsc() {
		return ifsc;
	}

	/**
	 * @return the bank_id
	 */
	public long getBank_id() {
		return bank_id;
	}

	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the bank_name
	 */
	public String getBank_name() {
		return bank_name;
	}

	/**
	 * @param ifsc the ifsc to set
	 */
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	/**
	 * @param bank_id the bank_id to set
	 */
	public void setBank_id(long bank_id) {
		this.bank_id = bank_id;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @param bank_name the bank_name to set
	 */
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankBranches [ifsc=" + ifsc + ", bank_id=" + bank_id + ", branch=" + branch + ", address=" + address
				+ ", city=" + city + ", district=" + district + ", state=" + state + ", bank_name=" + bank_name + "]";
	}
	
	

}
