package test;

public class Teacher{
	private static String tchName;
	private static String tchSubject;
	private static int tchSD;//教师性别,0为男，1为女
	private static int age = 0,tchAge=-1;//tchAge是教龄

	public static void setAge(int ageIn){
		age=ageIn;
		System.out.println("教师年林被设置为："+age);
	}
	public static void set_tchName(String name){
		tchName =name;
		System.out.println("教师姓名被设置为："+tchName);
	}
	public static void set_tchSubject(String name){
		tchSubject =name;
		System.out.println("教师科目被设置为："+tchSubject);
	}
	public static void set_tchAge(int inputAge){
		tchAge =inputAge;
		System.out.println("教师教龄被设置为："+tchAge);
	}
	public static void setSex(int inputAge){
		tchSD =inputAge;
		System.out.println("教师教龄被设置为："+((tchSD==0)?"男":"女"));
	}
	public int printInfo(){
		if(tchName=="" || tchSubject=="" || tchSD==-1 || tchAge == -1 || age ==0){
			System.out.println("教师档案不完整，请尝试补全后再打印");
			return 0;
		}
		else{
			System.out.println("教师姓名："+tchName);
			System.out.println("教师科目："+tchSubject);
			System.out.println("教师性别："+((tchSD==0)?"男":"女"));
			System.out.println("教师年龄："+age);
			System.out.println("教师教龄："+tchAge);
			return 1;
		}
	}
}