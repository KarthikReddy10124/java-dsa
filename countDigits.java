public class countDigits {
    public static int countDigits(int n ){
        int cnt = 0;
        while(n>0){
            cnt=cnt+1;
            n=n/10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n =234;
        int res = countDigits(n);
        System.out.println(res);
    }
}