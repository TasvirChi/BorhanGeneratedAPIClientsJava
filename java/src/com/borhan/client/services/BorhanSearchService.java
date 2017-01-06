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

/**  Search service allows you to search for media in various media providers  This
  service is being used mostly by the CW component    */
@SuppressWarnings("serial")
public class BorhanSearchService extends BorhanServiceBase {
    public BorhanSearchService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanSearchResultResponse search(BorhanSearch search) throws BorhanApiException {
        return this.search(search, null);
    }

	/**  Search for media in one of the supported media providers     */
    public BorhanSearchResultResponse search(BorhanSearch search, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("search", search);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("search", "search", kparams, BorhanSearchResultResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanSearchResultResponse.class, resultXmlElement);
    }

	/**  Retrieve extra information about media found in search action   Some providers
	  return only part of the fields needed to create entry from, use this action to
	  get the rest of the fields.     */
    public BorhanSearchResult getMediaInfo(BorhanSearchResult searchResult) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("searchResult", searchResult);
        this.borhanClient.queueServiceCall("search", "getMediaInfo", kparams, BorhanSearchResult.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanSearchResult.class, resultXmlElement);
    }

	/**  Search for media given a specific URL   Borhan supports a searchURL action on
	  some of the media providers.   This action will return a BorhanSearchResult
	  object based on a given URL (assuming the media provider is supported)     */
    public BorhanSearchResult searchUrl(BorhanMediaType mediaType, String url) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("mediaType", mediaType);
        kparams.add("url", url);
        this.borhanClient.queueServiceCall("search", "searchUrl", kparams, BorhanSearchResult.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanSearchResult.class, resultXmlElement);
    }

    public BorhanSearchAuthData externalLogin(BorhanSearchProviderType searchSource, String userName, String password) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("searchSource", searchSource);
        kparams.add("userName", userName);
        kparams.add("password", password);
        this.borhanClient.queueServiceCall("search", "externalLogin", kparams, BorhanSearchAuthData.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanSearchAuthData.class, resultXmlElement);
    }
}
