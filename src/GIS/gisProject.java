package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Date: December 2nd 2018
 * @author Adam Mashiah & Ron Sider
 *@ gisProject represents a collection of gis layers
 */
public class gisProject implements GIS_project {
	ArrayList<GIS_layer> gl;
	metaData md;
	
	public gisProject(metaData md) {
		super();
		this.md = md;
		gl=new ArrayList<GIS_layer>();
	}
	public ArrayList<GIS_layer> Getgl(){return this.gl;}
	
	@Override
	public boolean add(GIS_layer e) {
		return gl.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends GIS_layer> c) {
		return gl.addAll(c);
	}

	@Override
	public void clear() {
		gl.clear();
	}

	@Override
	public boolean contains(Object o) {
		return gl.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return gl.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return gl.isEmpty();
	}

	@Override
	public Iterator<GIS_layer> iterator() {
		return gl.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return gl.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return gl.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return gl.retainAll(c);
	}

	@Override
	public int size() {
		return gl.size();
	}

	@Override
	public Object[] toArray() {
		return gl.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return gl.toArray(a);
	}

	@Override
	public Meta_data get_Meta_data() {
		return md;
	}

}
