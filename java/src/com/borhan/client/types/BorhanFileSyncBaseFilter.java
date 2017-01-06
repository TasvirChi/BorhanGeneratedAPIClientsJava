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
import com.borhan.client.enums.BorhanFileSyncObjectType;
import com.borhan.client.enums.BorhanFileSyncStatus;
import com.borhan.client.enums.BorhanFileSyncType;
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
public abstract class BorhanFileSyncBaseFilter extends BorhanFilter {
    public int partnerIdEqual = Integer.MIN_VALUE;
    public BorhanFileSyncObjectType fileObjectTypeEqual;
    public String fileObjectTypeIn;
    public String objectIdEqual;
    public String objectIdIn;
    public String versionEqual;
    public String versionIn;
    public int objectSubTypeEqual = Integer.MIN_VALUE;
    public String objectSubTypeIn;
    public String dcEqual;
    public String dcIn;
    public int originalEqual = Integer.MIN_VALUE;
    public int createdAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int createdAtLessThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtLessThanOrEqual = Integer.MIN_VALUE;
    public int readyAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int readyAtLessThanOrEqual = Integer.MIN_VALUE;
    public int syncTimeGreaterThanOrEqual = Integer.MIN_VALUE;
    public int syncTimeLessThanOrEqual = Integer.MIN_VALUE;
    public BorhanFileSyncStatus statusEqual;
    public String statusIn;
    public BorhanFileSyncType fileTypeEqual;
    public String fileTypeIn;
    public int linkedIdEqual = Integer.MIN_VALUE;
    public int linkCountGreaterThanOrEqual = Integer.MIN_VALUE;
    public int linkCountLessThanOrEqual = Integer.MIN_VALUE;
    public double fileSizeGreaterThanOrEqual = Double.MIN_VALUE;
    public double fileSizeLessThanOrEqual = Double.MIN_VALUE;

    public BorhanFileSyncBaseFilter() {
    }

    public BorhanFileSyncBaseFilter(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("partnerIdEqual")) {
                this.partnerIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("fileObjectTypeEqual")) {
                this.fileObjectTypeEqual = BorhanFileSyncObjectType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("fileObjectTypeIn")) {
                this.fileObjectTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objectIdEqual")) {
                this.objectIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objectIdIn")) {
                this.objectIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("versionEqual")) {
                this.versionEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("versionIn")) {
                this.versionIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objectSubTypeEqual")) {
                this.objectSubTypeEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("objectSubTypeIn")) {
                this.objectSubTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("dcEqual")) {
                this.dcEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("dcIn")) {
                this.dcIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("originalEqual")) {
                this.originalEqual = ParseUtils.parseInt(txt);
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
            } else if (nodeName.equals("readyAtGreaterThanOrEqual")) {
                this.readyAtGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("readyAtLessThanOrEqual")) {
                this.readyAtLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("syncTimeGreaterThanOrEqual")) {
                this.syncTimeGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("syncTimeLessThanOrEqual")) {
                this.syncTimeLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("statusEqual")) {
                this.statusEqual = BorhanFileSyncStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileTypeEqual")) {
                this.fileTypeEqual = BorhanFileSyncType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("fileTypeIn")) {
                this.fileTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("linkedIdEqual")) {
                this.linkedIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("linkCountGreaterThanOrEqual")) {
                this.linkCountGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("linkCountLessThanOrEqual")) {
                this.linkCountLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("fileSizeGreaterThanOrEqual")) {
                this.fileSizeGreaterThanOrEqual = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("fileSizeLessThanOrEqual")) {
                this.fileSizeLessThanOrEqual = ParseUtils.parseDouble(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanFileSyncBaseFilter");
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("fileObjectTypeEqual", this.fileObjectTypeEqual);
        kparams.add("fileObjectTypeIn", this.fileObjectTypeIn);
        kparams.add("objectIdEqual", this.objectIdEqual);
        kparams.add("objectIdIn", this.objectIdIn);
        kparams.add("versionEqual", this.versionEqual);
        kparams.add("versionIn", this.versionIn);
        kparams.add("objectSubTypeEqual", this.objectSubTypeEqual);
        kparams.add("objectSubTypeIn", this.objectSubTypeIn);
        kparams.add("dcEqual", this.dcEqual);
        kparams.add("dcIn", this.dcIn);
        kparams.add("originalEqual", this.originalEqual);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("readyAtGreaterThanOrEqual", this.readyAtGreaterThanOrEqual);
        kparams.add("readyAtLessThanOrEqual", this.readyAtLessThanOrEqual);
        kparams.add("syncTimeGreaterThanOrEqual", this.syncTimeGreaterThanOrEqual);
        kparams.add("syncTimeLessThanOrEqual", this.syncTimeLessThanOrEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("fileTypeEqual", this.fileTypeEqual);
        kparams.add("fileTypeIn", this.fileTypeIn);
        kparams.add("linkedIdEqual", this.linkedIdEqual);
        kparams.add("linkCountGreaterThanOrEqual", this.linkCountGreaterThanOrEqual);
        kparams.add("linkCountLessThanOrEqual", this.linkCountLessThanOrEqual);
        kparams.add("fileSizeGreaterThanOrEqual", this.fileSizeGreaterThanOrEqual);
        kparams.add("fileSizeLessThanOrEqual", this.fileSizeLessThanOrEqual);
        return kparams;
    }

}

