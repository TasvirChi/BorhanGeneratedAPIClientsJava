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
import com.borhan.client.enums.BorhanMediaType;
import com.borhan.client.enums.BorhanSourceType;
import com.borhan.client.enums.BorhanSearchProviderType;
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
public class BorhanMediaEntry extends BorhanPlayableEntry {
	/**  The media type of the entry     */
    public BorhanMediaType mediaType;
	/**  Override the default conversion quality       */
    public String conversionQuality;
	/**  The source type of the entry      */
    public BorhanSourceType sourceType;
	/**  The search provider type used to import this entry     */
    public BorhanSearchProviderType searchProviderType;
	/**  The ID of the media in the importing site     */
    public String searchProviderId;
	/**  The user name used for credits     */
    public String creditUserName;
	/**  The URL for credits     */
    public String creditUrl;
	/**  The media date extracted from EXIF data (For images) as Unix timestamp (In
	  seconds)     */
    public int mediaDate = Integer.MIN_VALUE;
	/**  The URL used for playback. This is not the download URL.     */
    public String dataUrl;
	/**  Comma separated flavor params ids that exists for this media entry     */
    public String flavorParamsIds;

    public BorhanMediaEntry() {
    }

    public BorhanMediaEntry(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("mediaType")) {
                this.mediaType = BorhanMediaType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("conversionQuality")) {
                this.conversionQuality = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sourceType")) {
                this.sourceType = BorhanSourceType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("searchProviderType")) {
                this.searchProviderType = BorhanSearchProviderType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("searchProviderId")) {
                this.searchProviderId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("creditUserName")) {
                this.creditUserName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("creditUrl")) {
                this.creditUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("mediaDate")) {
                this.mediaDate = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("dataUrl")) {
                this.dataUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("flavorParamsIds")) {
                this.flavorParamsIds = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanMediaEntry");
        kparams.add("mediaType", this.mediaType);
        kparams.add("conversionQuality", this.conversionQuality);
        kparams.add("sourceType", this.sourceType);
        kparams.add("searchProviderType", this.searchProviderType);
        kparams.add("searchProviderId", this.searchProviderId);
        kparams.add("creditUserName", this.creditUserName);
        kparams.add("creditUrl", this.creditUrl);
        return kparams;
    }

}

