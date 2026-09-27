public class LinearSearch{
    public static void main(String[] args){
        int []arr = {10,20,3,8,99};
        int val = 8;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == val){
                System.out.println("True");
            }
        }
    }
}