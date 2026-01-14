package Serialization_DeSerialization2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StoreObject {

	public static void main(String[] args) throws IOException
	{
		   ArrayList<Student> ob = new ArrayList<>();
		   
		    Student st = Student.getStudentObject();
		    
		    ob.add(st);
		    
		   // var fos = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Linkeidn\\Student.txt");
		    
		    // var Oos = new ObjectOutputStream(fos);
		    
		    
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Linkeidn\\Student.txt")))
		{
			 oos.writeObject(ob);
			 System.out.println("Object stored successfully");
		}
	}

}
