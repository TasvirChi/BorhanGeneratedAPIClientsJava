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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Live Channel service lets you manage live channels    */
@SuppressWarnings("serial")
public class BorhanLiveChannelService extends BorhanServiceBase {
    public BorhanLiveChannelService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Adds new live channel.     */
    public BorhanLiveChannel add(BorhanLiveChannel liveChannel) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("liveChannel", liveChannel);
        this.borhanClient.queueServiceCall("livechannel", "add", kparams, BorhanLiveChannel.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveChannel.class, resultXmlElement);
    }

	/**  Get live channel by ID.     */
    public BorhanLiveChannel get(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("livechannel", "get", kparams, BorhanLiveChannel.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveChannel.class, resultXmlElement);
    }

	/**  Update live channel. Only the properties that were set will be updated.     */
    public BorhanLiveChannel update(String id, BorhanLiveChannel liveChannel) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("liveChannel", liveChannel);
        this.borhanClient.queueServiceCall("livechannel", "update", kparams, BorhanLiveChannel.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveChannel.class, resultXmlElement);
    }

	/**  Delete a live channel.     */
    public void delete(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("livechannel", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanLiveChannelListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanLiveChannelListResponse list(BorhanLiveChannelFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List live channels by filter with paging support.     */
    public BorhanLiveChannelListResponse list(BorhanLiveChannelFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("livechannel", "list", kparams, BorhanLiveChannelListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveChannelListResponse.class, resultXmlElement);
    }

	/**  Delivering the status of a live channel (on-air/offline)     */
    public boolean isLive(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("livechannel", "isLive", kparams);
        if (this.borhanClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
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
        this.borhanClient.queueServiceCall("livechannel", "appendRecording", kparams, BorhanLiveEntry.class);
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
        this.borhanClient.queueServiceCall("livechannel", "registerMediaServer", kparams, BorhanLiveEntry.class);
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
        this.borhanClient.queueServiceCall("livechannel", "unregisterMediaServer", kparams, BorhanLiveEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveEntry.class, resultXmlElement);
    }

	/**  Validates all registered media servers     */
    public void validateRegisteredMediaServers(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("livechannel", "validateRegisteredMediaServers", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
