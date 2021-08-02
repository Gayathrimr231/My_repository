public class Swap {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println("Before Swapping");
        System.out.println("Value of x is:"+x);
        System.out.println("Value of y is:"+y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping");
        System.out.println("Value of x is:"+x);
        System.out.println("Value of y is:"+y);
    }
}
