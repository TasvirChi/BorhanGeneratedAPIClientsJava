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
import com.borhan.client.enums.BorhanHttpNotificationMethod;
import com.borhan.client.enums.BorhanHttpNotificationAuthenticationMethod;
import com.borhan.client.enums.BorhanHttpNotificationSslVersion;
import com.borhan.client.enums.BorhanHttpNotificationCertificateType;
import com.borhan.client.enums.BorhanHttpNotificationSslKeyType;
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
public class BorhanHttpNotificationTemplate extends BorhanEventNotificationTemplate {
	/**  Remote server URL     */
    public String url;
	/**  Request method.     */
    public BorhanHttpNotificationMethod method;
	/**  Data to send.     */
    public BorhanHttpNotificationData data;
	/**  The maximum number of seconds to allow cURL functions to execute.     */
    public int timeout = Integer.MIN_VALUE;
	/**  The number of seconds to wait while trying to connect.   Must be larger than
	  zero.     */
    public int connectTimeout = Integer.MIN_VALUE;
	/**  A username to use for the connection.     */
    public String username;
	/**  A password to use for the connection.     */
    public String password;
	/**  The HTTP authentication method to use.     */
    public BorhanHttpNotificationAuthenticationMethod authenticationMethod;
	/**  The SSL version (2 or 3) to use.   By default PHP will try to determine this
	  itself, although in some cases this must be set manually.     */
    public BorhanHttpNotificationSslVersion sslVersion;
	/**  SSL certificate to verify the peer with.     */
    public String sslCertificate;
	/**  The format of the certificate.     */
    public BorhanHttpNotificationCertificateType sslCertificateType;
	/**  The password required to use the certificate.     */
    public String sslCertificatePassword;
	/**  The identifier for the crypto engine of the private SSL key specified in ssl
	  key.     */
    public String sslEngine;
	/**  The identifier for the crypto engine used for asymmetric crypto operations.     */
    public String sslEngineDefault;
	/**  The key type of the private SSL key specified in ssl key - PEM / DER / ENG.     */
    public BorhanHttpNotificationSslKeyType sslKeyType;
	/**  Private SSL key.     */
    public String sslKey;
	/**  The secret password needed to use the private SSL key specified in ssl key.     */
    public String sslKeyPassword;
	/**  Adds a e-mail custom header     */
    public ArrayList<BorhanKeyValue> customHeaders;

    public BorhanHttpNotificationTemplate() {
    }

    public BorhanHttpNotificationTemplate(Element node) throws BorhanApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("url")) {
                this.url = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("method")) {
                this.method = BorhanHttpNotificationMethod.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("data")) {
                this.data = ParseUtils.parseObject(BorhanHttpNotificationData.class, aNode);
                continue;
            } else if (nodeName.equals("timeout")) {
                this.timeout = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("connectTimeout")) {
                this.connectTimeout = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("username")) {
                this.username = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("password")) {
                this.password = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("authenticationMethod")) {
                this.authenticationMethod = BorhanHttpNotificationAuthenticationMethod.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("sslVersion")) {
                this.sslVersion = BorhanHttpNotificationSslVersion.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("sslCertificate")) {
                this.sslCertificate = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sslCertificateType")) {
                this.sslCertificateType = BorhanHttpNotificationCertificateType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("sslCertificatePassword")) {
                this.sslCertificatePassword = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sslEngine")) {
                this.sslEngine = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sslEngineDefault")) {
                this.sslEngineDefault = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sslKeyType")) {
                this.sslKeyType = BorhanHttpNotificationSslKeyType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("sslKey")) {
                this.sslKey = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("sslKeyPassword")) {
                this.sslKeyPassword = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("customHeaders")) {
                this.customHeaders = ParseUtils.parseArray(BorhanKeyValue.class, aNode);
                continue;
            } 
        }
    }

    public BorhanParams toParams() {
        BorhanParams kparams = super.toParams();
        kparams.add("objectType", "BorhanHttpNotificationTemplate");
        kparams.add("url", this.url);
        kparams.add("method", this.method);
        kparams.add("data", this.data);
        kparams.add("timeout", this.timeout);
        kparams.add("connectTimeout", this.connectTimeout);
        kparams.add("username", this.username);
        kparams.add("password", this.password);
        kparams.add("authenticationMethod", this.authenticationMethod);
        kparams.add("sslVersion", this.sslVersion);
        kparams.add("sslCertificate", this.sslCertificate);
        kparams.add("sslCertificateType", this.sslCertificateType);
        kparams.add("sslCertificatePassword", this.sslCertificatePassword);
        kparams.add("sslEngine", this.sslEngine);
        kparams.add("sslEngineDefault", this.sslEngineDefault);
        kparams.add("sslKeyType", this.sslKeyType);
        kparams.add("sslKey", this.sslKey);
        kparams.add("sslKeyPassword", this.sslKeyPassword);
        kparams.add("customHeaders", this.customHeaders);
        return kparams;
    }

}

