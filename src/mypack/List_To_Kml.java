package mypack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;


/**
 * https://github.com/igilfu/OOP_PROJECT
 * @author Adam Mashiah & Ron Sider
 *I got help from this github project
 */
public class List_To_Kml {
	/**
	 * This function get a list of Row object and create with that kml file by using jre for kml
	 * @param list
	 * @param desPath 
	 * @param desPathAfterFilterKML 
	 */
	public static  void createKMLFile(ArrayList<Spot> list, String desPath)
	//lets say that the list is the db from the csv and the despath is for storring the file on the file lets say C:\\Users\\���\\Desktop\\ 
	{		
		Kml l =new Kml();
		Document doc= l.createAndSetDocument();


		for (Spot a:list) {
		
				//insert wifi by wifi from the final list
				Placemark p = doc.createAndAddPlacemark();
				p.createAndSetTimeStamp().withWhen(a.getFirstseen().replace(' ','T'));
						p.withName("czx").
						withDescription("Ssid: "+a.getSsid()+"\n Rssi:   "+a.getRssi()+"\nChanal:   "+a.getChannel()+"\nMac:   "+a.getMac()
						+"\nFirst seen:   "+a.getFirstseen()+"\nAouthMode:   "+a.getAuthMode()).
						withOpen(Boolean.TRUE).createAndSetPoint().addToCoordinates(
								(a.getClo()),(a.getCla()));
				  }


		/**
		 * check if there is wifi in the list	
		 */
		
			try {
				l.marshal(new File(desPath));  //"final.kml"
				/**
				 * write to kml file
				 */
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
			
	}
	}
	
	





