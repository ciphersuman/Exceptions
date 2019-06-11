
public class AssertionDemo {
	
	public static void main(String args[])
	{
		testAssertion(-5);
	}
	
	
	
	
	public static void  testAssertion(int x)
	{
		assert (x>=0);
		
		
		System.out.println("hello stop the world not happened ");
	}

}
