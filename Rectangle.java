
public class Rectangle extends Object implements MyInterface {
  private int width, length;
  public Rectangle(int w, int l) {
	  width=w; length=l;
  }
  public int area() {
	  return length*width;
  }
  public void print() {
	  System.out.println("Width:"+width+" Length:"+length);
  }
}
