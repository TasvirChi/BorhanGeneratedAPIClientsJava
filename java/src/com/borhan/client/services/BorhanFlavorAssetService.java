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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Retrieve information and invoke actions on Flavor Asset    */
@SuppressWarnings("serial")
public class BorhanFlavorAssetService extends BorhanServiceBase {
    public BorhanFlavorAssetService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add flavor asset        */
    public BorhanFlavorAsset add(String entryId, BorhanFlavorAsset flavorAsset) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("flavorAsset", flavorAsset);
        this.borhanClient.queueServiceCall("flavorasset", "add", kparams, BorhanFlavorAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorAsset.class, resultXmlElement);
    }

	/**  Update flavor asset        */
    public BorhanFlavorAsset update(String id, BorhanFlavorAsset flavorAsset) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("flavorAsset", flavorAsset);
        this.borhanClient.queueServiceCall("flavorasset", "update", kparams, BorhanFlavorAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorAsset.class, resultXmlElement);
    }

	/**  Update content of flavor asset        */
    public BorhanFlavorAsset setContent(String id, BorhanContentResource contentResource) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);
        this.borhanClient.queueServiceCall("flavorasset", "setContent", kparams, BorhanFlavorAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorAsset.class, resultXmlElement);
    }

	/**  Get Flavor Asset by ID     */
    public BorhanFlavorAsset get(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("flavorasset", "get", kparams, BorhanFlavorAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorAsset.class, resultXmlElement);
    }

	/**  Get Flavor Assets for Entry     */
    public List<BorhanFlavorAsset> getByEntryId(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("flavorasset", "getByEntryId", kparams, BorhanFlavorAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanFlavorAsset.class, resultXmlElement);
    }

    public BorhanFlavorAssetListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanFlavorAssetListResponse list(BorhanAssetFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List Flavor Assets by filter and pager     */
    public BorhanFlavorAssetListResponse list(BorhanAssetFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("flavorasset", "list", kparams, BorhanFlavorAssetListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorAssetListResponse.class, resultXmlElement);
    }

	/**  Get web playable Flavor Assets for Entry     */
    public List<BorhanFlavorAsset> getWebPlayableByEntryId(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("flavorasset", "getWebPlayableByEntryId", kparams, BorhanFlavorAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanFlavorAsset.class, resultXmlElement);
    }

    public void convert(String entryId, int flavorParamsId) throws BorhanApiException {
        this.convert(entryId, flavorParamsId, 0);
    }

	/**  Add and convert new Flavor Asset for Entry with specific Flavor Params     */
    public void convert(String entryId, int flavorParamsId, int priority) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("flavorParamsId", flavorParamsId);
        kparams.add("priority", priority);
        this.borhanClient.queueServiceCall("flavorasset", "convert", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Reconvert Flavor Asset by ID     */
    public void reconvert(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("flavorasset", "reconvert", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Delete Flavor Asset by ID     */
    public void delete(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("flavorasset", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public String getUrl(String id) throws BorhanApiException {
        return this.getUrl(id, Integer.MIN_VALUE);
    }

    public String getUrl(String id, int storageId) throws BorhanApiException {
        return this.getUrl(id, storageId, false);
    }

	/**  Get download URL for the asset     */
    public String getUrl(String id, int storageId, boolean forceProxy) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("storageId", storageId);
        kparams.add("forceProxy", forceProxy);
        this.borhanClient.queueServiceCall("flavorasset", "getUrl", kparams);
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
        this.borhanClient.queueServiceCall("flavorasset", "getRemotePaths", kparams, BorhanRemotePathListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanRemotePathListResponse.class, resultXmlElement);
    }

    public String getDownloadUrl(String id) throws BorhanApiException {
        return this.getDownloadUrl(id, false);
    }

	/**  Get download URL for the Flavor Asset     */
    public String getDownloadUrl(String id, boolean useCdn) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("useCdn", useCdn);
        this.borhanClient.queueServiceCall("flavorasset", "getDownloadUrl", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  Get Flavor Asset with the relevant Flavor Params (Flavor Params can exist
	  without Flavor Asset & vice versa)     */
    public List<BorhanFlavorAssetWithParams> getFlavorAssetsWithParams(String entryId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        this.borhanClient.queueServiceCall("flavorasset", "getFlavorAssetsWithParams", kparams, BorhanFlavorAssetWithParams.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanFlavorAssetWithParams.class, resultXmlElement);
    }

	/**  manually export an asset     */
    public BorhanFlavorAsset export(String assetId, int storageProfileId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("assetId", assetId);
        kparams.add("storageProfileId", storageProfileId);
        this.borhanClient.queueServiceCall("flavorasset", "export", kparams, BorhanFlavorAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorAsset.class, resultXmlElement);
    }

	/**  Set a given flavor as the original flavor     */
    public void setAsSource(String assetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("assetId", assetId);
        this.borhanClient.queueServiceCall("flavorasset", "setAsSource", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  delete all local file syncs for this asset     */
    public void deleteLocalContent(String assetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("assetId", assetId);
        this.borhanClient.queueServiceCall("flavorasset", "deleteLocalContent", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
