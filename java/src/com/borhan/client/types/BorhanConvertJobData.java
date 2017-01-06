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
public class BorhanConvertJobData extends BorhanConvartableJobData {
    public String destFileSyncLocalPath;
    public String destFileSyncRemoteUrl;
    public String logFileSyncLocalPath;
    public String logFileSyncRemoteUrl;
    public String flavorAssetId;
    public String remoteMediaId;
    public String customData;
    public ArrayList<BorhanDestFileSyncDescriptor> extraDestFileSyncs;
    public String engineMessage;

    public BorhanConvertJobData() {
    }

    public BorhanConvertJobData(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("destFileSyncLocalPath")) {
                this.destFileSyncLocalPath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("destFileSyncRemoteUrl")) {
                this.destFileSyncRemoteUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("logFileSyncLocalPath")) {
                this.logFileSyncLocalPath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("logFileSyncRemoteUrl")) {
                this.logFileSyncRemoteUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("flavorAssetId")) {
                this.flavorAssetId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("remoteMediaId")) {
                this.remoteMediaId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("customData")) {
                this.customData = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("extraDestFileSyncs")) {
                this.extraDestFileSyncs = ParseUtils.parseArray(BorhanDestFileSyncDescriptor.class, aNode);
                continue;
            } else if (nodeName.equals("engineMessage")) {
                this.engineMessage = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanConvertJobData");
        kparams.add("destFileSyncLocalPath", this.destFileSyncLocalPath);
        kparams.add("destFileSyncRemoteUrl", this.destFileSyncRemoteUrl);
        kparams.add("logFileSyncLocalPath", this.logFileSyncLocalPath);
        kparams.add("logFileSyncRemoteUrl", this.logFileSyncRemoteUrl);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("remoteMediaId", this.remoteMediaId);
        kparams.add("customData", this.customData);
        kparams.add("extraDestFileSyncs", this.extraDestFileSyncs);
        kparams.add("engineMessage", this.engineMessage);
        return kparams;
    }

}

