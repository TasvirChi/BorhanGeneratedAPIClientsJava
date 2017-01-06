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

/**  Media service lets you upload and manage media files (images / videos & audio)    */
@SuppressWarnings("serial")
public class BorhanMediaService extends BorhanServiceBase {
    public BorhanMediaService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add entry        */
    public BorhanMediaEntry add(BorhanMediaEntry entry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entry", entry);
        this.borhanClient.queueServiceCall("media", "add", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

    public BorhanMediaEntry addContent(String entryId) throws BorhanApiException {
        return this.addContent(entryId, null);
    }

	/**  Add content to media entry which is not yet associated with content (therefore
	  is in status NO_CONTENT).      If the requirement is to replace the entry's
	  associated content, use action updateContent.        */
    public BorhanMediaEntry addContent(String entryId, BorhanResource resource) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);
        this.borhanClient.queueServiceCall("media", "addContent", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

	/**  Adds new media entry by importing an HTTP or FTP URL.   The entry will be queued
	  for import and then for conversion.     */
    public BorhanMediaEntry addFromUrl(BorhanMediaEntry mediaEntry, String url) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("url", url);
        this.borhanClient.queueServiceCall("media", "addFromUrl", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

    public BorhanMediaEntry addFromSearchResult() throws BorhanApiException {
        return this.addFromSearchResult(null);
    }

    public BorhanMediaEntry addFromSearchResult(BorhanMediaEntry mediaEntry) throws BorhanApiException {
        return this.addFromSearchResult(mediaEntry, null);
    }

	/**  Adds new media entry by importing the media file from a search provider.   This
	  action should be used with the search service result.     */
    public BorhanMediaEntry addFromSearchResult(BorhanMediaEntry mediaEntry, BorhanSearchResult searchResult) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("searchResult", searchResult);
        this.borhanClient.queueServiceCall("media", "addFromSearchResult", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

	/**  Add new entry after the specific media file was uploaded and the upload token id
	  exists     */
    public BorhanMediaEntry addFromUploadedFile(BorhanMediaEntry mediaEntry, String uploadTokenId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("uploadTokenId", uploadTokenId);
        this.borhanClient.queueServiceCall("media", "addFromUploadedFile", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

	/**  Add new entry after the file was recored on the server and the token id exists  
	    */
    public BorhanMediaEntry addFromRecordedWebcam(BorhanMediaEntry mediaEntry, String webcamTokenId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("webcamTokenId", webcamTokenId);
        this.borhanClient.queueServiceCall("media", "addFromRecordedWebcam", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

    public BorhanMediaEntry addFromEntry(String sourceEntryId) throws BorhanApiException {
        return this.addFromEntry(sourceEntryId, null);
    }

    public BorhanMediaEntry addFromEntry(String sourceEntryId, BorhanMediaEntry mediaEntry) throws BorhanApiException {
        return this.addFromEntry(sourceEntryId, mediaEntry, Integer.MIN_VALUE);
    }

	/**  Copy entry into new entry     */
    public BorhanMediaEntry addFromEntry(String sourceEntryId, BorhanMediaEntry mediaEntry, int sourceFlavorParamsId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("sourceEntryId", sourceEntryId);
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("sourceFlavorParamsId", sourceFlavorParamsId);
        this.borhanClient.queueServiceCall("media", "addFromEntry", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

    public BorhanMediaEntry addFromFlavorAsset(String sourceFlavorAssetId) throws BorhanApiException {
        return this.addFromFlavorAsset(sourceFlavorAssetId, null);
    }

	/**  Copy flavor asset into new entry     */
    public BorhanMediaEntry addFromFlavorAsset(String sourceFlavorAssetId, BorhanMediaEntry mediaEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("sourceFlavorAssetId", sourceFlavorAssetId);
        kparams.add("mediaEntry", mediaEntry);
        this.borhanClient.queueServiceCall("media", "addFromFlavorAsset", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
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
        this.borhanClient.queueServiceCall("media", "convert", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

    public BorhanMediaEntry get(String entryId) throws BorhanApiException {
        return this.get(entryId, -1);
    }

	/**  Get media entry by ID.     */
    public BorhanMediaEntry get(String entryId, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("media", "get", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

    public String getMrss(String entryId) throws BorhanApiException {
        return this.getMrss(entryId, null);
    }

	/**  Get MRSS by entry id      XML will return as an escaped string        */
    public String getMrss(String entryId, ArrayList<BorhanExtendingItemMrssParameter> extendingItemsArray) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("extendingItemsArray", extendingItemsArray);
        this.borhanClient.queueServiceCall("media", "getMrss", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  Update media entry. Only the properties that were set will be updated.     */
    public BorhanMediaEntry update(String entryId, BorhanMediaEntry mediaEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("mediaEntry", mediaEntry);
        this.borhanClient.queueServiceCall("media", "update", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

    public BorhanMediaEntry updateContent(String entryId, BorhanResource resource) throws BorhanApiException {
        return this.updateContent(entryId, resource, Integer.MIN_VALUE);
    }

    public BorhanMediaEntry updateContent(String entryId, BorhanResource resource, int conversionProfileId) throws BorhanApiException {
        return this.updateContent(entryId, resource, conversionProfileId, null);
    }

	/**  Replace content associated with the media entry.     */
    public BorhanMediaEntry updateContent(String entryId, BorhanResource resource, int conversionProfileId, BorhanEntryReplacementOptions advancedOptions) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);
        kparams.add("conversionProfileId", conversionProfileId);
        kparams.add("advancedOptions", advancedOptions);
        this.borhanClient.queueServiceCall("media", "updateContent", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

	/**  Delete a media entry.     */
    public void delete(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("media", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Approves media replacement     */
    public BorhanMediaEntry approveReplace(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("media", "approveReplace", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

	/**  Cancels media replacement     */
    public BorhanMediaEntry cancelReplace(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("media", "cancelReplace", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

    public BorhanMediaListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanMediaListResponse list(BorhanMediaEntryFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List media entries by filter with paging support.     */
    public BorhanMediaListResponse list(BorhanMediaEntryFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("media", "list", kparams, BorhanMediaListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaListResponse.class, resultXmlElement);
    }

    public int count() throws BorhanApiException {
        return this.count(null);
    }

	/**  Count media entries by filter.     */
    public int count(BorhanMediaEntryFilter filter) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        this.borhanClient.queueServiceCall("media", "count", kparams);
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

	/**  Upload a media file to Borhan, then the file can be used to create a media
	  entry.     */
    public String upload(BorhanFile fileData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        this.borhanClient.queueServiceCall("media", "upload", kparams, kfiles);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public BorhanMediaEntry updateThumbnail(String entryId, int timeOffset) throws BorhanApiException {
        return this.updateThumbnail(entryId, timeOffset, Integer.MIN_VALUE);
    }

	/**  Update media entry thumbnail by a specified time offset (In seconds)   If flavor
	  params id not specified, source flavor will be used by default     */
    public BorhanMediaEntry updateThumbnail(String entryId, int timeOffset, int flavorParamsId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("timeOffset", timeOffset);
        kparams.add("flavorParamsId", flavorParamsId);
        this.borhanClient.queueServiceCall("media", "updateThumbnail", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

    public BorhanMediaEntry updateThumbnailFromSourceEntry(String entryId, String sourceEntryId, int timeOffset) throws BorhanApiException {
        return this.updateThumbnailFromSourceEntry(entryId, sourceEntryId, timeOffset, Integer.MIN_VALUE);
    }

	/**  Update media entry thumbnail from a different entry by a specified time offset
	  (In seconds)   If flavor params id not specified, source flavor will be used by
	  default     */
    public BorhanMediaEntry updateThumbnailFromSourceEntry(String entryId, String sourceEntryId, int timeOffset, int flavorParamsId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("sourceEntryId", sourceEntryId);
        kparams.add("timeOffset", timeOffset);
        kparams.add("flavorParamsId", flavorParamsId);
        this.borhanClient.queueServiceCall("media", "updateThumbnailFromSourceEntry", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

    public BorhanMediaEntry updateThumbnailJpeg(String entryId, File fileData) throws BorhanApiException {
        return this.updateThumbnailJpeg(entryId, new BorhanFile(fileData));
    }

    public BorhanMediaEntry updateThumbnailJpeg(String entryId, InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.updateThumbnailJpeg(entryId, new BorhanFile(fileData, fileDataName, fileDataSize));
    }

    public BorhanMediaEntry updateThumbnailJpeg(String entryId, FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.updateThumbnailJpeg(entryId, new BorhanFile(fileData, fileDataName));
    }

	/**  Update media entry thumbnail using a raw jpeg file     */
    public BorhanMediaEntry updateThumbnailJpeg(String entryId, BorhanFile fileData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        this.borhanClient.queueServiceCall("media", "updateThumbnailJpeg", kparams, kfiles, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMediaEntry.class, resultXmlElement);
    }

	/**  Update entry thumbnail using url     */
    public BorhanBaseEntry updateThumbnailFromUrl(String entryId, String url) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("url", url);
        this.borhanClient.queueServiceCall("media", "updateThumbnailFromUrl", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBaseEntry.class, resultXmlElement);
    }

	/**  Request a new conversion job, this can be used to convert the media entry to a
	  different format     */
    public int requestConversion(String entryId, String fileFormat) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("fileFormat", fileFormat);
        this.borhanClient.queueServiceCall("media", "requestConversion", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  Flag inappropriate media entry for moderation     */
    public void flag(BorhanModerationFlag moderationFlag) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("moderationFlag", moderationFlag);
        this.borhanClient.queueServiceCall("media", "flag", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Reject the media entry and mark the pending flags (if any) as moderated (this
	  will make the entry non playable)     */
    public void reject(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("media", "reject", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Approve the media entry and mark the pending flags (if any) as moderated (this
	  will make the entry playable)     */
    public void approve(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("media", "approve", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanModerationFlagListResponse listFlags(String entryId) throws BorhanApiException {
        return this.listFlags(entryId, null);
    }

	/**  List all pending flags for the media entry     */
    public BorhanModerationFlagListResponse listFlags(String entryId, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("media", "listFlags", kparams, BorhanModerationFlagListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanModerationFlagListResponse.class, resultXmlElement);
    }

	/**  Anonymously rank a media entry, no validation is done on duplicate rankings     */
    public void anonymousRank(String entryId, int rank) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("rank", rank);
        this.borhanClient.queueServiceCall("media", "anonymousRank", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanBulkUpload bulkUploadAdd(BorhanFile fileData) throws BorhanApiException {
        return this.bulkUploadAdd(fileData, null);
    }

    public BorhanBulkUpload bulkUploadAdd(File fileData) throws BorhanApiException {
        return this.bulkUploadAdd(new BorhanFile(fileData), null);
    }

    public BorhanBulkUpload bulkUploadAdd(InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.bulkUploadAdd(new BorhanFile(fileData, fileDataName, fileDataSize), null);
    }

    public BorhanBulkUpload bulkUploadAdd(FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.bulkUploadAdd(new BorhanFile(fileData, fileDataName), null);
    }

    public BorhanBulkUpload bulkUploadAdd(BorhanFile fileData, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.bulkUploadAdd(fileData, bulkUploadData, null);
    }

    public BorhanBulkUpload bulkUploadAdd(File fileData, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.bulkUploadAdd(new BorhanFile(fileData), bulkUploadData, null);
    }

    public BorhanBulkUpload bulkUploadAdd(InputStream fileData, String fileDataName, long fileDataSize, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.bulkUploadAdd(new BorhanFile(fileData, fileDataName, fileDataSize), bulkUploadData, null);
    }

    public BorhanBulkUpload bulkUploadAdd(FileInputStream fileData, String fileDataName, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.bulkUploadAdd(new BorhanFile(fileData, fileDataName), bulkUploadData, null);
    }

    public BorhanBulkUpload bulkUploadAdd(File fileData, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadEntryData bulkUploadEntryData) throws BorhanApiException {
        return this.bulkUploadAdd(new BorhanFile(fileData), bulkUploadData, bulkUploadEntryData);
    }

    public BorhanBulkUpload bulkUploadAdd(InputStream fileData, String fileDataName, long fileDataSize, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadEntryData bulkUploadEntryData) throws BorhanApiException {
        return this.bulkUploadAdd(new BorhanFile(fileData, fileDataName, fileDataSize), bulkUploadData, bulkUploadEntryData);
    }

    public BorhanBulkUpload bulkUploadAdd(FileInputStream fileData, String fileDataName, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadEntryData bulkUploadEntryData) throws BorhanApiException {
        return this.bulkUploadAdd(new BorhanFile(fileData, fileDataName), bulkUploadData, bulkUploadEntryData);
    }

	/**  Add new bulk upload batch job   Conversion profile id can be specified in the
	  API or in the CSV file, the one in the CSV file will be stronger.   If no
	  conversion profile was specified, partner's default will be used     */
    public BorhanBulkUpload bulkUploadAdd(BorhanFile fileData, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadEntryData bulkUploadEntryData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadEntryData", bulkUploadEntryData);
        this.borhanClient.queueServiceCall("media", "bulkUploadAdd", kparams, kfiles, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }
}
