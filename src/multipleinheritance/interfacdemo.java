package multipleinheritance;

public class interfacdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Child1 child1=new Child1();
            child1.show();
            child1.show2();
            child1.show3();
            
            
            Child2 child2=new Child2();
            child2.show();
            child2.show2();
            
            child1.method();
	}

}
