package org.sai.rest.MessageResources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sai.rest.Message.Model.MessageModel;
import org.sai.rest.Message.Model.MessageService;

@Path("messages")
public class MessageResource {

	MessageService m = new MessageService();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		
		return hashCode()+"";
	}
	
	@Path("/{messageId}")
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	// for json format we need to add dependencies bcoz java /jersey do not have any in built packages to convert to json format
	@Produces(MediaType.APPLICATION_JSON)
	public MessageModel getMessageWithId(@PathParam("messageId")   Long id){
		return m.getMessage(id);
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MessageModel addMessage(MessageModel msd){
		return m.addMessage(msd);
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MessageModel updateMesssage(@PathParam("messageId") Long id,MessageModel mod){
		mod.setId(id);
		return m.updateMesssage(mod);
	}
	
	@DELETE
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MessageModel removemessage(@PathParam("messageIdḍ") Long id){
		return m.removeMessage(id);
	}
	
}

