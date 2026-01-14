package Serialization_DeSerialization2;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable
{
	private int studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfSubmission;
	
	
	public Student(int studentId, String studentName, Double studentFees, Date dateOfSubmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfSubmission = dateOfSubmission;
	}
	
	public static Student getStudentObject()
	{
		return new Student(12,"Jayaram",30000.00,new Date());
	}

}