
public class TestThrow1 {
	
		static void validate(int age)
		{
			if(age<18)
				throw new ArithmeticException("not valid");
			else
				System.out.println("Welcome to vote");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);
		System.out.println("rest of the code");

	}

}
