public class ConsoleExercise {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is apprroximately %.2f", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer:");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered %d%n", userInput);


//      System.out.println(("Enter a sentence: ");
//        String userInput = scanner.next();
//        System.out.printf("%s%n", userInput);

        System.out.println("Enter the length of your classroom:");
        String length = scanner.nextLine();
        System.out.println("Enter the width of your classroom:");
        String width = scanner.nextLine();
        int perimeter = (Integer.parseInt(width) + Integer.parseInt(length)) * 2);
        System.out.printf("The perimeter of your classroom is %d%n", perimeter);
    }

}