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
import com.borhan.client.enums.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Storage Profiles service    */
@SuppressWarnings("serial")
public class BorhanStorageProfileService extends BorhanServiceBase {
    public BorhanStorageProfileService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Adds a storage profile to the Borhan DB.     */
    public BorhanStorageProfile add(BorhanStorageProfile storageProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("storageProfile", storageProfile);
        this.borhanClient.queueServiceCall("storageprofile", "add", kparams, BorhanStorageProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanStorageProfile.class, resultXmlElement);
    }

    public void updateStatus(int storageId, BorhanStorageProfileStatus status) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("storageId", storageId);
        kparams.add("status", status);
        this.borhanClient.queueServiceCall("storageprofile", "updateStatus", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Get storage profile by id     */
    public BorhanStorageProfile get(int storageProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("storageProfileId", storageProfileId);
        this.borhanClient.queueServiceCall("storageprofile", "get", kparams, BorhanStorageProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanStorageProfile.class, resultXmlElement);
    }

	/**  Update storage profile by id      */
    public BorhanStorageProfile update(int storageProfileId, BorhanStorageProfile storageProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("storageProfileId", storageProfileId);
        kparams.add("storageProfile", storageProfile);
        this.borhanClient.queueServiceCall("storageprofile", "update", kparams, BorhanStorageProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanStorageProfile.class, resultXmlElement);
    }

    public BorhanStorageProfileListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanStorageProfileListResponse list(BorhanStorageProfileFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

    public BorhanStorageProfileListResponse list(BorhanStorageProfileFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("storageprofile", "list", kparams, BorhanStorageProfileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanStorageProfileListResponse.class, resultXmlElement);
    }
}
