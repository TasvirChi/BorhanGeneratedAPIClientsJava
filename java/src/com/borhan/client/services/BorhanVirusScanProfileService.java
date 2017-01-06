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

/**  Virus scan profile service    */
@SuppressWarnings("serial")
public class BorhanVirusScanProfileService extends BorhanServiceBase {
    public BorhanVirusScanProfileService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanVirusScanProfileListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanVirusScanProfileListResponse list(BorhanVirusScanProfileFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List virus scan profile objects by filter and pager     */
    public BorhanVirusScanProfileListResponse list(BorhanVirusScanProfileFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("virusscan_virusscanprofile", "list", kparams, BorhanVirusScanProfileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanVirusScanProfileListResponse.class, resultXmlElement);
    }

	/**  Allows you to add an virus scan profile object and virus scan profile content
	  associated with Borhan object     */
    public BorhanVirusScanProfile add(BorhanVirusScanProfile virusScanProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("virusScanProfile", virusScanProfile);
        this.borhanClient.queueServiceCall("virusscan_virusscanprofile", "add", kparams, BorhanVirusScanProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanVirusScanProfile.class, resultXmlElement);
    }

	/**  Retrieve an virus scan profile object by id     */
    public BorhanVirusScanProfile get(int virusScanProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("virusScanProfileId", virusScanProfileId);
        this.borhanClient.queueServiceCall("virusscan_virusscanprofile", "get", kparams, BorhanVirusScanProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanVirusScanProfile.class, resultXmlElement);
    }

	/**  Update exisitng virus scan profile, it is possible to update the virus scan
	  profile id too     */
    public BorhanVirusScanProfile update(int virusScanProfileId, BorhanVirusScanProfile virusScanProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("virusScanProfileId", virusScanProfileId);
        kparams.add("virusScanProfile", virusScanProfile);
        this.borhanClient.queueServiceCall("virusscan_virusscanprofile", "update", kparams, BorhanVirusScanProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanVirusScanProfile.class, resultXmlElement);
    }

	/**  Mark the virus scan profile as deleted     */
    public BorhanVirusScanProfile delete(int virusScanProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("virusScanProfileId", virusScanProfileId);
        this.borhanClient.queueServiceCall("virusscan_virusscanprofile", "delete", kparams, BorhanVirusScanProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanVirusScanProfile.class, resultXmlElement);
    }

    public int scan(String flavorAssetId) throws BorhanApiException {
        return this.scan(flavorAssetId, Integer.MIN_VALUE);
    }

	/**  Scan flavor asset according to virus scan profile     */
    public int scan(String flavorAssetId, int virusScanProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("flavorAssetId", flavorAssetId);
        kparams.add("virusScanProfileId", virusScanProfileId);
        this.borhanClient.queueServiceCall("virusscan_virusscanprofile", "scan", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }
}
