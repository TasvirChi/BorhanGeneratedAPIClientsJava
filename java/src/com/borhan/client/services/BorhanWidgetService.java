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

/**  widget service for full widget management    */
@SuppressWarnings("serial")
public class BorhanWidgetService extends BorhanServiceBase {
    public BorhanWidgetService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new widget, can be attached to entry or kshow   SourceWidget is ignored.     */
    public BorhanWidget add(BorhanWidget widget) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("widget", widget);
        this.borhanClient.queueServiceCall("widget", "add", kparams, BorhanWidget.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanWidget.class, resultXmlElement);
    }

	/**  Update exisiting widget      */
    public BorhanWidget update(String id, BorhanWidget widget) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("widget", widget);
        this.borhanClient.queueServiceCall("widget", "update", kparams, BorhanWidget.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanWidget.class, resultXmlElement);
    }

	/**  Get widget by id     */
    public BorhanWidget get(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("widget", "get", kparams, BorhanWidget.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanWidget.class, resultXmlElement);
    }

	/**  Add widget based on existing widget.   Must provide valid sourceWidgetId     */
    public BorhanWidget clone(BorhanWidget widget) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("widget", widget);
        this.borhanClient.queueServiceCall("widget", "clone", kparams, BorhanWidget.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanWidget.class, resultXmlElement);
    }

    public BorhanWidgetListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanWidgetListResponse list(BorhanWidgetFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  Retrieve a list of available widget depends on the filter given     */
    public BorhanWidgetListResponse list(BorhanWidgetFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("widget", "list", kparams, BorhanWidgetListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanWidgetListResponse.class, resultXmlElement);
    }
}
