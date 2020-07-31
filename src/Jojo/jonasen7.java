package Jojo;

public class jonasen7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将一个数组中的重复元素保留一个其他的清零
		int a[]={1,2,3,1,2,3};
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					a[j]=0;
				}
			}
			for(int item:a){
				System.out.println(item);
			}
		}
	}

}
