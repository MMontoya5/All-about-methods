import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    
    //Asking for the max amount of people that can go to the park
     System.out.println("What is the max amount of people that can fit in the park? (Whole # only)");
    
    int numMax = scan.nextInt();

    System.out.println("How many people do you see at the park? (Whole # only)");
  
    int numPeople = scan.nextInt();

  System.out.println("There are "  + spaceAvailable(numPeople, numMax) + " spaces left");
  
  // Asking if there are benches available 
   
   System.out.println("How many people ");
  
   int totalPeople = scan.nextInt();
   
   System.out.println("There are 3 activitives: Double biking (2), Roller Skating (1), Volleyball (4) ");
   
   System.out.println("How many want to bike (must be less than people)");
  
   int bikes = scan.nextInt();
   
   System.out.println("How many want to play volleyBall (must be less than people)");
   int volleyBall = scan.nextInt();

   System.out.println(leftOvers + " can Roller Skate");
   
  
 }
  //method 1
   static int spaceAvailable(int numPeople, int numMax)
  {
   return numMax - numPeople;
  }
  //method 2

  

   
}