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
public class BorhanConcatJobData extends BorhanJobData {
	/**  Source files to be concatenated     */
    public ArrayList<BorhanString> srcFiles;
	/**  Output file     */
    public String destFilePath;
	/**  Flavor asset to be ingested with the output     */
    public String flavorAssetId;
	/**  Clipping offset in seconds     */
    public double offset = Double.MIN_VALUE;
	/**  Clipping duration in seconds     */
    public double duration = Double.MIN_VALUE;

    public BorhanConcatJobData() {
    }

    public BorhanConcatJobData(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("srcFiles")) {
                this.srcFiles = ParseUtils.parseArray(BorhanString.class, aNode);
                continue;
            } else if (nodeName.equals("destFilePath")) {
                this.destFilePath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("flavorAssetId")) {
                this.flavorAssetId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("offset")) {
                this.offset = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("duration")) {
                this.duration = ParseUtils.parseDouble(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanConcatJobData");
        kparams.add("srcFiles", this.srcFiles);
        kparams.add("destFilePath", this.destFilePath);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("offset", this.offset);
        kparams.add("duration", this.duration);
        return kparams;
    }

}

