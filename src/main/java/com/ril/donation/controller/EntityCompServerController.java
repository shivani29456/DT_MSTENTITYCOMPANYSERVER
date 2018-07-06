package com.ril.donation.controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ril.donation.modal.EntityCompServer;
import com.ril.donation.repository.EntityCompServerRepository;
import com.ril.donation.util.DeleteEntitycompServer;
import com.ril.donation.util.EntityCompServerUtil;


@RestController
public class EntityCompServerController
{
	@Autowired
	EntityCompServerRepository entityCompServerRepository;
	
	
	@RequestMapping(value="viewEntityCompServerMasters" ,method=RequestMethod.GET)
	   public ResponseEntity<Object> viewCompanyMasters() {
		HashMap<String,Object> responseObject=new HashMap<String,Object>();
		List<EntityCompServer > list=entityCompServerRepository.findAll();
		responseObject.put("data", list);
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	   }
	
	@RequestMapping(value="viewByIdEntityCompServerMaster" ,method=RequestMethod.POST)
	 public ResponseEntity<Object> viewCompanyMaster(@Valid @RequestBody EntityCompServerUtil entityCompServerUtil) {
		HashMap<String,Object> responseObject=new HashMap<>();
		java.util.Optional<EntityCompServer> cmp=entityCompServerRepository.findById(entityCompServerUtil.getId());
		responseObject.put("data", cmp);
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);

		
	   }	
	
	@RequestMapping(value="saveEntityCompServerMaster" ,method=RequestMethod.POST)
	public ResponseEntity<Object> saveCompanyMaster(@Valid @RequestBody EntityCompServer entitycmp)
	{
		HashMap<String,Object> responseObject=new HashMap<>();
		entityCompServerRepository.save(entitycmp);
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);

		
	}

	@RequestMapping(value="deleteEntityCompServerMaster" ,method=RequestMethod.POST)
    public ResponseEntity<Object> deleteCompanyMaster(  @Valid @RequestBody EntityCompServerUtil entityCompServerUtil) {
		HashMap<String,Object> responseObject=new HashMap<>();
		entityCompServerRepository.deleteById(entityCompServerUtil.getId());
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
	
	@RequestMapping(value="deleteEntityCompServerMasters" ,method=RequestMethod.POST)
    public ResponseEntity<Object> deleteCompanyMasters(  @Valid @RequestBody DeleteEntitycompServer deleteEntitycompServer) {
		HashMap<String,Object> responseObject=new HashMap<>();
		entityCompServerRepository.deleteByEntityCompServeridIn(deleteEntitycompServer.getCompanyMasterIds());
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
	
	
	

}
