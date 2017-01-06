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
import com.borhan.client.enums.BorhanThumbCropType;
import com.borhan.client.enums.BorhanContainerFormat;
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
public class BorhanThumbParams extends BorhanAssetParams {
    public BorhanThumbCropType cropType;
    public int quality = Integer.MIN_VALUE;
    public int cropX = Integer.MIN_VALUE;
    public int cropY = Integer.MIN_VALUE;
    public int cropWidth = Integer.MIN_VALUE;
    public int cropHeight = Integer.MIN_VALUE;
    public double videoOffset = Double.MIN_VALUE;
    public int width = Integer.MIN_VALUE;
    public int height = Integer.MIN_VALUE;
    public double scaleWidth = Double.MIN_VALUE;
    public double scaleHeight = Double.MIN_VALUE;
	/**  Hexadecimal value     */
    public String backgroundColor;
	/**  Id of the flavor params or the thumbnail params to be used as source for the
	  thumbnail creation     */
    public int sourceParamsId = Integer.MIN_VALUE;
	/**  The container format of the Flavor Params     */
    public BorhanContainerFormat format;
	/**  The image density (dpi) for example: 72 or 96     */
    public int density = Integer.MIN_VALUE;
	/**  Strip profiles and comments     */
    public boolean stripProfiles;
	/**  Create thumbnail from the videoLengthpercentage second        */
    public int videoOffsetInPercentage = Integer.MIN_VALUE;

    public BorhanThumbParams() {
    }

    public BorhanThumbParams(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("cropType")) {
                this.cropType = BorhanThumbCropType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("quality")) {
                this.quality = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("cropX")) {
                this.cropX = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("cropY")) {
                this.cropY = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("cropWidth")) {
                this.cropWidth = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("cropHeight")) {
                this.cropHeight = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("videoOffset")) {
                this.videoOffset = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("width")) {
                this.width = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("height")) {
                this.height = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("scaleWidth")) {
                this.scaleWidth = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("scaleHeight")) {
                this.scaleHeight = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("backgroundColor")) {
                this.backgroundColor = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sourceParamsId")) {
                this.sourceParamsId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("format")) {
                this.format = BorhanContainerFormat.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("density")) {
                this.density = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("stripProfiles")) {
                this.stripProfiles = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("videoOffsetInPercentage")) {
                this.videoOffsetInPercentage = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanThumbParams");
        kparams.add("cropType", this.cropType);
        kparams.add("quality", this.quality);
        kparams.add("cropX", this.cropX);
        kparams.add("cropY", this.cropY);
        kparams.add("cropWidth", this.cropWidth);
        kparams.add("cropHeight", this.cropHeight);
        kparams.add("videoOffset", this.videoOffset);
        kparams.add("width", this.width);
        kparams.add("height", this.height);
        kparams.add("scaleWidth", this.scaleWidth);
        kparams.add("scaleHeight", this.scaleHeight);
        kparams.add("backgroundColor", this.backgroundColor);
        kparams.add("sourceParamsId", this.sourceParamsId);
        kparams.add("format", this.format);
        kparams.add("density", this.density);
        kparams.add("stripProfiles", this.stripProfiles);
        kparams.add("videoOffsetInPercentage", this.videoOffsetInPercentage);
        return kparams;
    }

}

