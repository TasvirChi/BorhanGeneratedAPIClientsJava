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
import com.borhan.client.enums.BorhanCategoryUserPermissionLevel;
import com.borhan.client.enums.BorhanCategoryUserStatus;
import com.borhan.client.enums.BorhanUpdateMethodType;
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
public abstract class BorhanCategoryUserBaseFilter extends BorhanFilter {
    public int categoryIdEqual = Integer.MIN_VALUE;
    public String categoryIdIn;
    public String userIdEqual;
    public String userIdIn;
    public BorhanCategoryUserPermissionLevel permissionLevelEqual;
    public String permissionLevelIn;
    public BorhanCategoryUserStatus statusEqual;
    public String statusIn;
    public int createdAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int createdAtLessThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int updatedAtLessThanOrEqual = Integer.MIN_VALUE;
    public BorhanUpdateMethodType updateMethodEqual;
    public String updateMethodIn;
    public String categoryFullIdsStartsWith;
    public String categoryFullIdsEqual;
    public String permissionNamesMatchAnd;
    public String permissionNamesMatchOr;
    public String permissionNamesNotContains;

    public BorhanCategoryUserBaseFilter() {
    }

    public BorhanCategoryUserBaseFilter(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("categoryIdEqual")) {
                this.categoryIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("categoryIdIn")) {
                this.categoryIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("userIdEqual")) {
                this.userIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("userIdIn")) {
                this.userIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("permissionLevelEqual")) {
                this.permissionLevelEqual = BorhanCategoryUserPermissionLevel.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("permissionLevelIn")) {
                this.permissionLevelIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("statusEqual")) {
                this.statusEqual = BorhanCategoryUserStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createdAtGreaterThanOrEqual")) {
                this.createdAtGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAtLessThanOrEqual")) {
                this.createdAtLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAtGreaterThanOrEqual")) {
                this.updatedAtGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAtLessThanOrEqual")) {
                this.updatedAtLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updateMethodEqual")) {
                this.updateMethodEqual = BorhanUpdateMethodType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("updateMethodIn")) {
                this.updateMethodIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("categoryFullIdsStartsWith")) {
                this.categoryFullIdsStartsWith = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("categoryFullIdsEqual")) {
                this.categoryFullIdsEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("permissionNamesMatchAnd")) {
                this.permissionNamesMatchAnd = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("permissionNamesMatchOr")) {
                this.permissionNamesMatchOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("permissionNamesNotContains")) {
                this.permissionNamesNotContains = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanCategoryUserBaseFilter");
        kparams.add("categoryIdEqual", this.categoryIdEqual);
        kparams.add("categoryIdIn", this.categoryIdIn);
        kparams.add("userIdEqual", this.userIdEqual);
        kparams.add("userIdIn", this.userIdIn);
        kparams.add("permissionLevelEqual", this.permissionLevelEqual);
        kparams.add("permissionLevelIn", this.permissionLevelIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("updateMethodEqual", this.updateMethodEqual);
        kparams.add("updateMethodIn", this.updateMethodIn);
        kparams.add("categoryFullIdsStartsWith", this.categoryFullIdsStartsWith);
        kparams.add("categoryFullIdsEqual", this.categoryFullIdsEqual);
        kparams.add("permissionNamesMatchAnd", this.permissionNamesMatchAnd);
        kparams.add("permissionNamesMatchOr", this.permissionNamesMatchOr);
        kparams.add("permissionNamesNotContains", this.permissionNamesNotContains);
        return kparams;
    }

}

