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
public class BorhanConvartableJobData extends BorhanJobData {
    public String srcFileSyncLocalPath;
	/**  The translated path as used by the scheduler     */
    public String actualSrcFileSyncLocalPath;
    public String srcFileSyncRemoteUrl;
    public ArrayList<BorhanSourceFileSyncDescriptor> srcFileSyncs;
    public int engineVersion = Integer.MIN_VALUE;
    public int flavorParamsOutputId = Integer.MIN_VALUE;
    public BorhanFlavorParamsOutput flavorParamsOutput;
    public int mediaInfoId = Integer.MIN_VALUE;
    public int currentOperationSet = Integer.MIN_VALUE;
    public int currentOperationIndex = Integer.MIN_VALUE;
    public ArrayList<BorhanKeyValue> pluginData;

    public BorhanConvartableJobData() {
    }

    public BorhanConvartableJobData(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("srcFileSyncLocalPath")) {
                this.srcFileSyncLocalPath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("actualSrcFileSyncLocalPath")) {
                this.actualSrcFileSyncLocalPath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("srcFileSyncRemoteUrl")) {
                this.srcFileSyncRemoteUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("srcFileSyncs")) {
                this.srcFileSyncs = ParseUtils.parseArray(BorhanSourceFileSyncDescriptor.class, aNode);
                continue;
            } else if (nodeName.equals("engineVersion")) {
                this.engineVersion = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("flavorParamsOutputId")) {
                this.flavorParamsOutputId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("flavorParamsOutput")) {
                this.flavorParamsOutput = ParseUtils.parseObject(BorhanFlavorParamsOutput.class, aNode);
                continue;
            } else if (nodeName.equals("mediaInfoId")) {
                this.mediaInfoId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("currentOperationSet")) {
                this.currentOperationSet = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("currentOperationIndex")) {
                this.currentOperationIndex = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("pluginData")) {
                this.pluginData = ParseUtils.parseArray(BorhanKeyValue.class, aNode);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanConvartableJobData");
        kparams.add("srcFileSyncLocalPath", this.srcFileSyncLocalPath);
        kparams.add("actualSrcFileSyncLocalPath", this.actualSrcFileSyncLocalPath);
        kparams.add("srcFileSyncRemoteUrl", this.srcFileSyncRemoteUrl);
        kparams.add("srcFileSyncs", this.srcFileSyncs);
        kparams.add("engineVersion", this.engineVersion);
        kparams.add("flavorParamsOutputId", this.flavorParamsOutputId);
        kparams.add("flavorParamsOutput", this.flavorParamsOutput);
        kparams.add("mediaInfoId", this.mediaInfoId);
        kparams.add("currentOperationSet", this.currentOperationSet);
        kparams.add("currentOperationIndex", this.currentOperationIndex);
        kparams.add("pluginData", this.pluginData);
        return kparams;
    }

}

