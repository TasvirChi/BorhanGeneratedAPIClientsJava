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
import com.borhan.client.enums.BorhanPlayReadyAnalogVideoOPL;
import com.borhan.client.enums.BorhanPlayReadyDigitalAudioOPL;
import com.borhan.client.enums.BorhanPlayReadyCompressedDigitalVideoOPL;
import com.borhan.client.enums.BorhanPlayReadyUncompressedDigitalVideoOPL;
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
public class BorhanPlayReadyPlayRight extends BorhanPlayReadyRight {
    public BorhanPlayReadyAnalogVideoOPL analogVideoOPL;
    public ArrayList<BorhanPlayReadyAnalogVideoOPIdHolder> analogVideoOutputProtectionList;
    public BorhanPlayReadyDigitalAudioOPL compressedDigitalAudioOPL;
    public BorhanPlayReadyCompressedDigitalVideoOPL compressedDigitalVideoOPL;
    public ArrayList<BorhanPlayReadyDigitalAudioOPIdHolder> digitalAudioOutputProtectionList;
    public BorhanPlayReadyDigitalAudioOPL uncompressedDigitalAudioOPL;
    public BorhanPlayReadyUncompressedDigitalVideoOPL uncompressedDigitalVideoOPL;
    public int firstPlayExpiration = Integer.MIN_VALUE;
    public ArrayList<BorhanPlayReadyPlayEnablerHolder> playEnablers;

    public BorhanPlayReadyPlayRight() {
    }

    public BorhanPlayReadyPlayRight(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("analogVideoOPL")) {
                this.analogVideoOPL = BorhanPlayReadyAnalogVideoOPL.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("analogVideoOutputProtectionList")) {
                this.analogVideoOutputProtectionList = ParseUtils.parseArray(BorhanPlayReadyAnalogVideoOPIdHolder.class, aNode);
                continue;
            } else if (nodeName.equals("compressedDigitalAudioOPL")) {
                this.compressedDigitalAudioOPL = BorhanPlayReadyDigitalAudioOPL.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("compressedDigitalVideoOPL")) {
                this.compressedDigitalVideoOPL = BorhanPlayReadyCompressedDigitalVideoOPL.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("digitalAudioOutputProtectionList")) {
                this.digitalAudioOutputProtectionList = ParseUtils.parseArray(BorhanPlayReadyDigitalAudioOPIdHolder.class, aNode);
                continue;
            } else if (nodeName.equals("uncompressedDigitalAudioOPL")) {
                this.uncompressedDigitalAudioOPL = BorhanPlayReadyDigitalAudioOPL.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("uncompressedDigitalVideoOPL")) {
                this.uncompressedDigitalVideoOPL = BorhanPlayReadyUncompressedDigitalVideoOPL.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("firstPlayExpiration")) {
                this.firstPlayExpiration = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("playEnablers")) {
                this.playEnablers = ParseUtils.parseArray(BorhanPlayReadyPlayEnablerHolder.class, aNode);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanPlayReadyPlayRight");
        kparams.add("analogVideoOPL", this.analogVideoOPL);
        kparams.add("analogVideoOutputProtectionList", this.analogVideoOutputProtectionList);
        kparams.add("compressedDigitalAudioOPL", this.compressedDigitalAudioOPL);
        kparams.add("compressedDigitalVideoOPL", this.compressedDigitalVideoOPL);
        kparams.add("digitalAudioOutputProtectionList", this.digitalAudioOutputProtectionList);
        kparams.add("uncompressedDigitalAudioOPL", this.uncompressedDigitalAudioOPL);
        kparams.add("uncompressedDigitalVideoOPL", this.uncompressedDigitalVideoOPL);
        kparams.add("firstPlayExpiration", this.firstPlayExpiration);
        kparams.add("playEnablers", this.playEnablers);
        return kparams;
    }

}

