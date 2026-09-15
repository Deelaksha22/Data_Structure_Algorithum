import java.util.Arrays;
public class Sort {
    public static void main(String[] args){
    Integer [] numbers = {10,2,30,4,37,48,55,88,33};
    Arrays.sort(numbers);
    for(int x: numbers){
        System.out.print(x+" ");
    }
}
}