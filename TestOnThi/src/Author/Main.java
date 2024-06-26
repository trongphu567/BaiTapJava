package Author;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author authors[]=new Author[3];
		authors[0]=new Author("Phu","a@gmail.com");
		authors[1]=new Author("Phuc", "b@gmail.com");
		authors[2]=new Author("Phi", "c@gmail.com");
		
		Book book1=new Book("Hello", authors, 500000);
		System.out.println(book1.getAuthorNames());
	}

}
