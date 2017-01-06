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
import java.util.ArrayList;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  api for getting reports data by the report type and some inputFilter    */
@SuppressWarnings("serial")
public class BorhanReportService extends BorhanServiceBase {
    public BorhanReportService(BorhanClient client) {
        this.borhanClient = client;
    }

    public List<BorhanReportGraph> getGraphs(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter) throws BorhanApiException {
        return this.getGraphs(reportType, reportInputFilter, null);
    }

    public List<BorhanReportGraph> getGraphs(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, String dimension) throws BorhanApiException {
        return this.getGraphs(reportType, reportInputFilter, dimension, null);
    }

	/**  report getGraphs action allows to get a graph data for a specific report.      */
    public List<BorhanReportGraph> getGraphs(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, String dimension, String objectIds) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("dimension", dimension);
        kparams.add("objectIds", objectIds);
        this.borhanClient.queueServiceCall("report", "getGraphs", kparams, BorhanReportGraph.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanReportGraph.class, resultXmlElement);
    }

    public BorhanReportTotal getTotal(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter) throws BorhanApiException {
        return this.getTotal(reportType, reportInputFilter, null);
    }

	/**  report getTotal action allows to get a graph data for a specific report.      */
    public BorhanReportTotal getTotal(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, String objectIds) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("objectIds", objectIds);
        this.borhanClient.queueServiceCall("report", "getTotal", kparams, BorhanReportTotal.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanReportTotal.class, resultXmlElement);
    }

    public List<BorhanReportBaseTotal> getBaseTotal(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter) throws BorhanApiException {
        return this.getBaseTotal(reportType, reportInputFilter, null);
    }

	/**  report getBaseTotal action allows to get a the total base for storage reports   
	     */
    public List<BorhanReportBaseTotal> getBaseTotal(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, String objectIds) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("objectIds", objectIds);
        this.borhanClient.queueServiceCall("report", "getBaseTotal", kparams, BorhanReportBaseTotal.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseArray(BorhanReportBaseTotal.class, resultXmlElement);
    }

    public BorhanReportTable getTable(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, BorhanFilterPager pager) throws BorhanApiException {
        return this.getTable(reportType, reportInputFilter, pager, null);
    }

    public BorhanReportTable getTable(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, BorhanFilterPager pager, String order) throws BorhanApiException {
        return this.getTable(reportType, reportInputFilter, pager, order, null);
    }

	/**  report getTable action allows to get a graph data for a specific report.      */
    public BorhanReportTable getTable(BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, BorhanFilterPager pager, String order, String objectIds) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("pager", pager);
        kparams.add("order", order);
        kparams.add("objectIds", objectIds);
        this.borhanClient.queueServiceCall("report", "getTable", kparams, BorhanReportTable.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanReportTable.class, resultXmlElement);
    }

    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, BorhanReportType reportType, BorhanReportInputFilter reportInputFilter) throws BorhanApiException {
        return this.getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, null);
    }

    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, String dimension) throws BorhanApiException {
        return this.getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, null);
    }

    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, String dimension, BorhanFilterPager pager) throws BorhanApiException {
        return this.getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, null);
    }

    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, String dimension, BorhanFilterPager pager, String order) throws BorhanApiException {
        return this.getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, order, null);
    }

	/**  will create a Csv file for the given report and return the URL to access it     */
    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, BorhanReportType reportType, BorhanReportInputFilter reportInputFilter, String dimension, BorhanFilterPager pager, String order, String objectIds) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("reportTitle", reportTitle);
        kparams.add("reportText", reportText);
        kparams.add("headers", headers);
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("dimension", dimension);
        kparams.add("pager", pager);
        kparams.add("order", order);
        kparams.add("objectIds", objectIds);
        this.borhanClient.queueServiceCall("report", "getUrlForReportAsCsv", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  Will serve a requested report     */
    public String serve(String id) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        this.borhanClient.queueServiceCall("report", "serve", kparams);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public BorhanReportResponse execute(int id) throws BorhanApiException {
        return this.execute(id, null);
    }

    public BorhanReportResponse execute(int id, ArrayList<BorhanKeyValue> params) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("params", params);
        this.borhanClient.queueServiceCall("report", "execute", kparams, BorhanReportResponse.class);
        if (this.borhanClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.borhanClient.doQueue();
        return ParseUtils.parseObject(BorhanReportResponse.class, resultXmlElement);
    }

    public String getCsv(int id) throws BorhanApiException {
        return this.getCsv(id, null);
    }

    public String getCsv(int id, ArrayList<BorhanKeyValue> params) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("params", params);
        this.borhanClient.queueServiceCall("report", "getCsv", kparams);
        return this.borhanClient.serve();
    }

    public String getCsvFromStringParams(int id) throws BorhanApiException {
        return this.getCsvFromStringParams(id, null);
    }

	/**  Returns report CSV file executed by string params with the following convention:
	  param1=value1;param2=value2      */
    public String getCsvFromStringParams(int id, String params) throws BorhanApiException {
        BorhanParams kparams = new BorhanParams();
        kparams.add("id", id);
        kparams.add("params", params);
        this.borhanClient.queueServiceCall("report", "getCsvFromStringParams", kparams);
        return this.borhanClient.serve();
    }
}
