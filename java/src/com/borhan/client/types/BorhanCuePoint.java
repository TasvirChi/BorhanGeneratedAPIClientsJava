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
import com.borhan.client.enums.BorhanCuePointType;
import com.borhan.client.enums.BorhanCuePointStatus;
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
public abstract class BorhanCuePoint extends BorhanObjectBase {
    public String id;
    public BorhanCuePointType cuePointType;
    public BorhanCuePointStatus status;
    public String entryId;
    public int partnerId = Integer.MIN_VALUE;
    public int createdAt = Integer.MIN_VALUE;
    public int updatedAt = Integer.MIN_VALUE;
    public int triggeredAt = Integer.MIN_VALUE;
    public String tags;
	/**  Start time in milliseconds     */
    public int startTime = Integer.MIN_VALUE;
    public String userId;
    public String partnerData;
    public int partnerSortValue = Integer.MIN_VALUE;
    public BorhanNullableBoolean forceStop;
    public int thumbOffset = Integer.MIN_VALUE;
    public String systemName;

    public BorhanCuePoint() {
    }

    public BorhanCuePoint(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("cuePointType")) {
                this.cuePointType = BorhanCuePointType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanCuePointStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("triggeredAt")) {
                this.triggeredAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("tags")) {
                this.tags = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("startTime")) {
                this.startTime = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("userId")) {
                this.userId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerData")) {
                this.partnerData = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerSortValue")) {
                this.partnerSortValue = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("forceStop")) {
                this.forceStop = BorhanNullableBoolean.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("thumbOffset")) {
                this.thumbOffset = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("systemName")) {
                this.systemName = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanCuePoint");
        kparams.add("entryId", this.entryId);
        kparams.add("triggeredAt", this.triggeredAt);
        kparams.add("tags", this.tags);
        kparams.add("startTime", this.startTime);
        kparams.add("partnerData", this.partnerData);
        kparams.add("partnerSortValue", this.partnerSortValue);
        kparams.add("forceStop", this.forceStop);
        kparams.add("thumbOffset", this.thumbOffset);
        kparams.add("systemName", this.systemName);
        return kparams;
    }

}

