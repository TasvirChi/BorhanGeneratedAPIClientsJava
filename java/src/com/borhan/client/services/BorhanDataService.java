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

/**  Data service lets you manage data content (textual content)    */
@SuppressWarnings("serial")
public class BorhanDataService extends BorhanServiceBase {
    public BorhanDataService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Adds a new data entry     */
    public BorhanDataEntry add(BorhanDataEntry dataEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dataEntry", dataEntry);
        this.borhanClient.queueServiceCall("data", "add", kparams, BorhanDataEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDataEntry.class, resultXmlElement);
    }

    public BorhanDataEntry get(String entryId) throws BorhanApiException {
        return this.get(entryId, -1);
    }

	/**  Get data entry by ID.     */
    public BorhanDataEntry get(String entryId, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("data", "get", kparams, BorhanDataEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDataEntry.class, resultXmlElement);
    }

	/**  Update data entry. Only the properties that were set will be updated.     */
    public BorhanDataEntry update(String entryId, BorhanDataEntry documentEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("documentEntry", documentEntry);
        this.borhanClient.queueServiceCall("data", "update", kparams, BorhanDataEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDataEntry.class, resultXmlElement);
    }

	/**  Delete a data entry.     */
    public void delete(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("data", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanDataListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanDataListResponse list(BorhanDataEntryFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List data entries by filter with paging support.     */
    public BorhanDataListResponse list(BorhanDataEntryFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("data", "list", kparams, BorhanDataListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDataListResponse.class, resultXmlElement);
    }

    public String serve(String entryId) throws BorhanApiException {
        return this.serve(entryId, -1);
    }

    public String serve(String entryId, int version) throws BorhanApiException {
        return this.serve(entryId, version, false);
    }

	/**  serve action returan the file from dataContent field.     */
    public String serve(String entryId, int version, boolean forceProxy) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        kparams.add("forceProxy", forceProxy);
        this.borhanClient.queueServiceCall("data", "serve", kparams);
        return this.borhanClient.serve();
    }
}
