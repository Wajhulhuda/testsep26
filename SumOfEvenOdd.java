import java.io.*;
import java.util.*;
public class SumOfEvenOdd {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long mod = 0;
        long even=0;
        long odd=0;
        while(N>0){
            mod = N%10;
            if(mod%2==0){
                even=even+mod;    
            }else{
                odd=odd+mod;
            }
            N=N/10;
            
        }
        System.out.print(even+" "+odd);
    }
	

}
