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

/**  Manage partner users on Borhan's side  The userId in borhan is the unique Id
  in the partner's system, and the [partnerId,Id] couple are unique key in
  borhan's DB    */
@SuppressWarnings("serial")
public class BorhanUserService extends BorhanServiceBase {
    public BorhanUserService(BorhanClient client) {
        this.borhanClient = client;
    }

	/**  Adds a new user to an existing account in the Borhan database.   Input param
	  $id is the unique identifier in the partner's system.     */
    public BorhanUser add(BorhanUser user) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("user", user);
        this.borhanClient.queueServiceCall("user", "add", kparams, BorhanUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUser.class, resultXmlElement);
    }

	/**  Updates an existing user object.   You can also use this action to update the
	  userId.     */
    public BorhanUser update(String userId, BorhanUser user) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("userId", userId);
        kparams.add("user", user);
        this.borhanClient.queueServiceCall("user", "update", kparams, BorhanUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUser.class, resultXmlElement);
    }

    public BorhanUser get() throws BorhanApiException {
        return this.get(null);
    }

	/**  Retrieves a user object for a specified user ID.     */
    public BorhanUser get(String userId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("userId", userId);
        this.borhanClient.queueServiceCall("user", "get", kparams, BorhanUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUser.class, resultXmlElement);
    }

	/**  Retrieves a user object for a user's login ID and partner ID.   A login ID is
	  the email address used by a user to log into the system.     */
    public BorhanUser getByLoginId(String loginId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("loginId", loginId);
        this.borhanClient.queueServiceCall("user", "getByLoginId", kparams, BorhanUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUser.class, resultXmlElement);
    }

	/**  Deletes a user from a partner account.     */
    public BorhanUser delete(String userId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("userId", userId);
        this.borhanClient.queueServiceCall("user", "delete", kparams, BorhanUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUser.class, resultXmlElement);
    }

    public BorhanUserListResponse list() throws BorhanApiException {
        return this.list(null);
    }

    public BorhanUserListResponse list(BorhanUserFilter filter) throws BorhanApiException {
        return this.list(filter, null);
    }

	/**  Lists user objects that are associated with an account.   Blocked users are
	  listed unless you use a filter to exclude them.   Deleted users are not listed
	  unless you use a filter to include them.     */
    public BorhanUserListResponse list(BorhanUserFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("user", "list", kparams, BorhanUserListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUserListResponse.class, resultXmlElement);
    }

	/**  Notifies that a user is banned from an account.     */
    public void notifyBan(String userId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("userId", userId);
        this.borhanClient.queueServiceCall("user", "notifyBan", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public String login(int partnerId, String userId, String password) throws BorhanApiException {
        return this.login(partnerId, userId, password, 86400);
    }

    public String login(int partnerId, String userId, String password, int expiry) throws BorhanApiException {
        return this.login(partnerId, userId, password, expiry, "*");
    }

	/**  Logs a user into a partner account with a partner ID, a partner user ID (puser),
	  and a user password.     */
    public String login(int partnerId, String userId, String password, int expiry, String privileges) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("partnerId", partnerId);
        kparams.add("userId", userId);
        kparams.add("password", password);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.borhanClient.queueServiceCall("user", "login", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public String loginByLoginId(String loginId, String password) throws BorhanApiException {
        return this.loginByLoginId(loginId, password, Integer.MIN_VALUE);
    }

    public String loginByLoginId(String loginId, String password, int partnerId) throws BorhanApiException {
        return this.loginByLoginId(loginId, password, partnerId, 86400);
    }

    public String loginByLoginId(String loginId, String password, int partnerId, int expiry) throws BorhanApiException {
        return this.loginByLoginId(loginId, password, partnerId, expiry, "*");
    }

	/**  Logs a user into a partner account with a user login ID and a user password.     */
    public String loginByLoginId(String loginId, String password, int partnerId, int expiry, String privileges) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("loginId", loginId);
        kparams.add("password", password);
        kparams.add("partnerId", partnerId);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.borhanClient.queueServiceCall("user", "loginByLoginId", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public void updateLoginData(String oldLoginId, String password) throws BorhanApiException {
        this.updateLoginData(oldLoginId, password, "");
    }

    public void updateLoginData(String oldLoginId, String password, String newLoginId) throws BorhanApiException {
        this.updateLoginData(oldLoginId, password, newLoginId, "");
    }

    public void updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword) throws BorhanApiException {
        this.updateLoginData(oldLoginId, password, newLoginId, newPassword, null);
    }

    public void updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword, String newFirstName) throws BorhanApiException {
        this.updateLoginData(oldLoginId, password, newLoginId, newPassword, newFirstName, null);
    }

	/**  Updates a user's login data: email, password, name.     */
    public void updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword, String newFirstName, String newLastName) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("oldLoginId", oldLoginId);
        kparams.add("password", password);
        kparams.add("newLoginId", newLoginId);
        kparams.add("newPassword", newPassword);
        kparams.add("newFirstName", newFirstName);
        kparams.add("newLastName", newLastName);
        this.borhanClient.queueServiceCall("user", "updateLoginData", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Reset user's password and send the user an email to generate a new one.     */
    public void resetPassword(String email) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("email", email);
        this.borhanClient.queueServiceCall("user", "resetPassword", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

	/**  Set initial users password     */
    public void setInitialPassword(String hashKey, String newPassword) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("hashKey", hashKey);
        kparams.add("newPassword", newPassword);
        this.borhanClient.queueServiceCall("user", "setInitialPassword", kparams);
        if (this.borhanClient.isMultiRequest())
            return ;
        this.borhanClient.doQueue();
    }

    public BorhanUser enableLogin(String userId, String loginId) throws BorhanApiException {
        return this.enableLogin(userId, loginId, null);
    }

	/**  Enables a user to log into a partner account using an email address and a
	  password     */
    public BorhanUser enableLogin(String userId, String loginId, String password) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("userId", userId);
        kparams.add("loginId", loginId);
        kparams.add("password", password);
        this.borhanClient.queueServiceCall("user", "enableLogin", kparams, BorhanUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUser.class, resultXmlElement);
    }

    public BorhanUser disableLogin() throws BorhanApiException {
        return this.disableLogin(null);
    }

    public BorhanUser disableLogin(String userId) throws BorhanApiException {
        return this.disableLogin(userId, null);
    }

	/**  Disables a user's ability to log into a partner account using an email address
	  and a password.   You may use either a userId or a loginId parameter for this
	  action.     */
    public BorhanUser disableLogin(String userId, String loginId) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("userId", userId);
        kparams.add("loginId", loginId);
        this.borhanClient.queueServiceCall("user", "disableLogin", kparams, BorhanUser.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanUser.class, resultXmlElement);
    }

    public String index(String id) throws BorhanApiException {
        return this.index(id, true);
    }

	/**  Index an entry by id.     */
    public String index(String id, boolean shouldUpdate) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("shouldUpdate", shouldUpdate);
        this.borhanClient.queueServiceCall("user", "index", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public BorhanBulkUpload addFromBulkUpload(BorhanFile fileData) throws BorhanApiException {
        return this.addFromBulkUpload(fileData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(File fileData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData), null);
    }

    public BorhanBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName, fileDataSize), null);
    }

    public BorhanBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName), null);
    }

    public BorhanBulkUpload addFromBulkUpload(BorhanFile fileData, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.addFromBulkUpload(fileData, bulkUploadData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(File fileData, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData), bulkUploadData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName, fileDataSize), bulkUploadData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, BorhanBulkUploadJobData bulkUploadData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName), bulkUploadData, null);
    }

    public BorhanBulkUpload addFromBulkUpload(File fileData, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadUserData bulkUploadUserData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData), bulkUploadData, bulkUploadUserData);
    }

    public BorhanBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadUserData bulkUploadUserData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName, fileDataSize), bulkUploadData, bulkUploadUserData);
    }

    public BorhanBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadUserData bulkUploadUserData) throws BorhanApiException {
        return this.addFromBulkUpload(new BorhanFile(fileData, fileDataName), bulkUploadData, bulkUploadUserData);
    }

    public BorhanBulkUpload addFromBulkUpload(BorhanFile fileData, BorhanBulkUploadJobData bulkUploadData, BorhanBulkUploadUserData bulkUploadUserData) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        BorhanFiles kfiles = new BorhanFiles();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadUserData", bulkUploadUserData);
        this.borhanClient.queueServiceCall("user", "addFromBulkUpload", kparams, kfiles, BorhanBulkUpload.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanBulkUpload.class, resultXmlElement);
    }

	/**  Action which checks whther user login         */
    public boolean checkLoginDataExists(BorhanUserLoginDataFilter filter) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("filter", filter);
        this.borhanClient.queueServiceCall("user", "checkLoginDataExists", kparams);
        if (this.borhanClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
    }
}
