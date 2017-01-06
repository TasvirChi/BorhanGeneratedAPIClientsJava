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
import com.borhan.client.enums.BorhanDropFolderFileStatus;
import com.borhan.client.enums.BorhanDropFolderType;
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
public class BorhanDropFolderFile extends BorhanObjectBase {
    public int id = Integer.MIN_VALUE;
    public int partnerId = Integer.MIN_VALUE;
    public int dropFolderId = Integer.MIN_VALUE;
    public String fileName;
    public double fileSize = Double.MIN_VALUE;
    public int fileSizeLastSetAt = Integer.MIN_VALUE;
    public BorhanDropFolderFileStatus status;
    public BorhanDropFolderType type;
    public String parsedSlug;
    public String parsedFlavor;
    public String parsedUserId;
    public int leadDropFolderFileId = Integer.MIN_VALUE;
    public int deletedDropFolderFileId = Integer.MIN_VALUE;
    public String entryId;
    public BorhanDropFolderFileErrorCode errorCode;
    public String errorDescription;
    public String lastModificationTime;
    public int createdAt = Integer.MIN_VALUE;
    public int updatedAt = Integer.MIN_VALUE;
    public int uploadStartDetectedAt = Integer.MIN_VALUE;
    public int uploadEndDetectedAt = Integer.MIN_VALUE;
    public int importStartedAt = Integer.MIN_VALUE;
    public int importEndedAt = Integer.MIN_VALUE;
    public int batchJobId = Integer.MIN_VALUE;

    public BorhanDropFolderFile() {
    }

    public BorhanDropFolderFile(Element node) throws BorhanApiException {
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
            } else if (nodeName.equals("dropFolderId")) {
                this.dropFolderId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("fileName")) {
                this.fileName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileSize")) {
                this.fileSize = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("fileSizeLastSetAt")) {
                this.fileSizeLastSetAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanDropFolderFileStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("type")) {
                this.type = BorhanDropFolderType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("parsedSlug")) {
                this.parsedSlug = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("parsedFlavor")) {
                this.parsedFlavor = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("parsedUserId")) {
                this.parsedUserId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("leadDropFolderFileId")) {
                this.leadDropFolderFileId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("deletedDropFolderFileId")) {
                this.deletedDropFolderFileId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("errorCode")) {
                this.errorCode = BorhanDropFolderFileErrorCode.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("errorDescription")) {
                this.errorDescription = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("lastModificationTime")) {
                this.lastModificationTime = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("uploadStartDetectedAt")) {
                this.uploadStartDetectedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("uploadEndDetectedAt")) {
                this.uploadEndDetectedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("importStartedAt")) {
                this.importStartedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("importEndedAt")) {
                this.importEndedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("batchJobId")) {
                this.batchJobId = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanDropFolderFile");
        kparams.add("dropFolderId", this.dropFolderId);
        kparams.add("fileName", this.fileName);
        kparams.add("fileSize", this.fileSize);
        kparams.add("parsedSlug", this.parsedSlug);
        kparams.add("parsedFlavor", this.parsedFlavor);
        kparams.add("parsedUserId", this.parsedUserId);
        kparams.add("leadDropFolderFileId", this.leadDropFolderFileId);
        kparams.add("deletedDropFolderFileId", this.deletedDropFolderFileId);
        kparams.add("entryId", this.entryId);
        kparams.add("errorCode", this.errorCode);
        kparams.add("errorDescription", this.errorDescription);
        kparams.add("lastModificationTime", this.lastModificationTime);
        kparams.add("uploadStartDetectedAt", this.uploadStartDetectedAt);
        kparams.add("uploadEndDetectedAt", this.uploadEndDetectedAt);
        kparams.add("importStartedAt", this.importStartedAt);
        kparams.add("importEndedAt", this.importEndedAt);
        return kparams;
    }

}

