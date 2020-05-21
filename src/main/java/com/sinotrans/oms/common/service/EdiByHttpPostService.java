package com.sinotrans.oms.common.service;

import java.util.Map;

public interface EdiByHttpPostService {
	
	@SuppressWarnings("rawtypes")
	public Map sendEDIByHttpPost (String sender, String receiver, String messageType, String fileNM, String txtString,String esusEscoId,Long eorbId) throws Exception ;

}
