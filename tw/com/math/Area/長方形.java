package tw.com.math.Area;
interface 多邊形
{
	double 面積(double x,double y);
	double 週長(double x,double y);
}
public class 長方形 implements 多邊形
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