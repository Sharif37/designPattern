package factory;

public class shapeFactory {
	
 
	
	public Shape createShape(String shape)
	{
		if(shape.isEmpty() || shape==null)
			return null ;
		switch (shape){
		case "circle": {
			
			return new circle() ;
		}
		case "rectangle" : 
			return new rectangle() ;
		default:
			throw new IllegalArgumentException("Unexpected value: " + shape);
		}
	}
}
