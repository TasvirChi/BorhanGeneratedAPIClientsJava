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
import java.util.List;
import com.borhan.client.types.*;
import com.borhan.client.enums.*;
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

@SuppressWarnings("serial")
public class BorhanLiveReportsService extends BorhanServiceBase {
    public BorhanLiveReportsService(BorhanClient client) {
        this.borhanClient = client;
    }

    public List<BorhanReportGraph> getEvents(BorhanLiveReportType reportType) throws BorhanApiException {
        return this.getEvents(reportType, null);
    }

    public List<BorhanReportGraph> getEvents(BorhanLiveReportType reportType, BorhanLiveReportInputFilter filter) throws BorhanApiException {
        return this.getEvents(reportType, filter, null);
    }

    public List<BorhanReportGraph> getEvents(BorhanLiveReportType reportType, BorhanLiveReportInputFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("reportType", reportType);
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("livereports", "getEvents", kparams, BorhanReportGraph.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanReportGraph.class, resultXmlElement);
    }

    public BorhanLiveStatsListResponse getReport(BorhanLiveReportType reportType) throws BorhanApiException {
        return this.getReport(reportType, null);
    }

    public BorhanLiveStatsListResponse getReport(BorhanLiveReportType reportType, BorhanLiveReportInputFilter filter) throws BorhanApiException {
        return this.getReport(reportType, filter, null);
    }

    public BorhanLiveStatsListResponse getReport(BorhanLiveReportType reportType, BorhanLiveReportInputFilter filter, BorhanFilterPager pager) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("reportType", reportType);
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.borhanClient.queueServiceCall("livereports", "getReport", kparams, BorhanLiveStatsListResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveStatsListResponse.class, resultXmlElement);
    }

    public BorhanLiveReportExportResponse exportToCsv(BorhanLiveReportExportType reportType, BorhanLiveReportExportParams params) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("reportType", reportType);
        kparams.add("params", params);
        this.borhanClient.queueServiceCall("livereports", "exportToCsv", kparams, BorhanLiveReportExportResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanLiveReportExportResponse.class, resultXmlElement);
    }

	/**  Will serve a requested report     */
    public String serveReport(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("livereports", "serveReport", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }
}
