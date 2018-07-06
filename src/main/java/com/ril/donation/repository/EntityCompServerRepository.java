package com.ril.donation.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ril.donation.modal.EntityCompServer;



public interface EntityCompServerRepository extends JpaRepository<EntityCompServer, Integer> {
	
	@Transactional
	public void deleteByEntityCompServeridIn(List<Integer> entityCompServerIds);

}
