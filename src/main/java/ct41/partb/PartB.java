package ct41.partb;

import ct417.assignment.*;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class PartB {

	   public static void main(String[] args)
	    {
	        DateTime dt = new DateTime();
	        
	        //add students    
	        ArrayList<Student> stds = new ArrayList<Student>();
	        
	        Student std1 = new Student("Conor",17,dt);
	        stds.add(std1);
	        Student std2 = new Student("Stephen",20,dt);
	        stds.add(std2);
	        Student std3 = new Student("Craig",18,dt);
	        stds.add(std3);
	        Student std4 = new Student("Michelle",19,dt);
	        stds.add(std4);
	        Student std5 = new Student("Nadine",18,dt);
	        stds.add(std5);
	        Student std6 = new Student("Paul",19,dt);
	        stds.add(std6);
	        Student std7 = new Student("Joe",17,dt);
	        stds.add(std7);
	        
	        //add modules
	        ArrayList<Module> module = new ArrayList<Module>();
	        
	        Module CT123 = new Module("Software Eng","CT123");
	        CT123.StudentReg(std5);
	        CT123.StudentReg(std6);
	        CT123.StudentReg(std3);
	        module.add(CT123);
	        
	        Module CT115 = new Module("Programming","CT115");
	        CT115.StudentReg(std1);
	        CT115.StudentReg(std2);
	        CT115.StudentReg(std4);
	        module.add(CT115);
	        
	        Module CT135 = new Module("Database","CT135");
	        CT135.StudentReg(std1);
	        CT135.StudentReg(std2);
	        CT135.StudentReg(std3);
	        CT135.StudentReg(std5);
	        module.add(CT135);
	        
	        Module CT144 = new Module("Networks","CT144");
	        CT144.StudentReg(std7);
	        CT144.StudentReg(std6);
	        CT144.StudentReg(std4);
	        CT144.StudentReg(std2);
	        module.add(CT144);
	       
	        //add course
	        Programme BCT = new Programme("Computer Science & I.T.", new DateTime(), new DateTime());
	        BCT.setModules(module);
	        
	        // Result
	        System.out.println(BCT);
	    }
	}