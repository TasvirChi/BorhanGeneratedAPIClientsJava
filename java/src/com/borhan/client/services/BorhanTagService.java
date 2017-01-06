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

/**  Search object tags    */
@SuppressWarnings("serial")
public class BorhanTagService extends BorhanServiceBase {
    public BorhanTagService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanTagListResponse search(BorhanTagFilter tagFilter) throws BorhanApiException {
        return this.search(tagFilter, null);
    }

    public BorhanTagListResponse search(BorhanTagFilter tagFilter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("tagFilter", tagFilter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("tagsearch_tag", "search", kparams, BorhanTagListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanTagListResponse.class, resultXmlElement);
    }

	/**  Action goes over all tags with instanceCount==0 and checks whether they need to
	  be removed from the DB. Returns number of removed tags.        */
    public int deletePending() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("tagsearch_tag", "deletePending", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

    public void indexCategoryEntryTags(int categoryId, String pcToDecrement, String pcToIncrement) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("categoryId", categoryId);
        kparams.add("pcToDecrement", pcToDecrement);
        kparams.add("pcToIncrement", pcToIncrement);
        this.borhanClient.queueServiceCall("tagsearch_tag", "indexCategoryEntryTags", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
