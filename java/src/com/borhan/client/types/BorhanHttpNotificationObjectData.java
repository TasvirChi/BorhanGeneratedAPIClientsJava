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
import com.borhan.client.enums.BorhanResponseType;
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

/**  Evaluates PHP statement, depends on the execution context    */
@SuppressWarnings("serial")
public class BorhanHttpNotificationObjectData extends BorhanHttpNotificationData {
	/**  Borhan API object type     */
    public String apiObjectType;
	/**  Data format     */
    public BorhanResponseType format;
	/**  Ignore null attributes during serialization     */
    public boolean ignoreNull;
	/**  PHP code     */
    public String code;

    public BorhanHttpNotificationObjectData() {
    }

    public BorhanHttpNotificationObjectData(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("apiObjectType")) {
                this.apiObjectType = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("format")) {
                this.format = BorhanResponseType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("ignoreNull")) {
                this.ignoreNull = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("code")) {
                this.code = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanHttpNotificationObjectData");
        kparams.add("apiObjectType", this.apiObjectType);
        kparams.add("format", this.format);
        kparams.add("ignoreNull", this.ignoreNull);
        kparams.add("code", this.code);
        return kparams;
    }

}

