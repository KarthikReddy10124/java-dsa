class Numpattern2{
    static void pattern(int N){
        for(int i = 0;i<N;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
                pattern(6);}
}
