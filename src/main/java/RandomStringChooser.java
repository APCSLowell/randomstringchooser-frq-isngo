import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> words = new ArrayList<String>();
  public RandomStringChooser(String[] wordArray){
    for(int i = 0; i<wordArray.length; i++){
      words.add(wordArray[i]);
    }
  }
  public String getNext(){
    int randomNumber = (int)(Math.random()*words.size());
    if(words.size()==0){
      return "NONE";
    }
    String word = words.get(randomNumber);
    words.remove(randomNumber);
    return word;
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  
}
