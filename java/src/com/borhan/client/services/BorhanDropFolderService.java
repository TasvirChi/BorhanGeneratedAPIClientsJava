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

/**  DropFolder service lets you create and manage drop folders    */
@SuppressWarnings("serial")
public class BorhanDropFolderService extends BorhanServiceBase {
    public BorhanDropFolderService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Allows you to add a new BorhanDropFolder object     */
    public BorhanDropFolder add(BorhanDropFolder dropFolder) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolder", dropFolder);
        this.borhanClient.queueServiceCall("dropfolder_dropfolder", "add", kparams, BorhanDropFolder.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolder.class, resultXmlElement);
    }

	/**  Retrieve a BorhanDropFolder object by ID     */
    public BorhanDropFolder get(int dropFolderId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolderId", dropFolderId);
        this.borhanClient.queueServiceCall("dropfolder_dropfolder", "get", kparams, BorhanDropFolder.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolder.class, resultXmlElement);
    }

	/**  Update an existing BorhanDropFolder object     */
    public BorhanDropFolder update(int dropFolderId, BorhanDropFolder dropFolder) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolderId", dropFolderId);
        kparams.add("dropFolder", dropFolder);
        this.borhanClient.queueServiceCall("dropfolder_dropfolder", "update", kparams, BorhanDropFolder.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolder.class, resultXmlElement);
    }

	/**  Mark the BorhanDropFolder object as deleted     */
    public BorhanDropFolder delete(int dropFolderId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolderId", dropFolderId);
        this.borhanClient.queueServiceCall("dropfolder_dropfolder", "delete", kparams, BorhanDropFolder.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolder.class, resultXmlElement);
    }

    public BorhanDropFolderListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanDropFolderListResponse list(BorhanDropFolderFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List BorhanDropFolder objects     */
    public BorhanDropFolderListResponse list(BorhanDropFolderFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("dropfolder_dropfolder", "list", kparams, BorhanDropFolderListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolderListResponse.class, resultXmlElement);
    }
}
