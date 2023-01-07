package GitBranchApp2;

public class MainApp {
	
	public static void main(String[] args) {
		//組長
		System.out.println("1st Version");
		
		//組長 (新增)
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10,20));
	}
}

class Math{
	Math(){
	}
	int add(int a ,int b) {
		return a+b;
	}
}