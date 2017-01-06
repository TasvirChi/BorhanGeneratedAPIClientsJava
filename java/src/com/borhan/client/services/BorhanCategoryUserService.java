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

/**  Add & Manage CategoryUser - membership of a user in a category    */
@SuppressWarnings("serial")
public class BorhanCategoryUserService extends BorhanServiceBase {
    public BorhanCategoryUserService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new CategoryUser     */
    public BorhanCategoryUser add(BorhanCategoryUser categoryUser) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryUser", categoryUser);
        this.borhanClient.queueServiceCall("categoryuser", "add", kparams, BorhanCategoryUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryUser.class, resultXmlElement);
    }

	/**  Get CategoryUser by id     */
    public BorhanCategoryUser get(int categoryId, String userId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        this.borhanClient.queueServiceCall("categoryuser", "get", kparams, BorhanCategoryUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryUser.class, resultXmlElement);
    }

    public BorhanCategoryUser update(int categoryId, String userId, BorhanCategoryUser categoryUser) throws BorhanApiException {
        return this.update(categoryId, userId, categoryUser, false);
    }

	/**  Update CategoryUser by id     */
    public BorhanCategoryUser update(int categoryId, String userId, BorhanCategoryUser categoryUser, boolean override) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        kparams.add("categoryUser", categoryUser);
        kparams.add("override", override);
        this.borhanClient.queueServiceCall("categoryuser", "update", kparams, BorhanCategoryUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryUser.class, resultXmlElement);
    }

	/**  Delete a CategoryUser     */
    public void delete(int categoryId, String userId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        this.borhanClient.queueServiceCall("categoryuser", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  activate CategoryUser     */
    public BorhanCategoryUser activate(int categoryId, String userId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        this.borhanClient.queueServiceCall("categoryuser", "activate", kparams, BorhanCategoryUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryUser.class, resultXmlElement);
    }

	/**  reject CategoryUser     */
    public BorhanCategoryUser deactivate(int categoryId, String userId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        this.borhanClient.queueServiceCall("categoryuser", "deactivate", kparams, BorhanCategoryUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryUser.class, resultXmlElement);
    }

    public BorhanCategoryUserListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanCategoryUserListResponse list(BorhanCategoryUserFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List all categories     */
    public BorhanCategoryUserListResponse list(BorhanCategoryUserFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("categoryuser", "list", kparams, BorhanCategoryUserListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCategoryUserListResponse.class, resultXmlElement);
    }

	/**  Copy all memeber from parent category     */
    public void copyFromCategory(int categoryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryId", categoryId);
        this.borhanClient.queueServiceCall("categoryuser", "copyFromCategory", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public int index(String userId, int categoryId) throws BorhanApiException {
        return this.index(userId, categoryId, true);
    }

	/**  Index CategoryUser by userid and category id     */
    public int index(String userId, int categoryId, boolean shouldUpdate) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("userId", userId);
        kparams.add("categoryId", categoryId);
        kparams.add("shouldUpdate", shouldUpdate);
        this.borhanClient.queueServiceCall("categoryuser", "index", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
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

    public BorhanBulkUpload addFromBulkUpload(File fileData, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadCategoryUserData bulkUploadCategoryUserData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData), bulkUploadData, bulkUploadCategoryUserData);
    }

    public BorhanBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadCategoryUserData bulkUploadCategoryUserData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName, fileDataSize), bulkUploadData, bulkUploadCategoryUserData);
    }

    public BorhanBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadCategoryUserData bulkUploadCategoryUserData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName), bulkUploadData, bulkUploadCategoryUserData);
    }

    public BorhanBulkUpload addFromBulkUpload(BorhanFile fileData, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadCategoryUserData bulkUploadCategoryUserData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadCategoryUserData", bulkUploadCategoryUserData);
        this.borhanClient.queueServiceCall("categoryuser", "addFromBulkUpload", kparams, kfiles, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }
}
