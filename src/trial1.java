
public class trial1 
{
	public static void main(String[] args)
	{
		System.out.println("Hello, this is a trial run.");
		System.out.println("Let's add the numbers 5 and 6");
		int number = addNums();
		System.out.printf("The sum is %d", number);
	}
	
	private static int addNums()
	{
		return (5 + 6);
	}
}
