public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        int len = s.length();
        String tmp = s;
        String res = "";
        while (len > 0) {
            res = res + s.charAt(len - 1);
            len--;
        }
        System.out.println(res);
    }
}
