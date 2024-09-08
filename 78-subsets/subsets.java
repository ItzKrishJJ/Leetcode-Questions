import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(0, list, new ArrayList<>(), nums);
        return list;
    }

    void subset(int index, List<List<Integer>> list, List<Integer> current, int[] nums) {
        list.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            subset(i + 1, list, current, nums);
            current.remove(current.size() - 1);
        }
    }
}