//Author: Arpit Patel
public class Vec3d 
{
	private double x=0,y=0,z=0;
	
	public Vec3d(double x, double y, double z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public Vec3d cross(Vec3d right )
	{
		return new Vec3d(y*right.z-right.y*z, z*right.x-right.z*x, x*right.y-right.x*y);
	}

	public Vec3d plus(Vec3d right)
	{
	return new Vec3d(x+right.x, y+right.y, z+right.z);
	}
	
	public Vec3d times(Vec3d right)
	{
		return new Vec3d(x*right.x, y*right.y, z*right.z);
	}
	
	public static double dot(Vec3d a, Vec3d b)
	{
		double sum = a.x*b.x + a.y*b.y +a.z+b.z;
		return sum;
	}
	
	public static Vec3d cross(Vec3d a, Vec3d b)
	{
	Vec3d v = new Vec3d(0,0,0);
	v.x = a.y*b.z-b.y*a.z;
	v.y = a.z*b.x-b.z*a.x;
	v.z = a.x*b.y-b.x*a.y;
	return new Vec3d(v.x,v.y,v.z);
	}
	
	public Vec3d neg()
	{
	return new Vec3d(-x,-y,-z);
	}
	
	public String toString()
	{
		return "(" + x + "," + y + "," + z + ")";
	}
	
	public static void main(String[] args) 
	{
		Vec3d v1 = new Vec3d(1.0, 2.5, 3.0);
		Vec3d v2 = new Vec3d(-1.5, 1.0, 1.5);
		Vec3d v3 = v1.cross(v2);
		Vec3d v4 = Vec3d.cross(v1,v2);
		double d = Vec3d.dot(v1,v2);
		Vec3d v5 = v1.plus(v2);
		Vec3d v6 = v1.times(v2);
		Vec3d v7 = v1.neg();
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		System.out.println("d = " + d);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		System.out.println("v7 = " + v7);
		
	}	
}
