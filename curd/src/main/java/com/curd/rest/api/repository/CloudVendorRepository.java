package com.curd.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.rest.api.entities.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>  {

}
