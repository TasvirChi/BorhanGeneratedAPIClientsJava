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
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  A Mix is an XML unique format invented by Borhan, it allows the user to create
  a mix of videos and images, in and out points, transitions, text overlays,
  soundtrack, effects and much more...  Mixing service lets you create a new mix,
  manage its metadata and make basic manipulations.       */
@SuppressWarnings("serial")
public class BorhanMixingService extends BorhanServiceBase {
    public BorhanMixingService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Adds a new mix.   If the dataContent is null, a default timeline will be
	  created.     */
    public BorhanMixEntry add(BorhanMixEntry mixEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("mixEntry", mixEntry);
        this.borhanClient.queueServiceCall("mixing", "add", kparams, BorhanMixEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMixEntry.class, resultXmlElement);
    }

    public BorhanMixEntry get(String entryId) throws BorhanApiException {
        return this.get(entryId, -1);
    }

	/**  Get mix entry by id.     */
    public BorhanMixEntry get(String entryId, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("mixing", "get", kparams, BorhanMixEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMixEntry.class, resultXmlElement);
    }

	/**  Update mix entry. Only the properties that were set will be updated.     */
    public BorhanMixEntry update(String entryId, BorhanMixEntry mixEntry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("mixEntry", mixEntry);
        this.borhanClient.queueServiceCall("mixing", "update", kparams, BorhanMixEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMixEntry.class, resultXmlElement);
    }

	/**  Delete a mix entry.     */
    public void delete(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("mixing", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanMixListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanMixListResponse list(BorhanMixEntryFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List entries by filter with paging support.   Return parameter is an array of
	  mix entries.     */
    public BorhanMixListResponse list(BorhanMixEntryFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("mixing", "list", kparams, BorhanMixListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMixListResponse.class, resultXmlElement);
    }

    public int count() throws BorhanApiException {
        return this.count(null);
    }

	/**  Count mix entries by filter.     */
    public int count(BorhanMediaEntryFilter filter) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        this.borhanClient.queueServiceCall("mixing", "count", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  Clones an existing mix.     */
    public BorhanMixEntry clone(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("mixing", "clone", kparams, BorhanMixEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMixEntry.class, resultXmlElement);
    }

	/**  Appends a media entry to a the end of the mix timeline, this will save the mix
	  timeline as a new version.     */
    public BorhanMixEntry appendMediaEntry(String mixEntryId, String mediaEntryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("mixEntryId", mixEntryId);
        kparams.add("mediaEntryId", mediaEntryId);
        this.borhanClient.queueServiceCall("mixing", "appendMediaEntry", kparams, BorhanMixEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanMixEntry.class, resultXmlElement);
    }

	/**  Get the mixes in which the media entry is included     */
    public List<BorhanMixEntry> getMixesByMediaId(String mediaEntryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("mediaEntryId", mediaEntryId);
        this.borhanClient.queueServiceCall("mixing", "getMixesByMediaId", kparams, BorhanMixEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanMixEntry.class, resultXmlElement);
    }

    public List<BorhanMediaEntry> getReadyMediaEntries(String mixId) throws BorhanApiException {
        return this.getReadyMediaEntries(mixId, -1);
    }

	/**  Get all ready media entries that exist in the given mix id     */
    public List<BorhanMediaEntry> getReadyMediaEntries(String mixId, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("mixId", mixId);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("mixing", "getReadyMediaEntries", kparams, BorhanMediaEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanMediaEntry.class, resultXmlElement);
    }

	/**  Anonymously rank a mix entry, no validation is done on duplicate rankings     */
    public void anonymousRank(String entryId, int rank) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("rank", rank);
        this.borhanClient.queueServiceCall("mixing", "anonymousRank", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
