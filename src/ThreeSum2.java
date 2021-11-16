import java.util.*;
class ThreeSum2 {

    static boolean find3Numbers(int A[], int arr_size, int sum)
    {
        for (int i = 0; i < arr_size - 2; i++) {

            // Find pair in subarray A[i+1..n-1]
            // with sum equal to sum - A[i]
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++)
            {
                if (s.contains(curr_sum - A[j]))
                {
                    System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + (curr_sum - A[j]));
                    return true;
                }
                s.add(A[j]);
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args)
    {
        int arr_size = 10000;
        int A[] = new int[arr_size];
        int min = 0;
        for (int i = 0; i < arr_size; i++) {
//            A[i] = ThreadLocalRandom.current().nextInt(min, arr_size);
            A[i] = 1;
        }
//        int sum = ThreadLocalRandom.current().nextInt(min, arr_size);
        int  sum = 0;
        find3Numbers(A, arr_size, sum);
    }
}