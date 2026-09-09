public class BubbleSort {
    public static void main(String[] args){
        int i,j, temp;
        int [] a = {50,39,20,10,60};
        for(i = 0;i<a.length-1;i++){
            for(j=0;j<a.length -i-2;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int x:a){
            System.out.print(x +" ");
        }
    }
}
