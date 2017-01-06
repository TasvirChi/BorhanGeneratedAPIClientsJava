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
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.borhan.client.BorhanFiles;
import com.borhan.client.BorhanFile;
import org.w3c.dom.Element;
import com.borhan.client.utils.ParseUtils;
import com.borhan.client.BorhanParams;
import com.borhan.client.BorhanApiException;
import com.borhan.client.types.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BorhanUploadService extends BorhanServiceBase {
    public BorhanUploadService(BorhanClient client) {
        this.borhanClient = client;
    }

    public String upload(File fileData) throws BorhanApiException {
        return this.upload(new BorhanFile(fileData));
    }

    public String upload(InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.upload(new BorhanFile(fileData, fileDataName, fileDataSize));
    }

    public String upload(FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.upload(new BorhanFile(fileData, fileDataName));
    }

    public String upload(BorhanFile fileData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        this.borhanClient.queueServiceCall("upload", "upload", kparams, kfiles);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public BorhanUploadResponse getUploadedFileTokenByFileName(String fileName) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("fileName", fileName);
        this.borhanClient.queueServiceCall("upload", "getUploadedFileTokenByFileName", kparams, BorhanUploadResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUploadResponse.class, resultXmlElement);
    }
}
