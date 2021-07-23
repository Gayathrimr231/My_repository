

public class Lowestnumber {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int temp;
        int lowestNum;

        if (a<=b) {
            temp = a;
             if (b<a) {
              temp = b;
             }
                if (c<temp)
                {
                    lowestNum=c;
                }
                else{
                    lowestNum=temp;
                }       

        System.out.println("the lowest number is "+lowestNum);
         
    }
}
}
