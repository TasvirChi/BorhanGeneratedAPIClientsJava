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
public class BorhanUserFilter extends BorhanUserBaseFilter {
    public String idOrScreenNameStartsWith;
    public String idEqual;
    public String idIn;
    public BorhanNullableBoolean loginEnabledEqual;
    public String roleIdEqual;
    public String roleIdsEqual;
    public String roleIdsIn;
    public String firstNameOrLastNameStartsWith;
	/**  Permission names filter expression     */
    public String permissionNamesMultiLikeOr;
	/**  Permission names filter expression     */
    public String permissionNamesMultiLikeAnd;

    public BorhanUserFilter() {
    }

    public BorhanUserFilter(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("idOrScreenNameStartsWith")) {
                this.idOrScreenNameStartsWith = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("idEqual")) {
                this.idEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("idIn")) {
                this.idIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("loginEnabledEqual")) {
                this.loginEnabledEqual = BorhanNullableBoolean.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("roleIdEqual")) {
                this.roleIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("roleIdsEqual")) {
                this.roleIdsEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("roleIdsIn")) {
                this.roleIdsIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("firstNameOrLastNameStartsWith")) {
                this.firstNameOrLastNameStartsWith = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("permissionNamesMultiLikeOr")) {
                this.permissionNamesMultiLikeOr = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("permissionNamesMultiLikeAnd")) {
                this.permissionNamesMultiLikeAnd = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanUserFilter");
        kparams.add("idOrScreenNameStartsWith", this.idOrScreenNameStartsWith);
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("loginEnabledEqual", this.loginEnabledEqual);
        kparams.add("roleIdEqual", this.roleIdEqual);
        kparams.add("roleIdsEqual", this.roleIdsEqual);
        kparams.add("roleIdsIn", this.roleIdsIn);
        kparams.add("firstNameOrLastNameStartsWith", this.firstNameOrLastNameStartsWith);
        kparams.add("permissionNamesMultiLikeOr", this.permissionNamesMultiLikeOr);
        kparams.add("permissionNamesMultiLikeAnd", this.permissionNamesMultiLikeAnd);
        return kparams;
    }

}

