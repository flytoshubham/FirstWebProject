package com.allstate.training.view;

public class Department implements Comparable<Department>{
	private String dname;
	private int did;
	public Department(String dname, int did)
	{
		this.dname=dname;
		this.did=did;
		
	}
	@Override
	public String toString() {
		return "[dname=" + dname + ", did=" + did + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + did;
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (did != other.did)
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		return true;
	}
	
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		if(this.did<o.did)
			return 1;
		else if(this.did>o.did)
			return -1;
		return 0;
	}

}
