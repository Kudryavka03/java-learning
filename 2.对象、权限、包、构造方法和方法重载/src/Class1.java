import Package2.Class2; //Class2 in Package2

public class Class1 {
	static int num;	//define a variable for Class1
	public Class1() {
		
	}
	public Class1(int a) {
		num=a;	//Make variable "num" same as varibale "a"
	}
	public static void commomMethodOverloadingExample() {
		System.out.println("Overloading Method:commomMethodOverloadingExample() Called!");
	}
	public static void commomMethodOverloadingExample(int a) {
		System.out.println("Overloading Method:commomMethodOverloadingExample(int a) Called! The variable \"a\" is:"+a);
	}
	public  static void  printInfo() {
		System.out.println("This is default package.");
		Class2 dfPkg = new Class2();
		dfPkg.printInfo();
		Class1 samePkg = new Class1();// Moot method
		System.out.println("After new an constructed instance with no parameters ,the value of variable \"num\" is " + num);
		Class1 samePkg2 = new Class1(10);
		System.out.println("Constructor Overloading. The value of variable \"num\" is " + num);
		commomMethodOverloadingExample();
		commomMethodOverloadingExample(114514);
	}
	public static void main(String[] args) {
		printInfo();
	}
}
