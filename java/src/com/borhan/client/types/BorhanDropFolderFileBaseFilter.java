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
import com.borhan.client.enums.BorhanDropFolderFileStatus;
import com.borhan.client.enums.BorhanDropFolderFileErrorCode;
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
public abstract class BorhanDropFolderFileBaseFilter extends BorhanFilter {
    public int idEqual = Integer.MIN_VALUE;
    public String idIn;
    public int partnerIdEqual = Integer.MIN_VALUE;
    public String partnerIdIn;
    public int dropFolderIdEqual = Integer.MIN_VALUE;
    public String dropFolderIdIn;
    public String fileNameEqual;
    public String fileNameIn;
    public String fileNameLike;
    public BorhanDropFolderFileStatus statusEqual;
    public String statusIn;
    public String statusNotIn;
    public String parsedSlugEqual;
    public String parsedSlugIn;
    public String parsedSlugLike;
    public String parsedFlavorEqual;
    public String parsedFlavorIn;
    public String parsedFlavorLike;
    public int leadDropFolderFileIdEqual = Integer.MIN_VALUE;
    public int deletedDropFolderFileIdEqual = Integer.MIN_VALUE;
    public String entryIdEqual;
    public BorhanDropFolderFileErrorCode errorCodeEqual;
    public String errorCodeIn;
    public int createdAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int createdAtLessThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtLessThanOrEqual = Integer.MIN_VALUE;

    public BorhanDropFolderFileBaseFilter() {
    }

    public BorhanDropFolderFileBaseFilter(Element node) throws BorhanApiException {
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
            } else if (nodeName.equals("partnerIdEqual")) {
                this.partnerIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerIdIn")) {
                this.partnerIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("dropFolderIdEqual")) {
                this.dropFolderIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("dropFolderIdIn")) {
                this.dropFolderIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileNameEqual")) {
                this.fileNameEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileNameIn")) {
                this.fileNameIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileNameLike")) {
                this.fileNameLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("statusEqual")) {
                this.statusEqual = BorhanDropFolderFileStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("statusNotIn")) {
                this.statusNotIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("parsedSlugEqual")) {
                this.parsedSlugEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("parsedSlugIn")) {
                this.parsedSlugIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("parsedSlugLike")) {
                this.parsedSlugLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("parsedFlavorEqual")) {
                this.parsedFlavorEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("parsedFlavorIn")) {
                this.parsedFlavorIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("parsedFlavorLike")) {
                this.parsedFlavorLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("leadDropFolderFileIdEqual")) {
                this.leadDropFolderFileIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("deletedDropFolderFileIdEqual")) {
                this.deletedDropFolderFileIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("entryIdEqual")) {
                this.entryIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("errorCodeEqual")) {
                this.errorCodeEqual = BorhanDropFolderFileErrorCode.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("errorCodeIn")) {
                this.errorCodeIn = ParseUtils.parseString(txt);
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
        kparams.add("objectType", "BorhanDropFolderFileBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("dropFolderIdEqual", this.dropFolderIdEqual);
        kparams.add("dropFolderIdIn", this.dropFolderIdIn);
        kparams.add("fileNameEqual", this.fileNameEqual);
        kparams.add("fileNameIn", this.fileNameIn);
        kparams.add("fileNameLike", this.fileNameLike);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("statusNotIn", this.statusNotIn);
        kparams.add("parsedSlugEqual", this.parsedSlugEqual);
        kparams.add("parsedSlugIn", this.parsedSlugIn);
        kparams.add("parsedSlugLike", this.parsedSlugLike);
        kparams.add("parsedFlavorEqual", this.parsedFlavorEqual);
        kparams.add("parsedFlavorIn", this.parsedFlavorIn);
        kparams.add("parsedFlavorLike", this.parsedFlavorLike);
        kparams.add("leadDropFolderFileIdEqual", this.leadDropFolderFileIdEqual);
        kparams.add("deletedDropFolderFileIdEqual", this.deletedDropFolderFileIdEqual);
        kparams.add("entryIdEqual", this.entryIdEqual);
        kparams.add("errorCodeEqual", this.errorCodeEqual);
        kparams.add("errorCodeIn", this.errorCodeIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        return kparams;
    }

}

