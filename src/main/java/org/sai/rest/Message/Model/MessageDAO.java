package org.sai.rest.Message.Model;

import java.util.HashMap;
import java.util.Map;

public class MessageDAO {

	private static Map<Long,MessageModel> map = new HashMap<Long,MessageModel>();

	private static Map<Long,Profile> profilemap = new HashMap<Long,Profile>();
	
	public static Map<Long, Profile> getProfilemap() {
		return profilemap;
	}

	public void setProfilemap(Map<Long, Profile> profilemap) {
		this.profilemap = profilemap;
	}

	public static  Map<Long, MessageModel>  getMap() {
		return map;
	}

	public void setMap(Map<Long, MessageModel> map) {
		this.map = map;
	}
	
	
}
