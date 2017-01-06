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
import com.borhan.client.enums.BorhanMetadataObjectType;
import com.borhan.client.enums.BorhanMetadataStatus;
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
public abstract class BorhanMetadataBaseFilter extends BorhanFilter {
    public int partnerIdEqual = Integer.MIN_VALUE;
    public int metadataProfileIdEqual = Integer.MIN_VALUE;
    public int metadataProfileVersionEqual = Integer.MIN_VALUE;
    public int metadataProfileVersionGreaterThanOrEqual = Integer.MIN_VALUE;
    public int metadataProfileVersionLessThanOrEqual = Integer.MIN_VALUE;
    public BorhanMetadataObjectType metadataObjectTypeEqual;
    public String objectIdEqual;
    public String objectIdIn;
    public int versionEqual = Integer.MIN_VALUE;
    public int versionGreaterThanOrEqual = Integer.MIN_VALUE;
    public int versionLessThanOrEqual = Integer.MIN_VALUE;
    public int createdAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int createdAtLessThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtLessThanOrEqual = Integer.MIN_VALUE;
    public BorhanMetadataStatus statusEqual;
    public String statusIn;

    public BorhanMetadataBaseFilter() {
    }

    public BorhanMetadataBaseFilter(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("partnerIdEqual")) {
                this.partnerIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("metadataProfileIdEqual")) {
                this.metadataProfileIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("metadataProfileVersionEqual")) {
                this.metadataProfileVersionEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("metadataProfileVersionGreaterThanOrEqual")) {
                this.metadataProfileVersionGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("metadataProfileVersionLessThanOrEqual")) {
                this.metadataProfileVersionLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("metadataObjectTypeEqual")) {
                this.metadataObjectTypeEqual = BorhanMetadataObjectType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("objectIdEqual")) {
                this.objectIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objectIdIn")) {
                this.objectIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("versionEqual")) {
                this.versionEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("versionGreaterThanOrEqual")) {
                this.versionGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("versionLessThanOrEqual")) {
                this.versionLessThanOrEqual = ParseUtils.parseInt(txt);
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
            } else if (nodeName.equals("statusEqual")) {
                this.statusEqual = BorhanMetadataStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanMetadataBaseFilter");
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("metadataProfileIdEqual", this.metadataProfileIdEqual);
        kparams.add("metadataProfileVersionEqual", this.metadataProfileVersionEqual);
        kparams.add("metadataProfileVersionGreaterThanOrEqual", this.metadataProfileVersionGreaterThanOrEqual);
        kparams.add("metadataProfileVersionLessThanOrEqual", this.metadataProfileVersionLessThanOrEqual);
        kparams.add("metadataObjectTypeEqual", this.metadataObjectTypeEqual);
        kparams.add("objectIdEqual", this.objectIdEqual);
        kparams.add("objectIdIn", this.objectIdIn);
        kparams.add("versionEqual", this.versionEqual);
        kparams.add("versionGreaterThanOrEqual", this.versionGreaterThanOrEqual);
        kparams.add("versionLessThanOrEqual", this.versionLessThanOrEqual);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        return kparams;
    }

}

