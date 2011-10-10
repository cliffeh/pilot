package net.cliftonsnyder.pilot.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import net.cliftonsnyder.pilot.model.TextElementList;

@Path("/text")
public class TextElementResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public TextElementList getTextElements(String id) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			// TextElementTest te = new TextElementTest("" + i,
			// );
			list.add("this is element #" + i);
		}
		// GenericEntity<Collection<String>> entity = new
		// GenericEntity<Collection<String>>(
		// list) {
		// };
		TextElementList tel = new TextElementList();
		tel.setList(list);
		return tel; // Response.ok(entity).build();
	}
}
