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

/**  Add & Manage Caption Params    */
@SuppressWarnings("serial")
public class BorhanCaptionParamsService extends BorhanServiceBase {
    public BorhanCaptionParamsService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new Caption Params     */
    public BorhanCaptionParams add(BorhanCaptionParams captionParams) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("captionParams", captionParams);
        this.borhanClient.queueServiceCall("caption_captionparams", "add", kparams, BorhanCaptionParams.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCaptionParams.class, resultXmlElement);
    }

	/**  Get Caption Params by ID     */
    public BorhanCaptionParams get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("caption_captionparams", "get", kparams, BorhanCaptionParams.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCaptionParams.class, resultXmlElement);
    }

	/**  Update Caption Params by ID     */
    public BorhanCaptionParams update(int id, BorhanCaptionParams captionParams) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("captionParams", captionParams);
        this.borhanClient.queueServiceCall("caption_captionparams", "update", kparams, BorhanCaptionParams.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCaptionParams.class, resultXmlElement);
    }

	/**  Delete Caption Params by ID     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("caption_captionparams", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanCaptionParamsListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanCaptionParamsListResponse list(BorhanCaptionParamsFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List Caption Params by filter with paging support (By default - all system
	  default params will be listed too)     */
    public BorhanCaptionParamsListResponse list(BorhanCaptionParamsFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("caption_captionparams", "list", kparams, BorhanCaptionParamsListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCaptionParamsListResponse.class, resultXmlElement);
    }
}
