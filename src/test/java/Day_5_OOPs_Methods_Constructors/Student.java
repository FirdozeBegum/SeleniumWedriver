package Day_5_OOPs_Methods_Constructors;

public class Student {
	int sid;
	String sname;
	char grade;

	void printStudentData() {
		System.out.println(sid + "   " + sname + "  " + grade + " ");
	}

	void setStudentData(int id, String name, char gr) {
		sid = id;
		sname = name;
		grade = gr;
	}

	Student(int id, String name, char gr)
	{
		sid = id;
		sname = name;
		grade = gr;
	}
	
	
	
	
	
	
	
	
	
}
