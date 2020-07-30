package TheWorld;

public class Dio10 {
	/*企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；
	利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，
	可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；
	40万到60万之间时高于40万元的部分，
	可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，
	超过100万元的部分按1%提成，在程序中设定一个变量为当月利润，求应发放奖金总数？*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	利润<=100000，奖金提升10%
		100000<利润<200000,低于100000提10%，高于100000提7.5%
		200000<利润<400000，高于200000提5%
		400000<利润<600000，高于400000提3%
		600000<利润<1000000，高于600000提1.5%
		利润>1000000,提1%*/
		double a =180000;//奖金
		double sum = 0;//总和
		if(a<=100000){
			sum=100000*0.1+100000;
			System.out.println(sum);
		}
		else if(a>100000 && a<200000){
			sum = 100000*0.1+(a - 100000)*0.75+a;
			System.out.println(sum);
		}
		else if(a>200000 && a<400000){
			sum = a*0.05+a;
			System.out.println(sum);
		}
		else if(a>400000 && a<600000){
			sum = a*0.03+a;
			System.out.println(sum);
		}
		else if(a>600000 && a<1000000){
			sum = a*0.015+a;
			System.out.println(sum);
		}
		else{
			sum = a*0.01+a;
			System.out.println(sum);
		}
	}

}
