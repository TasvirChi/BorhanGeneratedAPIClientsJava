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

/**  PermissionItem service lets you create and manage permission items    */
@SuppressWarnings("serial")
public class BorhanPermissionItemService extends BorhanServiceBase {
    public BorhanPermissionItemService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Adds a new permission item object to the account.   This action is available
	  only to Borhan system administrators.     */
    public BorhanPermissionItem add(BorhanPermissionItem permissionItem) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("permissionItem", permissionItem);
        this.borhanClient.queueServiceCall("permissionitem", "add", kparams, BorhanPermissionItem.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermissionItem.class, resultXmlElement);
    }

	/**  Retrieves a permission item object using its ID.     */
    public BorhanPermissionItem get(int permissionItemId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("permissionItemId", permissionItemId);
        this.borhanClient.queueServiceCall("permissionitem", "get", kparams, BorhanPermissionItem.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermissionItem.class, resultXmlElement);
    }

	/**  Updates an existing permission item object.   This action is available only to
	  Borhan system administrators.     */
    public BorhanPermissionItem update(int permissionItemId, BorhanPermissionItem permissionItem) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("permissionItemId", permissionItemId);
        kparams.add("permissionItem", permissionItem);
        this.borhanClient.queueServiceCall("permissionitem", "update", kparams, BorhanPermissionItem.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermissionItem.class, resultXmlElement);
    }

	/**  Deletes an existing permission item object.   This action is available only to
	  Borhan system administrators.     */
    public BorhanPermissionItem delete(int permissionItemId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("permissionItemId", permissionItemId);
        this.borhanClient.queueServiceCall("permissionitem", "delete", kparams, BorhanPermissionItem.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermissionItem.class, resultXmlElement);
    }

    public BorhanPermissionItemListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanPermissionItemListResponse list(BorhanPermissionItemFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  Lists permission item objects that are associated with an account.     */
    public BorhanPermissionItemListResponse list(BorhanPermissionItemFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("permissionitem", "list", kparams, BorhanPermissionItemListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermissionItemListResponse.class, resultXmlElement);
    }
}
