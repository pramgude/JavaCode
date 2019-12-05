
public class FinallyMethod {

	public static void main(String[] args) {
		try
		{
			System.out.println("The value :");
			for(int i=0;i<=3;i++)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("The finally block always execute.....");
		}

	}

}


//o/p :
/*
 * The value :
 *  0
 *   1 
 *   2
 *    3 
 *    The finally block always execute.....
 */
