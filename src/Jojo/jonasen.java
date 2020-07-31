package Jojo;

public class jonasen {
public static void main(String[] args) {
	//动态初始化
	//数组是定长的
	int[] arr = new int[4];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	
	//静态初始化
	int[] arr2 = {80,20,10,63};
	System.out.println(arr2[3]);
	
	char [] a ={'a','b','c'};
	
	int[] jonasen = {80,20,10,63};
	int sum = 0;
	for(int i=0;i<jonasen.length;i++){
		sum+=jonasen[i];
	}
	double avg = (double)sum/jonasen.length;
	System.out.println(avg);
}
}
