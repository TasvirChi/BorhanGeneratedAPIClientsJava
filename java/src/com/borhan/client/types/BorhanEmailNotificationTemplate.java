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
import com.borhan.client.enums.BorhanEmailNotificationFormat;
import com.borhan.client.enums.BorhanEmailNotificationTemplatePriority;
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
public class BorhanEmailNotificationTemplate extends BorhanEventNotificationTemplate {
	/**  Define the email body format     */
    public BorhanEmailNotificationFormat format;
	/**  Define the email subject      */
    public String subject;
	/**  Define the email body content     */
    public String body;
	/**  Define the email sender email     */
    public String fromEmail;
	/**  Define the email sender name     */
    public String fromName;
	/**  Email recipient emails and names     */
    public BorhanEmailNotificationRecipientProvider to;
	/**  Email recipient emails and names     */
    public BorhanEmailNotificationRecipientProvider cc;
	/**  Email recipient emails and names     */
    public BorhanEmailNotificationRecipientProvider bcc;
	/**  Default email addresses to whom the reply should be sent.      */
    public BorhanEmailNotificationRecipientProvider replyTo;
	/**  Define the email priority     */
    public BorhanEmailNotificationTemplatePriority priority;
	/**  Email address that a reading confirmation will be sent     */
    public String confirmReadingTo;
	/**  Hostname to use in Message-Id and Received headers and as default HELLO string. 
	    If empty, the value returned by SERVER_NAME is used or
	  'localhost.localdomain'.     */
    public String hostname;
	/**  Sets the message ID to be used in the Message-Id header.   If empty, a unique id
	  will be generated.     */
    public String messageID;
	/**  Adds a e-mail custom header     */
    public ArrayList<BorhanKeyValue> customHeaders;

    public BorhanEmailNotificationTemplate() {
    }

    public BorhanEmailNotificationTemplate(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("format")) {
                this.format = BorhanEmailNotificationFormat.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("subject")) {
                this.subject = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("body")) {
                this.body = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fromEmail")) {
                this.fromEmail = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fromName")) {
                this.fromName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("to")) {
                this.to = ParseUtils.parseObject(BorhanEmailNotificationRecipientProvider.class, aNode);
                continue;
            } else if (nodeName.equals("cc")) {
                this.cc = ParseUtils.parseObject(BorhanEmailNotificationRecipientProvider.class, aNode);
                continue;
            } else if (nodeName.equals("bcc")) {
                this.bcc = ParseUtils.parseObject(BorhanEmailNotificationRecipientProvider.class, aNode);
                continue;
            } else if (nodeName.equals("replyTo")) {
                this.replyTo = ParseUtils.parseObject(BorhanEmailNotificationRecipientProvider.class, aNode);
                continue;
            } else if (nodeName.equals("priority")) {
                this.priority = BorhanEmailNotificationTemplatePriority.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("confirmReadingTo")) {
                this.confirmReadingTo = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("hostname")) {
                this.hostname = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("messageID")) {
                this.messageID = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("customHeaders")) {
                this.customHeaders = ParseUtils.parseArray(BorhanKeyValue.class, aNode);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanEmailNotificationTemplate");
        kparams.add("format", this.format);
        kparams.add("subject", this.subject);
        kparams.add("body", this.body);
        kparams.add("fromEmail", this.fromEmail);
        kparams.add("fromName", this.fromName);
        kparams.add("to", this.to);
        kparams.add("cc", this.cc);
        kparams.add("bcc", this.bcc);
        kparams.add("replyTo", this.replyTo);
        kparams.add("priority", this.priority);
        kparams.add("confirmReadingTo", this.confirmReadingTo);
        kparams.add("hostname", this.hostname);
        kparams.add("messageID", this.messageID);
        kparams.add("customHeaders", this.customHeaders);
        return kparams;
    }

}

