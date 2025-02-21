import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String newStr = new StringBuilder(str).reverse().toString();
        return str.equals(newStr);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print the number to select if it`s Palindrome: ");
        int x = scanner.nextInt();
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(x);
        System.out.println(result);
    }
}
