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
import com.borhan.client.enums.BorhanLiveChannelSegmentType;
import com.borhan.client.enums.BorhanLiveChannelSegmentStatus;
import com.borhan.client.enums.BorhanLiveChannelSegmentTriggerType;
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
public class BorhanLiveChannelSegment extends BorhanObjectBase {
	/**  Unique identifier     */
    public String id;
    public int partnerId = Integer.MIN_VALUE;
	/**  Segment creation date as Unix timestamp (In seconds)     */
    public int createdAt = Integer.MIN_VALUE;
	/**  Segment update date as Unix timestamp (In seconds)     */
    public int updatedAt = Integer.MIN_VALUE;
	/**  Segment name     */
    public String name;
	/**  Segment description     */
    public String description;
	/**  Segment tags     */
    public String tags;
	/**  Segment could be associated with the main stream, as additional stream or as
	  overlay     */
    public BorhanLiveChannelSegmentType type;
    public BorhanLiveChannelSegmentStatus status;
	/**  Live channel id     */
    public String channelId;
	/**  Entry id to be played     */
    public String entryId;
	/**  Segment start time trigger type     */
    public BorhanLiveChannelSegmentTriggerType triggerType;
	/**  Live channel segment that the trigger relates to     */
    public String triggerSegmentId;
	/**  Segment play start time, in mili-seconds, according to trigger type     */
    public double startTime = Double.MIN_VALUE;
	/**  Segment play duration time, in mili-seconds     */
    public double duration = Double.MIN_VALUE;

    public BorhanLiveChannelSegment() {
    }

    public BorhanLiveChannelSegment(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseString(txt);
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
            } else if (nodeName.equals("name")) {
                this.name = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tags")) {
                this.tags = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("type")) {
                this.type = BorhanLiveChannelSegmentType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanLiveChannelSegmentStatus.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("channelId")) {
                this.channelId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("triggerType")) {
                this.triggerType = BorhanLiveChannelSegmentTriggerType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("triggerSegmentId")) {
                this.triggerSegmentId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("startTime")) {
                this.startTime = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("duration")) {
                this.duration = ParseUtils.parseDouble(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanLiveChannelSegment");
        kparams.add("name", this.name);
        kparams.add("description", this.description);
        kparams.add("tags", this.tags);
        kparams.add("type", this.type);
        kparams.add("channelId", this.channelId);
        kparams.add("entryId", this.entryId);
        kparams.add("triggerType", this.triggerType);
        kparams.add("triggerSegmentId", this.triggerSegmentId);
        kparams.add("startTime", this.startTime);
        kparams.add("duration", this.duration);
        return kparams;
    }

}

