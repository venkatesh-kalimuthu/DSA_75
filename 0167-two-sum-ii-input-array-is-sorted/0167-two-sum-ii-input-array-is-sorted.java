class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> count = new HashMap<>();

        int difference;

        for (int i=0;i<numbers.length; i++){

            difference = target - numbers[i];
            if(count.containsKey(difference)){
                return new int[]{count.get(difference)+1, i+1};
            }
            if(!count.containsKey(numbers[i])){
                count.put(numbers[i], i);
            }            
        }
        return new int[] {};        
    }
}
