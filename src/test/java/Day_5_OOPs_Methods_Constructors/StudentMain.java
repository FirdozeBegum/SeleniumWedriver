package Day_5_OOPs_Methods_Constructors;

public class StudentMain {

	public static void main(String[] args) {
		//Student stu = new Student();

		// 1. using object reference variables

	/*	stu.sid = 101;
		stu.sname = "David";
		stu.grade = 'A';
		stu.printStudentData();
*/
	// 2. using method	
	//stu.setStudentData(102,"Sonu",'B');
	//stu.printStudentData();
		
		//3. using Constructor -->initializing the data 
		
		Student stu = new Student(101,"John",'C');
		stu.printStudentData();
		
	}

}
