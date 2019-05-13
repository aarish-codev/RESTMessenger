package org.aarish.RESTJersy.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.aarish.RESTJersy.messenger.dao.DatabaseClass;
import org.aarish.RESTJersy.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	{
		profiles.put("Foo", new Profile(1L, "foo", "fizz", "buzz"));
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId((long) (profiles.size() + 1));
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty())
			return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public void deleteProfile(String profileName) {
		profiles.remove(profileName);
	}

}
