public class Dashes
{
    /*
     * The purpose of this program is to print lines
     * like this:  +-------+
     */
    public static void main(String[] args)
    {
        printADashedLine();
        printADashedLine();
    }
    
    /*
     * We're going to use a method to do the printing.
     * We'll divide it up into 3 parts to make it a little
     * easier to modify later.
     */
    public static void printADashedLine()
    {
        System.out.print("+");
        System.out.print("-------");
        System.out.println("+");
    }
}