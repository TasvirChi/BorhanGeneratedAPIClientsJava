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
public class BorhanBulkUploadResultUser extends BorhanBulkUploadResult {
    public String userId;
    public String screenName;
    public String email;
    public String description;
    public String tags;
    public int dateOfBirth = Integer.MIN_VALUE;
    public String country;
    public String state;
    public String city;
    public String zip;
    public int gender = Integer.MIN_VALUE;
    public String firstName;
    public String lastName;

    public BorhanBulkUploadResultUser() {
    }

    public BorhanBulkUploadResultUser(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("userId")) {
                this.userId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("screenName")) {
                this.screenName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("email")) {
                this.email = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tags")) {
                this.tags = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("dateOfBirth")) {
                this.dateOfBirth = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("country")) {
                this.country = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("state")) {
                this.state = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("city")) {
                this.city = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("zip")) {
                this.zip = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("gender")) {
                this.gender = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("firstName")) {
                this.firstName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("lastName")) {
                this.lastName = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanBulkUploadResultUser");
        kparams.add("userId", this.userId);
        kparams.add("screenName", this.screenName);
        kparams.add("email", this.email);
        kparams.add("description", this.description);
        kparams.add("tags", this.tags);
        kparams.add("dateOfBirth", this.dateOfBirth);
        kparams.add("country", this.country);
        kparams.add("state", this.state);
        kparams.add("city", this.city);
        kparams.add("zip", this.zip);
        kparams.add("gender", this.gender);
        kparams.add("firstName", this.firstName);
        kparams.add("lastName", this.lastName);
        return kparams;
    }

}

