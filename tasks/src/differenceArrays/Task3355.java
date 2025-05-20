package differenceArrays;

public class Task3355 {
    public static void main(String[] args) {
        System.out.println((new Solution()).isZeroArray(new int[] {4,3,2,1}, new int[][] {{1,3}, {0,2}}));
    }
}

class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;

            for (int[] query : queries) {
                if ((i >= query[0]) && (i <= query[1])) nums[i]--;
                if (nums[i] == 0) break;
            }
            if (nums[i] != 0) return false;
        }

        return true;
    }
}