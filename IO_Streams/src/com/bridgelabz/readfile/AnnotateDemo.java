package com.bridgelabz.readfile;

// we have to use a keyword interface to create a annotate

// the variable in an annotation is know as Marker Annotation

// if it contain single value it know as single value annotaion

// more than one value its know as Multi value annotation

//
@interface Javeed
{
	String name() default "Entry"; // creates field
	int age() default 0;
	
}

@Javeed(age = 23, name = "Javeed")

class SampleAnnotate
{
	String name;
	int age;
	
	public SampleAnnotate(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
public class AnnotateDemo {
	
	public static void main(String[] args)
	{
		
	}

	
}
