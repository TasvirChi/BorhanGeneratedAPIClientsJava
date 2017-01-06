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
import com.borhan.client.enums.BorhanITunesSyndicationFeedCategories;
import com.borhan.client.enums.BorhanITunesSyndicationFeedAdultValues;
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
public class BorhanITunesSyndicationFeed extends BorhanBaseSyndicationFeed {
	/**  feed description            */
    public String feedDescription;
	/**  feed language            */
    public String language;
	/**  feed landing page (i.e publisher website)            */
    public String feedLandingPage;
	/**  author/publisher name            */
    public String ownerName;
	/**  publisher email            */
    public String ownerEmail;
	/**  podcast thumbnail            */
    public String feedImageUrl;
    public BorhanITunesSyndicationFeedCategories category;
    public BorhanITunesSyndicationFeedAdultValues adultContent;
    public String feedAuthor;
	/**  true in case you want to enfore the palylist order on the       */
    public BorhanNullableBoolean enforceOrder;

    public BorhanITunesSyndicationFeed() {
    }

    public BorhanITunesSyndicationFeed(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("feedDescription")) {
                this.feedDescription = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("language")) {
                this.language = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("feedLandingPage")) {
                this.feedLandingPage = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("ownerName")) {
                this.ownerName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("ownerEmail")) {
                this.ownerEmail = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("feedImageUrl")) {
                this.feedImageUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("category")) {
                this.category = BorhanITunesSyndicationFeedCategories.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("adultContent")) {
                this.adultContent = BorhanITunesSyndicationFeedAdultValues.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("feedAuthor")) {
                this.feedAuthor = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("enforceOrder")) {
                this.enforceOrder = BorhanNullableBoolean.get(ParseUtils.parseInt(txt));
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanITunesSyndicationFeed");
        kparams.add("feedDescription", this.feedDescription);
        kparams.add("language", this.language);
        kparams.add("feedLandingPage", this.feedLandingPage);
        kparams.add("ownerName", this.ownerName);
        kparams.add("ownerEmail", this.ownerEmail);
        kparams.add("feedImageUrl", this.feedImageUrl);
        kparams.add("adultContent", this.adultContent);
        kparams.add("feedAuthor", this.feedAuthor);
        kparams.add("enforceOrder", this.enforceOrder);
        return kparams;
    }

}

