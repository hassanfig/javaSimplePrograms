import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student{
	String fullname;
	int age;
	String id;
	float note;
	String classement;
	String city;


	Student(String fullname, int age, String id, float note, String classement, String city){
		this.fullname = fullname;
		this.id=id; this.note = note;
		this.age=age;
		this.classement = classement; this.city=city;
	}
	void diplay(){
		System.out.println("FullName :" + this.fullname);
		System.out.println("age : " + this.age);
		System.out.println("id :" + id);
		System.out.println("Le classement :"+this.classement);
		System.out.println("La note generale :" +this.note);
		System.out.println("la ville :"+ this.city);
	}
	
}

public class Start {
	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		System.out.println("Enter Your full name : ");
		String fullname = br.readLine();
				
		System.out.println("Enter Your age : ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Your id : ");
		String id = br.readLine();
		
		System.out.println("Enter Your note : ");
		float note =Float.parseFloat(br.readLine()) ;

		System.out.println("entrer le classement :");
		String classement = br.readLine() ;
		
		System.out.println("saisir la ville  :");
		String city = br.readLine();
		System.out.println("____________________");
		System.out.println("");

		Student std = new Student(fullname, age, id, note,  classement, city);
		std.diplay();
	}
}
