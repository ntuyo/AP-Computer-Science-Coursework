public class DashesWithParameter
{
    /*
     * The purpose of this program is to print lines
     * like this:  +-------+
     * of different lengths
     */
    public static void main(String[] args)
    {
        printADashedLine(7);
        printADashedLine(11);
        printADashedLine(45);
    }
    
    /*
     * We're going to use a method to do the printing.
     * Now the middle part has been turned into a loop.
     */
    public static void printADashedLine(int length)
    {
        System.out.print("+");
        for (int i = 0; i < length; i++)
        {
            System.out.print("-");
        }
        System.out.println("+");
    }
}