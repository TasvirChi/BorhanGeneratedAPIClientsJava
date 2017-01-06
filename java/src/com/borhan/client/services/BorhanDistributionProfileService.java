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

/**  Distribution Profile service    */
@SuppressWarnings("serial")
public class BorhanDistributionProfileService extends BorhanServiceBase {
    public BorhanDistributionProfileService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new Distribution Profile     */
    public BorhanDistributionProfile add(BorhanDistributionProfile distributionProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("distributionProfile", distributionProfile);
        this.borhanClient.queueServiceCall("contentdistribution_distributionprofile", "add", kparams, BorhanDistributionProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDistributionProfile.class, resultXmlElement);
    }

	/**  Get Distribution Profile by id     */
    public BorhanDistributionProfile get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_distributionprofile", "get", kparams, BorhanDistributionProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDistributionProfile.class, resultXmlElement);
    }

	/**  Update Distribution Profile by id     */
    public BorhanDistributionProfile update(int id, BorhanDistributionProfile distributionProfile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("distributionProfile", distributionProfile);
        this.borhanClient.queueServiceCall("contentdistribution_distributionprofile", "update", kparams, BorhanDistributionProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDistributionProfile.class, resultXmlElement);
    }

	/**  Update Distribution Profile status by id     */
    public BorhanDistributionProfile updateStatus(int id, BorhanDistributionProfileStatus status) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("status", status);
        this.borhanClient.queueServiceCall("contentdistribution_distributionprofile", "updateStatus", kparams, BorhanDistributionProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDistributionProfile.class, resultXmlElement);
    }

	/**  Delete Distribution Profile by id     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_distributionprofile", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanDistributionProfileListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanDistributionProfileListResponse list(BorhanDistributionProfileFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List all distribution providers     */
    public BorhanDistributionProfileListResponse list(BorhanDistributionProfileFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("contentdistribution_distributionprofile", "list", kparams, BorhanDistributionProfileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDistributionProfileListResponse.class, resultXmlElement);
    }

    public BorhanDistributionProfileListResponse listByPartner() throws BorhanApiException {
        return this.listByPartner(null);
    }

    public BorhanDistributionProfileListResponse listByPartner(BorhanPartnerFilter filter) throws BorhanApiException {
        return this.listByPartner(filter, null);
    }

    public BorhanDistributionProfileListResponse listByPartner(BorhanPartnerFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("contentdistribution_distributionprofile", "listByPartner", kparams, BorhanDistributionProfileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDistributionProfileListResponse.class, resultXmlElement);
    }
}
