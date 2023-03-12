public class InsertionSortRec {
    public static void main(String[] args) {
        int[] arr = {12,4,5,23,2,1,6,7,3};
        int[] result = insertionSortRec(arr,0,arr.length);
        for(int num:result){
            System.out.println(num);
        }
    }

    private static int[] insertionSortRec(int[] arr, int start, int end) {
        if(end-start==1){
            return arr;
        }
        insert(arr,start);
        insertionSortRec(arr,start+1,end);
        return arr;
    }

    private static void insert(int[] arr, int start) {
        int i=start;
        int key=arr[start+1];
        while (i>=0 && arr[i]>key){
            arr[i+1]=arr[i];
            i=i-1;
        }
        arr[i+1]=key;
    }
}
