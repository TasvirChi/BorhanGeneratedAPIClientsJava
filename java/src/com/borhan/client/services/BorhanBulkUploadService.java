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
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.borhan.client.enums.*;
import com.borhan.client.BorhanFiles;
import com.borhan.client.BorhanFile;
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

/**  Bulk upload service is used to upload & manage bulk uploads using CSV files. 
  This service manages only entry bulk uploads.    */
@SuppressWarnings("serial")
public class BorhanBulkUploadService extends BorhanServiceBase {
    public BorhanBulkUploadService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanBulkUpload add(int conversionProfileId, BorhanFile csvFileData) throws BorhanApiException {
        return this.add(conversionProfileId, csvFileData, null);
    }

    public BorhanBulkUpload add(int conversionProfileId, File csvFileData) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData), null);
    }

    public BorhanBulkUpload add(int conversionProfileId, InputStream csvFileData, String csvFileDataName, long csvFileDataSize) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData, csvFileDataName, csvFileDataSize), null);
    }

    public BorhanBulkUpload add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataName) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData, csvFileDataName), null);
    }

    public BorhanBulkUpload add(int conversionProfileId, BorhanFile csvFileData, BorhanBulkUploadType bulkUploadType) throws BorhanApiException {
        return this.add(conversionProfileId, csvFileData, bulkUploadType, null);
    }

    public BorhanBulkUpload add(int conversionProfileId, File csvFileData, BorhanBulkUploadType bulkUploadType) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData), bulkUploadType, null);
    }

    public BorhanBulkUpload add(int conversionProfileId, InputStream csvFileData, String csvFileDataName, long csvFileDataSize, BorhanBulkUploadType bulkUploadType) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData, csvFileDataName, csvFileDataSize), bulkUploadType, null);
    }

    public BorhanBulkUpload add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataName, BorhanBulkUploadType bulkUploadType) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData, csvFileDataName), bulkUploadType, null);
    }

    public BorhanBulkUpload add(int conversionProfileId, BorhanFile csvFileData, BorhanBulkUploadType bulkUploadType, String uploadedBy) throws BorhanApiException {
        return this.add(conversionProfileId, csvFileData, bulkUploadType, uploadedBy, null);
    }

    public BorhanBulkUpload add(int conversionProfileId, File csvFileData, BorhanBulkUploadType bulkUploadType, String uploadedBy) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData), bulkUploadType, uploadedBy, null);
    }

    public BorhanBulkUpload add(int conversionProfileId, InputStream csvFileData, String csvFileDataName, long csvFileDataSize, BorhanBulkUploadType bulkUploadType, String uploadedBy) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData, csvFileDataName, csvFileDataSize), bulkUploadType, uploadedBy, null);
    }

    public BorhanBulkUpload add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataName, BorhanBulkUploadType bulkUploadType, String uploadedBy) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData, csvFileDataName), bulkUploadType, uploadedBy, null);
    }

    public BorhanBulkUpload add(int conversionProfileId, File csvFileData, BorhanBulkUploadType bulkUploadType, String uploadedBy, String fileName) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData), bulkUploadType, uploadedBy, fileName);
    }

    public BorhanBulkUpload add(int conversionProfileId, InputStream csvFileData, String csvFileDataName, long csvFileDataSize, BorhanBulkUploadType bulkUploadType, String uploadedBy, String fileName) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData, csvFileDataName, csvFileDataSize), bulkUploadType, uploadedBy, fileName);
    }

    public BorhanBulkUpload add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataName, BorhanBulkUploadType bulkUploadType, String uploadedBy, String fileName) throws BorhanApiException {
        return this.add(conversionProfileId, new BorhanFile(csvFileData, csvFileDataName), bulkUploadType, uploadedBy, fileName);
    }

	/**  Add new bulk upload batch job   Conversion profile id can be specified in the
	  API or in the CSV file, the one in the CSV file will be stronger.   If no
	  conversion profile was specified, partner's default will be used     */
    public BorhanBulkUpload add(int conversionProfileId, BorhanFile csvFileData, BorhanBulkUploadType bulkUploadType, String uploadedBy, String fileName) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("conversionProfileId", conversionProfileId);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("csvFileData", csvFileData);
        kparams.add("bulkUploadType", bulkUploadType);
        kparams.add("uploadedBy", uploadedBy);
        kparams.add("fileName", fileName);
        this.borhanClient.queueServiceCall("bulkupload", "add", kparams, kfiles, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }

	/**  Get bulk upload batch job by id     */
    public BorhanBulkUpload get(long id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("bulkupload", "get", kparams, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }

    public BorhanBulkUploadListResponse list() throws BorhanApiException {
        return this.list(null);
    }

	/**  List bulk upload batch jobs     */
    public BorhanBulkUploadListResponse list(BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("bulkupload", "list", kparams, BorhanBulkUploadListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUploadListResponse.class, resultXmlElement);
    }

	/**  serve action returan the original file.     */
    public String serve(long id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("bulkupload", "serve", kparams);
        return this.borhanClient.serve();
    }

	/**  serveLog action returan the original file.     */
    public String serveLog(long id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("bulkupload", "serveLog", kparams);
        return this.borhanClient.serve();
    }

	/**  Aborts the bulk upload and all its child jobs     */
    public BorhanBulkUpload abort(long id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("bulkupload", "abort", kparams, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }
}
