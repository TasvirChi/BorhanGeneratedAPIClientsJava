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

/**  Generic Distribution Provider service    */
@SuppressWarnings("serial")
public class BorhanGenericDistributionProviderService extends BorhanServiceBase {
    public BorhanGenericDistributionProviderService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new Generic Distribution Provider     */
    public BorhanGenericDistributionProvider add(BorhanGenericDistributionProvider genericDistributionProvider) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("genericDistributionProvider", genericDistributionProvider);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovider", "add", kparams, BorhanGenericDistributionProvider.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProvider.class, resultXmlElement);
    }

	/**  Get Generic Distribution Provider by id     */
    public BorhanGenericDistributionProvider get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovider", "get", kparams, BorhanGenericDistributionProvider.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProvider.class, resultXmlElement);
    }

	/**  Update Generic Distribution Provider by id     */
    public BorhanGenericDistributionProvider update(int id, BorhanGenericDistributionProvider genericDistributionProvider) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("genericDistributionProvider", genericDistributionProvider);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovider", "update", kparams, BorhanGenericDistributionProvider.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProvider.class, resultXmlElement);
    }

	/**  Delete Generic Distribution Provider by id     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovider", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanGenericDistributionProviderListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanGenericDistributionProviderListResponse list(BorhanGenericDistributionProviderFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List all distribution providers     */
    public BorhanGenericDistributionProviderListResponse list(BorhanGenericDistributionProviderFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovider", "list", kparams, BorhanGenericDistributionProviderListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderListResponse.class, resultXmlElement);
    }
}
