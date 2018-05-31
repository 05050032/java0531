import java.lang.*;
public class 多邊形測試
{
	public static void main(String srgd[])
	{
		長方形 長=new 長方形();
		正方形 正=new 正方形();
		double a,b,c;
		a=3;
		b=6;
		c=5;
		System.out.println("邊長為"+c+"的正方形面積："+正.面積(c,c));
		System.out.println("邊長為"+c+"的正方形週長："+正.週長(c,c));
		System.out.println("長為"+a+"寬為"+b+"的長方形面積:"+長.面積(a,b));
		System.out.println("長為"+a+"寬為"+b+"的長方形面積:"+長.週長(a,b));
	}
}
interface 多邊形
{
	double 面積(double x,double y);
	double 週長(double x,double y);
}
class 正方形 implements 多邊形
{
	@Override public double 面積(double x,double y)
	{
		return x*y;
	}
	@Override public double 週長(double x,double y)
	{
		return x*4;
	}
}
class 長方形 implements 多邊形
{
	@Override public double 面積(double x,double y)
	{
		return x*y;
	}
	@Override public double 週長(double x,double y)
	{
		return (x+y)*2;
	}
}