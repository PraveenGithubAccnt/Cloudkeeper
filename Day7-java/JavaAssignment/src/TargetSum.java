import java.util.*;
public class TargetSum {
    public static List<Integer> targetsm(ArrayList<Integer> nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int complement = target - num;

            if (map.containsKey(complement)) {
                return Arrays.asList(map.get(complement), i);
            }

            map.put(num, i);
        }
        return Arrays.asList(-1, -1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(11);
        nums.add(15);
        int target = 9;
        List<Integer> result = targetsm(nums, target);
        System.out.println("Indices: " + result);
    }
}
