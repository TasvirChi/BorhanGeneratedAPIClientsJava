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

@SuppressWarnings("serial")
public class BorhanDrmProfileService extends BorhanServiceBase {
    public BorhanDrmProfileService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Allows you to add a new DrmProfile object     */
    public BorhanDrmProfile add(BorhanDrmProfile drmProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("drmProfile", drmProfile);
        this.borhanClient.queueServiceCall("drm_drmprofile", "add", kparams, BorhanDrmProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDrmProfile.class, resultXmlElement);
    }

	/**  Retrieve a BorhanDrmProfile object by ID     */
    public BorhanDrmProfile get(int drmProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("drmProfileId", drmProfileId);
        this.borhanClient.queueServiceCall("drm_drmprofile", "get", kparams, BorhanDrmProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDrmProfile.class, resultXmlElement);
    }

	/**  Update an existing BorhanDrmProfile object     */
    public BorhanDrmProfile update(int drmProfileId, BorhanDrmProfile drmProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("drmProfileId", drmProfileId);
        kparams.add("drmProfile", drmProfile);
        this.borhanClient.queueServiceCall("drm_drmprofile", "update", kparams, BorhanDrmProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDrmProfile.class, resultXmlElement);
    }

	/**  Mark the BorhanDrmProfile object as deleted     */
    public BorhanDrmProfile delete(int drmProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("drmProfileId", drmProfileId);
        this.borhanClient.queueServiceCall("drm_drmprofile", "delete", kparams, BorhanDrmProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDrmProfile.class, resultXmlElement);
    }

    public BorhanDrmProfileListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanDrmProfileListResponse list(BorhanDrmProfileFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List BorhanDrmProfile objects     */
    public BorhanDrmProfileListResponse list(BorhanDrmProfileFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("drm_drmprofile", "list", kparams, BorhanDrmProfileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDrmProfileListResponse.class, resultXmlElement);
    }

	/**  Retrieve a BorhanDrmProfile object by provider, if no specific profile defined
	  return default profile     */
    public BorhanDrmProfile getByProvider(BorhanDrmProviderType provider) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("provider", provider);
        this.borhanClient.queueServiceCall("drm_drmprofile", "getByProvider", kparams, BorhanDrmProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDrmProfile.class, resultXmlElement);
    }
}
