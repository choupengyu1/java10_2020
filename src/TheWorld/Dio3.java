package TheWorld;

public class Dio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num = 200;;num++){
			boolean flag = true;
			for(int i = 2;i<=num-1;i++){
				if(num%i == 0){
				flag = false;
				break;
				}
			}
			if(flag){
				System.out.println(num);
				break;
			}
		}

	}

}
