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

/**  Bulk upload service is used to upload & manage bulk uploads    */
@SuppressWarnings("serial")
public class BorhanBulkService extends BorhanServiceBase {
    public BorhanBulkService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Get bulk upload batch job by id     */
    public BorhanBulkUpload get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("bulkupload_bulk", "get", kparams, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }

    public BorhanBulkUploadListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanBulkUploadListResponse list(BorhanBulkUploadFilter bulkUploadFilter) throws BorhanApiException {
        return this.list(bulkUploadFilter, null);
    }

	/**  List bulk upload batch jobs     */
    public BorhanBulkUploadListResponse list(BorhanBulkUploadFilter bulkUploadFilter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("bulkUploadFilter", bulkUploadFilter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("bulkupload_bulk", "list", kparams, BorhanBulkUploadListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUploadListResponse.class, resultXmlElement);
    }

	/**  serve action returns the original file.     */
    public String serve(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("bulkupload_bulk", "serve", kparams);
        return this.borhanClient.serve();
    }

	/**  serveLog action returns the log file for the bulk-upload job.     */
    public String serveLog(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("bulkupload_bulk", "serveLog", kparams);
        return this.borhanClient.serve();
    }

	/**  Aborts the bulk upload and all its child jobs     */
    public BorhanBulkUpload abort(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("bulkupload_bulk", "abort", kparams, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }
}
