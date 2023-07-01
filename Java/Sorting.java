public class Sorting {

    public static void countingSortDescending(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            largest=Math.max(largest,arr[i]);
        }
        int count[] =new int[largest+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i] >0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
        int curr = arr[i];
        int prev = i-1;
        //finding out the correct pos to insert
        while (prev >=0 && arr [prev] > curr) {
        arr [prev+1] = arr[prev];
        prev--;
        }
        //insertion
        arr[prev+1] = curr;
    }
}

    public static void selectionSort(int arr[]) {
        for(int i=0; i< arr.length-1; i++) {
        int minPos = i;
        for(int j=i+1; j<arr.length; j++) {
        if (arr [minPos] < arr[j]) {
        minPos = j;
        }
        }
        //swap
        int temp = arr[minPos];
        arr [minPos] = arr[i];
        arr[i] = temp;
    }
}
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int small= Integer.MAX_VALUE;
            for(int j=i;j<arr.length-1;j++){
                if(small>arr[j]){
                    small=arr[j];
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= arr[temp];
                }
            }
        }
    }

    public static void bubble1(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++) {
            if(arr[j] > arr[j+1]) {
                        //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr [j+1] = temp;
                }
            }
        }
    }

    public static void bubble( int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;i<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= swap;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {5,6,3,6,11,69,7,10,5};

        countingSortDescending(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
