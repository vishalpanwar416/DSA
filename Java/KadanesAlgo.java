
class KadanesAlgo{

    public static int kandanes(int arr[]){
        int cs =0;
        int ms= Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);
        }
        return ms;
    }
        public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        for(int i=0;i<arr.length-1;i++){
        System.out.print(arr[i]+ ", "); 
        }
        System.out.println(kandanes(arr));
    }
}
