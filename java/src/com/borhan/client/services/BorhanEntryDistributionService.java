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

/**  Entry Distribution service    */
@SuppressWarnings("serial")
public class BorhanEntryDistributionService extends BorhanServiceBase {
    public BorhanEntryDistributionService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new Entry Distribution     */
    public BorhanEntryDistribution add(BorhanEntryDistribution entryDistribution) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryDistribution", entryDistribution);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "add", kparams, BorhanEntryDistribution.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistribution.class, resultXmlElement);
    }

	/**  Get Entry Distribution by id     */
    public BorhanEntryDistribution get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "get", kparams, BorhanEntryDistribution.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistribution.class, resultXmlElement);
    }

	/**  Validates Entry Distribution by id for submission     */
    public BorhanEntryDistribution validate(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "validate", kparams, BorhanEntryDistribution.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistribution.class, resultXmlElement);
    }

	/**  Update Entry Distribution by id     */
    public BorhanEntryDistribution update(int id, BorhanEntryDistribution entryDistribution) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("entryDistribution", entryDistribution);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "update", kparams, BorhanEntryDistribution.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistribution.class, resultXmlElement);
    }

	/**  Delete Entry Distribution by id     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanEntryDistributionListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanEntryDistributionListResponse list(BorhanEntryDistributionFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List all distribution providers     */
    public BorhanEntryDistributionListResponse list(BorhanEntryDistributionFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "list", kparams, BorhanEntryDistributionListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistributionListResponse.class, resultXmlElement);
    }

    public BorhanEntryDistribution submitAdd(int id) throws BorhanApiException {
        return this.submitAdd(id, false);
    }

	/**  Submits Entry Distribution to the remote destination     */
    public BorhanEntryDistribution submitAdd(int id, boolean submitWhenReady) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("submitWhenReady", submitWhenReady);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "submitAdd", kparams, BorhanEntryDistribution.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistribution.class, resultXmlElement);
    }

	/**  Submits Entry Distribution changes to the remote destination     */
    public BorhanEntryDistribution submitUpdate(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "submitUpdate", kparams, BorhanEntryDistribution.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistribution.class, resultXmlElement);
    }

	/**  Submits Entry Distribution report request     */
    public BorhanEntryDistribution submitFetchReport(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "submitFetchReport", kparams, BorhanEntryDistribution.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistribution.class, resultXmlElement);
    }

	/**  Deletes Entry Distribution from the remote destination     */
    public BorhanEntryDistribution submitDelete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "submitDelete", kparams, BorhanEntryDistribution.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistribution.class, resultXmlElement);
    }

	/**  Retries last submit action     */
    public BorhanEntryDistribution retrySubmit(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "retrySubmit", kparams, BorhanEntryDistribution.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEntryDistribution.class, resultXmlElement);
    }

	/**  Serves entry distribution sent data     */
    public String serveSentData(int id, BorhanDistributionAction actionType) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("actionType", actionType);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "serveSentData", kparams);
        return this.borhanClient.serve();
    }

	/**  Serves entry distribution returned data     */
    public String serveReturnedData(int id, BorhanDistributionAction actionType) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("actionType", actionType);
        this.borhanClient.queueServiceCall("contentdistribution_entrydistribution", "serveReturnedData", kparams);
        return this.borhanClient.serve();
    }
}
