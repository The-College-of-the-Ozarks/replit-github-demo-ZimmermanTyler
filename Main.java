import java.util.Scanner;
class Main
{   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
     for(int x=0; x==0; x++){
       try{
         System.out.print("Enter quarts needed >> ");
         quartsNeeded = input.nextInt();
       }
       catch(Exception error){
         input.nextLine();
         x--;
       }
     }
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
   }
}
