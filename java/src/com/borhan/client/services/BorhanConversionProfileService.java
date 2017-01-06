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

/**  Add & Manage Conversion Profiles    */
@SuppressWarnings("serial")
public class BorhanConversionProfileService extends BorhanServiceBase {
    public BorhanConversionProfileService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Set Conversion Profile to be the partner default     */
    public BorhanConversionProfile setAsDefault(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("conversionprofile", "setAsDefault", kparams, BorhanConversionProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanConversionProfile.class, resultXmlElement);
    }

    public BorhanConversionProfile getDefault() throws BorhanApiException {
        return this.getDefault(null);
    }

	/**  Get the partner's default conversion profile     */
    public BorhanConversionProfile getDefault(BorhanConversionProfileType type) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("type", type);
        this.borhanClient.queueServiceCall("conversionprofile", "getDefault", kparams, BorhanConversionProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanConversionProfile.class, resultXmlElement);
    }

	/**  Add new Conversion Profile     */
    public BorhanConversionProfile add(BorhanConversionProfile conversionProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("conversionProfile", conversionProfile);
        this.borhanClient.queueServiceCall("conversionprofile", "add", kparams, BorhanConversionProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanConversionProfile.class, resultXmlElement);
    }

	/**  Get Conversion Profile by ID     */
    public BorhanConversionProfile get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("conversionprofile", "get", kparams, BorhanConversionProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanConversionProfile.class, resultXmlElement);
    }

	/**  Update Conversion Profile by ID     */
    public BorhanConversionProfile update(int id, BorhanConversionProfile conversionProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("conversionProfile", conversionProfile);
        this.borhanClient.queueServiceCall("conversionprofile", "update", kparams, BorhanConversionProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanConversionProfile.class, resultXmlElement);
    }

	/**  Delete Conversion Profile by ID     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("conversionprofile", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanConversionProfileListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanConversionProfileListResponse list(BorhanConversionProfileFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List Conversion Profiles by filter with paging support     */
    public BorhanConversionProfileListResponse list(BorhanConversionProfileFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("conversionprofile", "list", kparams, BorhanConversionProfileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanConversionProfileListResponse.class, resultXmlElement);
    }
}
