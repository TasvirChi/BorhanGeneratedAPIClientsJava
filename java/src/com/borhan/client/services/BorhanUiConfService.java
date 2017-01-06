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

/**  UiConf service lets you create and manage your UIConfs for the various flash
  components  This service is used by the BMC-ApplicationStudio    */
@SuppressWarnings("serial")
public class BorhanUiConfService extends BorhanServiceBase {
    public BorhanUiConfService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  UIConf Add action allows you to add a UIConf to Borhan DB     */
    public BorhanUiConf add(BorhanUiConf uiConf) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("uiConf", uiConf);
        this.borhanClient.queueServiceCall("uiconf", "add", kparams, BorhanUiConf.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUiConf.class, resultXmlElement);
    }

	/**  Update an existing UIConf     */
    public BorhanUiConf update(int id, BorhanUiConf uiConf) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("uiConf", uiConf);
        this.borhanClient.queueServiceCall("uiconf", "update", kparams, BorhanUiConf.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUiConf.class, resultXmlElement);
    }

	/**  Retrieve a UIConf by id     */
    public BorhanUiConf get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("uiconf", "get", kparams, BorhanUiConf.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUiConf.class, resultXmlElement);
    }

	/**  Delete an existing UIConf     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("uiconf", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Clone an existing UIConf     */
    public BorhanUiConf clone(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("uiconf", "clone", kparams, BorhanUiConf.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUiConf.class, resultXmlElement);
    }

    public BorhanUiConfListResponse listTemplates() throws BorhanApiException {
        return this.listTemplates(null);
    }

    public BorhanUiConfListResponse listTemplates(BorhanUiConfFilter filter) throws BorhanApiException {
        return this.listTemplates(filter, null);
    }

	/**  retrieve a list of available template UIConfs     */
    public BorhanUiConfListResponse listTemplates(BorhanUiConfFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("uiconf", "listTemplates", kparams, BorhanUiConfListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUiConfListResponse.class, resultXmlElement);
    }

    public BorhanUiConfListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanUiConfListResponse list(BorhanUiConfFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  Retrieve a list of available UIConfs     */
    public BorhanUiConfListResponse list(BorhanUiConfFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("uiconf", "list", kparams, BorhanUiConfListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUiConfListResponse.class, resultXmlElement);
    }

	/**  Retrieve a list of all available versions by object type     */
    public List<BorhanUiConfTypeInfo> getAvailableTypes() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("uiconf", "getAvailableTypes", kparams, BorhanUiConfTypeInfo.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanUiConfTypeInfo.class, resultXmlElement);
    }
}
