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
import com.borhan.client.enums.BorhanAppearInListType;
import com.borhan.client.enums.BorhanPrivacyType;
import com.borhan.client.enums.BorhanInheritanceType;
import com.borhan.client.enums.BorhanUserJoinPolicyType;
import com.borhan.client.enums.BorhanCategoryUserPermissionLevel;
import com.borhan.client.enums.BorhanContributionPolicyType;
import com.borhan.client.enums.BorhanCategoryStatus;
import com.borhan.client.enums.BorhanCategoryOrderBy;
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
public class BorhanCategory extends BorhanObjectBase {
	/**  The id of the Category     */
    public int id = Integer.MIN_VALUE;
    public int parentId = Integer.MIN_VALUE;
    public int depth = Integer.MIN_VALUE;
    public int partnerId = Integer.MIN_VALUE;
	/**  The name of the Category.    The following characters are not allowed: '<', '>',
	  ','     */
    public String name;
	/**  The full name of the Category     */
    public String fullName;
	/**  The full ids of the Category     */
    public String fullIds;
	/**  Number of entries in this Category (including child categories)     */
    public int entriesCount = Integer.MIN_VALUE;
	/**  Creation date as Unix timestamp (In seconds)     */
    public int createdAt = Integer.MIN_VALUE;
	/**  Update date as Unix timestamp (In seconds)     */
    public int updatedAt = Integer.MIN_VALUE;
	/**  Category description     */
    public String description;
	/**  Category tags     */
    public String tags;
	/**  If category will be returned for list action.     */
    public BorhanAppearInListType appearInList;
	/**  defines the privacy of the entries that assigned to this category     */
    public BorhanPrivacyType privacy;
	/**  If Category members are inherited from parent category or set manualy.      */
    public BorhanInheritanceType inheritanceType;
	/**  Who can ask to join this category     */
    public BorhanUserJoinPolicyType userJoinPolicy;
	/**  Default permissionLevel for new users     */
    public BorhanCategoryUserPermissionLevel defaultPermissionLevel;
	/**  Category Owner (User id)     */
    public String owner;
	/**  Number of entries that belong to this category directly     */
    public int directEntriesCount = Integer.MIN_VALUE;
	/**  Category external id, controlled and managed by the partner.     */
    public String referenceId;
	/**  who can assign entries to this category     */
    public BorhanContributionPolicyType contributionPolicy;
	/**  Number of active members for this category     */
    public int membersCount = Integer.MIN_VALUE;
	/**  Number of pending members for this category     */
    public int pendingMembersCount = Integer.MIN_VALUE;
	/**  Set privacy context for search entries that assiged to private and public
	  categories. the entries will be private if the search context is set with those
	  categories.     */
    public String privacyContext;
	/**  comma separated parents that defines a privacyContext for search     */
    public String privacyContexts;
	/**  Status     */
    public BorhanCategoryStatus status;
	/**  The category id that this category inherit its members and members permission
	  (for contribution and join)     */
    public int inheritedParentId = Integer.MIN_VALUE;
	/**  Can be used to store various partner related data as a numeric value     */
    public int partnerSortValue = Integer.MIN_VALUE;
	/**  Can be used to store various partner related data as a string      */
    public String partnerData;
	/**  Enable client side applications to define how to sort the category child
	  categories      */
    public BorhanCategoryOrderBy defaultOrderBy;
	/**  Number of direct children categories     */
    public int directSubCategoriesCount = Integer.MIN_VALUE;
	/**  Moderation to add entries to this category by users that are not of permission
	  level Manager or Moderator.       */
    public BorhanNullableBoolean moderation;
	/**  Nunber of pending moderation entries     */
    public int pendingEntriesCount = Integer.MIN_VALUE;

    public BorhanCategory() {
    }

    public BorhanCategory(Element node) throws BorhanApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("parentId")) {
                this.parentId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("depth")) {
                this.depth = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("name")) {
                this.name = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fullName")) {
                this.fullName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fullIds")) {
                this.fullIds = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("entriesCount")) {
                this.entriesCount = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("tags")) {
                this.tags = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("appearInList")) {
                this.appearInList = BorhanAppearInListType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("privacy")) {
                this.privacy = BorhanPrivacyType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("inheritanceType")) {
                this.inheritanceType = BorhanInheritanceType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("userJoinPolicy")) {
                this.userJoinPolicy = BorhanUserJoinPolicyType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("defaultPermissionLevel")) {
                this.defaultPermissionLevel = BorhanCategoryUserPermissionLevel.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("owner")) {
                this.owner = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("directEntriesCount")) {
                this.directEntriesCount = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("referenceId")) {
                this.referenceId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("contributionPolicy")) {
                this.contributionPolicy = BorhanContributionPolicyType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("membersCount")) {
                this.membersCount = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("pendingMembersCount")) {
                this.pendingMembersCount = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("privacyContext")) {
                this.privacyContext = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("privacyContexts")) {
                this.privacyContexts = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("status")) {
                this.status = BorhanCategoryStatus.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("inheritedParentId")) {
                this.inheritedParentId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerSortValue")) {
                this.partnerSortValue = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerData")) {
                this.partnerData = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("defaultOrderBy")) {
                this.defaultOrderBy = BorhanCategoryOrderBy.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("directSubCategoriesCount")) {
                this.directSubCategoriesCount = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("moderation")) {
                this.moderation = BorhanNullableBoolean.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("pendingEntriesCount")) {
                this.pendingEntriesCount = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanCategory");
        kparams.add("parentId", this.parentId);
        kparams.add("name", this.name);
        kparams.add("description", this.description);
        kparams.add("tags", this.tags);
        kparams.add("appearInList", this.appearInList);
        kparams.add("privacy", this.privacy);
        kparams.add("inheritanceType", this.inheritanceType);
        kparams.add("defaultPermissionLevel", this.defaultPermissionLevel);
        kparams.add("owner", this.owner);
        kparams.add("referenceId", this.referenceId);
        kparams.add("contributionPolicy", this.contributionPolicy);
        kparams.add("privacyContext", this.privacyContext);
        kparams.add("partnerSortValue", this.partnerSortValue);
        kparams.add("partnerData", this.partnerData);
        kparams.add("defaultOrderBy", this.defaultOrderBy);
        kparams.add("moderation", this.moderation);
        return kparams;
    }

}

