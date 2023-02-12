public class Main {
    public static void main(String[] args) {
        //Declare Variables
        int month = 2;

        //Input

        System.out.println("Enter your birth month: ");

        //Output

        if (1 <= month && month <= 12)
        {
            System.out.println("Your birth month is: " + month);
        }

        else
            {
                System.out.println("You entered an incorrect Birth Month Value: " + month);
            }
        }
    }