package GIS;

import java.util.ArrayList;
import java.util.Set;
//this is a Array list of points = area
public interface GIS_layer extends Set<GIS_element>{// ���� �� ���� �������� ����� �� ����� �� 
	//����� ���� �� ���� ����(set)
	// ����� set - list 
	//set ��� ����� 
	//List ���� �����
	
	public Meta_data get_Meta_data(); 
}
