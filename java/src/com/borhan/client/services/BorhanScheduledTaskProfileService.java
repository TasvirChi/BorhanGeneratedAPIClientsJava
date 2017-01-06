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

/**  Schedule task service lets you create and manage scheduled task profiles    */
@SuppressWarnings("serial")
public class BorhanScheduledTaskProfileService extends BorhanServiceBase {
    public BorhanScheduledTaskProfileService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add a new scheduled task profile     */
    public BorhanScheduledTaskProfile add(BorhanScheduledTaskProfile scheduledTaskProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("scheduledTaskProfile", scheduledTaskProfile);
        this.borhanClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "add", kparams, BorhanScheduledTaskProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanScheduledTaskProfile.class, resultXmlElement);
    }

	/**  Retrieve a scheduled task profile by id     */
    public BorhanScheduledTaskProfile get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "get", kparams, BorhanScheduledTaskProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanScheduledTaskProfile.class, resultXmlElement);
    }

	/**  Update an existing scheduled task profile     */
    public BorhanScheduledTaskProfile update(int id, BorhanScheduledTaskProfile scheduledTaskProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("scheduledTaskProfile", scheduledTaskProfile);
        this.borhanClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "update", kparams, BorhanScheduledTaskProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanScheduledTaskProfile.class, resultXmlElement);
    }

	/**  Delete a scheduled task profile     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanScheduledTaskProfileListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanScheduledTaskProfileListResponse list(BorhanScheduledTaskProfileFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List scheduled task profiles     */
    public BorhanScheduledTaskProfileListResponse list(BorhanScheduledTaskProfileFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "list", kparams, BorhanScheduledTaskProfileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanScheduledTaskProfileListResponse.class, resultXmlElement);
    }

    public int requestDryRun(int scheduledTaskProfileId) throws BorhanApiException {
        return this.requestDryRun(scheduledTaskProfileId, 500);
    }

    public int requestDryRun(int scheduledTaskProfileId, int maxResults) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("scheduledTaskProfileId", scheduledTaskProfileId);
        kparams.add("maxResults", maxResults);
        this.borhanClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "requestDryRun", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

    public BorhanObjectListResponse getDryRunResults(int requestId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("requestId", requestId);
        this.borhanClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "getDryRunResults", kparams, BorhanObjectListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanObjectListResponse.class, resultXmlElement);
    }
}
