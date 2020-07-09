package SchoolManagementSystem;

import java.util.List;

public class School {
private List<Teacher> teachers;
private List<Student> students;
private static int totalmoneyearned;
private static int totalmoneyspent;

public School(List<Teacher> teachers, List<Student> students) {
	this.teachers = teachers;
	this.students = students;
	this.totalmoneyearned=0;
	this.totalmoneyspent=0;
}

public List<Teacher> getTeachers() {
	return teachers;
}

public void addTeachers(Teacher teacher) {
	teachers.add(teacher);
}

public List<Student> getStudents() {
	return students;
}

public void addStudents(Student student) {
	students.add(student);
}



public static void updateTotalmoneyearned(int moneyearned) {
	totalmoneyearned+=moneyearned;
}

public static int getTotalmoneyspent() {
	return totalmoneyspent;
}
public static int getTotalmoneyearned() {
	return totalmoneyearned;
}
public static void updateTotalmoneyspent(int moneyspent) {
	totalmoneyspent-=moneyspent;
}


}
