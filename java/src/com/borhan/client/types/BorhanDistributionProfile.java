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
import com.borhan.client.enums.BorhanDistributionProviderType;
import com.borhan.client.enums.BorhanDistributionProfileStatus;
import com.borhan.client.enums.BorhanDistributionProfileActionStatus;
import java.util.ArrayList;
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
public abstract class BorhanDistributionProfile extends BorhanObjectBase {
	/**  Auto generated unique id     */
    public int id = Integer.MIN_VALUE;
	/**  Profile creation date as Unix timestamp (In seconds)     */
    public int createdAt = Integer.MIN_VALUE;
	/**  Profile last update date as Unix timestamp (In seconds)     */
    public int updatedAt = Integer.MIN_VALUE;
    public int partnerId = Integer.MIN_VALUE;
    public BorhanDistributionProviderType providerType;
    public String name;
    public BorhanDistributionProfileStatus status;
    public BorhanDistributionProfileActionStatus submitEnabled;
    public BorhanDistributionProfileActionStatus updateEnabled;
    public BorhanDistributionProfileActionStatus deleteEnabled;
    public BorhanDistributionProfileActionStatus reportEnabled;
	/**  Comma separated flavor params ids that should be auto converted     */
    public String autoCreateFlavors;
	/**  Comma separated thumbnail params ids that should be auto generated     */
    public String autoCreateThumb;
	/**  Comma separated flavor params ids that should be submitted if ready     */
    public String optionalFlavorParamsIds;
	/**  Comma separated flavor params ids that required to be ready before submission     */
    public String requiredFlavorParamsIds;
	/**  Thumbnail dimensions that should be submitted if ready     */
    public ArrayList<BorhanDistributionThumbDimensions> optionalThumbDimensions;
	/**  Thumbnail dimensions that required to be readt before submission     */
    public ArrayList<BorhanDistributionThumbDimensions> requiredThumbDimensions;
	/**  Asset Distribution Rules for assets that should be submitted if ready     */
    public ArrayList<BorhanAssetDistributionRule> optionalAssetDistributionRules;
	/**  Assets Asset Distribution Rules for assets that are required to be ready before
	  submission     */
    public ArrayList<BorhanAssetDistributionRule> requiredAssetDistributionRules;
	/**  If entry distribution sunrise not specified that will be the default since entry
	  creation time, in seconds     */
    public int sunriseDefaultOffset = Integer.MIN_VALUE;
	/**  If entry distribution sunset not specified that will be the default since entry
	  creation time, in seconds     */
    public int sunsetDefaultOffset = Integer.MIN_VALUE;
	/**  The best external storage to be used to download the asset files from     */
    public int recommendedStorageProfileForDownload = Integer.MIN_VALUE;
	/**  The best Borhan data center to be used to download the asset files to     */
    public int recommendedDcForDownload = Integer.MIN_VALUE;
	/**  The best Borhan data center to be used to execute the distribution job     */
    public int recommendedDcForExecute = Integer.MIN_VALUE;

    public BorhanDistributionProfile() {
    }

    public BorhanDistributionProfile(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("providerType")) {
                this.providerType = BorhanDistributionProviderType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("name")) {
                this.name = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanDistributionProfileStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("submitEnabled")) {
                this.submitEnabled = BorhanDistributionProfileActionStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("updateEnabled")) {
                this.updateEnabled = BorhanDistributionProfileActionStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("deleteEnabled")) {
                this.deleteEnabled = BorhanDistributionProfileActionStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("reportEnabled")) {
                this.reportEnabled = BorhanDistributionProfileActionStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("autoCreateFlavors")) {
                this.autoCreateFlavors = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("autoCreateThumb")) {
                this.autoCreateThumb = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("optionalFlavorParamsIds")) {
                this.optionalFlavorParamsIds = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("requiredFlavorParamsIds")) {
                this.requiredFlavorParamsIds = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("optionalThumbDimensions")) {
                this.optionalThumbDimensions = ParseUtils.parseArray(BorhanDistributionThumbDimensions.class, aNode);
                continue;
            } else if (nodeName.equals("requiredThumbDimensions")) {
                this.requiredThumbDimensions = ParseUtils.parseArray(BorhanDistributionThumbDimensions.class, aNode);
                continue;
            } else if (nodeName.equals("optionalAssetDistributionRules")) {
                this.optionalAssetDistributionRules = ParseUtils.parseArray(BorhanAssetDistributionRule.class, aNode);
                continue;
            } else if (nodeName.equals("requiredAssetDistributionRules")) {
                this.requiredAssetDistributionRules = ParseUtils.parseArray(BorhanAssetDistributionRule.class, aNode);
                continue;
            } else if (nodeName.equals("sunriseDefaultOffset")) {
                this.sunriseDefaultOffset = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("sunsetDefaultOffset")) {
                this.sunsetDefaultOffset = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("recommendedStorageProfileForDownload")) {
                this.recommendedStorageProfileForDownload = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("recommendedDcForDownload")) {
                this.recommendedDcForDownload = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("recommendedDcForExecute")) {
                this.recommendedDcForExecute = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanDistributionProfile");
        kparams.add("providerType", this.providerType);
        kparams.add("name", this.name);
        kparams.add("status", this.status);
        kparams.add("submitEnabled", this.submitEnabled);
        kparams.add("updateEnabled", this.updateEnabled);
        kparams.add("deleteEnabled", this.deleteEnabled);
        kparams.add("reportEnabled", this.reportEnabled);
        kparams.add("autoCreateFlavors", this.autoCreateFlavors);
        kparams.add("autoCreateThumb", this.autoCreateThumb);
        kparams.add("optionalFlavorParamsIds", this.optionalFlavorParamsIds);
        kparams.add("requiredFlavorParamsIds", this.requiredFlavorParamsIds);
        kparams.add("optionalThumbDimensions", this.optionalThumbDimensions);
        kparams.add("requiredThumbDimensions", this.requiredThumbDimensions);
        kparams.add("optionalAssetDistributionRules", this.optionalAssetDistributionRules);
        kparams.add("requiredAssetDistributionRules", this.requiredAssetDistributionRules);
        kparams.add("sunriseDefaultOffset", this.sunriseDefaultOffset);
        kparams.add("sunsetDefaultOffset", this.sunsetDefaultOffset);
        kparams.add("recommendedStorageProfileForDownload", this.recommendedStorageProfileForDownload);
        kparams.add("recommendedDcForDownload", this.recommendedDcForDownload);
        kparams.add("recommendedDcForExecute", this.recommendedDcForExecute);
        return kparams;
    }

}

