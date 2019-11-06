
public class NamePrinter 
{
	 public static void main(String [] args)
	    {
			String myName = "Nazari Tuyo";
			int positionOfSpace = myName.indexOf(' ');
			String firstName = myName.substring(0, positionOfSpace);
			String lastName = myName.substring(positionOfSpace +1);
			System.out.println(firstName);
			System.out.println(lastName);
			
			for (int i=0; i < myName.length(); i++)
			{
				myName.charAt(i);
				System.out.println(myName.charAt(i));
			}
			
			
			
			
				
			
	
	    }

}
