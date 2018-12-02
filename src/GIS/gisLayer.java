package GIS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//import java.util.Set;
/**
 * @Date: December 2nd 2018
 * @author Adam Mashiah & Ron Sider
 *@
 */
public class gisLayer implements GIS_layer {
	ArrayList<GIS_element> ge;
	metaData md;

	public gisLayer(metaData md) {
		super();
		this.md = md;
		ge=new ArrayList<GIS_element>();
	}

	@Override
	public boolean add(GIS_element e) {
		return ge.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends GIS_element> c) {
		return ge.addAll(c);
	}

	@Override
	public void clear() {
		ge.clear();
	}

	@Override
	public boolean contains(Object o) {
		return ge.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return ge.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return ge.isEmpty();
	}

	@Override
	public Iterator<GIS_element> iterator() {
		return ge.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return ge.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return ge.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return ge.retainAll(c);
	}

	@Override
	public int size() {
		return ge.size();
	}

	@Override
	public Object[] toArray() {
		return ge.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return ge.toArray(a);
	}

	@Override
	public String toString() {
		return "gisLayer [ge=" + ge + ", md=" + md + "]";
	}
	@Override
	public Meta_data get_Meta_data() {
		return md;
	}

}
