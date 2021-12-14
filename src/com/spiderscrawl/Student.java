package com.spiderscrawl;

public class Student {
	
	int roll = 444;
	String name ="Delhi";
	
	public boolean equals(Object obj)
	{
		int roll1 = this.roll;
		String name1 = this.name;
		
		System.out.println("roll1 "+roll1);
		System.out.println("name1 : "+name1);
		
		Student student =(Student) obj;
		
		int roll2 = student.roll;
		String name2 = student.name;
		
		System.out.println("roll2 "+roll2);
		System.out.println("name2 : "+name2);
		
		if(name1.equals(name2) && roll1==roll2 ) {
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
