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

/**  Add & Manage CategoryEntry - assign entry to category    */
@SuppressWarnings("serial")
public class BorhanCategoryEntryService extends BorhanServiceBase {
    public BorhanCategoryEntryService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new CategoryEntry     */
    public BorhanCategoryEntry add(BorhanCategoryEntry categoryEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryEntry", categoryEntry);
        this.borhanClient.queueServiceCall("categoryentry", "add", kparams, BorhanCategoryEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryEntry.class, resultXmlElement);
    }

	/**  Delete CategoryEntry     */
    public void delete(String entryId, int categoryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        this.borhanClient.queueServiceCall("categoryentry", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanCategoryEntryListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanCategoryEntryListResponse list(BorhanCategoryEntryFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List all categoryEntry     */
    public BorhanCategoryEntryListResponse list(BorhanCategoryEntryFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("categoryentry", "list", kparams, BorhanCategoryEntryListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryEntryListResponse.class, resultXmlElement);
    }

    public int index(String entryId, int categoryId) throws BorhanApiException {
        return this.index(entryId, categoryId, true);
    }

	/**  Index CategoryEntry by Id     */
    public int index(String entryId, int categoryId, boolean shouldUpdate) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        kparams.add("shouldUpdate", shouldUpdate);
        this.borhanClient.queueServiceCall("categoryentry", "index", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  activate CategoryEntry when it is pending moderation     */
    public void activate(String entryId, int categoryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        this.borhanClient.queueServiceCall("categoryentry", "activate", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  activate CategoryEntry when it is pending moderation     */
    public void reject(String entryId, int categoryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        this.borhanClient.queueServiceCall("categoryentry", "reject", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  update privacy context from the category     */
    public void syncPrivacyContext(String entryId, int categoryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        this.borhanClient.queueServiceCall("categoryentry", "syncPrivacyContext", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanBulkUpload addFromBulkUpload(BorhanBulkServiceData bulkUploadData) throws BorhanApiException {
        return this.addFromBulkUpload(bulkUploadData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(BorhanBulkServiceData bulkUploadData, BorhanBulkUploadCategoryEntryData bulkUploadCategoryEntryData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadCategoryEntryData", bulkUploadCategoryEntryData);
        this.borhanClient.queueServiceCall("categoryentry", "addFromBulkUpload", kparams, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }
}
