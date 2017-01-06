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
import com.borhan.client.enums.BorhanPermissionType;
import com.borhan.client.enums.BorhanPermissionStatus;
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
public abstract class BorhanPermissionBaseFilter extends BorhanFilter {
    public int idEqual = Integer.MIN_VALUE;
    public String idIn;
    public BorhanPermissionType typeEqual;
    public String typeIn;
    public String nameEqual;
    public String nameIn;
    public String friendlyNameLike;
    public String descriptionLike;
    public BorhanPermissionStatus statusEqual;
    public String statusIn;
    public int partnerIdEqual = Integer.MIN_VALUE;
    public String partnerIdIn;
    public String dependsOnPermissionNamesMultiLikeOr;
    public String dependsOnPermissionNamesMultiLikeAnd;
    public String tagsMultiLikeOr;
    public String tagsMultiLikeAnd;
    public int createdAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int createdAtLessThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtLessThanOrEqual = Integer.MIN_VALUE;

    public BorhanPermissionBaseFilter() {
    }

    public BorhanPermissionBaseFilter(Element node) throws BorhanApiException {
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
            } else if (nodeName.equals("typeEqual")) {
                this.typeEqual = BorhanPermissionType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("typeIn")) {
                this.typeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("nameEqual")) {
                this.nameEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("nameIn")) {
                this.nameIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("friendlyNameLike")) {
                this.friendlyNameLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("descriptionLike")) {
                this.descriptionLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("statusEqual")) {
                this.statusEqual = BorhanPermissionStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerIdEqual")) {
                this.partnerIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerIdIn")) {
                this.partnerIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("dependsOnPermissionNamesMultiLikeOr")) {
                this.dependsOnPermissionNamesMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("dependsOnPermissionNamesMultiLikeAnd")) {
                this.dependsOnPermissionNamesMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tagsMultiLikeOr")) {
                this.tagsMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tagsMultiLikeAnd")) {
                this.tagsMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createdAtGreaterThanOrEqual")) {
                this.createdAtGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAtLessThanOrEqual")) {
                this.createdAtLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAtGreaterThanOrEqual")) {
                this.updatedAtGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAtLessThanOrEqual")) {
                this.updatedAtLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanPermissionBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("typeEqual", this.typeEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("nameEqual", this.nameEqual);
        kparams.add("nameIn", this.nameIn);
        kparams.add("friendlyNameLike", this.friendlyNameLike);
        kparams.add("descriptionLike", this.descriptionLike);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("dependsOnPermissionNamesMultiLikeOr", this.dependsOnPermissionNamesMultiLikeOr);
        kparams.add("dependsOnPermissionNamesMultiLikeAnd", this.dependsOnPermissionNamesMultiLikeAnd);
        kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
        kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        return kparams;
    }

}

