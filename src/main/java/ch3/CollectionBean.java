package ch3;

import java.util.List;
import java.util.Map;

import ch2.SomeBean;

public class CollectionBean {
	private String[] strArray;
	private SomeBean[] sbArray;
	private List list;
	private Map map;
	
	public String[] getStrArray() {
		return strArray;
	}

	public void setStrArray(String[] aStrArray) {
		this.strArray = aStrArray;
	}
	
	public SomeBean[] getSbArray() {
		return sbArray;
	}

	public void setSbArray(SomeBean[] aSbArray) {
		this.sbArray = aSbArray;
	}
	public List getList() {
		return list;
	}

	public void setList(List aList) {
		this.list = aList;
	}
	
	public Map getMap() {
		return map;
	}

	public void setMap(Map aMap) {
		this.map = aMap;
	}
	
	
}