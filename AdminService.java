package com.medicare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medicare.model.Medicine;
import com.medicare.repo.IAdminRepository;

@Service
@Transactional
public class AdminService  {
	@Autowired
	private IAdminRepository adminRepository;

	@Transactional
	public void create(Medicine medicine)   
	{  
		adminRepository.save(medicine);  
		System.out.println("medicine"+medicine);
	}  
	/*
	 * public void update(Medicine medicine, int medicine_Id) {
	 * adminRepository.save(medicine); }
	 */ 
	/*
	 * public void delete(Integer medicine_Id) {
	 * adminRepository.deleteById(medicine_Id); }
	 */
	
	
}
