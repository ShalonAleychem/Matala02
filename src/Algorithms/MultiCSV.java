package Algorithms;

/**
 * @Date: December 2nd 2018
 * @author Adam Mashiah & Ron Sider
 *@
 */

//import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.nio.Buffer;
import java.util.Date;
//import java.util.ArrayList;
import java.util.Scanner;

//import com.sun.xml.internal.stream.util.BufferAllocator;

import GIS.gisElement;
import GIS.gisLayer;
import GIS.gisProject;
import GIS.metaData;
import Geom.Point3D;
//import javafx.scene.shape.Line;

public class MultiCSV {
	gisProject gp;
	static long time;

	public MultiCSV() {
		super();
		Date d=new Date();
		/*long*/ time=d.getTime();	
		gp=new gisProject(new metaData(time, "folder"));
	}

public gisProject getGp() {
		return gp;
	}

	public void setGp(gisProject gp) {
		this.gp = gp;
	}

	public gisProject listFile(File dir) {
		File[] files=dir.listFiles();
       gp=new gisProject(new metaData(time, "fol"));
		for(File file : files) {
			if (file.getName().substring(file.getName().length()-3,file.getName().length()).equals("csv")) { 
				System.out.println(file.getName());
				
				Scanner scan = null;
				try{	
					scan = new Scanner(file);
				}	    
				catch(FileNotFoundException e){
					System.out.println(e.getMessage());
				}
				String row = scan.nextLine();

				gisLayer gl=new gisLayer(new metaData(time, row));
				row = scan.nextLine();
				String[] word = new String[11];
				while(scan.hasNext())    
				{
					row = scan.nextLine();//going to the relavant row 
					word = row.split(",");//for differ the cells in each row 
					double cla=Double.parseDouble(word[6]);//Reconverts from string to double
					double clo=Double.parseDouble(word[7]);//Reconverts from string to double
					double attitude=Double.parseDouble(word[8]);//Reconverts from string to double
					String data=word[1]+" "+word[0]+" "+word[2]+" "+word[4]+" "+word[9]+" "+word[10];
					gisElement ge=new gisElement(new Point3D(clo,cla,attitude), new metaData(time, data));//maybe we need to change 
					gl.add(ge);
				}
				gp.add(gl);
				System.out.println(gp.size());
			}
		}
		return gp;
	}
}



