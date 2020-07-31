package Jojo;

public class jonasen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,29,9,97,61,33,7};
		int max = 10;
		int min = 10;
		for(int i = 1;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
			if(a[i]<min){
				min = a[i];
			}
		}
		System.out.println("最大的值是"+max+","+"最小的值是"+min);
	}

}
