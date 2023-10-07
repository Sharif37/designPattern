package Composite ;
public class Shape implements component {
	public void render()
	{
		System.out.println("render shape ");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("moving shape ");
	}

}
