import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int num = 5;
//        while (num <= 15) {
//            System.out.printf(num + " ");
//            num += 1;
//        }

//    }
//}

//1b
//    int i = 0;
//    do {
//        System.out.println(i);
//        i += 2;
//    } while (i <= 100);

//        int num = 100;
//        do {
//            System.out.println(num);
//            num -= 5;
//        } while (num >= -10);

//        int num = 2;
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num < 1_000_000);
//
//
//          }
//      };

//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//
//        }
//    }};
        boolean willContinue = false;
        do {
            System.out.println("Please enter integer");
            Scanner sc = new Scanner(System.in);
            int userInt = sc.nextInt();
            System.out.println(userInt + " | " + userInt * userInt + " | " + Math.pow(userInt, 3));

            for (int i = 1; i <= userInt; i++) {
                System.out.println(i + " | " + i * i + " | " + (int) Math.pow(i, 3));

            }
            System.out.println("Do you want to enter another number? (y/n)");
            String userResponse = sc.next();
            if (userResponse.equals("y")) {
                willContinue = true;
            } else {
                willContinue = false;
            }
        } while (willContinue);
    }
}