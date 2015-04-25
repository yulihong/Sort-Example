package com.lyu.sortpersontask.beans;

import java.util.Objects;

public class Course {
	
	private String className;
	private String teacherName;
	private int id;
	
	public Course(String className, String teacherName)
	{
		this.className = className;
		this.teacherName = teacherName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(getClass() != obj.getClass())
			return false;
		
		Course course = (Course)obj;
		return Objects.equals(className, course.className) &&
				Objects.equals(teacherName, course.teacherName) &&
				Objects.equals(id,  course.id);	
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(className, teacherName, id);
	}
	
    @Override
    public String toString() {
        return className + " " + teacherName;
    }

}
