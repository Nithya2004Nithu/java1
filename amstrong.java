package javapro1;
import java.util.Scanner;
public class amstrong {
		public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int n,rem,res=0,i;
			n=sc.nextInt();
			 int originial=n;
	
			while(n>0){
				rem=n%10;
				res+=rem*rem*rem;
				n=n/10;
				
			}
	
			if(originial==res) {
				System.out.println("amstrong " +res);
				
			}
			else {
				System.out.println("not anstrong " +res);
			}
		}
}
