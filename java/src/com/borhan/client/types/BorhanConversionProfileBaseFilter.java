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
import com.borhan.client.enums.BorhanConversionProfileStatus;
import com.borhan.client.enums.BorhanConversionProfileType;
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
public abstract class BorhanConversionProfileBaseFilter extends BorhanFilter {
    public int idEqual = Integer.MIN_VALUE;
    public String idIn;
    public BorhanConversionProfileStatus statusEqual;
    public String statusIn;
    public BorhanConversionProfileType typeEqual;
    public String typeIn;
    public String nameEqual;
    public String systemNameEqual;
    public String systemNameIn;
    public String tagsMultiLikeOr;
    public String tagsMultiLikeAnd;
    public String defaultEntryIdEqual;
    public String defaultEntryIdIn;

    public BorhanConversionProfileBaseFilter() {
    }

    public BorhanConversionProfileBaseFilter(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("idEqual")) {
                this.idEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("idIn")) {
                this.idIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("statusEqual")) {
                this.statusEqual = BorhanConversionProfileStatus.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("typeEqual")) {
                this.typeEqual = BorhanConversionProfileType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("typeIn")) {
                this.typeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("nameEqual")) {
                this.nameEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("systemNameEqual")) {
                this.systemNameEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("systemNameIn")) {
                this.systemNameIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tagsMultiLikeOr")) {
                this.tagsMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tagsMultiLikeAnd")) {
                this.tagsMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("defaultEntryIdEqual")) {
                this.defaultEntryIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("defaultEntryIdIn")) {
                this.defaultEntryIdIn = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanConversionProfileBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("typeEqual", this.typeEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("nameEqual", this.nameEqual);
        kparams.add("systemNameEqual", this.systemNameEqual);
        kparams.add("systemNameIn", this.systemNameIn);
        kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
        kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
        kparams.add("defaultEntryIdEqual", this.defaultEntryIdEqual);
        kparams.add("defaultEntryIdIn", this.defaultEntryIdIn);
        return kparams;
    }

}

