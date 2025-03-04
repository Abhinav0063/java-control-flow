import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int age1 = input.nextInt();
        System.out.print("Enter height of Amar: ");
        int height1 = input.nextInt();

        System.out.print("Enter age of Akbar: ");
        int age2 = input.nextInt();
        System.out.print("Enter height of Akbar: ");
        int height2 = input.nextInt();

        System.out.print("Enter age of Anthony: ");
        int age3 = input.nextInt();
        System.out.print("Enter height of Anthony: ");
        int height3 = input.nextInt();

        // Finding the youngest
        int youngestAge = Math.min(age1, Math.min(age2, age3));
        String youngest = (youngestAge == age1) ? "Amar" : (youngestAge == age2) ? "Akbar" : "Anthony";

        // Finding the tallest
        int tallestHeight = Math.max(height1, Math.max(height2, height3));
        String tallest = (tallestHeight == height1) ? "Amar" : (tallestHeight == height2) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is " + youngest + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallest + " with height " + tallestHeight + " cm.");

        input.close();
    }
}
