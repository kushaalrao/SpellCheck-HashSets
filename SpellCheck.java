
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
public class SpellCheck
{
    public static void main(String[] args) throws FileNotFoundException{
        Set<String> dictionaryWords = readWords("words.txt");
        Set<String> documentWords = readWords("sample.txt");
        
        for(String word : documentWords){
            if(!dictionaryWords.contains(word)){
                System.out.println(word);
            }
           
        }
        
       
    }
    
     public static Set<String> readWords(String fileName) throws FileNotFoundException{
         Set<String> words = new HashSet<String>();
         Scanner in = new Scanner(new File(fileName));
         
         in.useDelimiter("[^a-zA-Z]+");
         while (in.hasNext()){
             words.add(in.next().toLowerCase());
            }
            return words;
        }
    
}
