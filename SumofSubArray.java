public class SumofSubArray {
    public static int findAllSubarraysWithGivenSum(int[] arr, int k) {
    //     int count = 0, sum = 0;
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     map.put(0, 1); // Initialize with sum 0 having one occurrence

    //     for (int num : arr) {
    //         sum += num;
    //         if (map.containsKey(sum - k)) {
    //             count += map.get(sum - k);
    //         }
    //         map.put(sum, map.getOrDefault(sum, 0) + 1);
    //     }
    //     return count;
    // }

    // public static void main(String[] args) {
    //     int[] sv = {1, 3, 4, 5, 6, 7};
    //     int targetSum = 6;
    //     System.out.println(findAllSubarraysWithGivenSum(sv, targetSum));
    // }
    int n = arr.length; 
        int cnt = 0; 
        for (int i = 0 ; i < n; i++) { 
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[k];
                if (sum == k)
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] sv = { 3, 1, 2, 4, 7, 6, 6}; 
        int targetSum = 6; 
        System.out.println(findAllSubarraysWithGivenSum(sv, targetSum));
    }
}