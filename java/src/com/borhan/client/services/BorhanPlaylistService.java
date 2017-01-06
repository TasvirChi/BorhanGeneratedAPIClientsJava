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
import com.borhan.client.enums.*;
import java.util.ArrayList;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Playlist service lets you create,manage and play your playlists  Playlists could
  be static (containing a fixed list of entries) or dynamic (baseed on a filter)    */
@SuppressWarnings("serial")
public class BorhanPlaylistService extends BorhanServiceBase {
    public BorhanPlaylistService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanPlaylist add(BorhanPlaylist playlist) throws BorhanApiException {
        return this.add(playlist, false);
    }

	/**  Add new playlist   Note that all entries used in a playlist will become public
	  and may appear in BorhanNetwork     */
    public BorhanPlaylist add(BorhanPlaylist playlist, boolean updateStats) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("playlist", playlist);
        kparams.add("updateStats", updateStats);
        this.borhanClient.queueServiceCall("playlist", "add", kparams, BorhanPlaylist.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPlaylist.class, resultXmlElement);
    }

    public BorhanPlaylist get(String id) throws BorhanApiException {
        return this.get(id, -1);
    }

	/**  Retrieve a playlist     */
    public BorhanPlaylist get(String id, int version) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("version", version);
        this.borhanClient.queueServiceCall("playlist", "get", kparams, BorhanPlaylist.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPlaylist.class, resultXmlElement);
    }

    public BorhanPlaylist update(String id, BorhanPlaylist playlist) throws BorhanApiException {
        return this.update(id, playlist, false);
    }

	/**  Update existing playlist   Note - you cannot change playlist type. updated
	  playlist must be of the same type.     */
    public BorhanPlaylist update(String id, BorhanPlaylist playlist, boolean updateStats) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("playlist", playlist);
        kparams.add("updateStats", updateStats);
        this.borhanClient.queueServiceCall("playlist", "update", kparams, BorhanPlaylist.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPlaylist.class, resultXmlElement);
    }

	/**  Delete existing playlist     */
    public void delete(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("playlist", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanPlaylist clone(String id) throws BorhanApiException {
        return this.clone(id, null);
    }

	/**  Clone an existing playlist     */
    public BorhanPlaylist clone(String id, BorhanPlaylist newPlaylist) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("newPlaylist", newPlaylist);
        this.borhanClient.queueServiceCall("playlist", "clone", kparams, BorhanPlaylist.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPlaylist.class, resultXmlElement);
    }

    public BorhanPlaylistListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanPlaylistListResponse list(BorhanPlaylistFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List available playlists     */
    public BorhanPlaylistListResponse list(BorhanPlaylistFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("playlist", "list", kparams, BorhanPlaylistListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPlaylistListResponse.class, resultXmlElement);
    }

    public List<BorhanBaseEntry> execute(String id) throws BorhanApiException {
        return this.execute(id, "");
    }

    public List<BorhanBaseEntry> execute(String id, String detailed) throws BorhanApiException {
        return this.execute(id, detailed, null);
    }

    public List<BorhanBaseEntry> execute(String id, String detailed, BorhanContext playlistContext) throws BorhanApiException {
        return this.execute(id, detailed, playlistContext, null);
    }

	/**  Retrieve playlist for playing purpose     */
    public List<BorhanBaseEntry> execute(String id, String detailed, BorhanContext playlistContext, BorhanMediaEntryFilterForPlaylist filter) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("detailed", detailed);
        kparams.add("playlistContext", playlistContext);
        kparams.add("filter", filter);
        this.borhanClient.queueServiceCall("playlist", "execute", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanBaseEntry.class, resultXmlElement);
    }

    public List<BorhanBaseEntry> executeFromContent(BorhanPlaylistType playlistType, String playlistContent) throws BorhanApiException {
        return this.executeFromContent(playlistType, playlistContent, "");
    }

	/**  Retrieve playlist for playing purpose, based on content     */
    public List<BorhanBaseEntry> executeFromContent(BorhanPlaylistType playlistType, String playlistContent, String detailed) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("playlistType", playlistType);
        kparams.add("playlistContent", playlistContent);
        kparams.add("detailed", detailed);
        this.borhanClient.queueServiceCall("playlist", "executeFromContent", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanBaseEntry.class, resultXmlElement);
    }

    public List<BorhanBaseEntry> executeFromFilters(ArrayList<BorhanMediaEntryFilterForPlaylist> filters, int totalResults) throws BorhanApiException {
        return this.executeFromFilters(filters, totalResults, "");
    }

	/**  Revrieve playlist for playing purpose, based on media entry filters     */
    public List<BorhanBaseEntry> executeFromFilters(ArrayList<BorhanMediaEntryFilterForPlaylist> filters, int totalResults, String detailed) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filters", filters);
        kparams.add("totalResults", totalResults);
        kparams.add("detailed", detailed);
        this.borhanClient.queueServiceCall("playlist", "executeFromFilters", kparams, BorhanBaseEntry.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanBaseEntry.class, resultXmlElement);
    }

	/**  Retrieve playlist statistics     */
    public BorhanPlaylist getStatsFromContent(BorhanPlaylistType playlistType, String playlistContent) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("playlistType", playlistType);
        kparams.add("playlistContent", playlistContent);
        this.borhanClient.queueServiceCall("playlist", "getStatsFromContent", kparams, BorhanPlaylist.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPlaylist.class, resultXmlElement);
    }
}
