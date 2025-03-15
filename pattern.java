public class pattern {
    public static void pt(int k){
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pt1(int k){
        for(int i=0;i<k;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pt2(int k){
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pt3(int k){
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void revPat(int k){
        for(int i=0;i<k;i++){
            for(int j=k;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void revPatnum(int k){
        for(int i=0;i>k;i++){
            for(int j=k;j<i;j--){
                System.out.print(j);
                );
            }
            System.out.println(null);
        }
    }

    public static void main(String... args){
        int number=5;
        revPatnum(number);
    }
}