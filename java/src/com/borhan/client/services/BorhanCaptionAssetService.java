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

/**  Retrieve information and invoke actions on caption Asset    */
@SuppressWarnings("serial")
public class BorhanCaptionAssetService extends BorhanServiceBase {
    public BorhanCaptionAssetService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add caption asset        */
    public BorhanCaptionAsset add(String entryId, BorhanCaptionAsset captionAsset) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("captionAsset", captionAsset);
        this.borhanClient.queueServiceCall("caption_captionasset", "add", kparams, BorhanCaptionAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCaptionAsset.class, resultXmlElement);
    }

	/**  Update content of caption asset        */
    public BorhanCaptionAsset setContent(String id, BorhanContentResource contentResource) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);
        this.borhanClient.queueServiceCall("caption_captionasset", "setContent", kparams, BorhanCaptionAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCaptionAsset.class, resultXmlElement);
    }

	/**  Update caption asset        */
    public BorhanCaptionAsset update(String id, BorhanCaptionAsset captionAsset) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("captionAsset", captionAsset);
        this.borhanClient.queueServiceCall("caption_captionasset", "update", kparams, BorhanCaptionAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCaptionAsset.class, resultXmlElement);
    }

    public String serveByEntryId(String entryId) throws BorhanApiException {
        return this.serveByEntryId(entryId, Integer.MIN_VALUE);
    }

	/**  Serves caption by entry id and thumnail params id     */
    public String serveByEntryId(String entryId, int captionParamId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("entryId", entryId);
        kparams.add("captionParamId", captionParamId);
        this.borhanClient.queueServiceCall("caption_captionasset", "serveByEntryId", kparams);
        return this.borhanClient.serve();
    }

    public String getUrl(String id) throws BorhanApiException {
        return this.getUrl(id, Integer.MIN_VALUE);
    }

	/**  Get download URL for the asset     */
    public String getUrl(String id, int storageId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("storageId", storageId);
        this.borhanClient.queueServiceCall("caption_captionasset", "getUrl", kparams);
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
        this.borhanClient.queueServiceCall("caption_captionasset", "getRemotePaths", kparams, BorhanRemotePathListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanRemotePathListResponse.class, resultXmlElement);
    }

	/**  Serves caption by its id     */
    public String serve(String captionAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("captionAssetId", captionAssetId);
        this.borhanClient.queueServiceCall("caption_captionasset", "serve", kparams);
        return this.borhanClient.serve();
    }

    public String serveWebVTT(String captionAssetId) throws BorhanApiException {
        return this.serveWebVTT(captionAssetId, 30);
    }

    public String serveWebVTT(String captionAssetId, int segmentDuration) throws BorhanApiException {
        return this.serveWebVTT(captionAssetId, segmentDuration, Integer.MIN_VALUE);
    }

    public String serveWebVTT(String captionAssetId, int segmentDuration, int segmentIndex) throws BorhanApiException {
        return this.serveWebVTT(captionAssetId, segmentDuration, segmentIndex, 10000);
    }

	/**  Serves caption by its id converting it to segmented WebVTT     */
    public String serveWebVTT(String captionAssetId, int segmentDuration, int segmentIndex, int localTimestamp) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("captionAssetId", captionAssetId);
        kparams.add("segmentDuration", segmentDuration);
        kparams.add("segmentIndex", segmentIndex);
        kparams.add("localTimestamp", localTimestamp);
        this.borhanClient.queueServiceCall("caption_captionasset", "serveWebVTT", kparams);
        return this.borhanClient.serve();
    }

	/**  Markss the caption as default and removes that mark from all other caption
	  assets of the entry.     */
    public void setAsDefault(String captionAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("captionAssetId", captionAssetId);
        this.borhanClient.queueServiceCall("caption_captionasset", "setAsDefault", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanCaptionAsset get(String captionAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("captionAssetId", captionAssetId);
        this.borhanClient.queueServiceCall("caption_captionasset", "get", kparams, BorhanCaptionAsset.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCaptionAsset.class, resultXmlElement);
    }

    public BorhanCaptionAssetListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanCaptionAssetListResponse list(BorhanAssetFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List caption Assets by filter and pager     */
    public BorhanCaptionAssetListResponse list(BorhanAssetFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("caption_captionasset", "list", kparams, BorhanCaptionAssetListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCaptionAssetListResponse.class, resultXmlElement);
    }

    public void delete(String captionAssetId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("captionAssetId", captionAssetId);
        this.borhanClient.queueServiceCall("caption_captionasset", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
