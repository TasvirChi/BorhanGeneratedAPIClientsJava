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
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.borhan.client.BorhanFiles;
import com.borhan.client.BorhanFile;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add & Manage Categories    */
@SuppressWarnings("serial")
public class BorhanCategoryService extends BorhanServiceBase {
    public BorhanCategoryService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new Category     */
    public BorhanCategory add(BorhanCategory category) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("category", category);
        this.borhanClient.queueServiceCall("category", "add", kparams, BorhanCategory.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategory.class, resultXmlElement);
    }

	/**  Get Category by id     */
    public BorhanCategory get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("category", "get", kparams, BorhanCategory.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategory.class, resultXmlElement);
    }

	/**  Update Category     */
    public BorhanCategory update(int id, BorhanCategory category) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("category", category);
        this.borhanClient.queueServiceCall("category", "update", kparams, BorhanCategory.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategory.class, resultXmlElement);
    }

    public void delete(int id) throws BorhanApiException {
        this.delete(id, BorhanNullableBoolean.get(1));
    }

	/**  Delete a Category     */
    public void delete(int id, BorhanNullableBoolean moveEntriesToParentCategory) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("moveEntriesToParentCategory", moveEntriesToParentCategory);
        this.borhanClient.queueServiceCall("category", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanCategoryListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanCategoryListResponse list(BorhanCategoryFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List all categories     */
    public BorhanCategoryListResponse list(BorhanCategoryFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("category", "list", kparams, BorhanCategoryListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryListResponse.class, resultXmlElement);
    }

    public int index(int id) throws BorhanApiException {
        return this.index(id, true);
    }

	/**  Index Category by id     */
    public int index(int id, boolean shouldUpdate) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("shouldUpdate", shouldUpdate);
        this.borhanClient.queueServiceCall("category", "index", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  Move categories that belong to the same parent category to a target categroy -
	  enabled only for ks with disable entitlement     */
    public BorhanCategoryListResponse move(String categoryIds, int targetCategoryParentId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryIds", categoryIds);
        kparams.add("targetCategoryParentId", targetCategoryParentId);
        this.borhanClient.queueServiceCall("category", "move", kparams, BorhanCategoryListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryListResponse.class, resultXmlElement);
    }

	/**  Unlock categories     */
    public void unlockCategories() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("category", "unlockCategories", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanBulkUpload addFromBulkUpload(BorhanFile fileData) throws BorhanApiException {
        return this.addFromBulkUpload(fileData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(File fileData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData), null);
    }

    public BorhanBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName, fileDataSize), null);
    }

    public BorhanBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName), null);
    }

    public BorhanBulkUpload addFromBulkUpload(BorhanFile fileData, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.addFromBulkUpload(fileData, bulkUploadData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(File fileData, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData), bulkUploadData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName, fileDataSize), bulkUploadData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName), bulkUploadData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(File fileData, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadCategoryData bulkUploadCategoryData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData), bulkUploadData, bulkUploadCategoryData);
    }

    public BorhanBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadCategoryData bulkUploadCategoryData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName, fileDataSize), bulkUploadData, bulkUploadCategoryData);
    }

    public BorhanBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadCategoryData bulkUploadCategoryData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName), bulkUploadData, bulkUploadCategoryData);
    }

    public BorhanBulkUpload addFromBulkUpload(BorhanFile fileData, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadCategoryData bulkUploadCategoryData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadCategoryData", bulkUploadCategoryData);
        this.borhanClient.queueServiceCall("category", "addFromBulkUpload", kparams, kfiles, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }
}
