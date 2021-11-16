import java.util.concurrent.ThreadLocalRandom;
class ThreeSum1 {
    boolean find3Numbers(int A[], int arr_size, int sum)
    {
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {

                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        System.out.println("not found");
        return false;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        ThreeSum1 triplet = new ThreeSum1();
        int arr_size = 10000;
        int A[] = new int[arr_size];
        int min = 0;
        for (int i = 0; i < arr_size; i++) {
//            A[i] = ThreadLocalRandom.current().nextInt(min, arr_size);
            A[i] = 1;
        }
//        int sum = ThreadLocalRandom.current().nextInt(min, arr_size);
        int  sum = 0;
        triplet.find3Numbers(A, arr_size, sum);
    }
}

