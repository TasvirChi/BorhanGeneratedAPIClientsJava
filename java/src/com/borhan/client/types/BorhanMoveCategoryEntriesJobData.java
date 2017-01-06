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
public class BorhanMoveCategoryEntriesJobData extends BorhanJobData {
	/**  Source category id     */
    public int srcCategoryId = Integer.MIN_VALUE;
	/**  Destination category id        */
    public int destCategoryId = Integer.MIN_VALUE;
	/**  Saves the last category id that its entries moved completely      In case of
	  crash the batch will restart from that point        */
    public int lastMovedCategoryId = Integer.MIN_VALUE;
	/**  Saves the last page index of the child categories filter pager      In case of
	  crash the batch will restart from that point        */
    public int lastMovedCategoryPageIndex = Integer.MIN_VALUE;
	/**  Saves the last page index of the category entries filter pager      In case of
	  crash the batch will restart from that point        */
    public int lastMovedCategoryEntryPageIndex = Integer.MIN_VALUE;
	/**  All entries from all child categories will be moved as well        */
    public boolean moveFromChildren;
	/**  Entries won't be deleted from the source entry        */
    public boolean copyOnly;
	/**  Destination categories fallback ids        */
    public String destCategoryFullIds;

    public BorhanMoveCategoryEntriesJobData() {
    }

    public BorhanMoveCategoryEntriesJobData(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("srcCategoryId")) {
                this.srcCategoryId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("destCategoryId")) {
                this.destCategoryId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("lastMovedCategoryId")) {
                this.lastMovedCategoryId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("lastMovedCategoryPageIndex")) {
                this.lastMovedCategoryPageIndex = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("lastMovedCategoryEntryPageIndex")) {
                this.lastMovedCategoryEntryPageIndex = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("moveFromChildren")) {
                this.moveFromChildren = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("copyOnly")) {
                this.copyOnly = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("destCategoryFullIds")) {
                this.destCategoryFullIds = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanMoveCategoryEntriesJobData");
        kparams.add("srcCategoryId", this.srcCategoryId);
        kparams.add("destCategoryId", this.destCategoryId);
        kparams.add("lastMovedCategoryId", this.lastMovedCategoryId);
        kparams.add("lastMovedCategoryPageIndex", this.lastMovedCategoryPageIndex);
        kparams.add("lastMovedCategoryEntryPageIndex", this.lastMovedCategoryEntryPageIndex);
        kparams.add("moveFromChildren", this.moveFromChildren);
        kparams.add("copyOnly", this.copyOnly);
        kparams.add("destCategoryFullIds", this.destCategoryFullIds);
        return kparams;
    }

}

