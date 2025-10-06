class Missing{
    public static void main(String [] args){
        int [] arr = {0, 1, 2, 4, 5};
        int n = arr.length;
        int actual_length = (n * (n+1))/2;
        
        int actualSum = 0;
        for(int i=0; i<n; i++){
             actualSum += arr[i];
        }
        int missingNumber = actual_length - actualSum;
        System.out.println(missingNumber);
    }
}