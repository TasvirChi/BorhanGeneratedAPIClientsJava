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
import com.borhan.client.enums.BorhanDeliveryProfileType;
import com.borhan.client.enums.BorhanPlaybackProtocol;
import com.borhan.client.enums.BorhanDeliveryStatus;
import com.borhan.client.enums.BorhanNullableBoolean;
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
public class BorhanDeliveryProfile extends BorhanObjectBase {
	/**  The id of the Delivery     */
    public int id = Integer.MIN_VALUE;
    public int partnerId = Integer.MIN_VALUE;
	/**  The name of the Delivery     */
    public String name;
	/**  Delivery type     */
    public BorhanDeliveryProfileType type;
	/**  System name of the delivery     */
    public String systemName;
	/**  The description of the Delivery     */
    public String description;
	/**  Creation time as Unix timestamp (In seconds)     */
    public int createdAt = Integer.MIN_VALUE;
	/**  Update time as Unix timestamp (In seconds)     */
    public int updatedAt = Integer.MIN_VALUE;
    public BorhanPlaybackProtocol streamerType;
    public String url;
	/**  the host part of the url     */
    public String hostName;
    public BorhanDeliveryStatus status;
    public BorhanUrlRecognizer recognizer;
    public BorhanUrlTokenizer tokenizer;
	/**  True if this is the systemwide default for the protocol     */
    public BorhanNullableBoolean isDefault;
	/**  the object from which this object was cloned (or 0)     */
    public int parentId = Integer.MIN_VALUE;
	/**  Comma separated list of supported media protocols. f.i. rtmpe     */
    public String mediaProtocols;

    public BorhanDeliveryProfile() {
    }

    public BorhanDeliveryProfile(Element node) throws BorhanApiException {
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
            } else if (nodeName.equals("type")) {
                this.type = BorhanDeliveryProfileType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("systemName")) {
                this.systemName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("streamerType")) {
                this.streamerType = BorhanPlaybackProtocol.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("url")) {
                this.url = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("hostName")) {
                this.hostName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanDeliveryStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("recognizer")) {
                this.recognizer = ParseUtils.parseObject(BorhanUrlRecognizer.class, aNode);
                continue;
            } else if (nodeName.equals("tokenizer")) {
                this.tokenizer = ParseUtils.parseObject(BorhanUrlTokenizer.class, aNode);
                continue;
            } else if (nodeName.equals("isDefault")) {
                this.isDefault = BorhanNullableBoolean.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("parentId")) {
                this.parentId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("mediaProtocols")) {
                this.mediaProtocols = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanDeliveryProfile");
        kparams.add("name", this.name);
        kparams.add("type", this.type);
        kparams.add("systemName", this.systemName);
        kparams.add("description", this.description);
        kparams.add("streamerType", this.streamerType);
        kparams.add("url", this.url);
        kparams.add("status", this.status);
        kparams.add("recognizer", this.recognizer);
        kparams.add("tokenizer", this.tokenizer);
        kparams.add("mediaProtocols", this.mediaProtocols);
        return kparams;
    }

}

