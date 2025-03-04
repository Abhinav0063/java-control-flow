import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for three subjects
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        // Calculate percentage
        double percentage = (physics + chemistry + maths) / 3.0;
        
        // Determine grade based on percentage
        char grade;
        String remarks;

        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Display the results
        System.out.println("Average Marks: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
