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
import com.borhan.client.enums.BorhanBatchJobStatus;
import com.borhan.client.enums.BorhanBulkUploadType;
import com.borhan.client.enums.BorhanBatchJobErrorTypes;
import com.borhan.client.enums.BorhanBulkUploadObjectType;
import java.util.ArrayList;
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
public class BorhanBulkUpload extends BorhanObjectBase {
    public long id = Long.MIN_VALUE;
    public String uploadedBy;
    public String uploadedByUserId;
    public int uploadedOn = Integer.MIN_VALUE;
    public int numOfEntries = Integer.MIN_VALUE;
    public BorhanBatchJobStatus status;
    public String logFileUrl;
    public String csvFileUrl;
    public String bulkFileUrl;
    public BorhanBulkUploadType bulkUploadType;
    public ArrayList<BorhanBulkUploadResult> results;
    public String error;
    public BorhanBatchJobErrorTypes errorType;
    public int errorNumber = Integer.MIN_VALUE;
    public String fileName;
    public String description;
    public int numOfObjects = Integer.MIN_VALUE;
    public BorhanBulkUploadObjectType bulkUploadObjectType;

    public BorhanBulkUpload() {
    }

    public BorhanBulkUpload(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseBigint(txt);
                continue;
            } else if (nodeName.equals("uploadedBy")) {
                this.uploadedBy = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("uploadedByUserId")) {
                this.uploadedByUserId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("uploadedOn")) {
                this.uploadedOn = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("numOfEntries")) {
                this.numOfEntries = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanBatchJobStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("logFileUrl")) {
                this.logFileUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("csvFileUrl")) {
                this.csvFileUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("bulkFileUrl")) {
                this.bulkFileUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("bulkUploadType")) {
                this.bulkUploadType = BorhanBulkUploadType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("results")) {
                this.results = ParseUtils.parseArray(BorhanBulkUploadResult.class, aNode);
                continue;
            } else if (nodeName.equals("error")) {
                this.error = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("errorType")) {
                this.errorType = BorhanBatchJobErrorTypes.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("errorNumber")) {
                this.errorNumber = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("fileName")) {
                this.fileName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("numOfObjects")) {
                this.numOfObjects = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("bulkUploadObjectType")) {
                this.bulkUploadObjectType = BorhanBulkUploadObjectType.get(ParseUtils.parseString(txt));
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanBulkUpload");
        kparams.add("id", this.id);
        kparams.add("uploadedBy", this.uploadedBy);
        kparams.add("uploadedByUserId", this.uploadedByUserId);
        kparams.add("uploadedOn", this.uploadedOn);
        kparams.add("numOfEntries", this.numOfEntries);
        kparams.add("status", this.status);
        kparams.add("logFileUrl", this.logFileUrl);
        kparams.add("csvFileUrl", this.csvFileUrl);
        kparams.add("bulkFileUrl", this.bulkFileUrl);
        kparams.add("bulkUploadType", this.bulkUploadType);
        kparams.add("results", this.results);
        kparams.add("error", this.error);
        kparams.add("errorType", this.errorType);
        kparams.add("errorNumber", this.errorNumber);
        kparams.add("fileName", this.fileName);
        kparams.add("description", this.description);
        kparams.add("numOfObjects", this.numOfObjects);
        kparams.add("bulkUploadObjectType", this.bulkUploadObjectType);
        return kparams;
    }

}

