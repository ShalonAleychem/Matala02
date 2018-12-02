package Main;

import java.io.File;
import java.io.FileFilter;

//import java.io.File;
//import java.io.FileFilter;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//import GIS.gisElement;
//import GIS.gisLayer;
//import GIS.gisProject;
//import GIS.metaData;
//import Geom.Point3D;

public class test0 {
	
//	public void listFolder(File dir) {
//		File[]subDirs = dir.listFiles(new FileFilter() {
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.isDirectory();
//			}
//		});
//		System.out.println("Directory of:\t" + dir.getAbsolutePath()+"  is:");
//		listFile(dir);
//		for(File folder: subDirs) {
//			listFile(folder);
//		}
//	}
	public void listFile(File dir) {
		File[] files = dir.listFiles();
		for (File file: files) {
			if (file.getName().substring(file.getName().length()-3,file.getName().length()).equals("csv")) 
			System.out.println(file.getName());
		}
	}
	public static void main(String []args) {
		//new test0().listFile(new File("C:\\Users\\���\\Desktop\\studies\\OOP\\task2\\Ex2\\Ex2\\data"));
		new test0().listFile(new File("C:\\Users\\Owner\\Downloads\\Ex2\\Ex2\\data"));
}
}
