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

@SuppressWarnings("serial")
public class BorhanUploadTokenService extends BorhanServiceBase {
    public BorhanUploadTokenService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanUploadToken add() throws BorhanApiException {
        return this.add(null);
    }

	/**  Adds new upload token to upload a file     */
    public BorhanUploadToken add(BorhanUploadToken uploadToken) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("uploadToken", uploadToken);
        this.borhanClient.queueServiceCall("uploadtoken", "add", kparams, BorhanUploadToken.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUploadToken.class, resultXmlElement);
    }

	/**  Get upload token by id     */
    public BorhanUploadToken get(String uploadTokenId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("uploadTokenId", uploadTokenId);
        this.borhanClient.queueServiceCall("uploadtoken", "get", kparams, BorhanUploadToken.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUploadToken.class, resultXmlElement);
    }

    public BorhanUploadToken upload(String uploadTokenId, BorhanFile fileData) throws BorhanApiException {
        return this.upload(uploadTokenId, fileData, false);
    }

    public BorhanUploadToken upload(String uploadTokenId, File fileData) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData), false);
    }

    public BorhanUploadToken upload(String uploadTokenId, InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData, fileDataName, fileDataSize), false);
    }

    public BorhanUploadToken upload(String uploadTokenId, FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData, fileDataName), false);
    }

    public BorhanUploadToken upload(String uploadTokenId, BorhanFile fileData, boolean resume) throws BorhanApiException {
        return this.upload(uploadTokenId, fileData, resume, true);
    }

    public BorhanUploadToken upload(String uploadTokenId, File fileData, boolean resume) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData), resume, true);
    }

    public BorhanUploadToken upload(String uploadTokenId, InputStream fileData, String fileDataName, long fileDataSize, boolean resume) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData, fileDataName, fileDataSize), resume, true);
    }

    public BorhanUploadToken upload(String uploadTokenId, FileInputStream fileData, String fileDataName, boolean resume) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData, fileDataName), resume, true);
    }

    public BorhanUploadToken upload(String uploadTokenId, BorhanFile fileData, boolean resume, boolean finalChunk) throws BorhanApiException {
        return this.upload(uploadTokenId, fileData, resume, finalChunk, -1);
    }

    public BorhanUploadToken upload(String uploadTokenId, File fileData, boolean resume, boolean finalChunk) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData), resume, finalChunk, -1);
    }

    public BorhanUploadToken upload(String uploadTokenId, InputStream fileData, String fileDataName, long fileDataSize, boolean resume, boolean finalChunk) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData, fileDataName, fileDataSize), resume, finalChunk, -1);
    }

    public BorhanUploadToken upload(String uploadTokenId, FileInputStream fileData, String fileDataName, boolean resume, boolean finalChunk) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData, fileDataName), resume, finalChunk, -1);
    }

    public BorhanUploadToken upload(String uploadTokenId, File fileData, boolean resume, boolean finalChunk, double resumeAt) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData), resume, finalChunk, resumeAt);
    }

    public BorhanUploadToken upload(String uploadTokenId, InputStream fileData, String fileDataName, long fileDataSize, boolean resume, boolean finalChunk, double resumeAt) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData, fileDataName, fileDataSize), resume, finalChunk, resumeAt);
    }

    public BorhanUploadToken upload(String uploadTokenId, FileInputStream fileData, String fileDataName, boolean resume, boolean finalChunk, double resumeAt) throws BorhanApiException {
        return this.upload(uploadTokenId, new BorhanFile(fileData, fileDataName), resume, finalChunk, resumeAt);
    }

	/**  Upload a file using the upload token id, returns an error on failure (an
	  exception will be thrown when using one of the Borhan clients)      */
    public BorhanUploadToken upload(String uploadTokenId, BorhanFile fileData, boolean resume, boolean finalChunk, double resumeAt) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("uploadTokenId", uploadTokenId);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        kparams.add("resume", resume);
        kparams.add("finalChunk", finalChunk);
        kparams.add("resumeAt", resumeAt);
        this.borhanClient.queueServiceCall("uploadtoken", "upload", kparams, kfiles, BorhanUploadToken.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUploadToken.class, resultXmlElement);
    }

	/**  Deletes the upload token by upload token id     */
    public void delete(String uploadTokenId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("uploadTokenId", uploadTokenId);
        this.borhanClient.queueServiceCall("uploadtoken", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanUploadTokenListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanUploadTokenListResponse list(BorhanUploadTokenFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List upload token by filter with pager support.    When using a user session the
	  service will be restricted to users objects only.     */
    public BorhanUploadTokenListResponse list(BorhanUploadTokenFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("uploadtoken", "list", kparams, BorhanUploadTokenListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUploadTokenListResponse.class, resultXmlElement);
    }
}
