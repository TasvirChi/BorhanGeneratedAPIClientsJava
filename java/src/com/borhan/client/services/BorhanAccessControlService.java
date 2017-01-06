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

/**  Add & Manage Access Controls    */
@SuppressWarnings("serial")
public class BorhanAccessControlService extends BorhanServiceBase {
    public BorhanAccessControlService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new Access Control Profile     */
    public BorhanAccessControl add(BorhanAccessControl accessControl) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("accessControl", accessControl);
        this.borhanClient.queueServiceCall("accesscontrol", "add", kparams, BorhanAccessControl.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAccessControl.class, resultXmlElement);
    }

	/**  Get Access Control Profile by id     */
    public BorhanAccessControl get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("accesscontrol", "get", kparams, BorhanAccessControl.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAccessControl.class, resultXmlElement);
    }

	/**  Update Access Control Profile by id     */
    public BorhanAccessControl update(int id, BorhanAccessControl accessControl) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("accessControl", accessControl);
        this.borhanClient.queueServiceCall("accesscontrol", "update", kparams, BorhanAccessControl.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAccessControl.class, resultXmlElement);
    }

	/**  Delete Access Control Profile by id     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("accesscontrol", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanAccessControlListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanAccessControlListResponse list(BorhanAccessControlFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List Access Control Profiles by filter and pager     */
    public BorhanAccessControlListResponse list(BorhanAccessControlFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("accesscontrol", "list", kparams, BorhanAccessControlListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAccessControlListResponse.class, resultXmlElement);
    }
}
