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
import com.borhan.client.enums.BorhanUserStatus;
import com.borhan.client.enums.BorhanNullableBoolean;
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
public abstract class BorhanUserBaseFilter extends BorhanFilter {
    public int partnerIdEqual = Integer.MIN_VALUE;
    public String screenNameLike;
    public String screenNameStartsWith;
    public String emailLike;
    public String emailStartsWith;
    public String tagsMultiLikeOr;
    public String tagsMultiLikeAnd;
    public BorhanUserStatus statusEqual;
    public String statusIn;
    public int createdAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int createdAtLessThanOrEqual = Integer.MIN_VALUE;
    public String firstNameStartsWith;
    public String lastNameStartsWith;
    public BorhanNullableBoolean isAdminEqual;

    public BorhanUserBaseFilter() {
    }

    public BorhanUserBaseFilter(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("partnerIdEqual")) {
                this.partnerIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("screenNameLike")) {
                this.screenNameLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("screenNameStartsWith")) {
                this.screenNameStartsWith = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("emailLike")) {
                this.emailLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("emailStartsWith")) {
                this.emailStartsWith = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tagsMultiLikeOr")) {
                this.tagsMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tagsMultiLikeAnd")) {
                this.tagsMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("statusEqual")) {
                this.statusEqual = BorhanUserStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createdAtGreaterThanOrEqual")) {
                this.createdAtGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAtLessThanOrEqual")) {
                this.createdAtLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("firstNameStartsWith")) {
                this.firstNameStartsWith = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("lastNameStartsWith")) {
                this.lastNameStartsWith = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("isAdminEqual")) {
                this.isAdminEqual = BorhanNullableBoolean.get(ParseUtils.parseInt(txt));
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanUserBaseFilter");
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("screenNameLike", this.screenNameLike);
        kparams.add("screenNameStartsWith", this.screenNameStartsWith);
        kparams.add("emailLike", this.emailLike);
        kparams.add("emailStartsWith", this.emailStartsWith);
        kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
        kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("firstNameStartsWith", this.firstNameStartsWith);
        kparams.add("lastNameStartsWith", this.lastNameStartsWith);
        kparams.add("isAdminEqual", this.isAdminEqual);
        return kparams;
    }

}

