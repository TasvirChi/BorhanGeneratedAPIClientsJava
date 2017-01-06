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
import com.borhan.client.enums.BorhanDrmProviderType;
import com.borhan.client.enums.BorhanDrmPolicyStatus;
import com.borhan.client.enums.BorhanDrmLicenseScenario;
import com.borhan.client.enums.BorhanDrmLicenseType;
import com.borhan.client.enums.BorhanDrmLicenseExpirationPolicy;
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
public class BorhanDrmPolicy extends BorhanObjectBase {
    public int id = Integer.MIN_VALUE;
    public int partnerId = Integer.MIN_VALUE;
    public String name;
    public String systemName;
    public String description;
    public BorhanDrmProviderType provider;
    public BorhanDrmPolicyStatus status;
    public BorhanDrmLicenseScenario scenario;
    public BorhanDrmLicenseType licenseType;
    public BorhanDrmLicenseExpirationPolicy licenseExpirationPolicy;
	/**  Duration in days the license is effective     */
    public int duration = Integer.MIN_VALUE;
    public int createdAt = Integer.MIN_VALUE;
    public int updatedAt = Integer.MIN_VALUE;

    public BorhanDrmPolicy() {
    }

    public BorhanDrmPolicy(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("name")) {
                this.name = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("systemName")) {
                this.systemName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("provider")) {
                this.provider = BorhanDrmProviderType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanDrmPolicyStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("scenario")) {
                this.scenario = BorhanDrmLicenseScenario.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("licenseType")) {
                this.licenseType = BorhanDrmLicenseType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("licenseExpirationPolicy")) {
                this.licenseExpirationPolicy = BorhanDrmLicenseExpirationPolicy.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("duration")) {
                this.duration = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanDrmPolicy");
        kparams.add("partnerId", this.partnerId);
        kparams.add("name", this.name);
        kparams.add("systemName", this.systemName);
        kparams.add("description", this.description);
        kparams.add("provider", this.provider);
        kparams.add("status", this.status);
        kparams.add("scenario", this.scenario);
        kparams.add("licenseType", this.licenseType);
        kparams.add("licenseExpirationPolicy", this.licenseExpirationPolicy);
        kparams.add("duration", this.duration);
        return kparams;
    }

}

