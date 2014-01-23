package fundamentals;

public class BinarySearch {

    /**
     * Takes an integer key and a sorted array of int values as arguments and returns
     * the index of the key if it is present in the array, -1 otherwise.
     */
    public static int rank(int key, int[] a) {

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {

            int mid  = lo + (hi - lo) / 2;

            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
