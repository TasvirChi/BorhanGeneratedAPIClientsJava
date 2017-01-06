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
package com.borhan.client.enums;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum BorhanSchemaType implements BorhanEnumAsString {
    BULK_UPLOAD_RESULT_XML ("bulkUploadXml.bulkUploadResultXML"),
    BULK_UPLOAD_XML ("bulkUploadXml.bulkUploadXML"),
    INGEST_API ("cuePoint.ingestAPI"),
    SERVE_API ("cuePoint.serveAPI"),
    DROP_FOLDER_XML ("dropFolderXmlBulkUpload.dropFolderXml"),
    SYNDICATION ("syndication");

    public String hashCode;

    BorhanSchemaType(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public static BorhanSchemaType get(String hashCode) {
        if (hashCode.equals("bulkUploadXml.bulkUploadResultXML"))
        {
           return BULK_UPLOAD_RESULT_XML;
        }
        else 
        if (hashCode.equals("bulkUploadXml.bulkUploadXML"))
        {
           return BULK_UPLOAD_XML;
        }
        else 
        if (hashCode.equals("cuePoint.ingestAPI"))
        {
           return INGEST_API;
        }
        else 
        if (hashCode.equals("cuePoint.serveAPI"))
        {
           return SERVE_API;
        }
        else 
        if (hashCode.equals("dropFolderXmlBulkUpload.dropFolderXml"))
        {
           return DROP_FOLDER_XML;
        }
        else 
        if (hashCode.equals("syndication"))
        {
           return SYNDICATION;
        }
        else 
        {
           return BULK_UPLOAD_RESULT_XML;
        }
    }
}
