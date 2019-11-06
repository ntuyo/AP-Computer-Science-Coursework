import java.util.Scanner;
// Sofia and Nazari




// A program that asks the user to think of a number, then tries
// to guess what it was.
public class GuessYourNumber {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] numbersToGuess = initializeNumbers(10);
        
        System.out.println("Think of a number between 1 and 10 and I'll try to guess it.");
        
        // Choose a number to guess, then ask the user if it was the right one. The
        // key thing here is that we're randomly choosing the INDEX of the number to 
        // guess, not directly choosing a number.
        int indexOfGuess = (int)(Math.random() * 10);
        System.out.print("Was it " + numbersToGuess[indexOfGuess] + "? ");
        String answer = input.nextLine();
        
        // Until the user says 'yes', keep guessing.
        while (!answer.equals("Yes"))
        {
            // Remove the number we just guessed from the list of numbers, so
            // we don't guess it again. If we run out of numbers, the user is
            // cheating!
            numbersToGuess = removeNumberFromList(numbersToGuess, indexOfGuess); 
            if (numbersToGuess.length == 0)
            {
                System.out.println("What?!? That was all the numbers!");
                return;
            }
            
            
            indexOfGuess = (int)(Math.random() * (numbersToGuess.length));
            System.out.print("Okay, then was it " + numbersToGuess[indexOfGuess] + "? ");
            answer = input.nextLine();
        }
        
        // The user said we got it.
        System.out.println("Woohoo!");
    }
    
    // Set up an array with 'howMany' counting numbers numbers in it, starting at 1.
    public static int[] initializeNumbers(int howMany)
    {
        int [] numbers = new int[howMany];
        for (int i = 0; i < howMany; i++)
        {
        		numbers[i] = i + 1;
        }
        
        return numbers;
    }
    
    // Remove the number at 'index' from the array 'list' by constructing a new array
    // that doesn't include the number we want to skip, and return that new array.
    public static int[] removeNumberFromList(int[] list, int index)
    {
        // make a new array that is one element smaller than the old one
        int[] newList = new int[(list.length) - 1];
        
        // copy all the values up to but not including the one we want to
        // leave out
        for (int i = 0; i < index; i++)
        {
            newList[i] = list[i];
        }
        
        // copy all the values *after* the one we want to leave out
        for (int j = index; j < newList.length; j++)
        {
            newList[j] = list[j + 1];
        }
        
        return newList;
    }
}
