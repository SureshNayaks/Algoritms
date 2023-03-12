public class SelectionSort {
        public static void main(String[] args) {
                int[] arr = {1,10,3,4,5,9,7,8,6,2};
                int[] result2 = seletionSortRec(arr,0,arr.length);
                int[] result1 =selectionSortIter(arr);
                for (int i=0;i<arr.length;i++){
                        System.out.println(result1[i]);
                }
                for (int i=0;i<arr.length;i++){
                        System.out.println(result2[i]);
                }
        }

        private static int[] selectionSortIter(int[] arr) {
                for (int i=0;i<arr.length;i++){
                        int minPos = i;
                        for(int j=minPos;j<arr.length;j++){
                                if(arr[j]<arr[minPos]){
                                        minPos=j;
                                }
                        }
                        swap(arr,i,minPos);
                }
                return arr;
        }

        private static int[] swap(int[] arr, int startpos, int minPos) {
                int temp=arr[startpos];
                arr[startpos]=arr[minPos];
                arr[minPos]=temp;
                return arr;
        }

        private static int[] seletionSortRec(int[] arr, int startPos, int endPos) {
                if(endPos-startPos==0){
                        return arr;
                }
                int minPos=startPos;
                for (int i=startPos;i<endPos;i++){
                        if(arr[i]<arr[minPos]){
                                minPos=i;
                        }
                }
                swap(arr,startPos,minPos);
                return seletionSortRec(arr,startPos+1,endPos);
        }
}
