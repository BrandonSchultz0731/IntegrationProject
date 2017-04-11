
//Brandon Schultz
//This project is about all the things discussed in class.

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Integration {

  public static void main(String[] args) // This is a header
  {

    int i = 4;
    double d = 4.0;
    String s = "I am initializing a variable";
    // A variable is a location in memory
    int menuSelection;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    // Java built-in data types
    // System.out.println("What is a byte?");
    // System.out.println("The byte data type is an 8-bit signed two's
    // complement integer."
    // + " Min value: -128. Max Value = 127. Useful for saving memory in "
    // + "large arrays.");
    // System.out.println("What is a short?");
    // System.out.println("The short data type is a 16-bit signed two's
    // complement integer."
    // + " Min Value = -32,768 Max value = 32,767. Same guidelines as byte.");
    // System.out.println("What is an Int?");
    // System.out.println("the int data type is a 32-bit signed two's"
    // + " complement integer, which has a minimum value of -231 and a maximum
    // value of 231-1. "
    // + "Represent an unsigned 32 bit integer.");
    // System.out.println("What is a long?");
    // System.out.println("The long data type is a 64-bit two's complement
    // integer. "
    // + "The signed long has a minimum value of -263 and a maximum value of
    // 263-1. "
    // + "Represent an unsigned 64 bit long.");
    // System.out.println("What is a float?");
    // System.out.println("The float data type is a single-precision 32-bit IEEE
    // 754 floating point. "
    // + "Use float if you need to save memory in large arrays of floating point
    // numbers. ");
    // System.out.println("What is a double?");
    // System.out.println("The double data type is a double-precision 64-bit
    // IEEE 754 floating point. "
    // + "Generally the default choice. ");
    // System.out.println("What is a boolean?");
    // System.out.println("The boolean data type has only two possible
    // values: true and false. "
    // + "Represents one bit of information. ");
    // System.out.println("What is a char?");
    // System.out.println("The char data type is a single 16-bit Unicode
    // character. "
    // + "It has a minimum value of \u0000 (or 0) and a maximum value
    // of \uffff");

    // A Relational Operator is an operator that tests or defines some
    // relationship between two entities.
    // A Conditional Operator is used to evaluate a condition thats applied to
    // one or two boolean expressions

    int myProgram = 1;

    while (myProgram == 1) {
      int testNum = 0;
      boolean mainException = false;
      while (mainException == false) {
        try {
          System.out.println("Welcome to the Menu Selection! Please select from the following options:\n");
          System.out.println("Enter '1' for: Mathematical Operations (Line 241)");
          System.out.println("Enter '2' for: if-else Statements (Line 278)");
          System.out.println("Entet '3' for: Find Your Age With Switch Statement (Line 308)");
          System.out.println("Enter '4' for: Using Arrays (Line 369)");
          System.out.println("Enter '5' for: What Type of Car is it? (Line 321)");
          System.out.println("Enter '6' for: Making a Staircase (Line ---)");
          System.out.println("Enter '7' for: Guessing Game (Line 442)");
          System.out.println("Enter '8' for: Searching Array (Line 480)");
          System.out.println("Enter '9' for: Summation of a Number (Line 509)");
          System.out.println("Enter '10' for: Factorial of a Number (Line 519)");
          System.out.println("Enter '11' for: Convert to Military Time (Line 528)");
          System.out.println("Enter '12' for: Search in 2-D Arrays (Line 571)");
          System.out.println("Enter '13' for: Using Inheritance");
          System.out.println();
          testNum = scan.nextInt();
          mainException = true;
        } catch (Exception e) {
          System.out.println("Bad input, you didnt enter a valid number\n");
          scan.nextLine();

        }
      }

      menuSelection = testNum;

      while (menuSelection < 1 || menuSelection > 13) // This is a use of the
                                                      // conditional OR operator
      {
        System.out.println("You did not enter a valid entry. Please enter a number 1-13");
        menuSelection = scan.nextInt();
      }

      switch (menuSelection) {

      case 1:
        doMath(scan); // This is a call, and inside the parenthesis is an
                      // argument
        break;

      case 2:
        thisIsIfElse(scan, i);
        break;

      case 3:
        findAge(scan);
        break;

      case 4:
        creatingArrays(scan); // This is creating and using an array
        break;

      case 5:
        System.out.println("You chose What Type of Car Is It?");
        System.out.println(
            "This is showing how to use information that is private and display it using a public \n" + "method");
        Car myCar = new Car();
        myCar.setColor("blue");
        myCar.setMake("Ford");
        System.out.println("My car is a " + myCar.getColor() + " " + myCar.getMake() + ".");
        break;

      case 6:
        creatingStaircase(scan);
        break;

      case 7:
        guessingGame(scan, rand);
        break;

      case 8:
        searchArrayIndex(scan);
        break;

      case 9:
        System.out.println("You chose Summation!\n");
        System.out.println(
            "Mathemtically, a summation is the sum of a sequence of numbers in decending order" + " down to 0\n");

        boolean exception = false;
        while (exception == false) {
          try {
            System.out.println("Please enter a number you want the summation of:");
            int n = scan.nextInt();
            System.out.println("The summation of " + n + " is: " + Summation(n) + "\n");
            exception = true;
          } catch (InputMismatchException e) {
            e.printStackTrace();
            scan.nextLine();
          }
        }
        break;

      case 10:
        System.out.println("You chose Factorial!\n");
        System.out.println("Mathemtically, a factorial is the multiplication of a sequence of numbers in decending "
            + "order down to 1\n");
        boolean exception1 = false;
        while (exception1 == false) {
          try {
            System.out.println("Please enter a number you want the summation of:");
            long k = scan.nextLong();
            System.out.println("The facortial of " + k + " is: " + Factorial(BigInteger.valueOf(k)) + "\n");
            exception1 = true;
          } catch (InputMismatchException e) {
            System.out.println("Bad input");
            scan.nextLine();
          }
        }
        break;

      case 11:
        System.out.println("You chose Military Time!\n");
        System.out.println("This program will take whatever time you enter and convert it to Military Time."
            + "Please enter a time, specifying AM or PM");
        convertToMilitary(scan);
        break;

      case 12:
        TwoDArray(scan);
        break;

      case 13:
        System.out.println("This program is demonstrating the use of inheritance!");
        SportsCar mySportsCar = new SportsCar();
        mySportsCar.setStickShift("5 speed");
        mySportsCar.setColor("Red");
        mySportsCar.setMake("Chevy");

        System.out.println(mySportsCar.getColor() + " " + mySportsCar.getMake() + " with a "
            + mySportsCar.getStickShift() + " transmission");

      } // This closer goes to switch menuSlection

      // This is a switch statement
      // char grade = 'C';
      //
      // switch (grade) {
      // case 'A':
      // System.out.println("Awesome!");
      // break;
      // case 'B':
      // System.out.println("Great!");
      // break;
      // case 'C':
      // System.out.println("Pretty good");
      // break;
      // case 'D':
      // System.out.println("You can do better");
      // break;
      // case 'F':
      // System.out.println("You should come to class more...");
      // break;
      //
      // }
      // System.out.println("You're grade is a " + grade);

      System.out.println("\nPress 1 to go back to main menu or press 2 to quit");
      myProgram = scan.nextInt();
    }

  }

  // This is a method for case 1
  public static void doMath(Scanner scan) { // This is a parameter
    int replay = 1;
    while(replay == 1){
      boolean exception = true;
      // These are mathematical operations using variables
      System.out.println("You chose Mathematical Operations! \n");
      System.out.println("This program will let you choose 2 numbers and it will do the 4 basic mathematical operations "
          + "with those numbers \nas well as give the remainder. The 2 numbers are stored in 2 separate variables "
          + "in order to do the calculations. \n");
      System.out.println("Please choose 2 numbers:");
      int firstNumber = 0;
      int secondNumber = 0;

      while (exception) {
        try {
          firstNumber = scan.nextInt();
          exception = false;
        } catch (InputMismatchException e) {
          System.out.println("Bad input, enter a real number for the first number");
          scan.nextLine();
        }

      }
      exception = true;
      while (exception) {
        try {
          secondNumber = scan.nextInt();
          exception = false;
        } catch (InputMismatchException e) {
          System.out.println("Bad input, eneter a real number for the second number");
          scan.nextLine();
        }
      }

      int thisIsMultiplication = firstNumber * secondNumber;
      int thisIsSubtraction = firstNumber - secondNumber;
      int thisIsAddition = firstNumber + secondNumber;
      float thisIsDivision = (float) firstNumber / secondNumber;
      int thisIsRemainder = firstNumber % secondNumber;
      System.out.println("Multiplying these numbers gives you " + thisIsMultiplication);
      System.out.println("Subtracting these numbers gives you " + thisIsSubtraction);
      System.out.println("Adding these numbers gives you " + thisIsAddition);
      System.out.println("Dividing these numbers gives you " + thisIsDivision);
      System.out.println("The remainder of these numbers is " + thisIsRemainder);

      /*
       * int division takes the two variables which contain numerical values
       * within them and divides them to produces another value, which is assigned
       * to the new variable
       */
      System.out.println("\nTo replay, press 1, else, press 2");
      replay = scan.nextInt();

    }
    
  }

  public static void thisIsIfElse(Scanner scan, int i) {
    boolean exception = true;
    // This is an if-else statement
    System.out.println("You chose if-else Statement! \n");
    System.out.println("This program will let you chose one number, and based on your number, it will determine if \n"
        + "your number is less than, equal to, or greater than 4 \n");
    System.out.println("Please enter your number:");
    while (exception) {
      try {
        i = scan.nextInt();
        if (i < 4) // This is a use of a relational operator using the less than
                   // sign
        {
          System.out.println("Your number is less than 4");
        } else if (i == 4) {
          System.out.println("Your number is equal to 4");
        } else {
          System.out.println("Your number is greater than 4");
        }
        exception = false;
      }

      catch (InputMismatchException e) {
        System.out.println("Bad input! Please enter a real number and try again.");
        scan.nextLine();
      }
    }

  }

  public static void findAge(Scanner scan) {
    boolean exception = true;
    // Finding your age using switch statements, inspired by
    // homeandlearn.co.uk
    System.out.println("You chose Finding Your Age! \n");
    System.out.println("Based on the age that you enter, this program will determine where your age falls \n"
        + "in the category. Beware, if your age is too high, you will be called old! \n");
    System.out.println("Enter Your Age: ");
    while (exception) {
      try {
        int age = scan.nextInt();
        switch (age) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
          System.out.println("You are between 1-10");
          break;
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
          System.out.println("You are between 11-20");
          break;
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        case 26:
        case 27:
        case 28:
        case 29:
        case 30:
          System.out.println("You are between 21-30");
          break;
        default:
          System.out.println("You are old!");

        }
        exception = false;
      } catch (InputMismatchException e) {
        System.out.println("Bad input! Please enter a real number and try again.");
        scan.nextLine();
      }
    }

  }

  public static void creatingArrays(Scanner scan) {
    boolean exception = true;
    // This is creating and using an array
    System.out.println("You chose Creating an Array! \n");
    System.out.println("An array is similar to a variable but it can hold multiple numbers instead of just one. \n"
        + "This program will create an array that holds 5 numbers and find the smallest number of the 5 as well \n"
        + "as the sum \n");
    System.out.println("Please enter 5 numbers that you want to double:");
    while (exception) {
      
        int array[] = new int[5]; // An array, called 'array', with an index of
                                  // 5

        for (int i = 0; i < 5;) {
          try{
            array[i] = scan.nextInt();
            i++;
          }
          catch(InputMismatchException e){
            System.out.println("Bad input, please enter a real number for number "+ (i+1));
            scan.nextLine();
          }
          
        }
        int min = array[0];

        // Find the smallest value in an array

        for (int i = 0; i < array.length; i++) { // This is a for loop
          if (min > array[i]) {
            min = array[i];
          }
        }
        System.out.println("The smallest number is " + min);

        // This is the sum of the numbers in the array
        int accumulator = 0;
        for (int i = 0; i < array.length; i++) {
          accumulator += array[i];
        }
        System.out.println("The sum is " + accumulator);
        exception = false;
      
    }

  }

  public static void creatingStaircase(Scanner scan) {
    boolean exception = true;
    System.out.println("You chose Making a Staircase!");
    System.out.println("This is going to make a right-aligned staircase with any symbol you choose! To make this \n"
        + "program, I am using two for loops, one for the spaces and one for the symbol");

    System.out.println("Please enter the width you want the staircase to be:");

    while (exception) {
      try {
        int width = scan.nextInt();
        System.out.println("Please enter any desired symbol for the staircase");
        String symbol = scan.next();
        String repeatSymbol = symbol;
        String space = " ";
        for (int i = 1; i <= width; i++) {
          for (int x = 0; x < width - i; x++) {
            System.out.print(space);
          }
          System.out.println(symbol);
          symbol = symbol + repeatSymbol;
        }
        exception = false;
      } catch (InputMismatchException e) {
        System.out.println("Bad input! Please try again");
        scan.nextLine();
      }
    }

  }

  public static void guessingGame(Scanner scan, Random rand) {
    boolean exception = true;
    // This is a guessing game using random number generator
    System.out.println("You chose Guessing Game!\n");
    System.out.println("This is a guessing game using the random number generator! The computer generates a random \n"
        + "number and you have to guess it. But, you only get 4 tries! Choose wisely...\n");
    int randNum = 1 + rand.nextInt(10);

    System.out.println("Im thinking of a number 1-10. What is it?");
    int i = 3;
    int userNum = 0;
    while (exception) {
      try {
        for (; i > 0;) {
          userNum = scan.nextInt();
          i--;
          if (i == 0) {
            break;
          } else if (userNum != randNum) {
            System.out.print("Wrong! You have " + i + " more ");
            if (i > 1) {
              System.out.println("tries");
            } else {
              System.out.println("try");
            }

          }

          else {
            System.out.println("Correct! It was " + randNum);
            break;
          }

        }
        if (userNum != randNum) {
          System.out.println("You Lose! The number was " + randNum);
        }
        exception = false;
      } catch (InputMismatchException e) {
        System.out.println("Bad input, please enter a real number");

        scan.nextLine();

      }
    }

  }

  public static void searchArrayIndex(Scanner scan) {
    // This will search an array for a number entered and tell the user what
    // index the number was found in the array
    System.out.println("You chose Search Array!\n");
    System.out.println("This program will have you input a number 1-10. Within the program, there is an array that "
        + "holds random assorted numbers 1 through 10");

    boolean exception = true;
    while (exception) {
      try {
        int value = scan.nextInt();
        int[] myArray = { 2, 5, 9, 1, 3, 10, 8, 6, 7, 5, 4 };

        for (int i = 0; i < myArray.length; i++) {
          if (value == myArray[i]) {
            System.out.println("The number you entered is in the " + i + "th index position of the array, or "
                + "position number " + (i + 1) + " of the array if you start from 1");
          }

        }
        exception = false;
      } catch (InputMismatchException e) {
        System.out.println("Bad input. Please try again");
        scan.nextLine();
      }
    }

  }

  public static int Summation(int n) {
    if (n <= 0) {
      return 0;

    } else {
      return n + Summation(n - 1);
    }
  }

  public static BigInteger Factorial(BigInteger n) {

    if (n.compareTo(BigInteger.ZERO) == 0) {
      return BigInteger.ONE;
    } else {
      return n.multiply(Factorial(n.subtract(BigInteger.ONE)));
    }
  }

  public static void convertToMilitary(Scanner scan) {
    boolean exception = true;
    while (exception) {
      try {
        String time = scan.next();
        if (time.length() == 9) {
          time = "0" + time;
        }

        String TwentyFour;
        if (time.substring(8, 9).equals("A")) {
          if (time.substring(0, 2).equals("12")) {
            TwentyFour = "00";

          } else {
            TwentyFour = time.substring(0, 2);
          }
          System.out.print(TwentyFour);
          System.out.println(time.substring(2, time.length() - 2));
        } else {
          int x = Integer.parseInt(time.substring(0, 2));

          if (time.substring(0, 2).equals("12")) {
            TwentyFour = "12";
          } else {
            TwentyFour = Integer.toString(x + 12);
          }

          System.out.print("The time is " + TwentyFour);
          System.out.println(time.substring(2, time.length() - 2));
        }
        exception = false;
      } catch (InputMismatchException e) {
        System.out.println("Bad input! Please enter the proper time in the form of hh:mm:ss_M with AM or PM");
        scan.nextLine();
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Bad input! Please enter the proper time in the form of hh:mm:ss_M with AM or PM");
        scan.nextLine();
      }
    }

  }

  public static void TwoDArray(Scanner scan) {
    int[][] myArray = new int[3][3];

    for (int row = 0; row < myArray.length; row++) {
      for (int col = 0; col < myArray.length; col++) {
        myArray[row][col] = (int) (Math.random() * 10) + 1;
        System.out.print(myArray[row][col] + "\t");
        if (col == 2) {
          System.out.println();
        }
      }
    }
    System.out.println("Please enter a value 1-10 to see if it's in the array:");
    boolean exception = true;

    while (exception) {
      try {
        int value = scan.nextInt();
        boolean numberFound = false;
        for (int row = 0; row < myArray.length; row++) {
          for (int col = 0; col < myArray.length; col++) {
            if (value == myArray[row][col]) {
              System.out
                  .println("The number you entered is in row number " + (row + 1) + " and column number " + (col + 1));
              numberFound = true;
            }

          }
        }
        if (numberFound != true) {
          System.out.println("The number " + value + " was not found");
        }
        exception = false;
      } catch (InputMismatchException e) {
        System.out.println("Bad Input. Please enter a real number!");
        scan.nextLine();
      }

    }

  }

}
