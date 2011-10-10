package net.cliftonsnyder.pilot.model;

public class Task {
	private int id;
	private String description;

	public Task() {

	}

	public Task(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public int getId() {
		return id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}
}
