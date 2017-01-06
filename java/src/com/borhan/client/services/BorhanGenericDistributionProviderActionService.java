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
import com.borhan.client.enums.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Generic Distribution Provider Actions service    */
@SuppressWarnings("serial")
public class BorhanGenericDistributionProviderActionService extends BorhanServiceBase {
    public BorhanGenericDistributionProviderActionService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Add new Generic Distribution Provider Action     */
    public BorhanGenericDistributionProviderAction add(BorhanGenericDistributionProviderAction genericDistributionProviderAction) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("genericDistributionProviderAction", genericDistributionProviderAction);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "add", kparams, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Add MRSS transform file to generic distribution provider action     */
    public BorhanGenericDistributionProviderAction addMrssTransform(int id, String xslData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("xslData", xslData);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addMrssTransform", kparams, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

    public BorhanGenericDistributionProviderAction addMrssTransformFromFile(int id, File xslFile) throws BorhanApiException {
        return this.addMrssTransformFromFile(id, new BorhanFile(xslFile));
    }

    public BorhanGenericDistributionProviderAction addMrssTransformFromFile(int id, InputStream xslFile, String xslFileName, long xslFileSize) throws BorhanApiException {
        return this.addMrssTransformFromFile(id, new BorhanFile(xslFile, xslFileName, xslFileSize));
    }

    public BorhanGenericDistributionProviderAction addMrssTransformFromFile(int id, FileInputStream xslFile, String xslFileName) throws BorhanApiException {
        return this.addMrssTransformFromFile(id, new BorhanFile(xslFile, xslFileName));
    }

	/**  Add MRSS transform file to generic distribution provider action     */
    public BorhanGenericDistributionProviderAction addMrssTransformFromFile(int id, BorhanFile xslFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("xslFile", xslFile);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addMrssTransformFromFile", kparams, kfiles, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Add MRSS validate file to generic distribution provider action     */
    public BorhanGenericDistributionProviderAction addMrssValidate(int id, String xsdData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("xsdData", xsdData);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addMrssValidate", kparams, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

    public BorhanGenericDistributionProviderAction addMrssValidateFromFile(int id, File xsdFile) throws BorhanApiException {
        return this.addMrssValidateFromFile(id, new BorhanFile(xsdFile));
    }

    public BorhanGenericDistributionProviderAction addMrssValidateFromFile(int id, InputStream xsdFile, String xsdFileName, long xsdFileSize) throws BorhanApiException {
        return this.addMrssValidateFromFile(id, new BorhanFile(xsdFile, xsdFileName, xsdFileSize));
    }

    public BorhanGenericDistributionProviderAction addMrssValidateFromFile(int id, FileInputStream xsdFile, String xsdFileName) throws BorhanApiException {
        return this.addMrssValidateFromFile(id, new BorhanFile(xsdFile, xsdFileName));
    }

	/**  Add MRSS validate file to generic distribution provider action     */
    public BorhanGenericDistributionProviderAction addMrssValidateFromFile(int id, BorhanFile xsdFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("xsdFile", xsdFile);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addMrssValidateFromFile", kparams, kfiles, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Add results transform file to generic distribution provider action     */
    public BorhanGenericDistributionProviderAction addResultsTransform(int id, String transformData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("transformData", transformData);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addResultsTransform", kparams, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

    public BorhanGenericDistributionProviderAction addResultsTransformFromFile(int id, File transformFile) throws BorhanApiException {
        return this.addResultsTransformFromFile(id, new BorhanFile(transformFile));
    }

    public BorhanGenericDistributionProviderAction addResultsTransformFromFile(int id, InputStream transformFile, String transformFileName, long transformFileSize) throws BorhanApiException {
        return this.addResultsTransformFromFile(id, new BorhanFile(transformFile, transformFileName, transformFileSize));
    }

    public BorhanGenericDistributionProviderAction addResultsTransformFromFile(int id, FileInputStream transformFile, String transformFileName) throws BorhanApiException {
        return this.addResultsTransformFromFile(id, new BorhanFile(transformFile, transformFileName));
    }

	/**  Add MRSS transform file to generic distribution provider action     */
    public BorhanGenericDistributionProviderAction addResultsTransformFromFile(int id, BorhanFile transformFile) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("transformFile", transformFile);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addResultsTransformFromFile", kparams, kfiles, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Get Generic Distribution Provider Action by id     */
    public BorhanGenericDistributionProviderAction get(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "get", kparams, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Get Generic Distribution Provider Action by provider id     */
    public BorhanGenericDistributionProviderAction getByProviderId(int genericDistributionProviderId, BorhanDistributionAction actionType) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("genericDistributionProviderId", genericDistributionProviderId);
        kparams.add("actionType", actionType);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "getByProviderId", kparams, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Update Generic Distribution Provider Action by provider id     */
    public BorhanGenericDistributionProviderAction updateByProviderId(int genericDistributionProviderId, BorhanDistributionAction actionType, BorhanGenericDistributionProviderAction genericDistributionProviderAction) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("genericDistributionProviderId", genericDistributionProviderId);
        kparams.add("actionType", actionType);
        kparams.add("genericDistributionProviderAction", genericDistributionProviderAction);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "updateByProviderId", kparams, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Update Generic Distribution Provider Action by id     */
    public BorhanGenericDistributionProviderAction update(int id, BorhanGenericDistributionProviderAction genericDistributionProviderAction) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("genericDistributionProviderAction", genericDistributionProviderAction);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "update", kparams, BorhanGenericDistributionProviderAction.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Delete Generic Distribution Provider Action by id     */
    public void delete(int id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "delete", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Delete Generic Distribution Provider Action by provider id     */
    public void deleteByProviderId(int genericDistributionProviderId, BorhanDistributionAction actionType) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("genericDistributionProviderId", genericDistributionProviderId);
        kparams.add("actionType", actionType);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "deleteByProviderId", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanGenericDistributionProviderActionListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanGenericDistributionProviderActionListResponse list(BorhanGenericDistributionProviderActionFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  List all distribution providers     */
    public BorhanGenericDistributionProviderActionListResponse list(BorhanGenericDistributionProviderActionFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "list", kparams, BorhanGenericDistributionProviderActionListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanGenericDistributionProviderActionListResponse.class, resultXmlElement);
    }
}
