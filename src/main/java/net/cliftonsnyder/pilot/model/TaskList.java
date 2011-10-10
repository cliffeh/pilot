package net.cliftonsnyder.pilot.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TaskList {
	private String owner;

	private Collection<Task> tasks;

	public TaskList() {
		tasks = new ArrayList<Task>();
	}

	public TaskList(String owner) {
		this();
		this.owner = owner;
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public String getOwner() {
		return owner;
	}

	public Collection<Task> getTasks() {
		return tasks;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setTasks(Collection<Task> tasks) {
		this.tasks = tasks;
	}
}
