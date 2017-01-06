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
import org.w3c.dom.Element;
import com.borhan.client.utils.ParseUtils;
import com.borhan.client.BorhanParams;
import com.borhan.client.BorhanApiException;
import com.borhan.client.types.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  System service is used for internal system helpers & to retrieve system level
  information    */
@SuppressWarnings("serial")
public class BorhanSystemService extends BorhanServiceBase {
    public BorhanSystemService(BorhanClient client) {
        this.borhanClient = client;
    }

    public boolean ping() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("system", "ping", kparams);
        if (this.borhanClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
    }

    public boolean pingDatabase() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("system", "pingDatabase", kparams);
        if (this.borhanClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
    }

    public int getTime() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("system", "getTime", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

    public String getVersion() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("system", "getVersion", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }
}
