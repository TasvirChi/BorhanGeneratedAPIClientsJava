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
import com.borhan.client.enums.*;
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

/**  Metadata service    */
@SuppressWarnings("serial")
public class BorhanMetadataService extends BorhanServiceBase {
    public BorhanMetadataService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Allows you to add a metadata object and metadata content associated with Borhan
	  object     */
    public BorhanMetadata add(int metadataProfileId, BorhanMetadataObjectType objectType, String objectId, String xmlData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("metadataProfileId", metadataProfileId);
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        kparams.add("xmlData", xmlData);
        this.borhanClient.queueServiceCall("metadata_metadata", "add", kparams, BorhanMetadata.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadata.class, resultXmlElement);
    }

    public BorhanMetadata addFromFile(int metadataProfileId, BorhanMetadataObjectType objectType, String objectId, File xmlFile) throws BorhanApiException {
        return this.addFromFile(metadataProfileId, objectType, objectId, new BorhanFile(xmlFile));
    }

    public BorhanMetadata addFromFile(int metadataProfileId, BorhanMetadataObjectType objectType, String objectId, InputStream xmlFile, String xmlFileName, long xmlFileSize) throws BorhanApiException {
        return this.addFromFile(metadataProfileId, objectType, objectId, new BorhanFile(xmlFile, xmlFileName, xmlFileSize));
    }

    public BorhanMetadata addFromFile(int metadataProfileId, BorhanMetadataObjectType objectType, String objectId, FileInputStream xmlFile, String xmlFileName) throws BorhanApiException {
        return this.addFromFile(metadataProfileId, objectType, objectId, new BorhanFile(xmlFile, xmlFileName));
    }

	/**  Allows you to add a metadata object and metadata file associated with Borhan
	  object     */
    public BorhanMetadata addFromFile(int metadataProfileId, BorhanMetadataObjectType objectType, String objectId, BorhanFile xmlFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("metadataProfileId", metadataProfileId);
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("xmlFile", xmlFile);
        this.borhanClient.queueServiceCall("metadata_metadata", "addFromFile", kparams, kfiles, BorhanMetadata.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadata.class, resultXmlElement);
    }

	/**  Allows you to add a metadata xml data from remote URL     */
    public BorhanMetadata addFromUrl(int metadataProfileId, BorhanMetadataObjectType objectType, String objectId, String url) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("metadataProfileId", metadataProfileId);
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        kparams.add("url", url);
        this.borhanClient.queueServiceCall("metadata_metadata", "addFromUrl", kparams, BorhanMetadata.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadata.class, resultXmlElement);
    }

	/**  Allows you to add a metadata xml data from remote URL.   Enables different
	  permissions than addFromUrl action.     */
    public BorhanMetadata addFromBulk(int metadataProfileId, BorhanMetadataObjectType objectType, String objectId, String url) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("metadataProfileId", metadataProfileId);
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        kparams.add("url", url);
        this.borhanClient.queueServiceCall("metadata_metadata", "addFromBulk", kparams, BorhanMetadata.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadata.class, resultXmlElement);
    }

	/**  Retrieve a metadata object by id     */
    public BorhanMetadata get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("metadata_metadata", "get", kparams, BorhanMetadata.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadata.class, resultXmlElement);
    }

    public BorhanMetadata update(int id) throws BorhanApiException {
        return this.update(id, null);
    }

    public BorhanMetadata update(int id, String xmlData) throws BorhanApiException {
        return this.update(id, xmlData, Integer.MIN_VALUE);
    }

	/**  Update an existing metadata object with new XML content     */
    public BorhanMetadata update(int id, String xmlData, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("xmlData", xmlData);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("metadata_metadata", "update", kparams, BorhanMetadata.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadata.class, resultXmlElement);
    }

    public BorhanMetadata updateFromFile(int id) throws BorhanApiException {
        return this.updateFromFile(id, (BorhanFile)null);
    }

    public BorhanMetadata updateFromFile(int id, File xmlFile) throws BorhanApiException {
        return this.updateFromFile(id, new BorhanFile(xmlFile));
    }

    public BorhanMetadata updateFromFile(int id, InputStream xmlFile, String xmlFileName, long xmlFileSize) throws BorhanApiException {
        return this.updateFromFile(id, new BorhanFile(xmlFile, xmlFileName, xmlFileSize));
    }

    public BorhanMetadata updateFromFile(int id, FileInputStream xmlFile, String xmlFileName) throws BorhanApiException {
        return this.updateFromFile(id, new BorhanFile(xmlFile, xmlFileName));
    }

	/**  Update an existing metadata object with new XML file     */
    public BorhanMetadata updateFromFile(int id, BorhanFile xmlFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("xmlFile", xmlFile);
        this.borhanClient.queueServiceCall("metadata_metadata", "updateFromFile", kparams, kfiles, BorhanMetadata.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadata.class, resultXmlElement);
    }

    public BorhanMetadataListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanMetadataListResponse list(BorhanMetadataFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List metadata objects by filter and pager     */
    public BorhanMetadataListResponse list(BorhanMetadataFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("metadata_metadata", "list", kparams, BorhanMetadataListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataListResponse.class, resultXmlElement);
    }

	/**  Delete an existing metadata     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("metadata_metadata", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public void invalidate(int id) throws BorhanApiException {
        this.invalidate(id, Integer.MIN_VALUE);
    }

	/**  Mark existing metadata as invalid   Used by batch metadata transform     */
    public void invalidate(int id, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("metadata_metadata", "invalidate", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Serves metadata XML file     */
    public String serve(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("metadata_metadata", "serve", kparams);
        return this.borhanClient.serve();
    }

    public BorhanMetadata updateFromXSL(int id, File xslFile) throws BorhanApiException {
        return this.updateFromXSL(id, new BorhanFile(xslFile));
    }

    public BorhanMetadata updateFromXSL(int id, InputStream xslFile, String xslFileName, long xslFileSize) throws BorhanApiException {
        return this.updateFromXSL(id, new BorhanFile(xslFile, xslFileName, xslFileSize));
    }

    public BorhanMetadata updateFromXSL(int id, FileInputStream xslFile, String xslFileName) throws BorhanApiException {
        return this.updateFromXSL(id, new BorhanFile(xslFile, xslFileName));
    }

	/**  Action transforms current metadata object XML using a provided XSL.     */
    public BorhanMetadata updateFromXSL(int id, BorhanFile xslFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("xslFile", xslFile);
        this.borhanClient.queueServiceCall("metadata_metadata", "updateFromXSL", kparams, kfiles, BorhanMetadata.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadata.class, resultXmlElement);
    }
}
