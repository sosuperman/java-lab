
public class Complex {
	int real;
	int imag;
	Complex(){
		this.real = 0;
		this.imag = 0;
	}
	Complex(int r, int i){
		this.real = r;
		this.imag = i;
	}
	double magnitude(Complex a){
		return Math.sqrt((a.real * a.real)+ (a.imag * a.imag));
	}
	String conjugate(Complex a){
		return(a.real+"-"+a.imag);
	}
	Complex add(Complex a, Complex b){
		Complex res = new Complex();
		res.real = a.real + b.real;
		res.imag = a.imag + b.imag;
		return res;
	}
	static boolean equal(Complex a, Complex b){
		if(a.real == b.real && a.imag == b.imag)
			return true;
		else 
			return false;
	}
	boolean compare(Complex a){
		if(a.real == this.real && a.imag == this.imag)
			return true;
		else 
			return false;
	}
}

class ComplexOp{
	public static void main(String...strings){
		Complex ob = new Complex();
		Complex a = new Complex(10, 20);
		Complex b = new Complex(5, 10);
		System.out.println(ob.magnitude(a));
		System.out.println(ob.conjugate(a));
		System.out.println(ob.add(a, b));
		System.out.println(Complex.equal(a,b));
		Complex c = new Complex(10, 20);
		System.out.println(c.equals(a));
	}
}