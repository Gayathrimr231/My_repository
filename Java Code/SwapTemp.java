public class SwapTemp {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int temp;
        System.out.println("Before swapping numbers:"+x+" "+y);

        temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping numbers:"+x+" "+y);
        System.out.println();



    }
}