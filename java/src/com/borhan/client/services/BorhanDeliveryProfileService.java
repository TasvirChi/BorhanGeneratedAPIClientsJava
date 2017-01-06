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

/**  delivery service is used to control delivery objects    */
@SuppressWarnings("serial")
public class BorhanDeliveryProfileService extends BorhanServiceBase {
    public BorhanDeliveryProfileService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new delivery.     */
    public BorhanDeliveryProfile add(BorhanDeliveryProfile delivery) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("delivery", delivery);
        this.borhanClient.queueServiceCall("deliveryprofile", "add", kparams, BorhanDeliveryProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDeliveryProfile.class, resultXmlElement);
    }

	/**  Update exisiting delivery     */
    public BorhanDeliveryProfile update(String id, BorhanDeliveryProfile delivery) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("delivery", delivery);
        this.borhanClient.queueServiceCall("deliveryprofile", "update", kparams, BorhanDeliveryProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDeliveryProfile.class, resultXmlElement);
    }

	/**  Get delivery by id    */
    public BorhanDeliveryProfile get(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("deliveryprofile", "get", kparams, BorhanDeliveryProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDeliveryProfile.class, resultXmlElement);
    }

	/**  Add delivery based on existing delivery.  Must provide valid sourceDeliveryId    */
    public BorhanDeliveryProfile clone(int deliveryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("deliveryId", deliveryId);
        this.borhanClient.queueServiceCall("deliveryprofile", "clone", kparams, BorhanDeliveryProfile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDeliveryProfile.class, resultXmlElement);
    }

    public BorhanDeliveryProfileListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanDeliveryProfileListResponse list(BorhanDeliveryProfileFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  Retrieve a list of available delivery depends on the filter given    */
    public BorhanDeliveryProfileListResponse list(BorhanDeliveryProfileFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("deliveryprofile", "list", kparams, BorhanDeliveryProfileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDeliveryProfileListResponse.class, resultXmlElement);
    }
}
