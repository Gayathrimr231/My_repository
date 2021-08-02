import javax.lang.model.util.ElementScanner14;

public class VowelConsonant1 {
    public static void main(String[] args){
        char ch = 'A';
        
        if (ch == 'A' || ch == 'E' || ch == 'I'  || ch == 'O' || ch == 'U' )
        {
           System.out.println(ch + "is Vowel");
        }
       else {
          System.out.println(ch + "is Consonant");
       }
}
}