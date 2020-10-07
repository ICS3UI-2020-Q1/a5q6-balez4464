import java.util.Scanner;

/**
 *This program prints out how mnay stars the user wants on seprate lines times thier number
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner
    Scanner input = new Scanner(System.in);
    
    //asks user for number of stars
    System.out.println("Please enter a number between 1 and 10");
    //users number
    int usersNumber = input.nextInt();
    //variable for star
    String star = ("*");
    int columns = usersNumber;
    
    //for loop to count up printing stars
    for (int firstCounter = 1; firstCounter <= usersNumber; firstCounter++){
        //prints new line for diferent rows
        System.out.println();
        //allows fot columns
        for (int secondCounter = 1; secondCounter <= columns; secondCounter++){
          System.out.print(star + " ");
        }
        
    }
    
    
  }
}
