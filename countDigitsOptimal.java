public class countDigitsOptimal{
    static int countDigits(int n){
        int cnt = (int)(Math.log10(n)+1);
        return cnt;
    }
    public static void main(String[] args) {
        int n =234567;
        int res = countDigits(n);
        System.out.println(res);
    }
}
