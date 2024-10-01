import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What party are you affiliated with? (D, R, I): ");

        String input = in.nextLine().trim().toUpperCase();

        if (input.equals("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        } else if (input.equals("R"))

        {
            System.out.println("You get a Republican Elephant!");
        } else if (input.equals("I"))

        {
            System.out.println("You get an Independent Person!");
        } else

        {
            System.out.println("Other");
        }

        in.close();
    }
}
