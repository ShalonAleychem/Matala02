package GIS;

import java.util.ArrayList;
import java.util.Set;
//this is a Array list of points = area
public interface GIS_layer extends Set<GIS_element>{// שכבה של מידע גיאוגרפי יורשת את הממשק של 
	//השכבה ממשת את ממשק השמה(set)
	// ההבדל set - list 
	//set ללא חזרות 
	//List מותר חזרות
	
	public Meta_data get_Meta_data(); 
}
