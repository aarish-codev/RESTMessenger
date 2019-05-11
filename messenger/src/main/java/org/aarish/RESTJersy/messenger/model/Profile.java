package org.aarish.RESTJersy.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Profile {
	
	private Long id;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date created;
	
	public Profile() {
		
	}

	public Profile(Long id, String profileName, String firstName, String lastName, Date created) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = created;
	}
	
	
	
	

}
