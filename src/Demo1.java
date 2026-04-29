class HelloWorld{
	static int emailId;
}

public class Demo1{
    static int x = 50;
	int z = 60;
	void m3(){
		System.out.println("m3 static var x " + x); // 90
		System.out.println("m3 object level var x " + z); // 60
	}
	public static void m2(){
		int y = 30;
		System.out.println("m2 static var x before " + x); // 80
		x = 90;
		Demo1 obj = new Demo1();
		System.out.println("object-level var " + obj.z); // 60
		System.out.println("m2 static var x after" + x); // 90
		System.out.println("m2 local var "+ y);
	}
	public static void m1(){
		int y = 20;
		System.out.println("m1 static var x " + x); // 70
		System.out.println("m1 local var "+ y);
		x = 80;
		m2();
	}
	public static void main(String[] args){
		int y = 10;
		System.out.println("HelloWorld");
		System.out.println("main static var x " + x);
		System.out.println("main local var y "+ y);
		x = 70;
		m1();
		Demo1 obj = new Demo1();
		System.out.println("instance/non-static/object-level var " +
		obj.z);
		obj.m3();
		System.out.println(args[0]);//These commands used as a take a input as a command line in a argument like args[0]=zero index variable hold
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		// For 8 primitive data types there is own class int - Integer,float - Float and parseint is a method.
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	}

}