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
import com.borhan.client.enums.BorhanDropFolderType;
import com.borhan.client.enums.BorhanDropFolderStatus;
import com.borhan.client.enums.BorhanDropFolderFileHandlerType;
import com.borhan.client.enums.BorhanDropFolderErrorCode;
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
public abstract class BorhanDropFolderBaseFilter extends BorhanFilter {
    public int idEqual = Integer.MIN_VALUE;
    public String idIn;
    public int partnerIdEqual = Integer.MIN_VALUE;
    public String partnerIdIn;
    public String nameLike;
    public BorhanDropFolderType typeEqual;
    public String typeIn;
    public BorhanDropFolderStatus statusEqual;
    public String statusIn;
    public int conversionProfileIdEqual = Integer.MIN_VALUE;
    public String conversionProfileIdIn;
    public int dcEqual = Integer.MIN_VALUE;
    public String dcIn;
    public String pathEqual;
    public String pathLike;
    public BorhanDropFolderFileHandlerType fileHandlerTypeEqual;
    public String fileHandlerTypeIn;
    public String fileNamePatternsLike;
    public String fileNamePatternsMultiLikeOr;
    public String fileNamePatternsMultiLikeAnd;
    public String tagsLike;
    public String tagsMultiLikeOr;
    public String tagsMultiLikeAnd;
    public BorhanDropFolderErrorCode errorCodeEqual;
    public String errorCodeIn;
    public int createdAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int createdAtLessThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtLessThanOrEqual = Integer.MIN_VALUE;

    public BorhanDropFolderBaseFilter() {
    }

    public BorhanDropFolderBaseFilter(Element node) throws BorhanApiException {
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
            } else if (nodeName.equals("nameLike")) {
                this.nameLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("typeEqual")) {
                this.typeEqual = BorhanDropFolderType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("typeIn")) {
                this.typeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("statusEqual")) {
                this.statusEqual = BorhanDropFolderStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("conversionProfileIdEqual")) {
                this.conversionProfileIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("conversionProfileIdIn")) {
                this.conversionProfileIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("dcEqual")) {
                this.dcEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("dcIn")) {
                this.dcIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("pathEqual")) {
                this.pathEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("pathLike")) {
                this.pathLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileHandlerTypeEqual")) {
                this.fileHandlerTypeEqual = BorhanDropFolderFileHandlerType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("fileHandlerTypeIn")) {
                this.fileHandlerTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileNamePatternsLike")) {
                this.fileNamePatternsLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileNamePatternsMultiLikeOr")) {
                this.fileNamePatternsMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileNamePatternsMultiLikeAnd")) {
                this.fileNamePatternsMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tagsLike")) {
                this.tagsLike = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tagsMultiLikeOr")) {
                this.tagsMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tagsMultiLikeAnd")) {
                this.tagsMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("errorCodeEqual")) {
                this.errorCodeEqual = BorhanDropFolderErrorCode.get(ParseUtils.parseString(txt));
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
        kparams.add("objectType", "BorhanDropFolderBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("nameLike", this.nameLike);
        kparams.add("typeEqual", this.typeEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("conversionProfileIdEqual", this.conversionProfileIdEqual);
        kparams.add("conversionProfileIdIn", this.conversionProfileIdIn);
        kparams.add("dcEqual", this.dcEqual);
        kparams.add("dcIn", this.dcIn);
        kparams.add("pathEqual", this.pathEqual);
        kparams.add("pathLike", this.pathLike);
        kparams.add("fileHandlerTypeEqual", this.fileHandlerTypeEqual);
        kparams.add("fileHandlerTypeIn", this.fileHandlerTypeIn);
        kparams.add("fileNamePatternsLike", this.fileNamePatternsLike);
        kparams.add("fileNamePatternsMultiLikeOr", this.fileNamePatternsMultiLikeOr);
        kparams.add("fileNamePatternsMultiLikeAnd", this.fileNamePatternsMultiLikeAnd);
        kparams.add("tagsLike", this.tagsLike);
        kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
        kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
        kparams.add("errorCodeEqual", this.errorCodeEqual);
        kparams.add("errorCodeIn", this.errorCodeIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        return kparams;
    }

}

