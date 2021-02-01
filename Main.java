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
  
  
 }
  
   static int spaceAvailable(int numPeople, int numMax)
  {
    return numMax + numPeople;
  }
   
 
}