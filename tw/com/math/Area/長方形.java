package tw.com.math.Area;
interface �h���
{
	double ���n(double x,double y);
	double �g��(double x,double y);
}
public class ����� implements �h���
{
	@Override public double ���n(double x,double y)
	{
		return x*y;
	}
	@Override public double �g��(double x,double y)
	{
		return (x+y)*2;
	}
}