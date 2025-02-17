package questiontwo;

/**
 *
 * @author lindelo Desiree Nkosi
 */
import java.util.Scanner;
public class ProgrammingStorage {
    Scanner scan = new Scanner(System.in);
    private Languages[] languages;
    
    public ProgrammingStorage(Languages[] languages){
        this.languages = new Languages[languages.length];
        for(int i = 0; i < languages.length; i++){
            this.languages[i] = new Languages(languages[i]);
        }
    }
    
    public void apsScore(int aps){
           if(aps < 40){
       System.out.println("You do not qualify for all of our programs");
        }else if(aps >= 40 && aps < 60){
            System.out.println("Yuu qualify for our web development program in javaScript");
             System.out.println(this.languages[1].toString());
             System.out.print("Are you interested yes/no:  ");
             String interested = scan.nextLine();
             interested.toLowerCase();
             if(interested.equals("yes")){
                System.out.println(this.languages[1].purchase());
             }
             
        } 
           else if (aps >= 60){
       System.out.println("\nYou qualify for both web development and mobile development here is our entire program to Choose from");
         System.out.println(this.languages[0].toString());
            System.out.println(this.languages[1].toString());
            System.out.print("Which one are you interested in? Web dev or Mobile dev?   ");
            String choice = scan.nextLine();
            choice.toLowerCase();
            if(choice.equals("web dev") || choice.equals("web")){
                System.out.println(this.languages[1].purchase());
            }else if(choice.equals("mobile dev") || choice.equals("mobile")){
                System.out.println(this.languages[0].purchase());
            }
              }
    }

    
    
    public String toString(){
        String empty = " ";
        for(int i = 0; i < this.languages.length; i++){
            empty += this.languages[i].toString() + "\n";
        }
        return empty;
    
}
}
        

