package GIS;

import Geom.Geom_element;
import Geom.Point3D;

/**
 * This interface represents a GIS element with geometric representation and meta data such as:
 * Orientation, color, string, timing...
 * @author Boaz Ben-Moshe
 *
 */
public interface GIS_element {//this is a point = spot
	public Geom_element getGeom();//geometric representation//v
	public Meta_data getData();//Orientation, color, string, timing...
	public void translate(Point3D vec);
}
