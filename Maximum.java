class Maximum{
    public  static void main(String [] args){
        int [] arr = {2, 7, 1, 9, 5};
        int n = arr.length;
        int max = findMax(arr, n);
        System.out.println(max);
    }
        public static int findMax(int[] arr, int n) {
        int max  = arr[0];
        for(int i=0; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}