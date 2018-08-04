package org.sai.ApplicationClass;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.sai.rest.MessageResources.MessageResource;
import org.sai.rest.messenger.MyResource;

@ApplicationPath("/webapi/*")
public class MyApplication extends Application{

	private Set<Class<?>> classes;
	private Set<Object> objects;
	
	public MyApplication() {
		System.out.println("---------------My App--------------------------");
		classes = new HashSet<Class<?>>();
		objects = new HashSet<Object>();
		classes.add(MyResource.class);
		objects.add(new MessageResource());
	}
	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return objects;
	}

	@Override
	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return super.getProperties();
	}

}
