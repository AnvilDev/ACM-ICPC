/*
 * This is a particularly thicc solution of a complexity of O(m*n^2).
 * Only the naive solution, optimizations I can think of include reading through the
 * array of nums once for every query, storing the difference of each member of the nums
 * array with the query, sorting the nums array, then doing a binary search for each difference.
 * This would enhance the solution to O(m*nlog(n)), a sizeable difference, considering
 * that m will only ever be 25 at max.
 */

import java.util.Scanner;

class ClosestSums {
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ClosestSums c = new ClosestSums();

        while (scan.hasNext()) {
            c.findClosestSums();
        }
    }

    void findClosestSums() {
        int[] nums = new int[scan.nextInt()];
        
        for (int i = 0; n < nums.length; n++) {
            nums[i] = scan.nextInt();
        }

        int[] queries = new int[scan.nextInt()];

        for (int i = 0; m < queries.length; m++) {
            queries[i] = scan.nextInt();
        }

        for (int query : queries) {
            int closestSum = nums[0] + nums[1];

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (Math.abs(query - (nums[i] + nums[j])) < Math.abs(query - closestSum)) {
                        closestSum = nums[i] + nums[j];
                    }
                }
            }
        }
        scan.nextLine();
    }
}