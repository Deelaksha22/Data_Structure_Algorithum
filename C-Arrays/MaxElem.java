import java.util.*;
public class MaxElem {
    public static void main(String[] args){
        int [] arr = {10,20,9,45,2};
        for(int i = 0;i < arr.length;i++){
            int max = i;
            for(int j = i+1;j<arr.length;j++){
                if(max<=arr[j])
                    max = j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }             
}
