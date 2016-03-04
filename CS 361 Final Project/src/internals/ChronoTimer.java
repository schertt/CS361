package internals;

import java.io.*;
import java.sql.Timestamp;
import java.util.*;
/**
 * @author 
 * The ChronoTimer class is responsible for
 * acting as the driver of the chronoTimer program.
 * It will also read commands from a text file
 * to simulate incoming 'signals'.
 */
public class ChronoTimer {

	private static Scanner stdIn = new Scanner(System.in);
	private ArrayList<Event> events = new ArrayList<Event>();
	static Timestamp currentTimestamp = new Timestamp((Calendar.getInstance().getTime()));
	
	public static void main(String[] arg)
	{
		System.out.println(currentTimestamp);
		//prompt user for file or console input
		System.out.print("Enter the name of the test file (Press <Enter> for console input): ");
		String filename = stdIn.nextLine();
		readCommands(filename);
	}
	
	
	
	//file reader
	private static void readCommands(String file) 
	{
		// reads from file if file is a non-empty string
		if (!file.isEmpty())
		{
			try 
			{
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while ((line = br.readLine()) != null)
				{
					
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		// reads from console if file is an empty string
		else
		{
			System.out.println("Enter commands (<CMD><ARGUMENT LIST><EOL>): ");
			String line;
			line = stdIn.nextLine();
		}
			
	}
	
	private static void processCommands()
	{
		
	}
	
	
}
