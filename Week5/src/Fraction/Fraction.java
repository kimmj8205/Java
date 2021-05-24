package Fraction;

public class Fraction 
{
	int n;
	int d;
	public Fraction(int n, int d)
	{
		this.n = n;
		this.d = d;
	}
	public Fraction add(Fraction i)
	{
		int n = this.n * i.d +  i.n * this.d;
		int d = this.d * i.d;
		Fraction result = new Fraction(n, d);
		return result;
	}
	public Fraction add(int i)
	{
		 int n = this.n + this.d * i;
		 Fraction result = new Fraction(n, d);
		 return result;
	}
	public void negate()
	{
		this.n = -this.n;
	}
	public Fraction inverse()
	{
		int n;
		int d;
		int s;
		s = this.n;
		n = this.d;
		d = s;
		Fraction result = new Fraction(n, d);
		return result;
	}
	public Fraction multiply(Fraction i)
	{
		int n = this.n * i.n;
		int d = this.d * i.d;
		Fraction result = new Fraction(n, d);
		return result;
	}
	public void multiply(int i)
	{
		n = n * i;
	}
	public String toText()
	{
		return (this.n+"/"+this.d);
	}
	public static void main(String[] args) 
	{
		Fraction x1 = new Fraction(1, 2);
		Fraction x2 = new Fraction(2, 3);
		Fraction xresult = x1.add(x2);
		String xr = xresult.toText();
		System.out.println("X = " + xr);
		Fraction y = new Fraction(-1, 2);
		Fraction yn = xresult.add(y);
		Fraction yd = xresult.add(-1);
		Fraction yd2 = yd.inverse();
		Fraction yresult = yn.multiply(yd2);
		String yr = yresult.toText();
		System.out.println("Y = " + yr);
	}

}
