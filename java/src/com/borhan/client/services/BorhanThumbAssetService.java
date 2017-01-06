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
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.borhan.client.BorhanFiles;
import com.borhan.client.BorhanFile;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Retrieve information and invoke actions on Thumb Asset    */
@SuppressWarnings("serial")
public class BorhanThumbAssetService extends BorhanServiceBase {
    public BorhanThumbAssetService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add thumbnail asset        */
    public BorhanThumbAsset add(String entryId, BorhanThumbAsset thumbAsset) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("thumbAsset", thumbAsset);
        this.borhanClient.queueServiceCall("thumbasset", "add", kparams, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAsset.class, resultXmlElement);
    }

	/**  Update content of thumbnail asset        */
    public BorhanThumbAsset setContent(String id, BorhanContentResource contentResource) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);
        this.borhanClient.queueServiceCall("thumbasset", "setContent", kparams, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAsset.class, resultXmlElement);
    }

	/**  Update thumbnail asset        */
    public BorhanThumbAsset update(String id, BorhanThumbAsset thumbAsset) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("thumbAsset", thumbAsset);
        this.borhanClient.queueServiceCall("thumbasset", "update", kparams, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAsset.class, resultXmlElement);
    }

    public String serveByEntryId(String entryId) throws BorhanApiException {
        return this.serveByEntryId(entryId, Integer.MIN_VALUE);
    }

	/**  Serves thumbnail by entry id and thumnail params id     */
    public String serveByEntryId(String entryId, int thumbParamId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("thumbParamId", thumbParamId);
        this.borhanClient.queueServiceCall("thumbasset", "serveByEntryId", kparams);
        return this.borhanClient.serve();
    }

    public String serve(String thumbAssetId) throws BorhanApiException {
        return this.serve(thumbAssetId, Integer.MIN_VALUE);
    }

    public String serve(String thumbAssetId, int version) throws BorhanApiException {
        return this.serve(thumbAssetId, version, null);
    }

    public String serve(String thumbAssetId, int version, BorhanThumbParams thumbParams) throws BorhanApiException {
        return this.serve(thumbAssetId, version, thumbParams, null);
    }

	/**  Serves thumbnail by its id     */
    public String serve(String thumbAssetId, int version, BorhanThumbParams thumbParams, BorhanThumbnailServeOptions options) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("thumbAssetId", thumbAssetId);
        kparams.add("version", version);
        kparams.add("thumbParams", thumbParams);
        kparams.add("options", options);
        this.borhanClient.queueServiceCall("thumbasset", "serve", kparams);
        return this.borhanClient.serve();
    }

	/**  Tags the thumbnail as DEFAULT_THUMB and removes that tag from all other
	  thumbnail assets of the entry.   Create a new file sync link on the entry
	  thumbnail that points to the thumbnail asset file sync.     */
    public void setAsDefault(String thumbAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("thumbAssetId", thumbAssetId);
        this.borhanClient.queueServiceCall("thumbasset", "setAsDefault", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanThumbAsset generateByEntryId(String entryId, int destThumbParamsId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("destThumbParamsId", destThumbParamsId);
        this.borhanClient.queueServiceCall("thumbasset", "generateByEntryId", kparams, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAsset.class, resultXmlElement);
    }

    public BorhanThumbAsset generate(String entryId, BorhanThumbParams thumbParams) throws BorhanApiException {
        return this.generate(entryId, thumbParams, null);
    }

    public BorhanThumbAsset generate(String entryId, BorhanThumbParams thumbParams, String sourceAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("thumbParams", thumbParams);
        kparams.add("sourceAssetId", sourceAssetId);
        this.borhanClient.queueServiceCall("thumbasset", "generate", kparams, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAsset.class, resultXmlElement);
    }

    public BorhanThumbAsset regenerate(String thumbAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("thumbAssetId", thumbAssetId);
        this.borhanClient.queueServiceCall("thumbasset", "regenerate", kparams, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAsset.class, resultXmlElement);
    }

    public BorhanThumbAsset get(String thumbAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("thumbAssetId", thumbAssetId);
        this.borhanClient.queueServiceCall("thumbasset", "get", kparams, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAsset.class, resultXmlElement);
    }

    public List<BorhanThumbAsset> getByEntryId(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("thumbasset", "getByEntryId", kparams, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanThumbAsset.class, resultXmlElement);
    }

    public BorhanThumbAssetListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanThumbAssetListResponse list(BorhanAssetFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List Thumbnail Assets by filter and pager     */
    public BorhanThumbAssetListResponse list(BorhanAssetFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("thumbasset", "list", kparams, BorhanThumbAssetListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAssetListResponse.class, resultXmlElement);
    }

    public BorhanThumbAsset addFromUrl(String entryId, String url) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("url", url);
        this.borhanClient.queueServiceCall("thumbasset", "addFromUrl", kparams, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAsset.class, resultXmlElement);
    }

    public BorhanThumbAsset addFromImage(String entryId, File fileData) throws BorhanApiException {
        return this.addFromImage(entryId, new BorhanFile(fileData));
    }

    public BorhanThumbAsset addFromImage(String entryId, InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.addFromImage(entryId, new BorhanFile(fileData, fileDataName, fileDataSize));
    }

    public BorhanThumbAsset addFromImage(String entryId, FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.addFromImage(entryId, new BorhanFile(fileData, fileDataName));
    }

    public BorhanThumbAsset addFromImage(String entryId, BorhanFile fileData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        this.borhanClient.queueServiceCall("thumbasset", "addFromImage", kparams, kfiles, BorhanThumbAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanThumbAsset.class, resultXmlElement);
    }

    public void delete(String thumbAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("thumbAssetId", thumbAssetId);
        this.borhanClient.queueServiceCall("thumbasset", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public String getUrl(String id) throws BorhanApiException {
        return this.getUrl(id, Integer.MIN_VALUE);
    }

    public String getUrl(String id, int storageId) throws BorhanApiException {
        return this.getUrl(id, storageId, null);
    }

	/**  Get download URL for the asset     */
    public String getUrl(String id, int storageId, BorhanThumbParams thumbParams) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("storageId", storageId);
        kparams.add("thumbParams", thumbParams);
        this.borhanClient.queueServiceCall("thumbasset", "getUrl", kparams);
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
        this.borhanClient.queueServiceCall("thumbasset", "getRemotePaths", kparams, BorhanRemotePathListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanRemotePathListResponse.class, resultXmlElement);
    }
}
