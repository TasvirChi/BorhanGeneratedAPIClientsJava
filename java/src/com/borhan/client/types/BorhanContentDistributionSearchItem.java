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
import com.borhan.client.enums.BorhanEntryDistributionSunStatus;
import com.borhan.client.enums.BorhanEntryDistributionFlag;
import com.borhan.client.enums.BorhanEntryDistributionStatus;
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
public class BorhanContentDistributionSearchItem extends BorhanSearchItem {
    public boolean noDistributionProfiles;
    public int distributionProfileId = Integer.MIN_VALUE;
    public BorhanEntryDistributionSunStatus distributionSunStatus;
    public BorhanEntryDistributionFlag entryDistributionFlag;
    public BorhanEntryDistributionStatus entryDistributionStatus;
    public boolean hasEntryDistributionValidationErrors;
	/**  Comma seperated validation error types     */
    public String entryDistributionValidationErrors;

    public BorhanContentDistributionSearchItem() {
    }

    public BorhanContentDistributionSearchItem(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("noDistributionProfiles")) {
                this.noDistributionProfiles = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("distributionProfileId")) {
                this.distributionProfileId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("distributionSunStatus")) {
                this.distributionSunStatus = BorhanEntryDistributionSunStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("entryDistributionFlag")) {
                this.entryDistributionFlag = BorhanEntryDistributionFlag.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("entryDistributionStatus")) {
                this.entryDistributionStatus = BorhanEntryDistributionStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("hasEntryDistributionValidationErrors")) {
                this.hasEntryDistributionValidationErrors = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("entryDistributionValidationErrors")) {
                this.entryDistributionValidationErrors = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanContentDistributionSearchItem");
        kparams.add("noDistributionProfiles", this.noDistributionProfiles);
        kparams.add("distributionProfileId", this.distributionProfileId);
        kparams.add("distributionSunStatus", this.distributionSunStatus);
        kparams.add("entryDistributionFlag", this.entryDistributionFlag);
        kparams.add("entryDistributionStatus", this.entryDistributionStatus);
        kparams.add("hasEntryDistributionValidationErrors", this.hasEntryDistributionValidationErrors);
        kparams.add("entryDistributionValidationErrors", this.entryDistributionValidationErrors);
        return kparams;
    }

}

