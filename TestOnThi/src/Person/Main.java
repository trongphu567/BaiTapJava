package Person;

public class Main {
	public static void main(String[] args) {
		Student st=new Student("Tran Phu",19,"Long An",9.5);
		st.display();
		System.out.println();
		Teacher tc=new Teacher("Nguyen Sum",51,"TPHCM",3000);
		tc.display();
	}
}
