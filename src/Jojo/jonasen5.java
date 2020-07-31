package Jojo;

public class jonasen5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-1,1,2,3,4,5,6,7,8,9};
		int key = -1;
		int low = 0;
		int high = a.length-1;
		int locale = -1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(key>a[mid]){
				low = mid +1;
			}
			else if(key<a[mid]){
				high = mid -1;
			}
			else{
				locale= mid;
				break;
			}
		}
		if(locale==-1){
			System.out.println("没找到");
		}
		else{
			System.out.println("找到了，脚标是"+locale);
		}
		}
		
	}


