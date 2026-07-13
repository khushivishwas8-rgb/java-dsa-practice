80. Remove Duplicates from Sorted Array II
class Solution {
    public int removeDuplicates(int[] nums) {

        //if the length is only 2
        if(nums.length<=2){
            return nums.length;
        }
        int j=2;
        for(int i = 2; i<nums.length;i++){ //go through each element in the array
            if(nums[i] != nums[j-2]){  //check if past element are copies
                nums[j] = nums[i];
                j++;                // igonore the third copy completley and move the j
            }
        }
        return j;
    }
}