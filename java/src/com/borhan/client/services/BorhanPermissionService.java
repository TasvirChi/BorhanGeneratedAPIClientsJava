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

/**  Permission service lets you create and manage user permissions    */
@SuppressWarnings("serial")
public class BorhanPermissionService extends BorhanServiceBase {
    public BorhanPermissionService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Adds a new permission object to the account.     */
    public BorhanPermission add(BorhanPermission permission) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("permission", permission);
        this.borhanClient.queueServiceCall("permission", "add", kparams, BorhanPermission.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermission.class, resultXmlElement);
    }

	/**  Retrieves a permission object using its ID.     */
    public BorhanPermission get(String permissionName) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("permissionName", permissionName);
        this.borhanClient.queueServiceCall("permission", "get", kparams, BorhanPermission.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermission.class, resultXmlElement);
    }

	/**  Updates an existing permission object.     */
    public BorhanPermission update(String permissionName, BorhanPermission permission) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("permissionName", permissionName);
        kparams.add("permission", permission);
        this.borhanClient.queueServiceCall("permission", "update", kparams, BorhanPermission.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermission.class, resultXmlElement);
    }

	/**  Deletes an existing permission object.     */
    public BorhanPermission delete(String permissionName) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("permissionName", permissionName);
        this.borhanClient.queueServiceCall("permission", "delete", kparams, BorhanPermission.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermission.class, resultXmlElement);
    }

    public BorhanPermissionListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanPermissionListResponse list(BorhanPermissionFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  Lists permission objects that are associated with an account.   Blocked
	  permissions are listed unless you use a filter to exclude them.   Blocked
	  permissions are listed unless you use a filter to exclude them.     */
    public BorhanPermissionListResponse list(BorhanPermissionFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("permission", "list", kparams, BorhanPermissionListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanPermissionListResponse.class, resultXmlElement);
    }

	/**  Retrieves a list of permissions that apply to the current KS.     */
    public String getCurrentPermissions() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("permission", "getCurrentPermissions", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }
}
