public class AlphabetPattens {
    public static void main(String[] args){
    int n = 5;
    printPattern4(n);
    }
    //Alpha
    /*  OUTPUT
        A
        AB
        ABC
        ABCD */
    public static void printPattern1(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
                
            }
            System.out.println();
        }
    }
    /* OUTPUT
        ABCD
        ABC
        AB
        A */
    public static void printPattern2(int n){
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+(n-i);ch++){
                System.out.print(ch+" ");
                
            }
            System.out.println();
        }
    }
    /*  A
        BB
        CCC
        DDDD */
    public static void printPattern3(int n){
        for(int i=0;i<n;i++){
            char ch =(char)('A' + i);//character declare
            for(int j=0;j<=i;j++){
                System.out.print(ch+" "); 
            }
            System.out.println();
        }
    }
    public static void printPattern4(int n){
        //outer
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //Alphabet
            char ch = 'A';
            //BreakPoint for revercing the alphabets
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch+"");
                if(j<=breakpoint)
                    ch++;
                else
                    ch--;
            }
            System.out.println();
        }
    }
}
