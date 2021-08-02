import jdk.jfr.Percentage;

public class PercentageCalculator {
   public static void main(String args[]) {

       System.out.println(" Obtained Score :" +args[0]);
       float obtainedScore =Float.parseFloat(args[0]);

       System.out.println("Total Score :" +args[1]);
       float totalScore = Float.parseFloat(args[1]);

       float Percentage = ((obtainedScore/totalScore) * 100);
       System.out.println("The Percentage for" +obtainedScore+ "is" + Percentage + "%");
   } 
}
