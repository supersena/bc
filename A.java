package day06;

//Identifier: 개발자
//Reserved Word : JVM
public class A {
	public static void main(String[] args) {
		String str = "진달래";
		try { 
			int i = Integer.parseInt(str);
			System.out.println("i: " + i);
		}catch(NumberFormatException ne) {
			System.out.println("숫자 형태만 가능해요");
		}
	}
}
