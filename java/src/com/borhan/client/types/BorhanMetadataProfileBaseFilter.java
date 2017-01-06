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
import com.borhan.client.enums.BorhanMetadataProfileStatus;
import com.borhan.client.enums.BorhanMetadataProfileCreateMode;
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
public abstract class BorhanMetadataProfileBaseFilter extends BorhanFilter {
    public int idEqual = Integer.MIN_VALUE;
    public int partnerIdEqual = Integer.MIN_VALUE;
    public BorhanMetadataObjectType metadataObjectTypeEqual;
    public String metadataObjectTypeIn;
    public int versionEqual = Integer.MIN_VALUE;
    public String nameEqual;
    public String systemNameEqual;
    public String systemNameIn;
    public int createdAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int createdAtLessThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtLessThanOrEqual = Integer.MIN_VALUE;
    public BorhanMetadataProfileStatus statusEqual;
    public String statusIn;
    public BorhanMetadataProfileCreateMode createModeEqual;
    public BorhanMetadataProfileCreateMode createModeNotEqual;
    public String createModeIn;
    public String createModeNotIn;

    public BorhanMetadataProfileBaseFilter() {
    }

    public BorhanMetadataProfileBaseFilter(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("idEqual")) {
                this.idEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerIdEqual")) {
                this.partnerIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("metadataObjectTypeEqual")) {
                this.metadataObjectTypeEqual = BorhanMetadataObjectType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("metadataObjectTypeIn")) {
                this.metadataObjectTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("versionEqual")) {
                this.versionEqual = ParseUtils.parseInt(txt);
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
                this.statusEqual = BorhanMetadataProfileStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createModeEqual")) {
                this.createModeEqual = BorhanMetadataProfileCreateMode.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("createModeNotEqual")) {
                this.createModeNotEqual = BorhanMetadataProfileCreateMode.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("createModeIn")) {
                this.createModeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createModeNotIn")) {
                this.createModeNotIn = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanMetadataProfileBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("metadataObjectTypeEqual", this.metadataObjectTypeEqual);
        kparams.add("metadataObjectTypeIn", this.metadataObjectTypeIn);
        kparams.add("versionEqual", this.versionEqual);
        kparams.add("nameEqual", this.nameEqual);
        kparams.add("systemNameEqual", this.systemNameEqual);
        kparams.add("systemNameIn", this.systemNameIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("createModeEqual", this.createModeEqual);
        kparams.add("createModeNotEqual", this.createModeNotEqual);
        kparams.add("createModeIn", this.createModeIn);
        kparams.add("createModeNotIn", this.createModeNotIn);
        return kparams;
    }

}

