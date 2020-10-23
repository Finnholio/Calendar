import java.util.*;
class Main {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    boolean keepGoing = true;
    while(true){
      System.out.print("Days in Month : ");
      int days = scan.nextInt();

      System.out.print("First Sundays Date : ");
      int firstSunday = scan.nextInt();

      calendar(days, firstSunday);

      String keepGoingString = scan.next();
      if (keepGoingString.toCharArray()[0] != 'y'){
        keepGoing = false;
      }
    }
  }

  public static void calendar(int days, int firstSunday){
    int blankSpaces = 0;
    if (firstSunday == 1){
      blankSpaces = 0;
    }
    else {
      blankSpaces = (firstSunday-8)*-1;
    }

    System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
    System.out.println("+------+------+------+------+------+------+------+");

    for (int i = 1; i <= days+blankSpaces; i++){
      if (i <= blankSpaces){
        System.out.print("|      ");
      }
      else if(i-blankSpaces > 9) {
        System.out.print("|  " + (i-blankSpaces) + "  ");
      }
      else {
        System.out.print("|  " + (i-blankSpaces) + "   ");
      }
      if (i%7 == 0){
        System.out.println("|");
      }
    }
    for (int i = 0; i < 7 - ((blankSpaces+days)%7); i++){
      System.out.print("|      ");
    }
    System.out.println("|");
    System.out.println("+------+------+------+------+------+------+------+");
  }
}