// merge sort

public class sorting {
    static void mergesort(int[] arr, int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);
    }
    public static void main(String[] args) {
        int[] arr={2,5,8,7,4,6,5,5};
        mergesort(arr,0,arr.length-1);
    }
}
