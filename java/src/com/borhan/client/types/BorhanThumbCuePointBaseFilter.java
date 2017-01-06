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
import com.borhan.client.enums.BorhanThumbCuePointSubType;
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
public abstract class BorhanThumbCuePointBaseFilter extends BorhanCuePointFilter {
    public String descriptionLike;
    public String descriptionMultiLikeOr;
    public String descriptionMultiLikeAnd;
    public String titleLike;
    public String titleMultiLikeOr;
    public String titleMultiLikeAnd;
    public BorhanThumbCuePointSubType subTypeEqual;
    public String subTypeIn;

    public BorhanThumbCuePointBaseFilter() {
    }

    public BorhanThumbCuePointBaseFilter(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("descriptionLike")) {
                this.descriptionLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("descriptionMultiLikeOr")) {
                this.descriptionMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("descriptionMultiLikeAnd")) {
                this.descriptionMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("titleLike")) {
                this.titleLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("titleMultiLikeOr")) {
                this.titleMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("titleMultiLikeAnd")) {
                this.titleMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("subTypeEqual")) {
                this.subTypeEqual = BorhanThumbCuePointSubType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("subTypeIn")) {
                this.subTypeIn = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanThumbCuePointBaseFilter");
        kparams.add("descriptionLike", this.descriptionLike);
        kparams.add("descriptionMultiLikeOr", this.descriptionMultiLikeOr);
        kparams.add("descriptionMultiLikeAnd", this.descriptionMultiLikeAnd);
        kparams.add("titleLike", this.titleLike);
        kparams.add("titleMultiLikeOr", this.titleMultiLikeOr);
        kparams.add("titleMultiLikeAnd", this.titleMultiLikeAnd);
        kparams.add("subTypeEqual", this.subTypeEqual);
        kparams.add("subTypeIn", this.subTypeIn);
        return kparams;
    }

}

