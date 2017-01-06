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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Short link service    */
@SuppressWarnings("serial")
public class BorhanShortLinkService extends BorhanServiceBase {
    public BorhanShortLinkService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanShortLinkListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanShortLinkListResponse list(BorhanShortLinkFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List short link objects by filter and pager     */
    public BorhanShortLinkListResponse list(BorhanShortLinkFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("shortlink_shortlink", "list", kparams, BorhanShortLinkListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanShortLinkListResponse.class, resultXmlElement);
    }

	/**  Allows you to add a short link object     */
    public BorhanShortLink add(BorhanShortLink shortLink) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("shortLink", shortLink);
        this.borhanClient.queueServiceCall("shortlink_shortlink", "add", kparams, BorhanShortLink.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanShortLink.class, resultXmlElement);
    }

	/**  Retrieve an short link object by id     */
    public BorhanShortLink get(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("shortlink_shortlink", "get", kparams, BorhanShortLink.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanShortLink.class, resultXmlElement);
    }

	/**  Update exisitng short link     */
    public BorhanShortLink update(String id, BorhanShortLink shortLink) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("shortLink", shortLink);
        this.borhanClient.queueServiceCall("shortlink_shortlink", "update", kparams, BorhanShortLink.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanShortLink.class, resultXmlElement);
    }

	/**  Mark the short link as deleted     */
    public BorhanShortLink delete(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("shortlink_shortlink", "delete", kparams, BorhanShortLink.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanShortLink.class, resultXmlElement);
    }

    public String goto_(String id) throws BorhanApiException {
        return this.goto_(id, false);
    }

	/**  Serves short link     */
    public String goto_(String id, boolean proxy) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("proxy", proxy);
        this.borhanClient.queueServiceCall("shortlink_shortlink", "goto_", kparams);
        return this.borhanClient.serve();
    }
}
