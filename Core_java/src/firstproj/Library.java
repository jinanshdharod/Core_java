package firstproj;

public class Library {
	int acc_num;
	String Title;
	String Author;
	
	void input()
	{
		acc_num = 7;
		Title = "Harry Potter";
		Author = "JK Rowling";
	}
	void compute()
	{
		int days = 8;
		int fine = days*5;
		System.out.println("Fine = Rs." + fine);
		
	}
    void display()
    {
    	System.out.println("Accession Number\t Title\t\t Author");
    	System.out.println(acc_num + "\t\t\t"+ Title +"\t" + Author);
    	
    }
    
	public static void main(String[] args) {
		Library ob = new Library();
		ob.input();
		ob.compute();
		ob.display();
		
		// TODO Auto-generated method stub

	}

}
