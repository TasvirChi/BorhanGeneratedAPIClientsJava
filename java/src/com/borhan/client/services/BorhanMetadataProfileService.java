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

/**  Metadata Profile service    */
@SuppressWarnings("serial")
public class BorhanMetadataProfileService extends BorhanServiceBase {
    public BorhanMetadataProfileService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanMetadataProfile add(BorhanMetadataProfile metadataProfile, String xsdData) throws BorhanApiException {
        return this.add(metadataProfile, xsdData, null);
    }

	/**  Allows you to add a metadata profile object and metadata profile content
	  associated with Borhan object type     */
    public BorhanMetadataProfile add(BorhanMetadataProfile metadataProfile, String xsdData, String viewsData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("metadataProfile", metadataProfile);
        kparams.add("xsdData", xsdData);
        kparams.add("viewsData", viewsData);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "add", kparams, BorhanMetadataProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfile.class, resultXmlElement);
    }

    public BorhanMetadataProfile addFromFile(BorhanMetadataProfile metadataProfile, BorhanFile xsdFile) throws BorhanApiException {
        return this.addFromFile(metadataProfile, xsdFile, (BorhanFile)null);
    }

    public BorhanMetadataProfile addFromFile(BorhanMetadataProfile metadataProfile, File xsdFile) throws BorhanApiException {
        return this.addFromFile(metadataProfile, new BorhanFile(xsdFile), (BorhanFile)null);
    }

    public BorhanMetadataProfile addFromFile(BorhanMetadataProfile metadataProfile, InputStream xsdFile, String xsdFileName, long xsdFileSize) throws BorhanApiException {
        return this.addFromFile(metadataProfile, new BorhanFile(xsdFile, xsdFileName, xsdFileSize), (BorhanFile)null);
    }

    public BorhanMetadataProfile addFromFile(BorhanMetadataProfile metadataProfile, FileInputStream xsdFile, String xsdFileName) throws BorhanApiException {
        return this.addFromFile(metadataProfile, new BorhanFile(xsdFile, xsdFileName), (BorhanFile)null);
    }

    public BorhanMetadataProfile addFromFile(BorhanMetadataProfile metadataProfile, File xsdFile, File viewsFile) throws BorhanApiException {
        return this.addFromFile(metadataProfile, new BorhanFile(xsdFile), new BorhanFile(viewsFile));
    }

    public BorhanMetadataProfile addFromFile(BorhanMetadataProfile metadataProfile, InputStream xsdFile, String xsdFileName, long xsdFileSize, InputStream viewsFile, String viewsFileName, long viewsFileSize) throws BorhanApiException {
        return this.addFromFile(metadataProfile, new BorhanFile(xsdFile, xsdFileName, xsdFileSize), new BorhanFile(viewsFile, viewsFileName, viewsFileSize));
    }

    public BorhanMetadataProfile addFromFile(BorhanMetadataProfile metadataProfile, FileInputStream xsdFile, String xsdFileName, FileInputStream viewsFile, String viewsFileName) throws BorhanApiException {
        return this.addFromFile(metadataProfile, new BorhanFile(xsdFile, xsdFileName), new BorhanFile(viewsFile, viewsFileName));
    }

	/**  Allows you to add a metadata profile object and metadata profile file associated
	  with Borhan object type     */
    public BorhanMetadataProfile addFromFile(BorhanMetadataProfile metadataProfile, BorhanFile xsdFile, BorhanFile viewsFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("metadataProfile", metadataProfile);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("xsdFile", xsdFile);
        kfiles.add("viewsFile", viewsFile);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "addFromFile", kparams, kfiles, BorhanMetadataProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfile.class, resultXmlElement);
    }

	/**  Retrieve a metadata profile object by id     */
    public BorhanMetadataProfile get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "get", kparams, BorhanMetadataProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfile.class, resultXmlElement);
    }

    public BorhanMetadataProfile update(int id, BorhanMetadataProfile metadataProfile) throws BorhanApiException {
        return this.update(id, metadataProfile, null);
    }

    public BorhanMetadataProfile update(int id, BorhanMetadataProfile metadataProfile, String xsdData) throws BorhanApiException {
        return this.update(id, metadataProfile, xsdData, null);
    }

	/**  Update an existing metadata object     */
    public BorhanMetadataProfile update(int id, BorhanMetadataProfile metadataProfile, String xsdData, String viewsData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("metadataProfile", metadataProfile);
        kparams.add("xsdData", xsdData);
        kparams.add("viewsData", viewsData);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "update", kparams, BorhanMetadataProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfile.class, resultXmlElement);
    }

    public BorhanMetadataProfileListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanMetadataProfileListResponse list(BorhanMetadataProfileFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List metadata profile objects by filter and pager     */
    public BorhanMetadataProfileListResponse list(BorhanMetadataProfileFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "list", kparams, BorhanMetadataProfileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfileListResponse.class, resultXmlElement);
    }

	/**  List metadata profile fields by metadata profile id     */
    public BorhanMetadataProfileFieldListResponse listFields(int metadataProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("metadataProfileId", metadataProfileId);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "listFields", kparams, BorhanMetadataProfileFieldListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfileFieldListResponse.class, resultXmlElement);
    }

	/**  Delete an existing metadata profile     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Update an existing metadata object definition file     */
    public BorhanMetadataProfile revert(int id, int toVersion) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("toVersion", toVersion);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "revert", kparams, BorhanMetadataProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfile.class, resultXmlElement);
    }

    public BorhanMetadataProfile updateDefinitionFromFile(int id, File xsdFile) throws BorhanApiException {
        return this.updateDefinitionFromFile(id, new BorhanFile(xsdFile));
    }

    public BorhanMetadataProfile updateDefinitionFromFile(int id, InputStream xsdFile, String xsdFileName, long xsdFileSize) throws BorhanApiException {
        return this.updateDefinitionFromFile(id, new BorhanFile(xsdFile, xsdFileName, xsdFileSize));
    }

    public BorhanMetadataProfile updateDefinitionFromFile(int id, FileInputStream xsdFile, String xsdFileName) throws BorhanApiException {
        return this.updateDefinitionFromFile(id, new BorhanFile(xsdFile, xsdFileName));
    }

	/**  Update an existing metadata object definition file     */
    public BorhanMetadataProfile updateDefinitionFromFile(int id, BorhanFile xsdFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("xsdFile", xsdFile);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "updateDefinitionFromFile", kparams, kfiles, BorhanMetadataProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfile.class, resultXmlElement);
    }

    public BorhanMetadataProfile updateViewsFromFile(int id, File viewsFile) throws BorhanApiException {
        return this.updateViewsFromFile(id, new BorhanFile(viewsFile));
    }

    public BorhanMetadataProfile updateViewsFromFile(int id, InputStream viewsFile, String viewsFileName, long viewsFileSize) throws BorhanApiException {
        return this.updateViewsFromFile(id, new BorhanFile(viewsFile, viewsFileName, viewsFileSize));
    }

    public BorhanMetadataProfile updateViewsFromFile(int id, FileInputStream viewsFile, String viewsFileName) throws BorhanApiException {
        return this.updateViewsFromFile(id, new BorhanFile(viewsFile, viewsFileName));
    }

	/**  Update an existing metadata object views file     */
    public BorhanMetadataProfile updateViewsFromFile(int id, BorhanFile viewsFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("viewsFile", viewsFile);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "updateViewsFromFile", kparams, kfiles, BorhanMetadataProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfile.class, resultXmlElement);
    }

    public BorhanMetadataProfile updateTransformationFromFile(int id, File xsltFile) throws BorhanApiException {
        return this.updateTransformationFromFile(id, new BorhanFile(xsltFile));
    }

    public BorhanMetadataProfile updateTransformationFromFile(int id, InputStream xsltFile, String xsltFileName, long xsltFileSize) throws BorhanApiException {
        return this.updateTransformationFromFile(id, new BorhanFile(xsltFile, xsltFileName, xsltFileSize));
    }

    public BorhanMetadataProfile updateTransformationFromFile(int id, FileInputStream xsltFile, String xsltFileName) throws BorhanApiException {
        return this.updateTransformationFromFile(id, new BorhanFile(xsltFile, xsltFileName));
    }

	/**  Update an existing metadata object xslt file     */
    public BorhanMetadataProfile updateTransformationFromFile(int id, BorhanFile xsltFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("xsltFile", xsltFile);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "updateTransformationFromFile", kparams, kfiles, BorhanMetadataProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMetadataProfile.class, resultXmlElement);
    }

	/**  Serves metadata profile XSD file     */
    public String serve(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "serve", kparams);
        return this.borhanClient.serve();
    }

	/**  Serves metadata profile view file     */
    public String serveView(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("metadata_metadataprofile", "serveView", kparams);
        return this.borhanClient.serve();
    }
}
