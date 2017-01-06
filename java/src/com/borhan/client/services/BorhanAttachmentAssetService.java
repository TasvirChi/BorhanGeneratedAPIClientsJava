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

/**  Retrieve information and invoke actions on attachment Asset    */
@SuppressWarnings("serial")
public class BorhanAttachmentAssetService extends BorhanServiceBase {
    public BorhanAttachmentAssetService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add attachment asset        */
    public BorhanAttachmentAsset add(String entryId, BorhanAttachmentAsset attachmentAsset) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("attachmentAsset", attachmentAsset);
        this.borhanClient.queueServiceCall("attachment_attachmentasset", "add", kparams, BorhanAttachmentAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAttachmentAsset.class, resultXmlElement);
    }

	/**  Update content of attachment asset        */
    public BorhanAttachmentAsset setContent(String id, BorhanContentResource contentResource) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);
        this.borhanClient.queueServiceCall("attachment_attachmentasset", "setContent", kparams, BorhanAttachmentAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAttachmentAsset.class, resultXmlElement);
    }

	/**  Update attachment asset        */
    public BorhanAttachmentAsset update(String id, BorhanAttachmentAsset attachmentAsset) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("attachmentAsset", attachmentAsset);
        this.borhanClient.queueServiceCall("attachment_attachmentasset", "update", kparams, BorhanAttachmentAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAttachmentAsset.class, resultXmlElement);
    }

    public String getUrl(String id) throws BorhanApiException {
        return this.getUrl(id, Integer.MIN_VALUE);
    }

	/**  Get download URL for the asset     */
    public String getUrl(String id, int storageId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("storageId", storageId);
        this.borhanClient.queueServiceCall("attachment_attachmentasset", "getUrl", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  Get remote storage existing paths for the asset     */
    public BorhanRemotePathListResponse getRemotePaths(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("attachment_attachmentasset", "getRemotePaths", kparams, BorhanRemotePathListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanRemotePathListResponse.class, resultXmlElement);
    }

	/**  Serves attachment by its id     */
    public String serve(String attachmentAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("attachmentAssetId", attachmentAssetId);
        this.borhanClient.queueServiceCall("attachment_attachmentasset", "serve", kparams);
        return this.borhanClient.serve();
    }

    public BorhanAttachmentAsset get(String attachmentAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("attachmentAssetId", attachmentAssetId);
        this.borhanClient.queueServiceCall("attachment_attachmentasset", "get", kparams, BorhanAttachmentAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAttachmentAsset.class, resultXmlElement);
    }

    public BorhanAttachmentAssetListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanAttachmentAssetListResponse list(BorhanAssetFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List attachment Assets by filter and pager     */
    public BorhanAttachmentAssetListResponse list(BorhanAssetFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("attachment_attachmentasset", "list", kparams, BorhanAttachmentAssetListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAttachmentAssetListResponse.class, resultXmlElement);
    }

    public void delete(String attachmentAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("attachmentAssetId", attachmentAssetId);
        this.borhanClient.queueServiceCall("attachment_attachmentasset", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
