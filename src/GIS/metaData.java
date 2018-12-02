package GIS;

import Geom.Point3D;

/**
 * @Date: December 2nd 2018
 * @author Adam Mashiah & Ron Sider
 *@
 */

public class metaData implements Meta_data {
	private long UTC;
	private String data;

	@Override
	public long getUTC() {
		return UTC;
	}

	@Override
	public String toString() {
		return "metaData [data=" + data + "]";
	}

	public metaData(long uTC, String data) {
		super();
		UTC = uTC;
		this.data = data;
	}

	@Override
	public Point3D get_Orientation() {
		return null;
	}

}
