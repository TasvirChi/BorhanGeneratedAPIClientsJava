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

/**  DropFolderFile service lets you create and manage drop folder files    */
@SuppressWarnings("serial")
public class BorhanDropFolderFileService extends BorhanServiceBase {
    public BorhanDropFolderFileService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Allows you to add a new BorhanDropFolderFile object     */
    public BorhanDropFolderFile add(BorhanDropFolderFile dropFolderFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolderFile", dropFolderFile);
        this.borhanClient.queueServiceCall("dropfolder_dropfolderfile", "add", kparams, BorhanDropFolderFile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolderFile.class, resultXmlElement);
    }

	/**  Retrieve a BorhanDropFolderFile object by ID     */
    public BorhanDropFolderFile get(int dropFolderFileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        this.borhanClient.queueServiceCall("dropfolder_dropfolderfile", "get", kparams, BorhanDropFolderFile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolderFile.class, resultXmlElement);
    }

	/**  Update an existing BorhanDropFolderFile object     */
    public BorhanDropFolderFile update(int dropFolderFileId, BorhanDropFolderFile dropFolderFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        kparams.add("dropFolderFile", dropFolderFile);
        this.borhanClient.queueServiceCall("dropfolder_dropfolderfile", "update", kparams, BorhanDropFolderFile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolderFile.class, resultXmlElement);
    }

	/**  Update status of BorhanDropFolderFile     */
    public BorhanDropFolderFile updateStatus(int dropFolderFileId, BorhanDropFolderFileStatus status) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        kparams.add("status", status);
        this.borhanClient.queueServiceCall("dropfolder_dropfolderfile", "updateStatus", kparams, BorhanDropFolderFile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolderFile.class, resultXmlElement);
    }

	/**  Mark the BorhanDropFolderFile object as deleted     */
    public BorhanDropFolderFile delete(int dropFolderFileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        this.borhanClient.queueServiceCall("dropfolder_dropfolderfile", "delete", kparams, BorhanDropFolderFile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolderFile.class, resultXmlElement);
    }

    public BorhanDropFolderFileListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanDropFolderFileListResponse list(BorhanDropFolderFileFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List BorhanDropFolderFile objects     */
    public BorhanDropFolderFileListResponse list(BorhanDropFolderFileFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("dropfolder_dropfolderfile", "list", kparams, BorhanDropFolderFileListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolderFileListResponse.class, resultXmlElement);
    }

	/**  Set the BorhanDropFolderFile status to ignore
	  (BorhanDropFolderFileStatus::IGNORE)     */
    public BorhanDropFolderFile ignore(int dropFolderFileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        this.borhanClient.queueServiceCall("dropfolder_dropfolderfile", "ignore", kparams, BorhanDropFolderFile.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanDropFolderFile.class, resultXmlElement);
    }
}
