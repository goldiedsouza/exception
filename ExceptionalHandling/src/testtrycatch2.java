
public class testtrycatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int data=50/10;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}

}
