package GIS;

import Coords.MyCoords;


import Geom.Geom_element;
import Geom.Point3D;
/**
 * @Date: December 2nd 2018
 * @author Adam Mashiah & Ron Sider
 * @gisElement class represents properties of the gis element
 */
public class gisElement implements GIS_element{
	Point3D p;
	metaData md;

	public gisElement(Point3D p, metaData md) {
		super();
		this.p = p;
		this.md = md;
	}

	@Override
	public Geom_element getGeom() {
		return p;
	}

	@Override
	public Meta_data getData() {
		return md;
	}

	@Override
	public void translate(Point3D vec) {
		MyCoords mc=new MyCoords();
		this.p=mc.add(p, vec);
	}

}
