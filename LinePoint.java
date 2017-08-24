import java.util.*;

public class LinePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Point.");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		System.out.println("Enter Second Point.");
		int a1 = in.nextInt();
		int b1 = in.nextInt();
		int c1 = in.nextInt();
		int d1 = in.nextInt();
		Point p1 = new Point(a, b);
		Point p2 = new Point(c, d);
		Point p3 = new Point(a1, b1);
		Point p4 = new Point(c1, d1);
		Line l1 = new Line(p1, p2);
		Line l2 = new Line(p3, p4);
		Point res = Line.intersect(l1, l2);
		System.out.println("("+res.x+","+res.y+")");
		in.close();
	}

}
class Point{
	double x, y;
	Point(){
		x = 0;
		y = 0;
	}
	Point(double a, double b){
		x = a;
		y = b;
	}
}
class Line{
	double m, c, xStart, yStart, xEnd, yEnd;
	Line(){
		m = 0;
		c = 0;
	}
	Line(Point p1, Point p2){
		m = (p2.y - p1.y)/(p2.x - p1.x);
		c = p2.y - (m*(p2.x));
		xStart = p1.x;
		yStart = p1.y;
		xEnd = p2.x;
		yEnd = p2.y;
		
	}
	public static Point intersect(Line l1, Line l2){
	// Line AB represented as a1x + b1y = c1
        double a1 = l1.yEnd - l1.yStart;
        double b1 = l1.xStart - l1.xEnd;
        double c1 = a1*(l1.xStart) + b1*(l1.yStart);
        
     // Line CD represented as a2x + b2y = c2
        double a2 = l2.yEnd - l2.yStart;
        double b2 = l2.xStart - l2.xEnd;
        double c2 = a2*(l2.xStart)+ b2*(l2.yStart);
        
        double determinant = a1*b2 - a2*b1;
        
        if (determinant == 0)
        {
            return new Point(Double.MAX_VALUE, Double.MAX_VALUE);
        }
        else
        {
            double x = (b2*c1 - b1*c2)/determinant;
            double y = (a1*c2 - a2*c1)/determinant;
            return new Point(x, y);
        }
		
	}
	
}