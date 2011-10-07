package net.cliftonsnyder.pilot.resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.cliftonsnyder.pilot.model.DataElement;
import com.cliftonsnyder.pilot.model.DataList;

@Path("/list")
public class DataListResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DataList getList(String id) {
		List<DataElement> list = new ArrayList<DataElement>();
		for (int i = 0; i < 10; i++) {
			DataElement d = new DataElement(i, "this is element #" + i);
			if(i%3 == 0){
				d.setDate(new Date());
			}
			
//			Hashtable<String, String> values = new Hashtable<String, String>();
//			values.put("foo" + i, "bar" + i);
//			d.setValues(values);
			
			list.add(d);
		}
		DataList dl = new DataList();
		dl.setList(list);
		return dl;
	}
}
