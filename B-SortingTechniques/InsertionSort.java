public class InsertionSort{
    public static void main(String[] args){
        int i, j, temp;
        int [] a = {10, 30, 2, 40, 5};
        for(i = 0;i<a.length;i++){
            j=i;
            while(j>0 && a[j-1]>a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    j--;
            }
        }
        for(int x:a)
            System.out.print(x + " ");
    }
}