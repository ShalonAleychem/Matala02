package mypack;

import java.io.File; 
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * https://github.com/igilfu/OOP_PROJECT
 * @author Adam Mashiah & Ron Sider
 *I got help from this github project
 */
public class readcsv {
	
	
	
static public ArrayList<Spot> GetList(String path){//this function gets a path for locating the file and needs to return an ArrayList type spot object
	
	
	ArrayList<Spot> db=new ArrayList<Spot>(); //creating the object i need eventually to return
	/**
	 * we use file class to read the csv file.
	 */
	Scanner scan = null;//the scan will help me to identify the rows
	File file = new File(path);//creating using the file package the path to locate the file on my computer
	
	try{	//because we are dealing with file we have to use try&&catch method for the cases we will find or not the file we are looking for
		scan = new Scanner(file);
		}	    
	catch(FileNotFoundException e){
		System.out.println(e.getMessage());
		}
	/**
	 * get line from the file
	 */

	String row = scan.nextLine();  //creating a iterator for the row on the file 
	/**
	 * read head line
	 */
	row = scan.nextLine();//going on row from the relevant data
	String[] word = new String[11];
//	word = row.split(",");

	while(scan.hasNext())    
	{
		row = scan.nextLine();//going to the relavant row 
		word = row.split(",");//for differ the cells in each row 
		int channe= Integer.parseInt(word[4]);//Reconverts from string to int
		int rssi= Integer.parseInt(word[5]);//Reconverts from string to int
		double cla=Double.parseDouble(word[6]);//Reconverts from string to double
		double clo=Double.parseDouble(word[7]);//Reconverts from string to double
		double attitude=Double.parseDouble(word[8]);//Reconverts from string to double
		int accuracy=Integer.parseInt(word[9]);//Reconverts from string to int
		Spot myrow=new Spot(word[0],word[1],word[2],word[3],channe,rssi,cla,clo,attitude,accuracy,word[10]);//creating an object type spot from the data of the row
		/**
		 *  converting back to double and integer from string
		 */
		System.out.println(myrow.toString());
		db.add(myrow);//adding the row to the ArrayList witch i need to return
	}
//	scan.close();
	return db;//returning and finishing the function
	}
}
