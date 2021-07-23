

public class PercentageCalculator {
    
      public static void main(String[] args) {
         

          System.out.println("Score:" +args[0]);
          System.out.println("Total score:" +args[1]);
          
        float score = float.parseInt(args[0]);
        float totalScore = float.parseInt(args[1]);

         float Percentage = (( score/ totalScore)*100);

         System.out.println("the percentage for" + score+ "is"+Percentage+ "%");

          
             }
}
