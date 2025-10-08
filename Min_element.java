class Min_element{
    public static void main(String [] args){
        int arr [] = {5, 2, 9, 1, 6};
        int l = arr.length;
        
        int p = Integer.MAX_VALUE;
        for(int i=0; i<l; i++){
            if(arr[i] < p){
               p = arr[i];
            }
        }
        System.out.println("The minimum array is : "+ p );
    }
}