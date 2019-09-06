package com.allstate.training.view;
import java.util.Set;
import java.util.TreeSet;

public class DepartmentDao {
	Set <Department> departments=new TreeSet<>();
	public void addDepartment(Department de)
	{
		departments.add(de);
	}
	public void removeDepartment(int index)
	{
		departments.remove(index);
	}

}
