package com.cmsz.demon.index.model;

import java.io.Serializable;

public class LagouUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5245418536761412956L;
	private int id;
	private String name;
	private String passwd;
	private int mobilephone;
	private int is_avaliable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(int mobilephone) {
		this.mobilephone = mobilephone;
	}
	public int getIs_avaliable() {
		return is_avaliable;
	}
	public void setIs_avaliable(int is_avaliable) {
		this.is_avaliable = is_avaliable;
	}
}
