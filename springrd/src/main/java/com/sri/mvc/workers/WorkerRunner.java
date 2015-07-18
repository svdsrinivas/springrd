package com.sri.mvc.workers;

import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

@Component("chain")
public class WorkerRunner implements BeanFactoryAware {
	 
		private BeanFactory beanFactory;
	 
		public void runChain( String chainName ) {
			try {
				createChain ( chainName ).execute( new ContextBase() );
			}catch ( Exception exc ) {
				throw new RuntimeException("Chain \"" + chainName + "\": Execution failed.", exc );
			}
		}
	 
		public void setBeanFactory( BeanFactory beanFactory ) throws BeansException {
			this.beanFactory = beanFactory;
		}
	 
		protected ChainBase createChain( String chainName ) {
			return ( ChainBase ) this.beanFactory.getBean( chainName );
		}
	}

