import java.util.Date;

class Thread_ex4
{
	int wait=0;
	Date dt;
	
	void ThreadActivity()
	{
		dt=new Date();
		System.out.println("Before Threading");
		System.out.println(dt.getHours() + " " +dt.getMinutes() + " " +dt.getSeconds());
		try
		{
			while(wait<=100)
			{
				Thread.sleep(1000);
				wait++;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error" +e.toString());
		}
		finally
		{
			dt=new Date();
			System.out.println("\n After Threading");
			System.out.println(dt.getHours() + " " +dt.getMinutes() + " " +dt.getSeconds());
			
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		Thread_ex4 obj=new Thread_ex4();
		obj.ThreadActivity();

	}

}
