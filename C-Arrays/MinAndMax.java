public class MinAndMax {
    public static void main(String[] args){
        int []a = {10,4,67,34,55};
        int min = a[0];
        int max=a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            else if(a[i]<min){
                min = a[i];
            }
            
        }
        System.out.println("Minimun is:"+min+" Maxium is:"+max);
    }
}