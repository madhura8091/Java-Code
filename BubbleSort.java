class BubbleSort {
    public static void main(String[] args) {
        int A[] = {12, 7, 8, 5, 3, 2};  
        int temp;

        
        for (int k = 0; k < A.length; k++) {
            for (int j = k + 1; j < A.length; j++) {
                if (A[k] > A[j]) {
                    
                    temp = A[k];
                    A[k] = A[j];
                    A[j] = temp;
                }
            }
        }

        
        System.out.println("Sorted Array:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "\t");
        }
    }

}
/*Output
    Sorted Array:
2	3	5	7	8	12	
    */
