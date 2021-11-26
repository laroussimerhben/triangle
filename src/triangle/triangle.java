package triangle;

public class triangle {
	private int l1,l2,l3;
	public triangle (int a, int b, int c)
	{
		l1=a;
		l2=b;
		l3=c;
	}

public TriangleType getType()
{
	if ((Math.min(Math.min(l1,l2),l3) <=0) || (l1 >= l2+l3) || (l2 >= l1+l3) || (l3 >= l1+l2))
	{
		return TriangleType.Invalid;
	}
	else if ((l1 == l2) && ( l2==l3 ))
		return TriangleType.Equilateral;
	else if ((l1==l2) || (l2==l3) || (l3==l1))
	{
		return TriangleType.Isoceles;
	}
	else
		return TriangleType.Scalene;
		
}
}
