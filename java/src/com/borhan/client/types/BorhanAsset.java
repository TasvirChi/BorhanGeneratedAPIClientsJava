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
public class BorhanAsset extends BorhanObjectBase {
	/**  The ID of the Flavor Asset     */
    public String id;
	/**  The entry ID of the Flavor Asset     */
    public String entryId;
    public int partnerId = Integer.MIN_VALUE;
	/**  The version of the Flavor Asset     */
    public int version = Integer.MIN_VALUE;
	/**  The size (in KBytes) of the Flavor Asset     */
    public int size = Integer.MIN_VALUE;
	/**  Tags used to identify the Flavor Asset in various scenarios     */
    public String tags;
	/**  The file extension     */
    public String fileExt;
    public int createdAt = Integer.MIN_VALUE;
    public int updatedAt = Integer.MIN_VALUE;
    public int deletedAt = Integer.MIN_VALUE;
	/**  System description, error message, warnings and failure cause.     */
    public String description;
	/**  Partner private data     */
    public String partnerData;
	/**  Partner friendly description     */
    public String partnerDescription;
	/**  Comma separated list of source flavor params ids     */
    public String actualSourceAssetParamsIds;

    public BorhanAsset() {
    }

    public BorhanAsset(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("version")) {
                this.version = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("size")) {
                this.size = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("tags")) {
                this.tags = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fileExt")) {
                this.fileExt = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("deletedAt")) {
                this.deletedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerData")) {
                this.partnerData = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerDescription")) {
                this.partnerDescription = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("actualSourceAssetParamsIds")) {
                this.actualSourceAssetParamsIds = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanAsset");
        kparams.add("tags", this.tags);
        kparams.add("fileExt", this.fileExt);
        kparams.add("partnerData", this.partnerData);
        kparams.add("partnerDescription", this.partnerDescription);
        kparams.add("actualSourceAssetParamsIds", this.actualSourceAssetParamsIds);
        return kparams;
    }

}

