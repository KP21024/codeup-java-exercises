public class BasicJavaPractice {
    //1.
//As of 2016, Android has 81.7 percent of the market share for mobile operating //systems. Create a variable called androidShare that holds this percentage as a double.

//Checkpoint 2 Passed
//2.
//Print out androidShare to the console.

    public class MarketShare {
        public static void main(String[] args) {
            double androidShare = 81.7;
            System.out.println(androidShare);
        }

    }



//Create a variable called intsCanHoldDecimals. Set it to true if the int type can hold a decimal number. Set it to false if the int type cannot do this.

//Checkpoint 2 Passed
//2.
//Print out your intsCanHoldDecimals variable.

    public class Booleans {
        public static void main(String[] args) {
            boolean intsCanHoldDecimals = false;
            System.out.println(intsCanHoldDecimals);
        }
    }

//1.
//Create a variable called expectedGrade of type char.

//Fill it with a single letter, representing the grade you think you would get in a graded Java course where the grades A, B, C, D and F are possible.

//2.
//Print out your expectedGrade variable!

    public class Char {
        public static void main(String[] args) {
            char expectedGrade = 'A';
            System.out.print(expectedGrade);
        }
    }


//Create a variable called openingLyrics that holds "Yesterday, all my troubles seemed so far away".

//Checkpoint 2 Passed
//2.
//Call System.out.println() to print out openingLyrics.

    public class Song {
        public static void main(String[] args) {
            String openingLyrics = "Yesterday, all my troubles seemed so far away";
            System.out.println(openingLyrics);
        }
    }

//.
//In the Mess.java file, we have declared a bunch of variables with the wrong type. Try to compile the file using the command:

//javac Mess.java
//Checkpoint 2 Passed
//2.
//Change the types of the variables so that they correspond with the type of the assignment values.

//For example, year is assigned 2001, so it should be an int.

    public class Mess {
        public static void main(String[] args) {

            int year = 2001;
            String title = "Shrek";
            char genre = 'C';
            double runtime = 1.58;
            boolean isPG = true;

        }


    }

//In the BadNames.java file, we declared variables with confusing names. Run the file and look at the error messages you get when trying to compile.

//Checkpoint 2 Passed
//2.
//Some of these variable names are illegal! Change the ones that are preventing the file from compiling.

    public class BadNames {
        public static void main(String[] args) {
            String firstName = "Samira";
            String blah = "Smith";
            String dotCom = "samira@google.com";
            int salaryexpectation = 100000;
            int yearOfBirth = 1955;

            System.out.println("The program runs!");
        }
    }

//1.
//The file MyProfile.java contains a class that represents your hiring profile as presented to potential employers.

    In the main() method, create a variable called name that holds your name, as a sequence of characters.

    Checkpoint 2 Passed

    Stuck? Get a hint
2.
    Create a variable called age that holds your age as a whole number.

            Checkpoint 3 Passed
3.
    Create a variable called desiredSalary that holds your desired salary per year to a precision of two decimal points.

            Checkpoint 4 Passed

    Stuck? Get a hint
4.
    Create a variable called gender that holds a single character, m (male), f (female), n (for none), or o (for other).

    Checkpoint 5 Passed
5.
    Create a variable called lookingForJob that holds whether or not you are currently open to job offers.


    public class MyProfile {
        public static void main(String[] args) {
            String name = "Kenny";
            int age = 36;
            double desiredSalary = 80000.00;
            char gender = 'm';
            boolean lookingForJob = true;
        }
    }

}
