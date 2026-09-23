public class SelectionSort {
    public static void main(String[] args){
        int [] a = {10,8,2,50,20};
        int i, j, min, temp;
        for(i=0;i<a.length -1;i++){
            min = i;
            for(j = i+1;j < a.length;j++){
                if(a[j] < a[min])
                    min = j;
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for(int x:a){
            System.out.print(x + " ");
        }
    }
    
}