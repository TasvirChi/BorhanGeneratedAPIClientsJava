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
import java.util.ArrayList;
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

/**  Document service    */
@SuppressWarnings("serial")
public class BorhanDocumentService extends BorhanServiceBase {
    public BorhanDocumentService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new document entry after the specific document file was uploaded and the
	  upload token id exists     */
    public BorhanDocumentEntry addFromUploadedFile(BorhanDocumentEntry documentEntry, String uploadTokenId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("documentEntry", documentEntry);
        kparams.add("uploadTokenId", uploadTokenId);
        this.borhanClient.queueServiceCall("document", "addFromUploadedFile", kparams, BorhanDocumentEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDocumentEntry.class, resultXmlElement);
    }

    public BorhanDocumentEntry addFromEntry(String sourceEntryId) throws BorhanApiException {
        return this.addFromEntry(sourceEntryId, null);
    }

    public BorhanDocumentEntry addFromEntry(String sourceEntryId, BorhanDocumentEntry documentEntry) throws BorhanApiException {
        return this.addFromEntry(sourceEntryId, documentEntry, Integer.MIN_VALUE);
    }

	/**  Copy entry into new entry     */
    public BorhanDocumentEntry addFromEntry(String sourceEntryId, BorhanDocumentEntry documentEntry, int sourceFlavorParamsId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("sourceEntryId", sourceEntryId);
        kparams.add("documentEntry", documentEntry);
        kparams.add("sourceFlavorParamsId", sourceFlavorParamsId);
        this.borhanClient.queueServiceCall("document", "addFromEntry", kparams, BorhanDocumentEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDocumentEntry.class, resultXmlElement);
    }

    public BorhanDocumentEntry addFromFlavorAsset(String sourceFlavorAssetId) throws BorhanApiException {
        return this.addFromFlavorAsset(sourceFlavorAssetId, null);
    }

	/**  Copy flavor asset into new entry     */
    public BorhanDocumentEntry addFromFlavorAsset(String sourceFlavorAssetId, BorhanDocumentEntry documentEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("sourceFlavorAssetId", sourceFlavorAssetId);
        kparams.add("documentEntry", documentEntry);
        this.borhanClient.queueServiceCall("document", "addFromFlavorAsset", kparams, BorhanDocumentEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDocumentEntry.class, resultXmlElement);
    }

    public int convert(String entryId) throws BorhanApiException {
        return this.convert(entryId, Integer.MIN_VALUE);
    }

    public int convert(String entryId, int conversionProfileId) throws BorhanApiException {
        return this.convert(entryId, conversionProfileId, null);
    }

	/**  Convert entry     */
    public int convert(String entryId, int conversionProfileId, ArrayList<BorhanConversionAttribute> dynamicConversionAttributes) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("conversionProfileId", conversionProfileId);
        kparams.add("dynamicConversionAttributes", dynamicConversionAttributes);
        this.borhanClient.queueServiceCall("document", "convert", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

    public BorhanDocumentEntry get(String entryId) throws BorhanApiException {
        return this.get(entryId, -1);
    }

	/**  Get document entry by ID.     */
    public BorhanDocumentEntry get(String entryId, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("document", "get", kparams, BorhanDocumentEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDocumentEntry.class, resultXmlElement);
    }

	/**  Update document entry. Only the properties that were set will be updated.     */
    public BorhanDocumentEntry update(String entryId, BorhanDocumentEntry documentEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("documentEntry", documentEntry);
        this.borhanClient.queueServiceCall("document", "update", kparams, BorhanDocumentEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDocumentEntry.class, resultXmlElement);
    }

	/**  Delete a document entry.     */
    public void delete(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("document", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanDocumentListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanDocumentListResponse list(BorhanDocumentEntryFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List document entries by filter with paging support.     */
    public BorhanDocumentListResponse list(BorhanDocumentEntryFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("document", "list", kparams, BorhanDocumentListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDocumentListResponse.class, resultXmlElement);
    }

    public String upload(File fileData) throws BorhanApiException {
        return this.upload(new BorhanFile(fileData));
    }

    public String upload(InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.upload(new BorhanFile(fileData, fileDataName, fileDataSize));
    }

    public String upload(FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.upload(new BorhanFile(fileData, fileDataName));
    }

	/**  Upload a document file to Borhan, then the file can be used to create a
	  document entry.      */
    public String upload(BorhanFile fileData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        this.borhanClient.queueServiceCall("document", "upload", kparams, kfiles);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  This will queue a batch job for converting the document file to swf   Returns
	  the URL where the new swf will be available      */
    public String convertPptToSwf(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("document", "convertPptToSwf", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public String serve(String entryId) throws BorhanApiException {
        return this.serve(entryId, null);
    }

    public String serve(String entryId, String flavorAssetId) throws BorhanApiException {
        return this.serve(entryId, flavorAssetId, false);
    }

	/**  Serves the file content     */
    public String serve(String entryId, String flavorAssetId, boolean forceProxy) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("flavorAssetId", flavorAssetId);
        kparams.add("forceProxy", forceProxy);
        this.borhanClient.queueServiceCall("document", "serve", kparams);
        return this.borhanClient.serve();
    }

    public String serveByFlavorParamsId(String entryId) throws BorhanApiException {
        return this.serveByFlavorParamsId(entryId, null);
    }

    public String serveByFlavorParamsId(String entryId, String flavorParamsId) throws BorhanApiException {
        return this.serveByFlavorParamsId(entryId, flavorParamsId, false);
    }

	/**  Serves the file content     */
    public String serveByFlavorParamsId(String entryId, String flavorParamsId, boolean forceProxy) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("flavorParamsId", flavorParamsId);
        kparams.add("forceProxy", forceProxy);
        this.borhanClient.queueServiceCall("document", "serveByFlavorParamsId", kparams);
        return this.borhanClient.serve();
    }

    public BorhanDocumentEntry updateContent(String entryId, BorhanResource resource) throws BorhanApiException {
        return this.updateContent(entryId, resource, Integer.MIN_VALUE);
    }

	/**  Replace content associated with the given document entry.     */
    public BorhanDocumentEntry updateContent(String entryId, BorhanResource resource, int conversionProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);
        kparams.add("conversionProfileId", conversionProfileId);
        this.borhanClient.queueServiceCall("document", "updateContent", kparams, BorhanDocumentEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDocumentEntry.class, resultXmlElement);
    }

	/**  Approves document replacement     */
    public BorhanDocumentEntry approveReplace(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("document", "approveReplace", kparams, BorhanDocumentEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDocumentEntry.class, resultXmlElement);
    }

	/**  Cancels document replacement     */
    public BorhanDocumentEntry cancelReplace(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("document", "cancelReplace", kparams, BorhanDocumentEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDocumentEntry.class, resultXmlElement);
    }
}
