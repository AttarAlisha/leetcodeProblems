public class Palindrome {
    public static boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }

        String original = String.valueOf(x);

        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  
        System.out.println(isPalindrome(-121)); 
        System.out.println(isPalindrome(10));   
    }
}
