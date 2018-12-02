package Coords;

import Geom.Point3D;

/**
 * @Date: December 2nd 2018
 * @author Adam Mashiah & Ron Sider
 *@
 */
public class MyCoords implements coords_converter {
	/**
	 * 
	 * @Earth_Radius- this is earth radius	
	 */
	
	private static final int Earth_Radius=6371000;
	
	/** @Lon_Norm- that is a constant used to determine a specific longtitude of a point */

	private static final double Lon_Norm=0.847091;
	
	
	/**
	 * This function takes a gps point and a vector and calculates the new gps point which is the sum
	 */
	public Point3D add(Point3D gps, Point3D local_vector_in_meter)
	{
		if(this.isValid_GPS_Point(gps)==false||this.isValid_GPS_Point(local_vector_in_meter)==false)
		{
			System.out.println("one of your points excceds the possible value, please stop the program running re-enter points");
			System.exit(0);//terminate jvm
			
		}
				
		Point3D p1=new Point3D(gps.x()+local_vector_in_meter.x(),gps.y()+local_vector_in_meter.y(),gps.z()+local_vector_in_meter.z());
		
		return p1;
		
	}
	/**
	 * This function shows distance of 3d dimensionals points(Use only if diff of altitudes is above 200)
	 * 
	 */
	public double distance3d(Point3D gps0, Point3D gps1)
	{
		
		if(this.isValid_GPS_Point(gps0)==false||this.isValid_GPS_Point(gps1)==false)
		{
			System.out.println("one of your points excceds the possible value, please stop the program running re-enter points");
			System.exit(0);//terminate jvm
			
		}
		
		
		
		//return (gps0.distance3D(gps1));
		double lon_diff=Math.abs(gps0.x()-gps1.x());
		double lat_diff=Math.abs(gps0.y()-gps1.y());
		double alt_diff=Math.abs(gps0.z()-gps1.z());
		
		////// now we will convert the difference to radians and then apply earth radius in order to convert to meters
		
		lon_diff=Point3D.d2r(lon_diff);
		 lat_diff=Point3D.d2r(lat_diff);
		 alt_diff=Point3D.d2r(alt_diff);
		 
		 lon_diff=lon_diff*Earth_Radius;
		 lat_diff=lat_diff*Earth_Radius;
		 alt_diff=alt_diff*Earth_Radius;
		 
		 return Math.sqrt(lon_diff*lon_diff+lat_diff*lat_diff+alt_diff*alt_diff);
		 	
	}
	/**
	 * This function shows distance of 2d dimensionals points(Use only if diff of altitudes is below 200)
	 * 
	 */
	
	public double distance2d(Point3D gps0, Point3D gps1)//add an exception
	{
		
		if(this.isValid_GPS_Point(gps0)==false||this.isValid_GPS_Point(gps1)==false)
		{
			System.out.println("one of your points excceds the possible value, please stop the program running re-enter points");
			System.exit(0);//terminate jvm
			
		}
		
		double lon_diff=Math.abs(gps0.x()-gps1.x());
		double lat_diff=Math.abs(gps0.y()-gps1.y());
		
		
		////// now we will convert the difference to radians and then apply earth radius in order to convert to meters
		
		lon_diff=Point3D.d2r(lon_diff);
		 lat_diff=Point3D.d2r(lat_diff);
		 
		 
		 lon_diff=lon_diff*Earth_Radius*Lon_Norm;
		 lat_diff=lat_diff*Earth_Radius;
		 return Math.sqrt((lon_diff*lon_diff)+(lat_diff*lat_diff));		
	}
	
	public Point3D vector3D(Point3D gps0, Point3D gps1)/** gps1 is terminal point, gps0 is starting point. the vector it self is in cartesian form */
	{
		if(this.isValid_GPS_Point(gps0)==false||this.isValid_GPS_Point(gps1)==false)
		{
			System.out.println("one of your points excceds the possible value, please stop the program running re-enter points");
			System.exit(0);//terminate jvm
			
		}
		Point3D p1=new Point3D(gps1.x()-gps0.x(),gps1.y()-gps0.y(),gps1.z()-gps0.z());
		return p1;
	}
	
	public double[] azimuth_elevation_dist(Point3D gps0, Point3D gps1)
	{
		double azimuth=Math.atan((gps1.x()-gps0.x())/(gps1.y()-gps0.y()));
		double distance=gps0.distance3D(gps1);
		double elevation=Math.abs(gps1.z()-gps0.z());
		double[]arr=new double[3];
		arr[0]=azimuth;
		arr[1]=elevation;
		arr[2]=distance;
		return arr;
		
	}
	/**
	 * This function checks if the values entered are according to the instructions.
	 */
	
	public boolean isValid_GPS_Point(Point3D p)
	{
		return (p.x()<=180&&p.x()>=-180&&p.y()<=90&&p.y()>=-90&&p.z()>=-450);
	}


}