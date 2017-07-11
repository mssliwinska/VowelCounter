import java.util.*;

public class VowelCounter {
  int vowels = 0;
  String word;

 public String getAWord() {
    System.out.println( "Write word you want to check vowels in: ");
    String word = System.console().readLine();
    word.toLowerCase();
    return word;
  }

  public int countVowels(){
  String word = getAWord();
  int l = word.length();
  int vowels = 0;
    for (int i = 0; i < l ; i++) {
    char v = word.charAt(i);
      if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y'){
        vowels ++;
      }
    }
    return vowels;
  }

public static void main(String[] args){
  VowelCounter counter = new VowelCounter();
  int counted = counter.countVowels();
  if (counted == 0){
    System.out.println("This word has no vowels");
  }
  else if (counted == 1){
    System.out.println("This word has " + counted + " vowel");
  }
  else{
    System.out.println("This word has " + counted + " vowels");
  }
}
}
