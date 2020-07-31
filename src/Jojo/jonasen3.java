package Jojo;

public class jonasen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={7,4,1,9,6,3};
		for(int i = 0;i<a.length/2;i++){
			int b = a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=b;
		}
		for(int i= 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
