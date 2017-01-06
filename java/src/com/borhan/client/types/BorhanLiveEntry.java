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
import com.borhan.client.enums.BorhanRecordStatus;
import com.borhan.client.enums.BorhanDVRStatus;
import com.borhan.client.enums.BorhanLivePublishStatus;
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
public abstract class BorhanLiveEntry extends BorhanMediaEntry {
	/**  The message to be presented when the stream is offline     */
    public String offlineMessage;
	/**  Recording Status Enabled/Disabled     */
    public BorhanRecordStatus recordStatus;
	/**  DVR Status Enabled/Disabled     */
    public BorhanDVRStatus dvrStatus;
	/**  Window of time which the DVR allows for backwards scrubbing (in minutes)     */
    public int dvrWindow = Integer.MIN_VALUE;
	/**  Elapsed recording time (in msec) up to the point where the live stream was last
	  stopped (unpublished).     */
    public int lastElapsedRecordingTime = Integer.MIN_VALUE;
	/**  Array of key value protocol->live stream url objects     */
    public ArrayList<BorhanLiveStreamConfiguration> liveStreamConfigurations;
	/**  Recorded entry id     */
    public String recordedEntryId;
	/**  Flag denoting whether entry should be published by the media server     */
    public BorhanLivePublishStatus pushPublishEnabled;
	/**  Array of publish configurations     */
    public ArrayList<BorhanLiveStreamPushPublishConfiguration> publishConfigurations;
	/**  The first time in which the entry was broadcast     */
    public int firstBroadcast = Integer.MIN_VALUE;
	/**  The Last time in which the entry was broadcast     */
    public int lastBroadcast = Integer.MIN_VALUE;
	/**  The time (unix timestamp in milliseconds) in which the entry broadcast started
	  or 0 when the entry is off the air     */
    public double currentBroadcastStartTime = Double.MIN_VALUE;

    public BorhanLiveEntry() {
    }

    public BorhanLiveEntry(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("offlineMessage")) {
                this.offlineMessage = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("recordStatus")) {
                this.recordStatus = BorhanRecordStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("dvrStatus")) {
                this.dvrStatus = BorhanDVRStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("dvrWindow")) {
                this.dvrWindow = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("lastElapsedRecordingTime")) {
                this.lastElapsedRecordingTime = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("liveStreamConfigurations")) {
                this.liveStreamConfigurations = ParseUtils.parseArray(BorhanLiveStreamConfiguration.class, aNode);
                continue;
            } else if (nodeName.equals("recordedEntryId")) {
                this.recordedEntryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("pushPublishEnabled")) {
                this.pushPublishEnabled = BorhanLivePublishStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("publishConfigurations")) {
                this.publishConfigurations = ParseUtils.parseArray(BorhanLiveStreamPushPublishConfiguration.class, aNode);
                continue;
            } else if (nodeName.equals("firstBroadcast")) {
                this.firstBroadcast = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("lastBroadcast")) {
                this.lastBroadcast = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("currentBroadcastStartTime")) {
                this.currentBroadcastStartTime = ParseUtils.parseDouble(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanLiveEntry");
        kparams.add("offlineMessage", this.offlineMessage);
        kparams.add("recordStatus", this.recordStatus);
        kparams.add("dvrStatus", this.dvrStatus);
        kparams.add("dvrWindow", this.dvrWindow);
        kparams.add("lastElapsedRecordingTime", this.lastElapsedRecordingTime);
        kparams.add("liveStreamConfigurations", this.liveStreamConfigurations);
        kparams.add("recordedEntryId", this.recordedEntryId);
        kparams.add("pushPublishEnabled", this.pushPublishEnabled);
        kparams.add("publishConfigurations", this.publishConfigurations);
        kparams.add("currentBroadcastStartTime", this.currentBroadcastStartTime);
        return kparams;
    }

}

