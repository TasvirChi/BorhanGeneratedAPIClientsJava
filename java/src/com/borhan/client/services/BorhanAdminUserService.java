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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage details for the administrative user    */
@SuppressWarnings("serial")
public class BorhanAdminUserService extends BorhanServiceBase {
    public BorhanAdminUserService(BorhanClient client) {
        this.borhanClient = client;
    }

    public BorhanAdminUser updatePassword(String email, String password) throws BorhanApiException {
        return this.updatePassword(email, password, "");
    }

    public BorhanAdminUser updatePassword(String email, String password, String newEmail) throws BorhanApiException {
        return this.updatePassword(email, password, newEmail, "");
    }

	/**  Update admin user password and email     */
    public BorhanAdminUser updatePassword(String email, String password, String newEmail, String newPassword) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("email", email);
        kparams.add("password", password);
        kparams.add("newEmail", newEmail);
        kparams.add("newPassword", newPassword);
        this.borhanClient.queueServiceCall("adminuser", "updatePassword", kparams, BorhanAdminUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanAdminUser.class, resultXmlElement);
    }

	/**  Reset admin user password and send it to the users email address     */
    public void resetPassword(String email) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("email", email);
        this.borhanClient.queueServiceCall("adminuser", "resetPassword", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public String login(String email, String password) throws BorhanApiException {
        return this.login(email, password, Integer.MIN_VALUE);
    }

	/**  Get an admin session using admin email and password (Used for login to the BMC
	  application)     */
    public String login(String email, String password, int partnerId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("email", email);
        kparams.add("password", password);
        kparams.add("partnerId", partnerId);
        this.borhanClient.queueServiceCall("adminuser", "login", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  Set initial users password     */
    public void setInitialPassword(String hashKey, String newPassword) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("hashKey", hashKey);
        kparams.add("newPassword", newPassword);
        this.borhanClient.queueServiceCall("adminuser", "setInitialPassword", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }
}
