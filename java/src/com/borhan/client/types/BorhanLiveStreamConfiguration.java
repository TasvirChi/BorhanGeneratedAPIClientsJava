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
import com.borhan.client.enums.BorhanPlaybackProtocol;
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

/**  A representation of a live stream configuration    */
@SuppressWarnings("serial")
public class BorhanLiveStreamConfiguration extends BorhanObjectBase {
    public BorhanPlaybackProtocol protocol;
    public String url;
    public String publishUrl;
    public String backupUrl;
    public String streamName;

    public BorhanLiveStreamConfiguration() {
    }

    public BorhanLiveStreamConfiguration(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("protocol")) {
                this.protocol = BorhanPlaybackProtocol.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("url")) {
                this.url = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("publishUrl")) {
                this.publishUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("backupUrl")) {
                this.backupUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("streamName")) {
                this.streamName = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanLiveStreamConfiguration");
        kparams.add("protocol", this.protocol);
        kparams.add("url", this.url);
        kparams.add("publishUrl", this.publishUrl);
        kparams.add("backupUrl", this.backupUrl);
        kparams.add("streamName", this.streamName);
        return kparams;
    }

}

