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
import com.borhan.client.enums.BorhanDropFolderType;
import com.borhan.client.enums.BorhanDropFolderStatus;
import com.borhan.client.enums.BorhanDropFolderFileDeletePolicy;
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
public class BorhanDropFolder extends BorhanObjectBase {
    public int id = Integer.MIN_VALUE;
    public int partnerId = Integer.MIN_VALUE;
    public String name;
    public String description;
    public BorhanDropFolderType type;
    public BorhanDropFolderStatus status;
    public int conversionProfileId = Integer.MIN_VALUE;
    public int dc = Integer.MIN_VALUE;
    public String path;
	/**  The ammount of time, in seconds, that should pass so that a file with no change
	  in size we'll be treated as "finished uploading to folder"     */
    public int fileSizeCheckInterval = Integer.MIN_VALUE;
    public BorhanDropFolderFileDeletePolicy fileDeletePolicy;
    public int autoFileDeleteDays = Integer.MIN_VALUE;
    public BorhanDropFolderFileHandlerType fileHandlerType;
    public String fileNamePatterns;
    public BorhanDropFolderFileHandlerConfig fileHandlerConfig;
    public String tags;
    public BorhanDropFolderErrorCode errorCode;
    public String errorDescription;
    public String ignoreFileNamePatterns;
    public int createdAt = Integer.MIN_VALUE;
    public int updatedAt = Integer.MIN_VALUE;
    public int lastAccessedAt = Integer.MIN_VALUE;
    public boolean incremental;
    public int lastFileTimestamp = Integer.MIN_VALUE;
    public int metadataProfileId = Integer.MIN_VALUE;
    public String categoriesMetadataFieldName;
    public boolean enforceEntitlement;
    public boolean shouldValidateKS;

    public BorhanDropFolder() {
    }

    public BorhanDropFolder(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("name")) {
                this.name = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("type")) {
                this.type = BorhanDropFolderType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanDropFolderStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("conversionProfileId")) {
                this.conversionProfileId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("dc")) {
                this.dc = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("path")) {
                this.path = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileSizeCheckInterval")) {
                this.fileSizeCheckInterval = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("fileDeletePolicy")) {
                this.fileDeletePolicy = BorhanDropFolderFileDeletePolicy.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("autoFileDeleteDays")) {
                this.autoFileDeleteDays = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("fileHandlerType")) {
                this.fileHandlerType = BorhanDropFolderFileHandlerType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("fileNamePatterns")) {
                this.fileNamePatterns = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileHandlerConfig")) {
                this.fileHandlerConfig = ParseUtils.parseObject(BorhanDropFolderFileHandlerConfig.class, aNode);
                continue;
            } else if (nodeName.equals("tags")) {
                this.tags = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("errorCode")) {
                this.errorCode = BorhanDropFolderErrorCode.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("errorDescription")) {
                this.errorDescription = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("ignoreFileNamePatterns")) {
                this.ignoreFileNamePatterns = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("lastAccessedAt")) {
                this.lastAccessedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("incremental")) {
                this.incremental = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("lastFileTimestamp")) {
                this.lastFileTimestamp = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("metadataProfileId")) {
                this.metadataProfileId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("categoriesMetadataFieldName")) {
                this.categoriesMetadataFieldName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("enforceEntitlement")) {
                this.enforceEntitlement = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("shouldValidateKS")) {
                this.shouldValidateKS = ParseUtils.parseBool(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanDropFolder");
        kparams.add("partnerId", this.partnerId);
        kparams.add("name", this.name);
        kparams.add("description", this.description);
        kparams.add("type", this.type);
        kparams.add("status", this.status);
        kparams.add("conversionProfileId", this.conversionProfileId);
        kparams.add("dc", this.dc);
        kparams.add("path", this.path);
        kparams.add("fileSizeCheckInterval", this.fileSizeCheckInterval);
        kparams.add("fileDeletePolicy", this.fileDeletePolicy);
        kparams.add("autoFileDeleteDays", this.autoFileDeleteDays);
        kparams.add("fileHandlerType", this.fileHandlerType);
        kparams.add("fileNamePatterns", this.fileNamePatterns);
        kparams.add("fileHandlerConfig", this.fileHandlerConfig);
        kparams.add("tags", this.tags);
        kparams.add("errorCode", this.errorCode);
        kparams.add("errorDescription", this.errorDescription);
        kparams.add("ignoreFileNamePatterns", this.ignoreFileNamePatterns);
        kparams.add("lastAccessedAt", this.lastAccessedAt);
        kparams.add("incremental", this.incremental);
        kparams.add("lastFileTimestamp", this.lastFileTimestamp);
        kparams.add("metadataProfileId", this.metadataProfileId);
        kparams.add("categoriesMetadataFieldName", this.categoriesMetadataFieldName);
        kparams.add("enforceEntitlement", this.enforceEntitlement);
        kparams.add("shouldValidateKS", this.shouldValidateKS);
        return kparams;
    }

}

