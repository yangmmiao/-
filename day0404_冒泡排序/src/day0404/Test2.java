package day0404;

import java.util.Arrays;
import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		int n=5+new Random().nextInt(10);
		System.out.println(n);
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=new Random().nextInt(100);
		}
		
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length-i;j++){
				if(a[j-1]>a[j]){
					int t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
