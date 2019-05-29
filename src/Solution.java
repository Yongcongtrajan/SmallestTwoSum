import java.util.PriorityQueue;

class Solution {
    public static int minSum(int[] nums) {
        if (nums == null ) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(nums.length);
        int sum = 0;
        for(int input : nums) {
            minHeap.offer(input);
        }

        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            minHeap.offer(first + second);
            sum += minHeap.peek();

        }
            return sum;



    }
}