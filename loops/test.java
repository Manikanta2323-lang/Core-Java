package loops;
 import java.util.Scanner;

public class test {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student info
        System.out.println("Enter Student ID: ");
        int studentID = sc.nextInt();

        System.out.print("Enter Student Name: ");
        String studentName = sc.next();

        System.out.print("Enter Attendance Percentage: ");
        int attendance = sc.nextInt();

        // Score input without arrays
        int totalScore = 0;
        int subjectCount = 0;
        String choice;

        

        while (true) {
            System.out.print("Enter subject score: ");
            int score = sc.nextInt();
            totalScore += score;
            subjectCount++;

            sc.nextLine(); // clear buffer10

            System.out.print("Do you want to enter another score? (yes/no): ");
            choice = sc.nextLine().toLowerCase();

            if (!choice.equals("yes")) {
                break;
            }
        }

        // Calculate average
        double average = 0;
        average=totalScore/subjectCount;
       
        

        // Determine grade
        String grade;
        if (average >= 85) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 35) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        // Award status
        String awardStatus;
        if (attendance >= 75) {
            awardStatus = "Awarded";
        } else {
            awardStatus = "No Award";
        }

        // Final Report
        System.out.println("\n----- STUDENT GRADE REPORT -----");
        System.out.println("Student Name      : " + studentName);
        System.out.println("Total Score       : " + totalScore);
        System.out.println("Average Score     : " + average);
        System.out.println("Number of Subjects: " + subjectCount);
        System.out.println("Grade             : " + grade);
        System.out.println("Award Status      : " + awardStatus);
    }
}


