import java.util.Scanner;
 public class Fibonacciseries{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of terms(m):");
        int m=scanner.nextInt();
        System.out.println("Fibonacciseries up to"+m+"terms:");
        printFibonacciseries(m);

    
    }
    public static void printFibonacciseries(int m){
        int t1=0;
        int t2=1;
        System.out.println(t1+""+t2);
        for(int i=3;i<=m;i++){
            int nextterm=t1+t2;
            System.out.println(""+ nextterm);
            t1=t2;
            t2=nextterm;
        }
    }
    

 } 