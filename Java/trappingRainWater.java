public class trappingRainWater {
    public static int rain(int arr[]){
        //left max array
        int leftmax[]= new int[arr.length];
        leftmax[0]= arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]= Math.max(arr[i],leftmax[i-1]);
        }

        //right max array
         int rightmax[]= new int[arr.length];
        rightmax[arr.length-1]= arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]= Math.max(arr[i],leftmax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<arr.length;i++){
            int waterlevel =Math.min(leftmax[i],rightmax[i]);
            trappedWater += waterlevel - arr[i];

        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+ ", "); 
        }
        System.out.println(rain(arr));
    }
}
