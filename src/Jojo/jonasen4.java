package Jojo;

public class jonasen4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,18,50,60,99,90,19,33};
		for(int i =1;i<a.length;i++){
			for(int j=0;j<a.length-i;j++){
				if(a[j]>a[j+1]){
					int b = a[j];
					a[j] = a[j+1];  
					a[j+1] = b;
				}
			}
		}
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
