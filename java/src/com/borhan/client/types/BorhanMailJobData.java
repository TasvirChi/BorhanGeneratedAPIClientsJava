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
import com.borhan.client.enums.BorhanMailType;
import com.borhan.client.enums.BorhanMailJobStatus;
import com.borhan.client.enums.BorhanLanguageCode;
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
public class BorhanMailJobData extends BorhanJobData {
    public BorhanMailType mailType;
    public int mailPriority = Integer.MIN_VALUE;
    public BorhanMailJobStatus status;
    public String recipientName;
    public String recipientEmail;
	/**  kuserId       */
    public int recipientId = Integer.MIN_VALUE;
    public String fromName;
    public String fromEmail;
    public String bodyParams;
    public String subjectParams;
    public String templatePath;
    public BorhanLanguageCode language;
    public int campaignId = Integer.MIN_VALUE;
    public int minSendDate = Integer.MIN_VALUE;
    public boolean isHtml;
    public String separator;

    public BorhanMailJobData() {
    }

    public BorhanMailJobData(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("mailType")) {
                this.mailType = BorhanMailType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("mailPriority")) {
                this.mailPriority = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanMailJobStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("recipientName")) {
                this.recipientName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("recipientEmail")) {
                this.recipientEmail = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("recipientId")) {
                this.recipientId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("fromName")) {
                this.fromName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fromEmail")) {
                this.fromEmail = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("bodyParams")) {
                this.bodyParams = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("subjectParams")) {
                this.subjectParams = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("templatePath")) {
                this.templatePath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("language")) {
                this.language = BorhanLanguageCode.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("campaignId")) {
                this.campaignId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("minSendDate")) {
                this.minSendDate = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("isHtml")) {
                this.isHtml = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("separator")) {
                this.separator = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanMailJobData");
        kparams.add("mailType", this.mailType);
        kparams.add("mailPriority", this.mailPriority);
        kparams.add("status", this.status);
        kparams.add("recipientName", this.recipientName);
        kparams.add("recipientEmail", this.recipientEmail);
        kparams.add("recipientId", this.recipientId);
        kparams.add("fromName", this.fromName);
        kparams.add("fromEmail", this.fromEmail);
        kparams.add("bodyParams", this.bodyParams);
        kparams.add("subjectParams", this.subjectParams);
        kparams.add("templatePath", this.templatePath);
        kparams.add("language", this.language);
        kparams.add("campaignId", this.campaignId);
        kparams.add("minSendDate", this.minSendDate);
        kparams.add("isHtml", this.isHtml);
        kparams.add("separator", this.separator);
        return kparams;
    }

}

