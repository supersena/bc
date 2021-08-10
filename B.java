package day06;

class MyException extends Exception {
	public String toString() {
		return "MyException";
	}
	void use1() {
		System.out.println("MyException 특화된 기능");
	}
}
class YourException extends Exception {
	public String toString() {
		return "YourException";
	}
	void use2() {
		System.out.println("YourException 특화된 기능");
	}
}
