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
import com.borhan.client.enums.BorhanAuditTrailStatus;
import com.borhan.client.enums.BorhanAuditTrailObjectType;
import com.borhan.client.enums.BorhanAuditTrailAction;
import com.borhan.client.enums.BorhanAuditTrailContext;
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
public abstract class BorhanAuditTrailBaseFilter extends BorhanFilter {
    public int idEqual = Integer.MIN_VALUE;
    public int createdAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int createdAtLessThanOrEqual = Integer.MIN_VALUE;
    public int parsedAtGreaterThanOrEqual = Integer.MIN_VALUE;
    public int parsedAtLessThanOrEqual = Integer.MIN_VALUE;
    public BorhanAuditTrailStatus statusEqual;
    public String statusIn;
    public BorhanAuditTrailObjectType auditObjectTypeEqual;
    public String auditObjectTypeIn;
    public String objectIdEqual;
    public String objectIdIn;
    public String relatedObjectIdEqual;
    public String relatedObjectIdIn;
    public BorhanAuditTrailObjectType relatedObjectTypeEqual;
    public String relatedObjectTypeIn;
    public String entryIdEqual;
    public String entryIdIn;
    public int masterPartnerIdEqual = Integer.MIN_VALUE;
    public String masterPartnerIdIn;
    public int partnerIdEqual = Integer.MIN_VALUE;
    public String partnerIdIn;
    public String requestIdEqual;
    public String requestIdIn;
    public String userIdEqual;
    public String userIdIn;
    public BorhanAuditTrailAction actionEqual;
    public String actionIn;
    public String ksEqual;
    public BorhanAuditTrailContext contextEqual;
    public String contextIn;
    public String entryPointEqual;
    public String entryPointIn;
    public String serverNameEqual;
    public String serverNameIn;
    public String ipAddressEqual;
    public String ipAddressIn;
    public String clientTagEqual;

    public BorhanAuditTrailBaseFilter() {
    }

    public BorhanAuditTrailBaseFilter(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("idEqual")) {
                this.idEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAtGreaterThanOrEqual")) {
                this.createdAtGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAtLessThanOrEqual")) {
                this.createdAtLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("parsedAtGreaterThanOrEqual")) {
                this.parsedAtGreaterThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("parsedAtLessThanOrEqual")) {
                this.parsedAtLessThanOrEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("statusEqual")) {
                this.statusEqual = BorhanAuditTrailStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("statusIn")) {
                this.statusIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("auditObjectTypeEqual")) {
                this.auditObjectTypeEqual = BorhanAuditTrailObjectType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("auditObjectTypeIn")) {
                this.auditObjectTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objectIdEqual")) {
                this.objectIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objectIdIn")) {
                this.objectIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("relatedObjectIdEqual")) {
                this.relatedObjectIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("relatedObjectIdIn")) {
                this.relatedObjectIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("relatedObjectTypeEqual")) {
                this.relatedObjectTypeEqual = BorhanAuditTrailObjectType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("relatedObjectTypeIn")) {
                this.relatedObjectTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("entryIdEqual")) {
                this.entryIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("entryIdIn")) {
                this.entryIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("masterPartnerIdEqual")) {
                this.masterPartnerIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("masterPartnerIdIn")) {
                this.masterPartnerIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerIdEqual")) {
                this.partnerIdEqual = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerIdIn")) {
                this.partnerIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("requestIdEqual")) {
                this.requestIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("requestIdIn")) {
                this.requestIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("userIdEqual")) {
                this.userIdEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("userIdIn")) {
                this.userIdIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("actionEqual")) {
                this.actionEqual = BorhanAuditTrailAction.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("actionIn")) {
                this.actionIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("ksEqual")) {
                this.ksEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("contextEqual")) {
                this.contextEqual = BorhanAuditTrailContext.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("contextIn")) {
                this.contextIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("entryPointEqual")) {
                this.entryPointEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("entryPointIn")) {
                this.entryPointIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("serverNameEqual")) {
                this.serverNameEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("serverNameIn")) {
                this.serverNameIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("ipAddressEqual")) {
                this.ipAddressEqual = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("ipAddressIn")) {
                this.ipAddressIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("clientTagEqual")) {
                this.clientTagEqual = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanAuditTrailBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("parsedAtGreaterThanOrEqual", this.parsedAtGreaterThanOrEqual);
        kparams.add("parsedAtLessThanOrEqual", this.parsedAtLessThanOrEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("auditObjectTypeEqual", this.auditObjectTypeEqual);
        kparams.add("auditObjectTypeIn", this.auditObjectTypeIn);
        kparams.add("objectIdEqual", this.objectIdEqual);
        kparams.add("objectIdIn", this.objectIdIn);
        kparams.add("relatedObjectIdEqual", this.relatedObjectIdEqual);
        kparams.add("relatedObjectIdIn", this.relatedObjectIdIn);
        kparams.add("relatedObjectTypeEqual", this.relatedObjectTypeEqual);
        kparams.add("relatedObjectTypeIn", this.relatedObjectTypeIn);
        kparams.add("entryIdEqual", this.entryIdEqual);
        kparams.add("entryIdIn", this.entryIdIn);
        kparams.add("masterPartnerIdEqual", this.masterPartnerIdEqual);
        kparams.add("masterPartnerIdIn", this.masterPartnerIdIn);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("requestIdEqual", this.requestIdEqual);
        kparams.add("requestIdIn", this.requestIdIn);
        kparams.add("userIdEqual", this.userIdEqual);
        kparams.add("userIdIn", this.userIdIn);
        kparams.add("actionEqual", this.actionEqual);
        kparams.add("actionIn", this.actionIn);
        kparams.add("ksEqual", this.ksEqual);
        kparams.add("contextEqual", this.contextEqual);
        kparams.add("contextIn", this.contextIn);
        kparams.add("entryPointEqual", this.entryPointEqual);
        kparams.add("entryPointIn", this.entryPointIn);
        kparams.add("serverNameEqual", this.serverNameEqual);
        kparams.add("serverNameIn", this.serverNameIn);
        kparams.add("ipAddressEqual", this.ipAddressEqual);
        kparams.add("ipAddressIn", this.ipAddressIn);
        kparams.add("clientTagEqual", this.clientTagEqual);
        return kparams;
    }

}

