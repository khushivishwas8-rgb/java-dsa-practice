
Merge Sorted Array 80
class Solution {
public void merge(int[] nums1, int m, int[] nums2, int n) {
int [] temp = new int [m+n];

for (int i = 0; i<m;i++){//loop through the mth element of nums1
temp[i] = nums1[i]; put the values in temp
}

for (int i = 0; i<n;i++){//loop through the mth element of nums2
temp[m+i] = nums1[i]; put the values in temp
}
//sort the array temp
Arrays.sort(temp);

for (int i = 0; i<m+n;i++){//loop through the mth element of nums1
nums1[i] = temp[i]; put the sorted  values from temp to nums1
}

