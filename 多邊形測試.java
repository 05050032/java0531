import java.lang.*;
public class �h��δ���
{
	public static void main(String srgd[])
	{
		����� ��=new �����();
		����� ��=new �����();
		double a,b,c;
		a=3;
		b=6;
		c=5;
		System.out.println("�����"+c+"������έ��n�G"+��.���n(c,c));
		System.out.println("�����"+c+"������ζg���G"+��.�g��(c,c));
		System.out.println("����"+a+"�e��"+b+"������έ��n:"+��.���n(a,b));
		System.out.println("����"+a+"�e��"+b+"������έ��n:"+��.�g��(a,b));
	}
}
interface �h���
{
	double ���n(double x,double y);
	double �g��(double x,double y);
}
class ����� implements �h���
{
	@Override public double ���n(double x,double y)
	{
		return x*y;
	}
	@Override public double �g��(double x,double y)
	{
		return x*4;
	}
}
class ����� implements �h���
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