public class Recurcion{
    public static void main(String[] args){
        int n = 3;
        int i = 1;
        Bhoo(i, n);
    }
    public static int Bhoo(int i,int n){
        if(i < n){
        System.out.println("Bhoomika");
        Bhoo(i+1, n);
        }
        return 0;
    }
}