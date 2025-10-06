class TwoSum{
    public static void main(String [] args){
        int [] arr = {3, 2, 4, 7};
        int target = 6;
        int n = arr.length;
        int [] result = new int[2];
        boolean found = false;
        
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                result[0] = i;
                result[1] = j;
                found = true;
                break;
            }
        }
    }
            if (found){
                System.out.println("(" + result[0] + "," + result[1] + ")");
            }else{
                System.out.println("-1");
            }
        }
}