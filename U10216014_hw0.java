/**
 * Name: Johnny
 * ID: U10216014
 * Ex: 11.2
 * Information: 
 *                Person
 *                   |
 *               -----------
 *               |         | 
 *            Student   Employee   
 *                         |     
 *                    -----------          
 *                    |         | 
 *                 Faculty    Staff          
 */
import java.util.*;

public class U10216014_hw0{
	public static void main(String[] args) {

		// to invoke every class's toString method.
		System.out.println(new Person().toString());
		System.out.println("-----------------------\n");
		System.out.println(new Student().toString());
		System.out.println("-----------------------\n");
		System.out.println(new Employee().toString());
		System.out.println("-----------------------\n");
		System.out.println(new Faculty().toString());
		System.out.println("-----------------------\n");
		System.out.println(new Staff().toString());
		System.out.println("-----------------------\n");
	}
}

class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String email;

	Person(){
		this.name = "Wu Yu Min";
		this.address = "Taiwan Taipei";
		this.phoneNumber = "4125252";
		this.email = "maplestory@yahoo.com.tw";
	}

    // four set data field method.
	public void setName(String newName){
		name = newName;
	}

	public void setAddress(String newAddress){
		address = newAddress;
	}

	public void setPhoneNumber(String newPhoneNumber){
		phoneNumber = newPhoneNumber;
	}

	public void setEmail(String newEmail){
		email = newEmail;
	}

	// four get data field method.
	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public String getEmail(){
		return email;
	}

	// Override the Object's method toString.
	@Override
	public String toString(){
		return "Class: Person \nThe person name is " + getName() 
		+ "\naddress is " + getAddress()
		+ "\nphoneNumber is " + getPhoneNumber()
		+ "\nemail is " + getEmail();
	}
}

// class Student is the subclass of Person.
class Student extends Person {
	final int FRESHMAN = 1;
	final int SOPHOMORE = 2;
	final int JUNIOR = 3;
	final int SENIOR = 4;
	int status;

	Student(){
		status = 1;
	}

	// One set data field method. 
	public void setStatus(int newStatus){
		this.status = newStatus;
	}

	// One get data field method.
	public int getStatus(){
		return status;
	}

	// Override the Object's method toString.
	@Override
	public String toString(){
		String a = "";
		switch(status){
			case 1:
				a = "FRESHMAN";
			break;
			case 2:
				a = "SOPHOMORE";
			break;
			case 3:
				a = "JUNIOR";
			break;
			case 4:
				a = "SENIOR";
			break;
			default:
				a = "No choice";
		}
		return "Class: Student \nThe person name is " + getName() 
		+ "\naddress is " + getAddress()
		+ "\nphoneNumber is " + getPhoneNumber()
		+ "\nemail is " + getEmail()
		+ "\nstatus is " + a;
	}
}

// Class Employee is the subclass of Person.
class Employee extends Person {
	private String office;
	private int salary;
	private String hiredDay;

	Employee(){
		office = "G313";
		salary = 100000;
	}

	// Three set data field method.
	public void setOffice(String newOffice){
		this.office = newOffice;
	}

	public void setSalary(int newSalary){
		this.salary = newSalary;
	}

	// Three get data field method.
	public String getOffice(){
		return office;
	}

	public int getSalary(){
		return salary;
	}

	public static String getHiredDay(){
		MyDate i = new MyDate();
		return i.getDate();	
	}

	// Override the Object's method toString.
	@Override
	public String toString(){		
		return "Class: Employee \nThe person name is " + getName() 
		+ "\naddress is " + getAddress()
		+ "\nphoneNumber is " + getPhoneNumber()
		+ "\nemail is " + getEmail()
		+ "\noffice is " + getOffice()
		+ "\nsalary is " + getSalary()
		+ "\nhiredDay is " + getHiredDay();
	}
}

// Class Faculty is the subclass of Employee.
class Faculty extends Employee {
	private int officeHour;
	private String rank;

	Faculty(){
		officeHour = 8;
		rank = "boss";
	}

	// Two set data field method.
	public void setOfficeHour(int newOfficeHour){
		this.officeHour = newOfficeHour;
	}

	public void setRank(String newRank){
		this.rank = newRank;
	}

	// Two get data field method. 
	public int getOfficeHour(){
		return officeHour;
	}

	public String getRank(){
		return rank;
	}

	// Override the Object's method toString.
	@Override
	public String toString(){
		return "Class: Faculty \nThe person name is " + getName() 
		+ "\naddress is " + getAddress()
		+ "\nphoneNumber is " + getPhoneNumber()
		+ "\nemail is " + getEmail()
		+ "\noffice is " + getOffice()
		+ "\nsalary is " + getSalary()
		+ "\nhiredDay is " + getHiredDay()
		+ "\nofficeHour is " + getOfficeHour()
		+ "\nrank is " + getRank();
	}
}

// Class Staff is the subclass of Employee.
class Staff extends Employee {
	private String title;

	Staff(){
		title = "Java coporation";
	}

	// One set data field method.
	public void setTitle(String newTitle){
		this.title = newTitle;
	}

	// One get data field method.
	public String getTitle(){
		return title;
	}

	// Override the Object's method toString.
	@Override
	public String toString(){
		return "Class: Staff \nThe person name is " + getName() 
		+ "\naddress is " + getAddress()
		+ "\nphoneNumber is " + getPhoneNumber()
		+ "\nemail is " + getEmail()
		+ "\noffice is " + getOffice()
		+ "\nsalary is " + getSalary()
		+ "\nhiredDay is " + getHiredDay()
		+ "\ntitle is " + getTitle();
	}
}

// Class MyDate can get time.
class MyDate{
	int year;
	int month;
	int day;
	long myElapsedTime;

	// No-arg constructor can get the current tine.
	MyDate() {
		

	}

	// The constructor can get the time if you give a elapsed time.
	MyDate(long newElapsedTime) {
		setDate(newElapsedTime);		
		GregorianCalendar myDate2 = new GregorianCalendar();
		myDate2.setTimeInMillis(myElapsedTime);
		this.year = myDate2.get(GregorianCalendar.YEAR);
		this.month = myDate2.get(GregorianCalendar.MONTH);
		this.day = myDate2.get(GregorianCalendar.DAY_OF_MONTH);		
		System.out.println("The hired day is " + year + " "+ month + " " + day);

	}

	// The constructor can set the date if you need.
	MyDate(int newYear, int newMonth, int newDay) {
		this.year = newYear;
		this.month = newMonth;
		this.day = newDay;
		System.out.println("The hired day is " + year + " "+ month + " " + day);
	}

	// Three get method.
	public int getYear() {		
		return year;
	}

	public int getMonth() {		
		return month;
	}

	public int getDay() {
		return day;	
	}

	// The method can set the elapsed time.
	public void setDate(long elapsedTime) {
		this.myElapsedTime = elapsedTime;
	}

	public String getDate(){
		StringBuilder a = new StringBuilder();
		GregorianCalendar myDate1 = new GregorianCalendar();
		this.year = myDate1.get(GregorianCalendar.YEAR);
		this.month = myDate1.get(GregorianCalendar.MONTH) + 1;
		this.day = myDate1.get(GregorianCalendar.DAY_OF_MONTH);	
		a.append(year + " " + month + " " + day);	
		String op = new String(a);
		return op;
	}
}
