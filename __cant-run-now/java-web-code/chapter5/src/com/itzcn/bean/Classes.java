package com.itzcn.bean;

import java.util.ArrayList;
import java.util.List;

public class Classes {
	
	private String[] names = new String[3];						//定义String类型的数组
	private List<Student> students = new ArrayList<Student>();	//定义List型数组
	public String[] getNames() {							//获取一个数组
		return names;
	}
	public void setNames(String[] names) {					//为数组赋值
		this.names = names;
	}
	public String getNames(int index){					//根据索引，获取数组中的某个元素
		return names[index];
	}
	public void setNames(int index , String name){			//为数组中的某个元素赋值
		this.names[index] = name;
	}
	public List<Student> getStudents() {					//获取一个集合
		return students;
	}
	public void setStudents(List<Student> students) {			//为集合赋值
		this.students = students;
	}
	public Student getStudents(int index){					//根据索引，获取集合中的某个元素
		return students.get(index);
	}
	public void setStudents(int index , Student student){			//为集合中的某个元素赋值
		this.students.set(index, student);
	}
}
