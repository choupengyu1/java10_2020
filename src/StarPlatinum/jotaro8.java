package StarPlatinum;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class jotaro8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入一个0～100的分数，如果不是0～100之间，打印分数无效，根据分数等级打印A,B,C,D,E。
		int a = 49;
		if(a<0 && a>100){
			System.out.println("打印分数无效");
			return;
		}
		switch(a/10){
		case 10:
		case 9:
			System.out.println("分数等级A");
			break;
		case 8:
			System.out.println("分数等级B");
			break;
		case 7:
			System.out.println("分数等级C");
			break;
		case 6:
			System.out.println("分数等级D");
			break;
		case 5:
			System.out.println("分数等级E");
			break;
	    default:
	    	System.out.println("垃圾分数");
		}
	}

}
