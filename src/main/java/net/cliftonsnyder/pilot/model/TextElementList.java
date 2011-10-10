package net.cliftonsnyder.pilot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TextElementList {
	private long lastUpdate;
	private List<String> list;

	public TextElementList() {
		lastUpdate = new Date().getTime();
		list = new ArrayList<String>();
	}

	public long getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@XmlElement(name = "text")
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
}
