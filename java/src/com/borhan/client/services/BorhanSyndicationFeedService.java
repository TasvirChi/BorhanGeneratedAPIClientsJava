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

/**  Add & Manage Syndication Feeds    */
@SuppressWarnings("serial")
public class BorhanSyndicationFeedService extends BorhanServiceBase {
    public BorhanSyndicationFeedService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new Syndication Feed     */
    public BorhanBaseSyndicationFeed add(BorhanBaseSyndicationFeed syndicationFeed) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("syndicationFeed", syndicationFeed);
        this.borhanClient.queueServiceCall("syndicationfeed", "add", kparams, BorhanBaseSyndicationFeed.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseSyndicationFeed.class, resultXmlElement);
    }

	/**  Get Syndication Feed by ID     */
    public BorhanBaseSyndicationFeed get(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("syndicationfeed", "get", kparams, BorhanBaseSyndicationFeed.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseSyndicationFeed.class, resultXmlElement);
    }

	/**  Update Syndication Feed by ID     */
    public BorhanBaseSyndicationFeed update(String id, BorhanBaseSyndicationFeed syndicationFeed) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("syndicationFeed", syndicationFeed);
        this.borhanClient.queueServiceCall("syndicationfeed", "update", kparams, BorhanBaseSyndicationFeed.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseSyndicationFeed.class, resultXmlElement);
    }

	/**  Delete Syndication Feed by ID     */
    public void delete(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("syndicationfeed", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanBaseSyndicationFeedListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanBaseSyndicationFeedListResponse list(BorhanBaseSyndicationFeedFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List Syndication Feeds by filter with paging support     */
    public BorhanBaseSyndicationFeedListResponse list(BorhanBaseSyndicationFeedFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("syndicationfeed", "list", kparams, BorhanBaseSyndicationFeedListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseSyndicationFeedListResponse.class, resultXmlElement);
    }

	/**  get entry count for a syndication feed     */
    public BorhanSyndicationFeedEntryCount getEntryCount(String feedId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("feedId", feedId);
        this.borhanClient.queueServiceCall("syndicationfeed", "getEntryCount", kparams, BorhanSyndicationFeedEntryCount.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanSyndicationFeedEntryCount.class, resultXmlElement);
    }

	/**  request conversion for all entries that doesnt have the required flavor param  
	  returns a comma-separated ids of conversion jobs     */
    public String requestConversion(String feedId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("feedId", feedId);
        this.borhanClient.queueServiceCall("syndicationfeed", "requestConversion", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }
}
