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
import java.util.List;
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

/**  Base Entry Service    */
@SuppressWarnings("serial")
public class BorhanBaseEntryService extends BorhanServiceBase {
    public BorhanBaseEntryService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanBaseEntry add(BorhanBaseEntry entry) throws BorhanApiException {
        return this.add(entry, null);
    }

	/**  Generic add entry, should be used when the uploaded entry type is not known.    
	     */
    public BorhanBaseEntry add(BorhanBaseEntry entry, BorhanEntryType type) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entry", entry);
        kparams.add("type", type);
        this.borhanClient.queueServiceCall("baseentry", "add", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

	/**  Attach content resource to entry in status NO_MEDIA        */
    public BorhanBaseEntry addContent(String entryId, BorhanResource resource) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);
        this.borhanClient.queueServiceCall("baseentry", "addContent", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

    public BorhanBaseEntry addFromUploadedFile(BorhanBaseEntry entry, String uploadTokenId) throws BorhanApiException {
        return this.addFromUploadedFile(entry, uploadTokenId, null);
    }

	/**  Generic add entry using an uploaded file, should be used when the uploaded entry
	  type is not known.        */
    public BorhanBaseEntry addFromUploadedFile(BorhanBaseEntry entry, String uploadTokenId, BorhanEntryType type) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entry", entry);
        kparams.add("uploadTokenId", uploadTokenId);
        kparams.add("type", type);
        this.borhanClient.queueServiceCall("baseentry", "addFromUploadedFile", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

    public BorhanBaseEntry get(String entryId) throws BorhanApiException {
        return this.get(entryId, -1);
    }

	/**  Get base entry by ID.     */
    public BorhanBaseEntry get(String entryId, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("baseentry", "get", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

	/**  Get remote storage existing paths for the asset.        */
    public BorhanRemotePathListResponse getRemotePaths(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("baseentry", "getRemotePaths", kparams, BorhanRemotePathListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanRemotePathListResponse.class, resultXmlElement);
    }

	/**  Update base entry. Only the properties that were set will be updated.     */
    public BorhanBaseEntry update(String entryId, BorhanBaseEntry baseEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("baseEntry", baseEntry);
        this.borhanClient.queueServiceCall("baseentry", "update", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

    public BorhanBaseEntry updateContent(String entryId, BorhanResource resource) throws BorhanApiException {
        return this.updateContent(entryId, resource, Integer.MIN_VALUE);
    }

    public BorhanBaseEntry updateContent(String entryId, BorhanResource resource, int conversionProfileId) throws BorhanApiException {
        return this.updateContent(entryId, resource, conversionProfileId, null);
    }

	/**  Update the content resource associated with the entry.     */
    public BorhanBaseEntry updateContent(String entryId, BorhanResource resource, int conversionProfileId, BorhanEntryReplacementOptions advancedOptions) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);
        kparams.add("conversionProfileId", conversionProfileId);
        kparams.add("advancedOptions", advancedOptions);
        this.borhanClient.queueServiceCall("baseentry", "updateContent", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

	/**  Get an array of BorhanBaseEntry objects by a comma-separated list of ids.     */
    public List<BorhanBaseEntry> getByIds(String entryIds) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryIds", entryIds);
        this.borhanClient.queueServiceCall("baseentry", "getByIds", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanBaseEntry.class, resultXmlElement);
    }

	/**  Delete an entry.     */
    public void delete(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("baseentry", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanBaseEntryListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanBaseEntryListResponse list(BorhanBaseEntryFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List base entries by filter with paging support.     */
    public BorhanBaseEntryListResponse list(BorhanBaseEntryFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("baseentry", "list", kparams, BorhanBaseEntryListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntryListResponse.class, resultXmlElement);
    }

    public BorhanBaseEntryListResponse listByReferenceId(String refId) throws BorhanApiException {
        return this.listByReferenceId(refId, null);
    }

	/**  List base entries by filter according to reference id     */
    public BorhanBaseEntryListResponse listByReferenceId(String refId, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("refId", refId);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("baseentry", "listByReferenceId", kparams, BorhanBaseEntryListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntryListResponse.class, resultXmlElement);
    }

    public int count() throws BorhanApiException {
        return this.count(null);
    }

	/**  Count base entries by filter.     */
    public int count(BorhanBaseEntryFilter filter) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        this.borhanClient.queueServiceCall("baseentry", "count", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
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

	/**  Upload a file to Borhan, that can be used to create an entry.     */
    public String upload(BorhanFile fileData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        this.borhanClient.queueServiceCall("baseentry", "upload", kparams, kfiles);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public BorhanBaseEntry updateThumbnailJpeg(String entryId, File fileData) throws BorhanApiException {
        return this.updateThumbnailJpeg(entryId, new BorhanFile(fileData));
    }

    public BorhanBaseEntry updateThumbnailJpeg(String entryId, InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.updateThumbnailJpeg(entryId, new BorhanFile(fileData, fileDataName, fileDataSize));
    }

    public BorhanBaseEntry updateThumbnailJpeg(String entryId, FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.updateThumbnailJpeg(entryId, new BorhanFile(fileData, fileDataName));
    }

	/**  Update entry thumbnail using a raw jpeg file.     */
    public BorhanBaseEntry updateThumbnailJpeg(String entryId, BorhanFile fileData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        this.borhanClient.queueServiceCall("baseentry", "updateThumbnailJpeg", kparams, kfiles, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

	/**  Update entry thumbnail using url.     */
    public BorhanBaseEntry updateThumbnailFromUrl(String entryId, String url) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("url", url);
        this.borhanClient.queueServiceCall("baseentry", "updateThumbnailFromUrl", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

	/**  Update entry thumbnail from a different entry by a specified time offset (in
	  seconds).     */
    public BorhanBaseEntry updateThumbnailFromSourceEntry(String entryId, String sourceEntryId, int timeOffset) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("sourceEntryId", sourceEntryId);
        kparams.add("timeOffset", timeOffset);
        this.borhanClient.queueServiceCall("baseentry", "updateThumbnailFromSourceEntry", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

	/**  Flag inappropriate entry for moderation.     */
    public void flag(BorhanModerationFlag moderationFlag) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("moderationFlag", moderationFlag);
        this.borhanClient.queueServiceCall("baseentry", "flag", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Reject the entry and mark the pending flags (if any) as moderated (this will
	  make the entry non-playable).     */
    public void reject(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("baseentry", "reject", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Approve the entry and mark the pending flags (if any) as moderated (this will
	  make the entry playable).     */
    public void approve(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("baseentry", "approve", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanModerationFlagListResponse listFlags(String entryId) throws BorhanApiException {
        return this.listFlags(entryId, null);
    }

	/**  List all pending flags for the entry.     */
    public BorhanModerationFlagListResponse listFlags(String entryId, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("baseentry", "listFlags", kparams, BorhanModerationFlagListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanModerationFlagListResponse.class, resultXmlElement);
    }

	/**  Anonymously rank an entry, no validation is done on duplicate rankings.     */
    public void anonymousRank(String entryId, int rank) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("rank", rank);
        this.borhanClient.queueServiceCall("baseentry", "anonymousRank", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  This action delivers entry-related data, based on the user's context: access
	  control, restriction, playback format and storage information.     */
    public BorhanEntryContextDataResult getContextData(String entryId, BorhanEntryContextDataParams contextDataParams) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("contextDataParams", contextDataParams);
        this.borhanClient.queueServiceCall("baseentry", "getContextData", kparams, BorhanEntryContextDataResult.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryContextDataResult.class, resultXmlElement);
    }

    public BorhanBaseEntry export(String entryId, int storageProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("storageProfileId", storageProfileId);
        this.borhanClient.queueServiceCall("baseentry", "export", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

    public int index(String id) throws BorhanApiException {
        return this.index(id, true);
    }

	/**  Index an entry by id.     */
    public int index(String id, boolean shouldUpdate) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("shouldUpdate", shouldUpdate);
        this.borhanClient.queueServiceCall("baseentry", "index", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  Clone an entry with optional attributes to apply to the clone     */
    public BorhanBaseEntry clone(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("baseentry", "clone", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }
}
