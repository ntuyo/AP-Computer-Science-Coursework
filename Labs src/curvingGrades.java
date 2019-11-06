import java.util.Scanner;

public class curvingGrades {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many grades will you enter?");
		
		String inputtedNumOfGrades = console.nextLine();
		int numOfGrades = Integer.parseInt(inputtedNumOfGrades);
		int maximumGrade = 0;
		int maximumDifference = 0;
		int[] grades = new int[numOfGrades];
		for(int i = 1; i <= grades.length; i++)
		{
			
			System.out.print("Enter grade " + i + ":");
			String inputtedGrade = console.nextLine();
			int grade = Integer.parseInt(inputtedGrade);
			grades[i - 1] = grade;
			if(grade > maximumGrade)
			{
				maximumGrade = grade;
				maximumDifference = 100 - maximumGrade;
			}
			
		}
		
		for(int i = 0; i < grades.length; i++)
		{
			System.out.println("Original:" + grades[i] + " With curve: " + (grades[i] + maximumDifference));
		}
		
	}

}
