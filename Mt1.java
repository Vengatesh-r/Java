package Com.mt.pkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
class Read extends Thread {
	public synchronized void run() {
try {
	sleep(100);
	FileReader fr = new FileReader("//home//prakash//Documents//ass.txt");
	BufferedReader br = new BufferedReader(fr);
	while (br.ready()) {

		System.out.println(br.readLine());
	}
	fr.close();
	br.close();
}
catch (Exception e) {
	System.out.println("chek code");
}
	}
}
class Write  extends Thread {
	public void run() {
		try {
			//sleep(100);
			FileWriter fw =new FileWriter("//home//prakash//Documents//ass.txt");
			BufferedWriter bw= new BufferedWriter(fw);
				bw.write("public class Student{"+"\n");
				bw.write("int rollno;"+"\n");
				bw.write("double total;"+"\n");
				bw.write("char grade;"+"\n");
				bw.write("void display(){"+"\n");
				bw.write("System.out.println(\"Rollno\"+rollno);"+"\n");
				bw.write("System.out.println(\"Total\"+total);"+"\n");
				bw.write("System.out.println(\"Grade\"+grade);}"+"\n");
				bw.write("public static void main(String [] args){"+"\n");
			//	bw.write("Student ram=new Student();"+"\n");
				//bw.write("ram.rollno=123;"+"\n");
		//		bw.write("ram.total=95;"+"\n");
		//		bw.write("ram.grade='A';"+"\n");
			//	bw.write("ram.display();"+"\n");
	//			bw.write("Student raja=new Student();"+"\n");
		//		bw.write("raja.rollno=456;"+"\n");
		//		bw.write("raja.total=85;"+"\n");
		//		bw.write("raja.grade='c';"+"\n");
	//			bw.write("raja.display();"+"\n");
		//		bw.write("}}"+"\n");
			//	fw.close();
				bw.close();
				fw.close();
			System.out.println("sucees");	
			
			}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}

public class Mt1 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Read re = new  Read();
		 re.start();
		 Write wr = new  Write ();
		 wr.start();
	}

}
