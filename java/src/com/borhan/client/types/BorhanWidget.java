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
import com.borhan.client.BorhanObjectBase;
import com.borhan.client.enums.BorhanWidgetSecurityType;
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
public class BorhanWidget extends BorhanObjectBase {
    public String id;
    public String sourceWidgetId;
    public String rootWidgetId;
    public int partnerId = Integer.MIN_VALUE;
    public String entryId;
    public int uiConfId = Integer.MIN_VALUE;
    public BorhanWidgetSecurityType securityType;
    public int securityPolicy = Integer.MIN_VALUE;
    public int createdAt = Integer.MIN_VALUE;
    public int updatedAt = Integer.MIN_VALUE;
	/**  Can be used to store various partner related data as a string      */
    public String partnerData;
    public String widgetHTML;
	/**  Should enforce entitlement on feed entries     */
    public boolean enforceEntitlement;
	/**  Set privacy context for search entries that assiged to private and public
	  categories within a category privacy context.     */
    public String privacyContext;
	/**  Addes the HTML5 script line to the widget's embed code     */
    public boolean addEmbedHtml5Support;

    public BorhanWidget() {
    }

    public BorhanWidget(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sourceWidgetId")) {
                this.sourceWidgetId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("rootWidgetId")) {
                this.rootWidgetId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("uiConfId")) {
                this.uiConfId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("securityType")) {
                this.securityType = BorhanWidgetSecurityType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("securityPolicy")) {
                this.securityPolicy = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerData")) {
                this.partnerData = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("widgetHTML")) {
                this.widgetHTML = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("enforceEntitlement")) {
                this.enforceEntitlement = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("privacyContext")) {
                this.privacyContext = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("addEmbedHtml5Support")) {
                this.addEmbedHtml5Support = ParseUtils.parseBool(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanWidget");
        kparams.add("sourceWidgetId", this.sourceWidgetId);
        kparams.add("entryId", this.entryId);
        kparams.add("uiConfId", this.uiConfId);
        kparams.add("securityType", this.securityType);
        kparams.add("securityPolicy", this.securityPolicy);
        kparams.add("partnerData", this.partnerData);
        kparams.add("enforceEntitlement", this.enforceEntitlement);
        kparams.add("privacyContext", this.privacyContext);
        kparams.add("addEmbedHtml5Support", this.addEmbedHtml5Support);
        return kparams;
    }

}

