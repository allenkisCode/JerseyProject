package org.sai.rest.Message.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class MessageService {

	private Map<Long,MessageModel> message = MessageDAO.getMap();
	
	public MessageService(){
		message.put(1L, new MessageModel(1L, "chandu", new Date(), "sus"));
		message.put(2L, new MessageModel(2L, "chandu2", new Date(), "sus2"));
	}
	
	public List<MessageModel> getMessages(){
		
		return new ArrayList<>(message.values());
	}
	
	public MessageModel getMessage(Long id){
			return message.get(id);
	}
	
	public MessageModel addMessage(MessageModel m){
		m.setId(message.size() + 1L);
		message.put(m.getId(),m);
		return m;
	}
	
	public MessageModel updateMesssage(MessageModel m){
		if(m.getId() <= 0)
			return null;
		message.put(m.getId(),m);
		return m;
	}
	
	public MessageModel removeMessage(Long id){
		return message.remove(id);
	}
}
