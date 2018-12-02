package Coords;
import Geom.Point3D;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @Date: December 2nd 2018
 * @author Adam Mashiah & Ron Sider
 *@
 */

class MyCoords_Test {

	@Test	
	void test_Distance2D()
	{
		Point3D p0=new Point3D(35.20904,32.10332,670);//building 9
		Point3D p1=new Point3D(32.10635,35.20523,650);//Humus
		MyCoords m1=new MyCoords();
		assertEquals(m1.distance2d(p0, p1),493.0523);//range of deviation  distance is [-1,+1] running the function on main gets us a very close number
	}

	@Test
	void test_is_valid_gps_point()
	{
		Point3D p0=new Point3D(100000,1000000,100000);
		Point3D p1=new Point3D(8,9,10);
		MyCoords m1=new MyCoords();
		assertEquals(m1.isValid_GPS_Point(p0),false);//Wrong on purpose
		assertEquals(m1.isValid_GPS_Point(p1),true);//Valid
	}


}
