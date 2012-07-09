   
package br.unicamp.ic.sed.mobilemedia.impl.album_mobilephonemgr.impl;

import javax.microedition.lcdui.Command;

import br.unicamp.ic.sed.mobilemedia.impl.album.spec.req.IMobilePhone;
import br.unicamp.ic.sed.cosmos.IManager;

class IMobilePhoneAdapter implements IMobilePhone{
	
	private IManager manager;
	
	public IMobilePhoneAdapter(IManager mgr) {
		this.manager = mgr;
	}
	
	public void postCommand ( Command comand ){ 
		br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.prov.IMobilePhone mobilePhone;
		
		mobilePhone = (br.unicamp.ic.sed.mobilemedia.impl.mobilephonemgr.spec.prov.IMobilePhone)manager.getRequiredInterface("IMobilePhone");
		mobilePhone.postCommand(comand);
	} 

}