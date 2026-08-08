public class ZeroandOnePatterns {
    public static void main(String[] args) {
        // Main method implementation
        int n = 5; //no. of rows
        printPatterns(n);//calling
    }
    // Practicing Patterns
    public static void printPatterns(int n){
        System.out.println("Zeros and Ones Patterns");
        int start = 1;
        for(int i = 0;i<n;i++){
            if(i%2 == 0)
                start = 1;
            else
                start = 0;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start = 1 - start;

            }
            System.out.println();
        }
    }    
    
}
