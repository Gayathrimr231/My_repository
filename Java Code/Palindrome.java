public class Palindrome {
    
    private static boolean isPalindrome(String str) {
        if (str==null)
        return false;
        StringBuilder stBuilder=new StringBuilder(str);
        //using reverse
        stBuilder.reverse();
        return stBuilder.toString().equals(str);
    }

public static void main(String[] args)  
{
    String str=args[0];
    boolean  isPalindrome=isPalindrome(str);
    if(isPalindrome) 
    {
        System.out.println(str+"is a palindrome string");

    }else {
        System.out.println(str+"is a not palindrome string");

    }
}
}