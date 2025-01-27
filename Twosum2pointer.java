import java.util.Arrays;


public class Twosum2pointer {

    static void twosum(int [ ] arr ,int target ){
        Arrays.sort(arr);
        int left = 0 , right = arr.length-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(+arr[left]+" and "+arr[right]);
                return;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,3,2,1,7,8,9};
        twosum(arr, 10);
    }
}