package javapro1;
import java.util.Scanner;
public class array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<=n-1;i++) {
		int t=sc.nextInt();
		arr[i]=t;
	}
	//System.out.println(arr[0]);
	for(int i=arr.length-1;i>0;i--) {
		System.out.println(arr[i]);
	}
	
}
}
