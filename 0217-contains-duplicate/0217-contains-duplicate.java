class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

      # using streams will add pipeline objects overhead. For loop is effective here
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
        
    }
}
