package firstproj;

public class classobj {
	int yearofpurchase; //data member
	String model;// data member
	double cost;// datamember
	public void disp1()// member function
	{
		System.out.println("year of purchase" + 2001);
		System.out.println("make" + "suzuki");
	}
	public void displ2()// member function
	{
		System.out.println("model" + 1999);
		System.out.println("cost" + 200000);
		
	}


	public static void main(String[] args) {
		classobj hi = new classobj();
		hi.disp1();
		hi.displ2();
		// TODO Auto-generated method stub

	}

}
