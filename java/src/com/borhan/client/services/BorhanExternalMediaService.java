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

/**  External media service lets you upload and manage embed codes and external
  playable content    */
@SuppressWarnings("serial")
public class BorhanExternalMediaService extends BorhanServiceBase {
    public BorhanExternalMediaService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add external media entry     */
    public BorhanExternalMediaEntry add(BorhanExternalMediaEntry entry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entry", entry);
        this.borhanClient.queueServiceCall("externalmedia_externalmedia", "add", kparams, BorhanExternalMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanExternalMediaEntry.class, resultXmlElement);
    }

	/**  Get external media entry by ID.     */
    public BorhanExternalMediaEntry get(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("externalmedia_externalmedia", "get", kparams, BorhanExternalMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanExternalMediaEntry.class, resultXmlElement);
    }

	/**  Update external media entry. Only the properties that were set will be updated. 
	     */
    public BorhanExternalMediaEntry update(String id, BorhanExternalMediaEntry entry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("entry", entry);
        this.borhanClient.queueServiceCall("externalmedia_externalmedia", "update", kparams, BorhanExternalMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanExternalMediaEntry.class, resultXmlElement);
    }

	/**  Delete a external media entry.     */
    public void delete(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("externalmedia_externalmedia", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanExternalMediaEntryListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanExternalMediaEntryListResponse list(BorhanExternalMediaEntryFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List media entries by filter with paging support.     */
    public BorhanExternalMediaEntryListResponse list(BorhanExternalMediaEntryFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("externalmedia_externalmedia", "list", kparams, BorhanExternalMediaEntryListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanExternalMediaEntryListResponse.class, resultXmlElement);
    }

    public int count() throws BorhanApiException {
        return this.count(null);
    }

	/**  Count media entries by filter.     */
    public int count(BorhanExternalMediaEntryFilter filter) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        this.borhanClient.queueServiceCall("externalmedia_externalmedia", "count", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }
}
