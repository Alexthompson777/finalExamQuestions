package QuestionC;

public class IllegalRectangle extends Exception {
	
	private int X;
	private int Y;
	
	public IllegalRectangle(int X, int Y)
	{
		this.X = X;
		this.Y = Y;
	}
	
	public int getX(){
		return X;
	}
	
	public int getY(){
		return Y;
	}

}
