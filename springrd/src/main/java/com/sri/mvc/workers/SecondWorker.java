package com.sri.mvc.workers;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.springframework.stereotype.Component;

@Component("second")
public class SecondWorker implements Command{
	public boolean execute(Context context ) throws Exception {
		System.err.println( "second" );
		return false;
	}
}
