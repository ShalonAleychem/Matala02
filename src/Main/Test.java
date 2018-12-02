package Main;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import Algorithms.MultiCSV;
import GIS.gisElement;
import GIS.gisLayer;
import GIS.gisProject;
import GIS.metaData;
import Geom.Point3D;
import mypack.List_To_Kml;
import mypack.Spot;
import mypack.readcsv;

public class Test {

	public static void main(String[] args) {
		gisLayer gl=new gisLayer(new metaData(465649498, "vxcvcxvcxvcxcxv"));
		ArrayList<Spot> db=readcsv.GetList
        ("C:\\Users\\���\\Desktop\\studies\\OOP\\task2\\Ex2\\Ex2\\data\\WigleWifi_20171201110209.csv");
		List_To_Kml.createKMLFile(db,"C:\\Users\\���\\Desktop\\beshvilah_saider.kml");
		
		MultiCSV test=new MultiCSV();
		//test.listFile
		//(new File("C:\\Users\\���\\Desktop\\studies\\OOP\\task2\\Ex2\\Ex2\\data"));
		test.listFile(new File("C:\\Users\\Owner\\Downloads\\Ex2\\Ex2\\data"));
		System.out.println(test.getGp().Getgl().get(0).toString());
	}
}

//@Override
//		Point3D a=new Point3D(32.16956688989755, 34.812206661227876, 29.984707511555015);
//		Point3D b=new Point3D(32.16943682725201, 34.81208525807686, 27.286889233099085);
//		MyCoords dis=new MyCoords();
//		System.out.println(dis.distance3d(a, b));