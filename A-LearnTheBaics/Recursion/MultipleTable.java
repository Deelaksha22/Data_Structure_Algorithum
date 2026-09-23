public class MultipleTable{
    public static void main(String[] args){
        Table(5,1);
    }
    public static int Table(int n, int i){
        if(n<0){
            return 0;
        }
        else
        {
            Table(n,i+1);
            n=n*i;
            return n;
        }
        
    }
}