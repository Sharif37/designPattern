package designPattern;

public class User implements calculateTax{
	String name ;
	int age ;
	public User(String name,int age) {
		this.name=name ;
		this.age=age ;
	}
	@Override
	public float TaxCalculate() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
