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

/**  Live Stream service lets you manage live stream entries    */
@SuppressWarnings("serial")
public class BorhanLiveStreamService extends BorhanServiceBase {
    public BorhanLiveStreamService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanLiveStreamEntry add(BorhanLiveStreamEntry liveStreamEntry) throws BorhanApiException {
        return this.add(liveStreamEntry, null);
    }

	/**  Adds new live stream entry.   The entry will be queued for provision.     */
    public BorhanLiveStreamEntry add(BorhanLiveStreamEntry liveStreamEntry, BorhanSourceType sourceType) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("liveStreamEntry", liveStreamEntry);
        kparams.add("sourceType", sourceType);
        this.borhanClient.queueServiceCall("livestream", "add", kparams, BorhanLiveStreamEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStreamEntry.class, resultXmlElement);
    }

    public BorhanLiveStreamEntry get(String entryId) throws BorhanApiException {
        return this.get(entryId, -1);
    }

	/**  Get live stream entry by ID.     */
    public BorhanLiveStreamEntry get(String entryId, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("livestream", "get", kparams, BorhanLiveStreamEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStreamEntry.class, resultXmlElement);
    }

	/**  Authenticate live-stream entry against stream token and partner limitations     */
    public BorhanLiveStreamEntry authenticate(String entryId, String token) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("token", token);
        this.borhanClient.queueServiceCall("livestream", "authenticate", kparams, BorhanLiveStreamEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStreamEntry.class, resultXmlElement);
    }

	/**  Update live stream entry. Only the properties that were set will be updated.     */
    public BorhanLiveStreamEntry update(String entryId, BorhanLiveStreamEntry liveStreamEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("liveStreamEntry", liveStreamEntry);
        this.borhanClient.queueServiceCall("livestream", "update", kparams, BorhanLiveStreamEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStreamEntry.class, resultXmlElement);
    }

	/**  Delete a live stream entry.     */
    public void delete(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("livestream", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanLiveStreamListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanLiveStreamListResponse list(BorhanLiveStreamEntryFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List live stream entries by filter with paging support.     */
    public BorhanLiveStreamListResponse list(BorhanLiveStreamEntryFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("livestream", "list", kparams, BorhanLiveStreamListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStreamListResponse.class, resultXmlElement);
    }

    public BorhanLiveStreamEntry updateOfflineThumbnailJpeg(String entryId, File fileData) throws BorhanApiException {
        return this.updateOfflineThumbnailJpeg(entryId, new BorhanFile(fileData));
    }

    public BorhanLiveStreamEntry updateOfflineThumbnailJpeg(String entryId, InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.updateOfflineThumbnailJpeg(entryId, new BorhanFile(fileData, fileDataName, fileDataSize));
    }

    public BorhanLiveStreamEntry updateOfflineThumbnailJpeg(String entryId, FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.updateOfflineThumbnailJpeg(entryId, new BorhanFile(fileData, fileDataName));
    }

	/**  Update live stream entry thumbnail using a raw jpeg file     */
    public BorhanLiveStreamEntry updateOfflineThumbnailJpeg(String entryId, BorhanFile fileData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        this.borhanClient.queueServiceCall("livestream", "updateOfflineThumbnailJpeg", kparams, kfiles, BorhanLiveStreamEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStreamEntry.class, resultXmlElement);
    }

	/**  Update entry thumbnail using url     */
    public BorhanLiveStreamEntry updateOfflineThumbnailFromUrl(String entryId, String url) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("url", url);
        this.borhanClient.queueServiceCall("livestream", "updateOfflineThumbnailFromUrl", kparams, BorhanLiveStreamEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStreamEntry.class, resultXmlElement);
    }

	/**  Delivering the status of a live stream (on-air/offline) if it is possible     */
    public boolean isLive(String id, BorhanPlaybackProtocol protocol) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("protocol", protocol);
        this.borhanClient.queueServiceCall("livestream", "isLive", kparams);
        if (this.borhanClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
    }

    public BorhanLiveStreamEntry addLiveStreamPushPublishConfiguration(String entryId, BorhanPlaybackProtocol protocol) throws BorhanApiException {
        return this.addLiveStreamPushPublishConfiguration(entryId, protocol, null);
    }

    public BorhanLiveStreamEntry addLiveStreamPushPublishConfiguration(String entryId, BorhanPlaybackProtocol protocol, String url) throws BorhanApiException {
        return this.addLiveStreamPushPublishConfiguration(entryId, protocol, url, null);
    }

	/**  Add new pushPublish configuration to entry     */
    public BorhanLiveStreamEntry addLiveStreamPushPublishConfiguration(String entryId, BorhanPlaybackProtocol protocol, String url, BorhanLiveStreamConfiguration liveStreamConfiguration) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("protocol", protocol);
        kparams.add("url", url);
        kparams.add("liveStreamConfiguration", liveStreamConfiguration);
        this.borhanClient.queueServiceCall("livestream", "addLiveStreamPushPublishConfiguration", kparams, BorhanLiveStreamEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStreamEntry.class, resultXmlElement);
    }

	/**  Remove push publish configuration from entry     */
    public BorhanLiveStreamEntry removeLiveStreamPushPublishConfiguration(String entryId, BorhanPlaybackProtocol protocol) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("protocol", protocol);
        this.borhanClient.queueServiceCall("livestream", "removeLiveStreamPushPublishConfiguration", kparams, BorhanLiveStreamEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStreamEntry.class, resultXmlElement);
    }

    public BorhanLiveEntry appendRecording(String entryId, String assetId, BorhanMediaServerIndex mediaServerIndex, BorhanDataCenterContentResource resource, double duration) throws BorhanApiException {
        return this.appendRecording(entryId, assetId, mediaServerIndex, resource, duration, false);
    }

	/**  Append recorded video to live entry     */
    public BorhanLiveEntry appendRecording(String entryId, String assetId, BorhanMediaServerIndex mediaServerIndex, BorhanDataCenterContentResource resource, double duration, boolean isLastChunk) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("assetId", assetId);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("resource", resource);
        kparams.add("duration", duration);
        kparams.add("isLastChunk", isLastChunk);
        this.borhanClient.queueServiceCall("livestream", "appendRecording", kparams, BorhanLiveEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveEntry.class, resultXmlElement);
    }

    public BorhanLiveEntry registerMediaServer(String entryId, String hostname, BorhanMediaServerIndex mediaServerIndex) throws BorhanApiException {
        return this.registerMediaServer(entryId, hostname, mediaServerIndex, null);
    }

	/**  Register media server to live entry     */
    public BorhanLiveEntry registerMediaServer(String entryId, String hostname, BorhanMediaServerIndex mediaServerIndex, String applicationName) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("hostname", hostname);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("applicationName", applicationName);
        this.borhanClient.queueServiceCall("livestream", "registerMediaServer", kparams, BorhanLiveEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveEntry.class, resultXmlElement);
    }

	/**  Unregister media server from live entry     */
    public BorhanLiveEntry unregisterMediaServer(String entryId, String hostname, BorhanMediaServerIndex mediaServerIndex) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("hostname", hostname);
        kparams.add("mediaServerIndex", mediaServerIndex);
        this.borhanClient.queueServiceCall("livestream", "unregisterMediaServer", kparams, BorhanLiveEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveEntry.class, resultXmlElement);
    }

	/**  Validates all registered media servers     */
    public void validateRegisteredMediaServers(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("livestream", "validateRegisteredMediaServers", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Creates perioding metadata sync-point events on a live stream     */
    public void createPeriodicSyncPoints(String entryId, int interval, int duration) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("interval", interval);
        kparams.add("duration", duration);
        this.borhanClient.queueServiceCall("livestream", "createPeriodicSyncPoints", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
