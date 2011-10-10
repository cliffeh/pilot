package net.cliftonsnyder.pilot.dao;

import java.util.Hashtable;

import net.cliftonsnyder.pilot.model.Task;
import net.cliftonsnyder.pilot.model.TaskList;

public enum TaskListDao {
	instance;

	private Hashtable<String, TaskList> taskLists;

	private TaskListDao() {
		taskLists = new Hashtable<String, TaskList>();
		TaskList tl = new TaskList("cliffeh");
		tl.addTask(new Task(1, "do the dishes"));
		tl.addTask(new Task(2, "do the moppin'"));
		tl.addTask(new Task(3, "keep hoppin'"));
		tl.addTask(new Task(4, "marry prince(ss)"));
		taskLists.put("cliffeh", tl);
	}

	public TaskList getTaskList(String owner) {
		return taskLists.get(owner);
	}
}
