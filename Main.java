import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Asking for the max amount of people that can go to the park
    System.out.println("What is the max amount of people that can fit in the park? (Whole # only)");

    int numMax = scan.nextInt();

    System.out.println("How many people do you see at the park? (Whole # only)");

    int numPeople = scan.nextInt();

    System.out.println("There are " + openSpace(numPeople, numMax) + " spaces left");

    // Asking if there are benches available

    System.out.println("How many people want to play");

    int totalPeople = scan.nextInt();

    System.out.println("There are 3 activitives: Double biking (2), Roller Skating (1), Volleyball (4) ");

    System.out.println("How many want to bike (must be less than " + totalPeople + ")");

    int bikes = scan.nextInt();

    // call spaceAvailable method to see the remainder of ppl that still need
    // equipment & then print out that number to the user
    int leftOver = totalPeople - bikes + spaceAvaliable(bikes, 2);
    
    
    System.out.println("How many want to volleyball (must be less than " + leftOver + ")");
    int volleyBall = scan.nextInt();
    
     leftOver = leftOver - volleyBall + spaceAvaliable(volleyBall, 4);

     
     System.out.println("The " + leftOver + " of you can roller skate");
  }

  // method 1
  static int openSpace(int numPeople, int numMax) {
    return numMax - numPeople;
  }
  // method 2

  static int spaceAvaliable(int bikes, int num) {
    return bikes % num;
  }

}
