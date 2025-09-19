import java.lang.*;

public class Test {
    
    
    static int binarySearch(int A[], int left, int right, int x) {
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A[mid] == x) {
                return mid;   
            } else if (A[mid] > x) {
                right = mid - 1;   
            } else {
                left = mid + 1;    
            }
        }
        return -1;   
    }

    
    public static void main(String s[]) {
        int A[] = {7, 8, 9, 14, 20, 26, 42, 45};
        int n = A.length;
        int x = 8;   

        int result = binarySearch(A, 0, n - 1, x);

        if (result == -1) {
            System.out.println("Element " + x + " is not found.");
        } else {
            System.out.println("Element " + x + " is found at index: " + result);
        }
    }
}
