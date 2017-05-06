package br.org.sms.ping.resource;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {
    
    @GET
    public JsonObject get() {
	return Json.createObjectBuilder()
		.add("now", System.nanoTime())
		.build();
    }

}
