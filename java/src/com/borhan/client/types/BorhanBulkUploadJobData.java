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
import com.borhan.client.enums.BorhanBulkUploadObjectType;
import com.borhan.client.enums.BorhanBulkUploadType;
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
public class BorhanBulkUploadJobData extends BorhanJobData {
    public String userId;
	/**  The screen name of the user     */
    public String uploadedBy;
	/**  Selected profile id for all bulk entries     */
    public int conversionProfileId = Integer.MIN_VALUE;
	/**  Created by the API     */
    public String resultsFileLocalPath;
	/**  Created by the API     */
    public String resultsFileUrl;
	/**  Number of created entries     */
    public int numOfEntries = Integer.MIN_VALUE;
	/**  Number of created objects     */
    public int numOfObjects = Integer.MIN_VALUE;
	/**  The bulk upload file path     */
    public String filePath;
	/**  Type of object for bulk upload     */
    public BorhanBulkUploadObjectType bulkUploadObjectType;
	/**  Friendly name of the file, used to be recognized later in the logs.     */
    public String fileName;
	/**  Data pertaining to the objects being uploaded     */
    public BorhanBulkUploadObjectData objectData;
	/**  Type of bulk upload     */
    public BorhanBulkUploadType type;
	/**  Recipients of the email for bulk upload success/failure     */
    public String emailRecipients;
	/**  Number of objects that finished on error status     */
    public int numOfErrorObjects = Integer.MIN_VALUE;

    public BorhanBulkUploadJobData() {
    }

    public BorhanBulkUploadJobData(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("userId")) {
                this.userId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("uploadedBy")) {
                this.uploadedBy = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("conversionProfileId")) {
                this.conversionProfileId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("resultsFileLocalPath")) {
                this.resultsFileLocalPath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("resultsFileUrl")) {
                this.resultsFileUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("numOfEntries")) {
                this.numOfEntries = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("numOfObjects")) {
                this.numOfObjects = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("filePath")) {
                this.filePath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("bulkUploadObjectType")) {
                this.bulkUploadObjectType = BorhanBulkUploadObjectType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("fileName")) {
                this.fileName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objectData")) {
                this.objectData = ParseUtils.parseObject(BorhanBulkUploadObjectData.class, aNode);
                continue;
            } else if (nodeName.equals("type")) {
                this.type = BorhanBulkUploadType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("emailRecipients")) {
                this.emailRecipients = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("numOfErrorObjects")) {
                this.numOfErrorObjects = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanBulkUploadJobData");
        kparams.add("fileName", this.fileName);
        kparams.add("emailRecipients", this.emailRecipients);
        kparams.add("numOfErrorObjects", this.numOfErrorObjects);
        return kparams;
    }

}

