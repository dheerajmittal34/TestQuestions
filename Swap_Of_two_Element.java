class Swap_Of_two_Element{
    public static void main(String [] args){
        int arr [] = {3, 8, 1, 5};
        int s = arr.length;
        int maxIndex = 0;
        int minIndex = 0;
        for(int i=0; i<s; i++){
            if(arr[i] > arr[maxIndex]){
                 maxIndex = i;
            }
            if(arr[i] < arr[minIndex]){
               minIndex = i;
            }
        }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[minIndex];
            arr[minIndex] = temp;
            
            for(int i=0; i<s; i++){
                System.out.println(arr[i] );
            
        }
        
    }
}