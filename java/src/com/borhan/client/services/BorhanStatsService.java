// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Borhan Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2011  Borhan Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.borhan.client.services;

import com.borhan.client.BorhanClient;
import com.borhan.client.BorhanServiceBase;
import com.borhan.client.types.*;
import org.w3c.dom.Element;
import com.borhan.client.utils.ParseUtils;
import com.borhan.client.BorhanParams;
import com.borhan.client.BorhanApiException;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Stats Service    */
@SuppressWarnings("serial")
public class BorhanStatsService extends BorhanServiceBase {
    public BorhanStatsService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Will write to the event log a single line representing the event   client
	  version - will help interprete the line structure. different client versions
	  might have slightly different data/data formats in the line event_id - number is
	  the row number in yuval's excel datetime - same format as MySql's datetime - can
	  change and should reflect the time zone session id - can be some big random
	  number or guid partner id entry id unique viewer widget id ui_conf id uid - the
	  puser id as set by the ppartner current point - in milliseconds duration -
	  milliseconds user ip process duration - in milliseconds control id seek new
	  point referrer       BorhanStatsEvent $event     */
    public boolean collect(BorhanStatsEvent event) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("event", event);
        this.borhanClient.queueServiceCall("stats", "collect", kparams);
        if (this.borhanClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
    }

	/**  Will collect the bmcEvent sent form the BMC client   // this will actually be an
	  empty function because all events will be sent using GET and will anyway be
	  logged in the apache log     */
    public void bmcCollect(BorhanStatsBmcEvent bmcEvent) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("bmcEvent", bmcEvent);
        this.borhanClient.queueServiceCall("stats", "bmcCollect", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanCEError reportKceError(BorhanCEError borhanCEError) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("borhanCEError", borhanCEError);
        this.borhanClient.queueServiceCall("stats", "reportKceError", kparams, BorhanCEError.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCEError.class, resultXmlElement);
    }

	/**  Use this action to report errors to the borhan server.     */
    public void reportError(String errorCode, String errorMessage) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("errorCode", errorCode);
        kparams.add("errorMessage", errorMessage);
        this.borhanClient.queueServiceCall("stats", "reportError", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
