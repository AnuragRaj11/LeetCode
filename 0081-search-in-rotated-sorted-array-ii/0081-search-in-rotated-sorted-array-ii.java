class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            if (nums[l] == target || nums[h] == target) {
                return true;
            }
            while (l < h && nums[l] == nums[l + 1]) {
                l++;
            }
            while (l < h && nums[h] == nums[h - 1]) {
                h--;
            }
            if (target > nums[l]) {
                l++;
            } else if (target < nums[h]) {
                h--;
            } else {
                break;
            }
        }
        return false;
    }
}