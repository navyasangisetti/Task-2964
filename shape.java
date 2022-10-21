package javaproject;

public class shape {
	int height;
	int width;

	public shape() {     
		height=20 ;
		width=30 ;
		
	}

}

 class Main {
	   public static void main(String args[]) {

			rectangle objRec = new rectangle();
			square objSquare = new square();
			circle objCircle = new circle();

			objRec.area();
			objSquare.area();
			objCircle.area();

		}
}
	    

