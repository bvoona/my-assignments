package Abstraction;
abstract class Shape
{
	public abstract void draw();
	
}
   class line extends Shape
   {
	 public void draw()
	 {
		 System.out.println("drawing a line");
   }
   }
   class rectangle extends Shape
   {
	   public void draw()
	   {
		   System.out.println("drawing a rectangle");
	   }
   }
   class cube extends Shape
   {
	   public void draw()
	   {
		   System.out.println("drawing a cube");
	   }
   }
   
 