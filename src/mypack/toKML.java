package mypack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;

/**
 * @Date: December 2nd 2018
 * @author Adam Mashiah & Ron Sider
 *@
 */
public class toKML {

	public  void createKMLFile(ArrayList<Spot> list, String desPath)
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
			}
}
}

/*.createAndSetTimeStamp().withWhen(list.get(i).getHead().getTime().replace(' ','T'));
p.withDescription("Ssid: "+list.get(i).getElement().get(j).getSsid()+"\nSignal:   "+list.get(i).getElement().get(j).getSignal()+"\nChanal:   "
+list.get(i).getElement().get(j).getChanal()+"\nMac:   "+list.get(i).getElement().get(j).getMac()
		+"\nTime and Date:   "+list.get(i).getHead().getTime()+"\nID:   "+list.get(i).getHead().getID())
.withName(list.get(i).getElement().get(j).getSsid()).withOpen(Boolean.TRUE).createAndSetPoint().addToCoordinates(
				Double.parseDouble(list.get(i).getHead().getLon()),Double.parseDouble(list.get(i).getHead().getLat()));*/