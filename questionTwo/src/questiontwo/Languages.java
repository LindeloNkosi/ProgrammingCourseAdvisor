
package questiontwo;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class Languages {
  
    private String language;
    private String errorHandling;
    private String inheritance;
    private String arrays;
    private String functions;
    private int score;
    
    
    //creating a constructer
    public Languages(String errorHandling, String inheritance, String arrays, String functions, int score, String language){
   
   this.errorHandling = errorHandling;
   this.inheritance = inheritance;
   this.arrays = arrays;
   this.functions = functions;
   this.score = score;
   this.language = language;
    }
    
    
    //copy constructer
  public Languages(Languages source){
   this.errorHandling = source.errorHandling;
   this.inheritance = source.inheritance;
   this.arrays = source.arrays;
   this.functions = source.functions;
   this.score = source.score;
   this.language = source.language;
  }
 
   
    public String geterrorHandling(){
      return this.errorHandling;
  }
  
  public void setErrorHandling(String errorHandling ){
     this.errorHandling = errorHandling;   
  }
  
  
  
    public String getInheritance(){
      return this.inheritance;
  }
  
  public void setInheritance(String inheritance ){
     this.inheritance = inheritance;   
  }
  
   
    public String getArrays(){
      return this.arrays;
  }
  
  public void setArrays(String arrays ){
     this.arrays = arrays;   
  } 
  
  
    public String getFunctions(){
      return this.functions;
  }
  
  public void setFuctions(String function ){
     this.functions = functions;   
  }
  public int getScore(){
      return this.score;
  }
  public void setScore(int score){
      this.score = score;
  }
  
  public String getLanguage(){
      return this.language;
  }
  public void setLanguage(String language){
      this.language = language;
  }
  
  public String purchase(){
      return "You have bought the " + this.language + " course " + " thank you enrolling with us";
  }
  
  public String toString(){
     return "\n" + this.language + "\n" +
             "error handling:  " + this.errorHandling + "\n" +
             "inheritance:  " + this.inheritance + "\n" +
             "Arrays:  " + this.arrays + "\n" +
             "Functions:  " + this.functions;
  }
}
