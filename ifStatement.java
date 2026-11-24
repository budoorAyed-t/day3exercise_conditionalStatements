import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ifStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1.Write a program that checks the role of the user
        System.out.print("Enter your role (admin, superuser, or user): ");
        String role = input.nextLine();

        if (role.equalsIgnoreCase("admin")){
            System.out.print("welcome admin");
        }
        else if(role.equalsIgnoreCase("superuser")){
            System.out.print("welcome superuser");
        }
        else if(role.equalsIgnoreCase("user")){
            System.out.print("welcome user");
        }
        else{
            System.out.print("invalid input");
        }
        System.out.print("\n\n");

        //2.Take three numbers from the user and print the greatest number.
        //Test Data
        System.out.println("Find the greatest number between three numbers");

        System.out.print("Input the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = input.nextInt();

        int greatest;

        if(num1>=num2 && num1>=num3){
            greatest = num1;
        }
        else if(num2>=num3){
            greatest = num2;
        }
        else{
            greatest = num3;
        }

        System.out.print("The greatest: " + greatest);
        System.out.print("\n\n");

        //3.Write a Java program that generates an integer between 1 and 7
        //and displays the name of the weekday. 5

        System.out.println("Display the name of the weekday corresponding to the entered number");
        System.out.print("Enter a number between 1 to 7: ");
        int weekdayNum = input.nextInt();

        switch(weekdayNum) {
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("invalid input");
        }
        System.out.print("\n\n");

        //4.
        //Write a program that takes a numeric score as input and prints
        //the corresponding letter grade using the following grading scale:

        System.out.println("Print the letter grade corresponding to the numeric score");
        System.out.print("Enter your numeric score: ");
        int numScore = input.nextInt();

        String letterGrade = "X";
        if (numScore >= 90 && numScore <= 100){
            letterGrade = "A";
        }
        else if (numScore >= 80 && numScore < 90){
            letterGrade = "B";
        }
        else if (numScore >= 70 && numScore < 80){
            letterGrade = "C";
        }
        else if (numScore >= 60 && numScore < 70){
            letterGrade = "D";
        }
        else if (numScore >= 0 && numScore < 60){
            letterGrade = "F";
        }

        if (letterGrade.equals("X")){
            System.out.print("invalid input");
        }
        else {
            System.out.println("Numeric Score: " + numScore);
            System.out.print("Letter Grade: " + letterGrade);
        }
        System.out.print("\n\n");

        //5.
        //Write a Java program that takes a person's age as input and
        //categorizes them into one of three age categories: "Child,"
        //"Teenager," or "Adult" using an if statement.

        System.out.println("Human age classification");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        String ageCategory;
        if(age < 13 && age > 0){
            System.out.print("You are a child");
        }
        else if(age > 13 && age <=19){
            System.out.print("You are a teenager");
        }
        else if(age > 19 && age <= 130){
            System.out.print("You are an adult");
        }
        else{
            System.out.print("invalid input");
        }

    }
}