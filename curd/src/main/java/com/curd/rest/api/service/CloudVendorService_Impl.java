package com.curd.rest.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curd.rest.api.entities.CloudVendor;
import com.curd.rest.api.repository.CloudVendorRepository;
@Service
public class CloudVendorService_Impl implements CloudVendorService {
	CloudVendorRepository cloudVendorRepository;
	

	public CloudVendorService_Impl(CloudVendorRepository cloudVendorRepository) {
		
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		//more business logic
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		//more business logic
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVenderId) {
		//more business logic
		
		return cloudVendorRepository.findById(cloudVenderId).get();
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		//more business logic
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		//more business logic
		
		return cloudVendorRepository.findAll();
	}

}
