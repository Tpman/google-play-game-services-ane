package com.airgamer.ane.playgameservices.turnbasegames.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.airgamer.ane.playgameservices.Extension;

public class RematchFunction implements FREFunction {

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {

		String matchId = null;

		try
		{
			matchId = arg1[0].getAsString();

		}
		catch (Exception e)
		{
			return null;
		}	
		
		Extension.context.turnBaseMulti.rematch(matchId);
		return null;
	}

}
