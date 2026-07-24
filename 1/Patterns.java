public class Patterns {
    public static void main(String[] args) {
        // Main method implementation
        int n = 5; // Example number of rows
        printPatterns(n);
    }
    public static void printPatterns(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) {
                stars = 2*n-i;
            }
                for(int j=0;j<stars;j++){
                    System.out.print("*");
                }
        
            System.out.println();
        }
    }
}
