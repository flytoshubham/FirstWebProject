package com.allstate.training.view;

public class Candidate implements Comparable<Candidate> {
	private  String cname;
	private String technicalExpertise;
	private String location;
	private int yearsOfExperience;
	
	public Candidate(String cname, String technicalxpertise,String location, int yearsOfExperience)
	{
		this.cname=cname;
		this.location=location;
		this.technicalExpertise=technicalExpertise;
		this.yearsOfExperience=yearsOfExperience;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((technicalExpertise == null) ? 0 : technicalExpertise.hashCode());
		result = prime * result + yearsOfExperience;
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
		Candidate other = (Candidate) obj;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (technicalExpertise == null) {
			if (other.technicalExpertise != null)
				return false;
		} else if (!technicalExpertise.equals(other.technicalExpertise))
			return false;
		if (yearsOfExperience != other.yearsOfExperience)
			return false;
		return true;
	}

	@Override
	public int compareTo(Candidate o) {
		// TODO Auto-generated method stub
		return this.cname.compareTo(o.cname);
	}
	
	public String getCity()
	{
		return location;
	}

	@Override
	public String toString() {
		return "Candidate [cname=" + cname + ", technicalExpertise=" + technicalExpertise + ", location=" + location
				+ ", yearsOfExperience=" + yearsOfExperience + "]";
	}
	

}
