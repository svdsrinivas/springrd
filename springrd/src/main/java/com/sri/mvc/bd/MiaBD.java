package com.sri.mvc.bd;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sri.mvc.to.MiaTO;
import com.sri.mvc.workers.WorkerRunner;

@Component
public class MiaBD {
	@Resource
	WorkerRunner chainRunner;
	public MiaTO getDetails(MiaTO to){
		System.out.println("Starting up...      [Ok]");
		chainRunner.runChain( "pingPongChain" );
		return null;
	}
}
