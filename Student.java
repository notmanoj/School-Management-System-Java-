package SchoolManagementSystem;

public class Student {
private int id;
private String name;
private int grade;
private int feespaid;
private int total;
public Student(String name,int id,int grade) {
	this.id=id;
	this.name=name;
	this.grade=grade;
	feespaid=0;
	total=30000;
}
int getid(){
	return id;
}
String getname() {
	return name;
}
int getgrade() {
	return grade;
}
public void setgrade(int grade) {
	this.grade=grade;
}
public void payfeespaid(int fees) {
	feespaid+=fees;
	School.updateTotalmoneyearned(feespaid);
}
public int remainingfees() {
	return total-=feespaid;
}
int getTotalfees() {return total;}
int getfeespaid() {return feespaid;}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Student name:" +name 
			+"\npays fee:" +feespaid;
}
}
