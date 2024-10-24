package com.curd.rest.api.service;

import java.util.List;

import com.curd.rest.api.entities.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public CloudVendor getCloudVendor(String cloudVenderId);
	public String deleteCloudVendor(String cloudVendorId);
	public List<CloudVendor> getAllCloudVendor();
	
	

}
