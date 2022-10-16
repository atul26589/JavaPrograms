package programs;

import java.util.ArrayList;

public class UniqueElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k;
		
		int a[]= {2,4,5,6,7,8,9,8,7,65,4,5,31,2,3};
		ArrayList b=new ArrayList<Object>();
		for(int i=0;i<a.length;i++) {
		k=0;
		
		if(!b.contains(a[i])) {
			b.add(a[i]);
			k++;
		
		for(int j=i+1;j<a.length;j++) {
			if (a[i]==a[j]) {
				k++;
			}
		}
		//System.out.println(a[i]+" "+k);
		if (k==1) {
			System.out.println(a[i]+"  " +"Non Repeated Num");
		}
		
		}
		
		}
}
}
