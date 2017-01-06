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
import com.borhan.client.enums.BorhanStorageProfileStatus;
import com.borhan.client.enums.BorhanStorageProfileProtocol;
import com.borhan.client.enums.BorhanStorageProfileDeliveryStatus;
import com.borhan.client.enums.BorhanStorageProfileReadyBehavior;
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
public class BorhanStorageProfile extends BorhanObjectBase {
    public int id = Integer.MIN_VALUE;
    public int createdAt = Integer.MIN_VALUE;
    public int updatedAt = Integer.MIN_VALUE;
    public int partnerId = Integer.MIN_VALUE;
    public String name;
    public String systemName;
    public String desciption;
    public BorhanStorageProfileStatus status;
    public BorhanStorageProfileProtocol protocol;
    public String storageUrl;
    public String storageBaseDir;
    public String storageUsername;
    public String storagePassword;
    public boolean storageFtpPassiveMode;
    public int minFileSize = Integer.MIN_VALUE;
    public int maxFileSize = Integer.MIN_VALUE;
    public String flavorParamsIds;
    public int maxConcurrentConnections = Integer.MIN_VALUE;
    public String pathManagerClass;
    public ArrayList<BorhanKeyValue> pathManagerParams;
	/**  No need to create enum for temp field     */
    public int trigger = Integer.MIN_VALUE;
	/**  Delivery Priority     */
    public int deliveryPriority = Integer.MIN_VALUE;
    public BorhanStorageProfileDeliveryStatus deliveryStatus;
    public BorhanStorageProfileReadyBehavior readyBehavior;
	/**  Flag sugnifying that the storage exported content should be deleted when soure
	  entry is deleted     */
    public int allowAutoDelete = Integer.MIN_VALUE;
	/**  Indicates to the local file transfer manager to create a link to the file
	  instead of copying it     */
    public boolean createFileLink;
	/**  Holds storage profile export rules     */
    public ArrayList<BorhanRule> rules;
	/**  Delivery profile ids     */
    public ArrayList<BorhanKeyValue> deliveryProfileIds;

    public BorhanStorageProfile() {
    }

    public BorhanStorageProfile(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("name")) {
                this.name = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("systemName")) {
                this.systemName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("desciption")) {
                this.desciption = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanStorageProfileStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("protocol")) {
                this.protocol = BorhanStorageProfileProtocol.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("storageUrl")) {
                this.storageUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("storageBaseDir")) {
                this.storageBaseDir = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("storageUsername")) {
                this.storageUsername = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("storagePassword")) {
                this.storagePassword = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("storageFtpPassiveMode")) {
                this.storageFtpPassiveMode = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("minFileSize")) {
                this.minFileSize = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("maxFileSize")) {
                this.maxFileSize = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("flavorParamsIds")) {
                this.flavorParamsIds = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("maxConcurrentConnections")) {
                this.maxConcurrentConnections = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("pathManagerClass")) {
                this.pathManagerClass = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("pathManagerParams")) {
                this.pathManagerParams = ParseUtils.parseArray(BorhanKeyValue.class, aNode);
                continue;
            } else if (nodeName.equals("trigger")) {
                this.trigger = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("deliveryPriority")) {
                this.deliveryPriority = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("deliveryStatus")) {
                this.deliveryStatus = BorhanStorageProfileDeliveryStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("readyBehavior")) {
                this.readyBehavior = BorhanStorageProfileReadyBehavior.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("allowAutoDelete")) {
                this.allowAutoDelete = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createFileLink")) {
                this.createFileLink = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("rules")) {
                this.rules = ParseUtils.parseArray(BorhanRule.class, aNode);
                continue;
            } else if (nodeName.equals("deliveryProfileIds")) {
                this.deliveryProfileIds = ParseUtils.parseArray(BorhanKeyValue.class, aNode);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanStorageProfile");
        kparams.add("name", this.name);
        kparams.add("systemName", this.systemName);
        kparams.add("desciption", this.desciption);
        kparams.add("status", this.status);
        kparams.add("protocol", this.protocol);
        kparams.add("storageUrl", this.storageUrl);
        kparams.add("storageBaseDir", this.storageBaseDir);
        kparams.add("storageUsername", this.storageUsername);
        kparams.add("storagePassword", this.storagePassword);
        kparams.add("storageFtpPassiveMode", this.storageFtpPassiveMode);
        kparams.add("minFileSize", this.minFileSize);
        kparams.add("maxFileSize", this.maxFileSize);
        kparams.add("flavorParamsIds", this.flavorParamsIds);
        kparams.add("maxConcurrentConnections", this.maxConcurrentConnections);
        kparams.add("pathManagerClass", this.pathManagerClass);
        kparams.add("pathManagerParams", this.pathManagerParams);
        kparams.add("trigger", this.trigger);
        kparams.add("deliveryPriority", this.deliveryPriority);
        kparams.add("deliveryStatus", this.deliveryStatus);
        kparams.add("readyBehavior", this.readyBehavior);
        kparams.add("allowAutoDelete", this.allowAutoDelete);
        kparams.add("createFileLink", this.createFileLink);
        kparams.add("rules", this.rules);
        kparams.add("deliveryProfileIds", this.deliveryProfileIds);
        return kparams;
    }

}

