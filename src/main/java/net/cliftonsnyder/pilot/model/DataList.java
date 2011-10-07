package net.cliftonsnyder.pilot.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DataList {
	private long lastUpdate;
	private List<DataElement> list;

	public DataList() {
		lastUpdate = new Date().getTime();
		list = new ArrayList<DataElement>();
	}

	public long getLastUpdate() {
		return lastUpdate;
	}

	public List<DataElement> getList() {
		return list;
	}

	public void setLastUpdate(long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void setList(List<DataElement> list) {
		this.list = list;
	}
}
