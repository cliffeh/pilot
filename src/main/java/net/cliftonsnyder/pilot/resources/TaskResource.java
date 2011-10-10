package net.cliftonsnyder.pilot.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import net.cliftonsnyder.pilot.dao.TaskListDao;
import net.cliftonsnyder.pilot.model.TaskList;

@Path("/tasks/{owner}")
public class TaskResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public TaskList getTaskList(@PathParam("owner") String owner) {
		return TaskListDao.instance.getTaskList(owner);
	}
}
	