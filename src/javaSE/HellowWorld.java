package javaSE;
/***
 * 1.一个.java文件中可以有多个class,但是只能有一个是public修饰的，
 * 文件命名跟public的类名一样
 * 
 * 2.只有public类中才能有main入口方法
 * 
 * 3.如果文件中没有public的类，文件名要跟其中一个类的名一样
 */
public class HellowWorld {
  public static void main(String[] args) {
    System.out.println("Hello World");
	System.out.println("Hello World");
}
}
class test{
	 public static void main(String[] args) {
		System.out.println("奥利给");
	}
 }