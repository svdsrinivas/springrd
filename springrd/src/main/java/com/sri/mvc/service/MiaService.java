package com.sri.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sri.mvc.bd.MiaBD;
import com.sri.mvc.to.MiaTO;

@Component
public class MiaService {
	@Autowired
	private MiaBD bd;
	
	public MiaTO getDetails(MiaTO to){
		return bd.getDetails(to);
	}
}
