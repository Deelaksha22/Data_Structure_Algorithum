public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        fun(0, arr.length -1,arr);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void fun(int l, int h,int arr[]){
        if(l>=h)
            return;
        int temp = arr[l];
        arr[l] =  arr[h];
        arr[h] = temp;
        fun(l+1,h-1,arr);       
    }
}
