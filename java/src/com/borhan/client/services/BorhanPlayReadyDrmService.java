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
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BorhanPlayReadyDrmService extends BorhanServiceBase {
    public BorhanPlayReadyDrmService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Generate key id and content key for PlayReady encryption     */
    public BorhanPlayReadyContentKey generateKey() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("playready_playreadydrm", "generateKey", kparams, BorhanPlayReadyContentKey.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPlayReadyContentKey.class, resultXmlElement);
    }

	/**  Get content keys for input key ids     */
    public List<BorhanPlayReadyContentKey> getContentKeys(String keyIds) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("keyIds", keyIds);
        this.borhanClient.queueServiceCall("playready_playreadydrm", "getContentKeys", kparams, BorhanPlayReadyContentKey.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanPlayReadyContentKey.class, resultXmlElement);
    }

    public BorhanPlayReadyContentKey getEntryContentKey(String entryId) throws BorhanApiException {
        return this.getEntryContentKey(entryId, false);
    }

	/**  Get content key and key id for the given entry     */
    public BorhanPlayReadyContentKey getEntryContentKey(String entryId, boolean createIfMissing) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("createIfMissing", createIfMissing);
        this.borhanClient.queueServiceCall("playready_playreadydrm", "getEntryContentKey", kparams, BorhanPlayReadyContentKey.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPlayReadyContentKey.class, resultXmlElement);
    }

    public BorhanPlayReadyLicenseDetails getLicenseDetails(String keyId, String deviceId, int deviceType) throws BorhanApiException {
        return this.getLicenseDetails(keyId, deviceId, deviceType, null);
    }

    public BorhanPlayReadyLicenseDetails getLicenseDetails(String keyId, String deviceId, int deviceType, String entryId) throws BorhanApiException {
        return this.getLicenseDetails(keyId, deviceId, deviceType, entryId, null);
    }

	/**  Get Play Ready policy and dates for license creation     */
    public BorhanPlayReadyLicenseDetails getLicenseDetails(String keyId, String deviceId, int deviceType, String entryId, String referrer) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("keyId", keyId);
        kparams.add("deviceId", deviceId);
        kparams.add("deviceType", deviceType);
        kparams.add("entryId", entryId);
        kparams.add("referrer", referrer);
        this.borhanClient.queueServiceCall("playready_playreadydrm", "getLicenseDetails", kparams, BorhanPlayReadyLicenseDetails.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPlayReadyLicenseDetails.class, resultXmlElement);
    }
}
