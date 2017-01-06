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

/**  partner service allows you to change/manage your partner personal details and
  settings as well    */
@SuppressWarnings("serial")
public class BorhanPartnerService extends BorhanServiceBase {
    public BorhanPartnerService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanPartner register(BorhanPartner partner) throws BorhanApiException {
        return this.register(partner, "");
    }

    public BorhanPartner register(BorhanPartner partner, String cmsPassword) throws BorhanApiException {
        return this.register(partner, cmsPassword, Integer.MIN_VALUE);
    }

    public BorhanPartner register(BorhanPartner partner, String cmsPassword, int templatePartnerId) throws BorhanApiException {
        return this.register(partner, cmsPassword, templatePartnerId, false);
    }

	/**  Create a new Partner object     */
    public BorhanPartner register(BorhanPartner partner, String cmsPassword, int templatePartnerId, boolean silent) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("partner", partner);
        kparams.add("cmsPassword", cmsPassword);
        kparams.add("templatePartnerId", templatePartnerId);
        kparams.add("silent", silent);
        this.borhanClient.queueServiceCall("partner", "register", kparams, BorhanPartner.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPartner.class, resultXmlElement);
    }

    public BorhanPartner update(BorhanPartner partner) throws BorhanApiException {
        return this.update(partner, false);
    }

	/**  Update details and settings of an existing partner     */
    public BorhanPartner update(BorhanPartner partner, boolean allowEmpty) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("partner", partner);
        kparams.add("allowEmpty", allowEmpty);
        this.borhanClient.queueServiceCall("partner", "update", kparams, BorhanPartner.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPartner.class, resultXmlElement);
    }

    public BorhanPartner get() throws BorhanApiException {
        return this.get(Integer.MIN_VALUE);
    }

	/**  Retrieve partner object by Id     */
    public BorhanPartner get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("partner", "get", kparams, BorhanPartner.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPartner.class, resultXmlElement);
    }

	/**  Retrieve partner secret and admin secret     */
    public BorhanPartner getSecrets(int partnerId, String adminEmail, String cmsPassword) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("partnerId", partnerId);
        kparams.add("adminEmail", adminEmail);
        kparams.add("cmsPassword", cmsPassword);
        this.borhanClient.queueServiceCall("partner", "getSecrets", kparams, BorhanPartner.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPartner.class, resultXmlElement);
    }

	/**  Retrieve all info attributed to the partner   This action expects no parameters.
	  It returns information for the current KS partnerId.     */
    public BorhanPartner getInfo() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("partner", "getInfo", kparams, BorhanPartner.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPartner.class, resultXmlElement);
    }

    public BorhanPartnerUsage getUsage() throws BorhanApiException {
        return this.getUsage();
    }

    public BorhanPartnerUsage getUsage(int year) throws BorhanApiException {
        return this.getUsage(year, 1);
    }

    public BorhanPartnerUsage getUsage(int year, int month) throws BorhanApiException {
        return this.getUsage(year, month, null);
    }

	/**  Get usage statistics for a partner   Calculation is done according to partner's
	  package   Additional data returned is a graph points of streaming usage in a
	  timeframe   The resolution can be "days" or "months"     */
    public BorhanPartnerUsage getUsage(int year, int month, BorhanReportInterval resolution) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("year", year);
        kparams.add("month", month);
        kparams.add("resolution", resolution);
        this.borhanClient.queueServiceCall("partner", "getUsage", kparams, BorhanPartnerUsage.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPartnerUsage.class, resultXmlElement);
    }

	/**  Get usage statistics for a partner   Calculation is done according to partner's
	  package     */
    public BorhanPartnerStatistics getStatistics() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("partner", "getStatistics", kparams, BorhanPartnerStatistics.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPartnerStatistics.class, resultXmlElement);
    }

    public BorhanPartnerListResponse listPartnersForUser() throws BorhanApiException {
        return this.listPartnersForUser(null);
    }

    public BorhanPartnerListResponse listPartnersForUser(BorhanPartnerFilter partnerFilter) throws BorhanApiException {
        return this.listPartnersForUser(partnerFilter, null);
    }

	/**  Retrieve a list of partner objects which the current user is allowed to access. 
	     */
    public BorhanPartnerListResponse listPartnersForUser(BorhanPartnerFilter partnerFilter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("partnerFilter", partnerFilter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("partner", "listPartnersForUser", kparams, BorhanPartnerListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPartnerListResponse.class, resultXmlElement);
    }

    public BorhanPartnerListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanPartnerListResponse list(BorhanPartnerFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List partners by filter with paging support   Current implementation will only
	  list the sub partners of the partner initiating the api call (using the current
	  KS).   This action is only partially implemented to support listing sub partners
	  of a VAR partner.     */
    public BorhanPartnerListResponse list(BorhanPartnerFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("partner", "list", kparams, BorhanPartnerListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPartnerListResponse.class, resultXmlElement);
    }

	/**  List partner's current processes' statuses     */
    public BorhanFeatureStatusListResponse listFeatureStatus() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("partner", "listFeatureStatus", kparams, BorhanFeatureStatusListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFeatureStatusListResponse.class, resultXmlElement);
    }

    public int count() throws BorhanApiException {
        return this.count(null);
    }

	/**  Count partner's existing sub-publishers (count includes the partner itself).     */
    public int count(BorhanPartnerFilter filter) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        this.borhanClient.queueServiceCall("partner", "count", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }
}
