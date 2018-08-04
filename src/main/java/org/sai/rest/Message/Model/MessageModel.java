package org.sai.rest.Message.Model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class MessageModel {

	private Long id;
	private String message;
	private Date createdate;
	private String creator;
	
	public MessageModel(){
		
	}
	
	public MessageModel(Long id,String msg,Date createdate,String creator){
		this.id = id;
		this.message=msg;
		this.createdate = createdate;
		this.creator = creator;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
}
