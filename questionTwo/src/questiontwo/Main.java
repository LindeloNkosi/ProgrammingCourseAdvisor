package questiontwo;

import java.util.Scanner;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        Languages[] languages = new Languages[]{
            new Java("java handiling errors with error handling", "java inheritting from other classes", "java arrays", "manipulating java methods", 60, "Java"),
            new JavaScript("Error handling with javaScript", "protypical inheritance with Js", "Js Arrays", "ES methods with Js", 40, "JavaScript")
        };
          ProgrammingStorage storage = new ProgrammingStorage(languages);
           System.out.println("**********Welcome to Lindelo's mobile and web development bootcamp************");
              System.out.print("What would you like to study...Mobile/Web development:  ");
               String reply = scan.nextLine();
               System.out.print("Please enter your AP score:  ");
                int score = scan.nextInt();

                storage.apsScore(score);
        
    }
    
}
