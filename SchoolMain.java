package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;


public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher lizzy=new Teacher(1,"Lizzy",10000);
		Teacher BB=new Teacher(2,"BB",40500);
		Teacher SHP=new Teacher(3,"SHP",40000);
		List<Teacher> teacherlist=new ArrayList<>();
		teacherlist.add(lizzy);
		teacherlist.add(BB);
		teacherlist.add(SHP);
		
		Student amit=new Student("Amit",19,1);	
		Student abhi=new Student("Abhi",20,1);	
		Student Banita=new Student("Banita",21,1);
		List<Student> studentlist=new ArrayList<>();
		studentlist.add(amit);
		studentlist.add(abhi);
		studentlist.add(Banita);
		
		School sc=new School(teacherlist,studentlist);
		amit.payfeespaid(20000);
		Banita.payfeespaid(40000);
		System.out.println(amit);
		System.out.println(Banita);
		BB.receiveSalary(BB.getsalary());
		System.out.println(BB);
		System.out.println("---------------------------");
	
		System.out.println("Total money earned:" +sc.getTotalmoneyearned());
		
		
	}

}



