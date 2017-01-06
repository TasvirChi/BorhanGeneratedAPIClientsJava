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

/**  Manage live channel segments    */
@SuppressWarnings("serial")
public class BorhanLiveChannelSegmentService extends BorhanServiceBase {
    public BorhanLiveChannelSegmentService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new live channel segment     */
    public BorhanLiveChannelSegment add(BorhanLiveChannelSegment liveChannelSegment) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("liveChannelSegment", liveChannelSegment);
        this.borhanClient.queueServiceCall("livechannelsegment", "add", kparams, BorhanLiveChannelSegment.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveChannelSegment.class, resultXmlElement);
    }

	/**  Get live channel segment by id     */
    public BorhanLiveChannelSegment get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("livechannelsegment", "get", kparams, BorhanLiveChannelSegment.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveChannelSegment.class, resultXmlElement);
    }

	/**  Update live channel segment by id     */
    public BorhanLiveChannelSegment update(int id, BorhanLiveChannelSegment liveChannelSegment) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("liveChannelSegment", liveChannelSegment);
        this.borhanClient.queueServiceCall("livechannelsegment", "update", kparams, BorhanLiveChannelSegment.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveChannelSegment.class, resultXmlElement);
    }

	/**  Delete live channel segment by id     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("livechannelsegment", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanLiveChannelSegmentListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanLiveChannelSegmentListResponse list(BorhanLiveChannelSegmentFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List live channel segments by filter and pager     */
    public BorhanLiveChannelSegmentListResponse list(BorhanLiveChannelSegmentFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("livechannelsegment", "list", kparams, BorhanLiveChannelSegmentListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveChannelSegmentListResponse.class, resultXmlElement);
    }
}
