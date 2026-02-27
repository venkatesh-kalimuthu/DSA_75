import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class TopKFrequentElements {
 
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number using a HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
 
        // Step 2: Create an array of lists (buckets) where index represents frequency
        // The maximum possible frequency is nums.length
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
 
        // Step 3: Populate the buckets - Bucket sort approach
        for (int num : freqMap.keySet()) {
            int frequency = freqMap.get(num);
            buckets[frequency].add(num);
        }
 
        // Step 4: Collect the top k frequent elements
        List<Integer> result = new ArrayList<>();
        // Iterate from highest possible frequency down to 1
        for (int i = buckets.length - 1; i >= 1 && result.size() < k; i--) {
            for (int num : buckets[i]) {
                result.add(num);
                if (result.size() == k) {
                    break; // Found k elements, stop
                }
            }
        }
 
        // Convert List<Integer> to int[]
        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = result.get(i);
        }
 
        return topK;
    }
 
    public static void main(String[] args) {
        TopKFrequentElements solver = new TopKFrequentElements();
 
        // Example 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        int[] result1 = solver.topKFrequent(nums1, k1);
        System.out.print("Input: nums = [1,1,1,2,2,3], k = 2 -> Output: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + (i == result1.length - 1 ? "" : ", "));
        }
        System.out.println("]"); // Expected: [1, 2] or [2, 1]
 
        // Example 2
        int[] nums2 = {1};
        int k2 = 1;
        int[] result2 = solver.topKFrequent(nums2, k2);
        System.out.print("Input: nums = [1], k = 1 -> Output: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + (i == result2.length - 1 ? "" : ", "));
        }
        System.out.println("]"); // Expected: [1]
 
        // Example 3
        int[] nums3 = {1, 2};
        int k3 = 2;
        int[] result3 = solver.topKFrequent(nums3, k3);
        System.out.print("Input: nums = [1,2], k = 2 -> Output: [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i] + (i == result3.length - 1 ? "" : ", "));
        }
        System.out.println("]"); // Expected: [1, 2] or [2, 1]
    }
}
