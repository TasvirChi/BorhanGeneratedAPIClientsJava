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

/**  Flavor Params Output service    */
@SuppressWarnings("serial")
public class BorhanFlavorParamsOutputService extends BorhanServiceBase {
    public BorhanFlavorParamsOutputService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Get flavor params output object by ID     */
    public BorhanFlavorParamsOutput get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("flavorparamsoutput", "get", kparams, BorhanFlavorParamsOutput.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorParamsOutput.class, resultXmlElement);
    }

    public BorhanFlavorParamsOutputListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanFlavorParamsOutputListResponse list(BorhanFlavorParamsOutputFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List flavor params output objects by filter and pager     */
    public BorhanFlavorParamsOutputListResponse list(BorhanFlavorParamsOutputFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("flavorparamsoutput", "list", kparams, BorhanFlavorParamsOutputListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanFlavorParamsOutputListResponse.class, resultXmlElement);
    }
}
