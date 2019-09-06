package com.allstate.training.pojo;

import java.io.Serializable;

public class Product implements Serializable {
	private int pid;
	private String pname;
	private int cost;
	private int qty;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", cost=" + cost + ", qty=" + qty + "]";
	}
	

}
