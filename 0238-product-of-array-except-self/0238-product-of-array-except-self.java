class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
 
        // Pass 1: Calculate the product of all elements to the LEFT of index i
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }
 
        // Pass 2: Calculate the product of all elements to the RIGHT of index i
        // and multiply it with the existing left product in the answer array
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
 
        return answer;
    }
}
