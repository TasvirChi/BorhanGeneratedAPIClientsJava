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
package com.borhan.client.services;

import com.borhan.client.BorhanClient;
import com.borhan.client.BorhanServiceBase;
import com.borhan.client.types.*;
import org.w3c.dom.Element;
import com.borhan.client.utils.ParseUtils;
import com.borhan.client.BorhanParams;
import com.borhan.client.BorhanApiException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.borhan.client.BorhanFiles;
import com.borhan.client.BorhanFile;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Annotation service - Video Annotation    */
@SuppressWarnings("serial")
public class BorhanAnnotationService extends BorhanServiceBase {
    public BorhanAnnotationService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Allows you to add an annotation object associated with an entry     */
    public BorhanAnnotation add(BorhanCuePoint annotation) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("annotation", annotation);
        this.borhanClient.queueServiceCall("annotation_annotation", "add", kparams, BorhanAnnotation.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAnnotation.class, resultXmlElement);
    }

	/**  Update annotation by id     */
    public BorhanAnnotation update(String id, BorhanCuePoint annotation) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("annotation", annotation);
        this.borhanClient.queueServiceCall("annotation_annotation", "update", kparams, BorhanAnnotation.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAnnotation.class, resultXmlElement);
    }

    public BorhanAnnotationListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanAnnotationListResponse list(BorhanCuePointFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List annotation objects by filter and pager    */
    public BorhanAnnotationListResponse list(BorhanCuePointFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("annotation_annotation", "list", kparams, BorhanAnnotationListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAnnotationListResponse.class, resultXmlElement);
    }

    public BorhanCuePointListResponse addFromBulk(File fileData) throws BorhanApiException {
        return this.addFromBulk(new BorhanFile(fileData));
    }

    public BorhanCuePointListResponse addFromBulk(InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.addFromBulk(new BorhanFile(fileData, fileDataName, fileDataSize));
    }

    public BorhanCuePointListResponse addFromBulk(FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.addFromBulk(new BorhanFile(fileData, fileDataName));
    }

	/**  Allows you to add multiple cue points objects by uploading XML that contains
	  multiple cue point definitions     */
    public BorhanCuePointListResponse addFromBulk(BorhanFile fileData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        this.borhanClient.queueServiceCall("annotation_annotation", "addFromBulk", kparams, kfiles, BorhanCuePointListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCuePointListResponse.class, resultXmlElement);
    }

    public String serveBulk() throws BorhanApiException {
        return this.serveBulk(null);
    }

    public String serveBulk(BorhanCuePointFilter filter) throws BorhanApiException {
        return this.serveBulk(filter, null);
    }

	/**  Download multiple cue points objects as XML definitions     */
    public String serveBulk(BorhanCuePointFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("annotation_annotation", "serveBulk", kparams);
        return this.borhanClient.serve();
    }

	/**  Retrieve an CuePoint object by id     */
    public BorhanCuePoint get(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("annotation_annotation", "get", kparams, BorhanCuePoint.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanCuePoint.class, resultXmlElement);
    }

    public int count() throws BorhanApiException {
        return this.count(null);
    }

	/**  count cue point objects by filter     */
    public int count(BorhanCuePointFilter filter) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        this.borhanClient.queueServiceCall("annotation_annotation", "count", kparams);
        if (this.borhanClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  delete cue point by id, and delete all children cue points     */
    public void delete(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("annotation_annotation", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
