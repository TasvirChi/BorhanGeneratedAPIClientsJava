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

/**  Add & Manage Flavor Params    */
@SuppressWarnings("serial")
public class BorhanFlavorParamsService extends BorhanServiceBase {
    public BorhanFlavorParamsService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new Flavor Params     */
    public BorhanFlavorParams add(BorhanFlavorParams flavorParams) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("flavorParams", flavorParams);
        this.borhanClient.queueServiceCall("flavorparams", "add", kparams, BorhanFlavorParams.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorParams.class, resultXmlElement);
    }

	/**  Get Flavor Params by ID     */
    public BorhanFlavorParams get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("flavorparams", "get", kparams, BorhanFlavorParams.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorParams.class, resultXmlElement);
    }

	/**  Update Flavor Params by ID     */
    public BorhanFlavorParams update(int id, BorhanFlavorParams flavorParams) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("flavorParams", flavorParams);
        this.borhanClient.queueServiceCall("flavorparams", "update", kparams, BorhanFlavorParams.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorParams.class, resultXmlElement);
    }

	/**  Delete Flavor Params by ID     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("flavorparams", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanFlavorParamsListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanFlavorParamsListResponse list(BorhanFlavorParamsFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List Flavor Params by filter with paging support (By default - all system
	  default params will be listed too)     */
    public BorhanFlavorParamsListResponse list(BorhanFlavorParamsFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("flavorparams", "list", kparams, BorhanFlavorParamsListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorParamsListResponse.class, resultXmlElement);
    }

	/**  Get Flavor Params by Conversion Profile ID     */
    public List<BorhanFlavorParams> getByConversionProfileId(int conversionProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("conversionProfileId", conversionProfileId);
        this.borhanClient.queueServiceCall("flavorparams", "getByConversionProfileId", kparams, BorhanFlavorParams.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanFlavorParams.class, resultXmlElement);
    }
}
