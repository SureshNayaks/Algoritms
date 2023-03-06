import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1};
        int k=1;
        int l=0;
        int r=arr.length;
        System.out.println(binarySearch(k,arr,l,r));


    }

    private static boolean binarySearch(int k, int[] arr, int l, int r) {
        if(r-l==0){
            return false;
        }
        int mid=(l+r)/2;
        if(arr[mid]==k){
            return true;
        }
        if(arr[mid]<k){
            return binarySearch(k,arr,mid+1,r);
        } else if (arr[mid]>k) {
            return binarySearch(k,arr,l,mid);
        }
        return false;
    }
}
