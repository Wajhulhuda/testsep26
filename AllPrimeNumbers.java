import java.io.*;
import java.util.*;
public class AllPrimeNumbers {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int count;
	        for(int i=2; i<=N; i++){
	            count = 0;
	            for(int j=1 ; j<=i; j++){
	                if(i%j == 0){
	                    count = count+1;
	                }
	            }
	            if(count == 2){
	                System.out.println(i);
	            }
	        }
	    }

}
