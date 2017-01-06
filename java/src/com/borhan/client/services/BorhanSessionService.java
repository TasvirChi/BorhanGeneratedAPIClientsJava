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
import com.borhan.client.enums.*;
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

/**  Session service    */
@SuppressWarnings("serial")
public class BorhanSessionService extends BorhanServiceBase {
    public BorhanSessionService(BorhanClient client) {
        this.borhanClient = client;
    }

    public String start(String secret) throws BorhanApiException {
        return this.start(secret, "");
    }

    public String start(String secret, String userId) throws BorhanApiException {
        return this.start(secret, userId, BorhanSessionType.get(0));
    }

    public String start(String secret, String userId, BorhanSessionType type) throws BorhanApiException {
        return this.start(secret, userId, type, Integer.MIN_VALUE);
    }

    public String start(String secret, String userId, BorhanSessionType type, int partnerId) throws BorhanApiException {
        return this.start(secret, userId, type, partnerId, 86400);
    }

    public String start(String secret, String userId, BorhanSessionType type, int partnerId, int expiry) throws BorhanApiException {
        return this.start(secret, userId, type, partnerId, expiry, null);
    }

	/**  Start a session with Borhan's server.   The result KS is the session key that
	  you should pass to all services that requires a ticket.     */
    public String start(String secret, String userId, BorhanSessionType type, int partnerId, int expiry, String privileges) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("secret", secret);
        kparams.add("userId", userId);
        kparams.add("type", type);
        kparams.add("partnerId", partnerId);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.borhanClient.queueServiceCall("session", "start", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  End a session with the Borhan server, making the current KS invalid.     */
    public void end() throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        this.borhanClient.queueServiceCall("session", "end", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public String impersonate(String secret, int impersonatedPartnerId) throws BorhanApiException {
        return this.impersonate(secret, impersonatedPartnerId, "");
    }

    public String impersonate(String secret, int impersonatedPartnerId, String userId) throws BorhanApiException {
        return this.impersonate(secret, impersonatedPartnerId, userId, BorhanSessionType.get(0));
    }

    public String impersonate(String secret, int impersonatedPartnerId, String userId, BorhanSessionType type) throws BorhanApiException {
        return this.impersonate(secret, impersonatedPartnerId, userId, type, Integer.MIN_VALUE);
    }

    public String impersonate(String secret, int impersonatedPartnerId, String userId, BorhanSessionType type, int partnerId) throws BorhanApiException {
        return this.impersonate(secret, impersonatedPartnerId, userId, type, partnerId, 86400);
    }

    public String impersonate(String secret, int impersonatedPartnerId, String userId, BorhanSessionType type, int partnerId, int expiry) throws BorhanApiException {
        return this.impersonate(secret, impersonatedPartnerId, userId, type, partnerId, expiry, null);
    }

	/**  Start an impersonated session with Borhan's server.   The result KS is the
	  session key that you should pass to all services that requires a ticket.     */
    public String impersonate(String secret, int impersonatedPartnerId, String userId, BorhanSessionType type, int partnerId, int expiry, String privileges) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("secret", secret);
        kparams.add("impersonatedPartnerId", impersonatedPartnerId);
        kparams.add("userId", userId);
        kparams.add("type", type);
        kparams.add("partnerId", partnerId);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.borhanClient.queueServiceCall("session", "impersonate", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public BorhanSessionInfo impersonateByKs(String session) throws BorhanApiException {
        return this.impersonateByKs(session, BorhanSessionType.get(Integer.MIN_VALUE));
    }

    public BorhanSessionInfo impersonateByKs(String session, BorhanSessionType type) throws BorhanApiException {
        return this.impersonateByKs(session, type, Integer.MIN_VALUE);
    }

    public BorhanSessionInfo impersonateByKs(String session, BorhanSessionType type, int expiry) throws BorhanApiException {
        return this.impersonateByKs(session, type, expiry, null);
    }

	/**  Start an impersonated session with Borhan's server.   The result KS info
	  contains the session key that you should pass to all services that requires a
	  ticket.   Type, expiry and privileges won't be changed if they're not set     */
    public BorhanSessionInfo impersonateByKs(String session, BorhanSessionType type, int expiry, String privileges) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("session", session);
        kparams.add("type", type);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.borhanClient.queueServiceCall("session", "impersonateByKs", kparams, BorhanSessionInfo.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanSessionInfo.class, resultXmlElement);
    }

    public BorhanSessionInfo get() throws BorhanApiException {
        return this.get(null);
    }

	/**  Parse session key and return its info     */
    public BorhanSessionInfo get(String session) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("session", session);
        this.borhanClient.queueServiceCall("session", "get", kparams, BorhanSessionInfo.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanSessionInfo.class, resultXmlElement);
    }

    public BorhanStartWidgetSessionResponse startWidgetSession(String widgetId) throws BorhanApiException {
        return this.startWidgetSession(widgetId, 86400);
    }

	/**  Start a session for Borhan's flash widgets     */
    public BorhanStartWidgetSessionResponse startWidgetSession(String widgetId, int expiry) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("widgetId", widgetId);
        kparams.add("expiry", expiry);
        this.borhanClient.queueServiceCall("session", "startWidgetSession", kparams, BorhanStartWidgetSessionResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanStartWidgetSessionResponse.class, resultXmlElement);
    }
}
