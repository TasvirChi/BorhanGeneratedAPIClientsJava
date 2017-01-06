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
package com.borhan.client.types;

import org.w3c.dom.Element;
import com.borhan.client.BorhanParams;
import com.borhan.client.BorhanApiException;
import com.borhan.client.BorhanObjectBase;
import com.borhan.client.enums.BorhanSearchProviderType;
import com.borhan.client.enums.BorhanMediaType;
import com.borhan.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BorhanSearch extends BorhanObjectBase {
    public String keyWords;
    public BorhanSearchProviderType searchSource;
    public BorhanMediaType mediaType;
	/**  Use this field to pass dynamic data for searching   For example - if you set
	  this field to "mymovies_$partner_id"   The $partner_id will be automatically
	  replcaed with your real partner Id     */
    public String extraData;
    public String authData;

    public BorhanSearch() {
    }

    public BorhanSearch(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("keyWords")) {
                this.keyWords = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("searchSource")) {
                this.searchSource = BorhanSearchProviderType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("mediaType")) {
                this.mediaType = BorhanMediaType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("extraData")) {
                this.extraData = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("authData")) {
                this.authData = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanSearch");
        kparams.add("keyWords", this.keyWords);
        kparams.add("searchSource", this.searchSource);
        kparams.add("mediaType", this.mediaType);
        kparams.add("extraData", this.extraData);
        kparams.add("authData", this.authData);
        return kparams;
    }

}

