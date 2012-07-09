package br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionshandler_mobilephonemgr.impl;

import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.mobilephonecontroller.spec.req.IExceptionsHandlerCtr;
import br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionshandler_mobilephonemgr.impl.ComponentFactory;
import br.unicamp.ic.sed.cosmos.IManager;

class IExceptionsHandlerAdapter implements IExceptionsHandlerCtr{

	
	
	
	public void handle(Exception exception) { //System.out.println("IExceptionsHandlerAdapter.handle()");
		br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionhandler.spec.prov.IExceptionsHandlerCtr handler;	
		IManager mgr = ComponentFactory.createInstance();
		
		handler = (br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.impl.warningexceptionhandler.spec.prov.IExceptionsHandlerCtr)mgr.getRequiredInterface("IExceptionsHandlerCtr");
		
		handler.handle(exception);
	}
}