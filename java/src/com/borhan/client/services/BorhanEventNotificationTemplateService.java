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

/**  Event notification template service lets you create and manage event
  notification templates    */
@SuppressWarnings("serial")
public class BorhanEventNotificationTemplateService extends BorhanServiceBase {
    public BorhanEventNotificationTemplateService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Allows you to add a new event notification template object     */
    public BorhanEventNotificationTemplate add(BorhanEventNotificationTemplate eventNotificationTemplate) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("eventNotificationTemplate", eventNotificationTemplate);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "add", kparams, BorhanEventNotificationTemplate.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEventNotificationTemplate.class, resultXmlElement);
    }

    public BorhanEventNotificationTemplate clone(int id) throws BorhanApiException {
        return this.clone(id, null);
    }

	/**  Allows you to clone exiting event notification template object and create a new
	  one with similar configuration     */
    public BorhanEventNotificationTemplate clone(int id, BorhanEventNotificationTemplate eventNotificationTemplate) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("eventNotificationTemplate", eventNotificationTemplate);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "clone", kparams, BorhanEventNotificationTemplate.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEventNotificationTemplate.class, resultXmlElement);
    }

	/**  Retrieve an event notification template object by id     */
    public BorhanEventNotificationTemplate get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "get", kparams, BorhanEventNotificationTemplate.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEventNotificationTemplate.class, resultXmlElement);
    }

	/**  Update an existing event notification template object     */
    public BorhanEventNotificationTemplate update(int id, BorhanEventNotificationTemplate eventNotificationTemplate) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("eventNotificationTemplate", eventNotificationTemplate);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "update", kparams, BorhanEventNotificationTemplate.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEventNotificationTemplate.class, resultXmlElement);
    }

	/**  Update event notification template status by id     */
    public BorhanEventNotificationTemplate updateStatus(int id, BorhanEventNotificationTemplateStatus status) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("status", status);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "updateStatus", kparams, BorhanEventNotificationTemplate.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEventNotificationTemplate.class, resultXmlElement);
    }

	/**  Delete an event notification template object     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanEventNotificationTemplateListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanEventNotificationTemplateListResponse list(BorhanEventNotificationTemplateFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  list event notification template objects     */
    public BorhanEventNotificationTemplateListResponse list(BorhanEventNotificationTemplateFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "list", kparams, BorhanEventNotificationTemplateListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEventNotificationTemplateListResponse.class, resultXmlElement);
    }

    public BorhanEventNotificationTemplateListResponse listByPartner() throws BorhanApiException {
        return this.listByPartner(null);
    }

    public BorhanEventNotificationTemplateListResponse listByPartner(BorhanPartnerFilter filter) throws BorhanApiException {
        return this.listByPartner(filter, null);
    }

    public BorhanEventNotificationTemplateListResponse listByPartner(BorhanPartnerFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "listByPartner", kparams, BorhanEventNotificationTemplateListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEventNotificationTemplateListResponse.class, resultXmlElement);
    }

	/**  Dispatch event notification object by id     */
    public int dispatch(int id, BorhanEventNotificationScope scope) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("scope", scope);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "dispatch", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

    public BorhanEventNotificationTemplateListResponse listTemplates() throws BorhanApiException {
        return this.listTemplates(null);
    }

    public BorhanEventNotificationTemplateListResponse listTemplates(BorhanEventNotificationTemplateFilter filter) throws BorhanApiException {
        return this.listTemplates(filter, null);
    }

	/**  Action lists the template partner event notification templates.     */
    public BorhanEventNotificationTemplateListResponse listTemplates(BorhanEventNotificationTemplateFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("eventnotification_eventnotificationtemplate", "listTemplates", kparams, BorhanEventNotificationTemplateListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanEventNotificationTemplateListResponse.class, resultXmlElement);
    }
}
