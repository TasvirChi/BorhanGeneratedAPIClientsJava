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
package com.borhan.client;
import com.borhan.client.services.BorhanAccessControlProfileService;
import com.borhan.client.services.BorhanAccessControlService;
import com.borhan.client.services.BorhanAdminUserService;
import com.borhan.client.services.BorhanBaseEntryService;
import com.borhan.client.services.BorhanBulkUploadService;
import com.borhan.client.services.BorhanCategoryEntryService;
import com.borhan.client.services.BorhanCategoryService;
import com.borhan.client.services.BorhanCategoryUserService;
import com.borhan.client.services.BorhanConversionProfileAssetParamsService;
import com.borhan.client.services.BorhanConversionProfileService;
import com.borhan.client.services.BorhanDataService;
import com.borhan.client.services.BorhanDeliveryProfileService;
import com.borhan.client.services.BorhanDocumentService;
import com.borhan.client.services.BorhanEmailIngestionProfileService;
import com.borhan.client.services.BorhanFileAssetService;
import com.borhan.client.services.BorhanFlavorAssetService;
import com.borhan.client.services.BorhanFlavorParamsOutputService;
import com.borhan.client.services.BorhanFlavorParamsService;
import com.borhan.client.services.BorhanLiveChannelSegmentService;
import com.borhan.client.services.BorhanLiveChannelService;
import com.borhan.client.services.BorhanLiveReportsService;
import com.borhan.client.services.BorhanStatsService;
import com.borhan.client.services.BorhanLiveStreamService;
import com.borhan.client.services.BorhanMediaInfoService;
import com.borhan.client.services.BorhanMediaServerService;
import com.borhan.client.services.BorhanMediaService;
import com.borhan.client.services.BorhanMixingService;
import com.borhan.client.services.BorhanNotificationService;
import com.borhan.client.services.BorhanPartnerService;
import com.borhan.client.services.BorhanPermissionItemService;
import com.borhan.client.services.BorhanPermissionService;
import com.borhan.client.services.BorhanPlaylistService;
import com.borhan.client.services.BorhanReportService;
import com.borhan.client.services.BorhanSchemaService;
import com.borhan.client.services.BorhanSearchService;
import com.borhan.client.services.BorhanSessionService;
import com.borhan.client.services.BorhanStorageProfileService;
import com.borhan.client.services.BorhanSyndicationFeedService;
import com.borhan.client.services.BorhanSystemService;
import com.borhan.client.services.BorhanThumbAssetService;
import com.borhan.client.services.BorhanThumbParamsOutputService;
import com.borhan.client.services.BorhanThumbParamsService;
import com.borhan.client.services.BorhanUiConfService;
import com.borhan.client.services.BorhanUploadService;
import com.borhan.client.services.BorhanUploadTokenService;
import com.borhan.client.services.BorhanUserRoleService;
import com.borhan.client.services.BorhanUserService;
import com.borhan.client.services.BorhanWidgetService;
import com.borhan.client.services.BorhanXInternalService;
import com.borhan.client.services.BorhanMetadataService;
import com.borhan.client.services.BorhanMetadataProfileService;
import com.borhan.client.services.BorhanDocumentsService;
import com.borhan.client.services.BorhanAnnotationService;
import com.borhan.client.services.BorhanAsperaService;
import com.borhan.client.services.BorhanAttachmentAssetService;
import com.borhan.client.services.BorhanAuditTrailService;
import com.borhan.client.services.BorhanBulkService;
import com.borhan.client.services.BorhanCaptionAssetService;
import com.borhan.client.services.BorhanCaptionParamsService;
import com.borhan.client.services.BorhanCaptionAssetItemService;
import com.borhan.client.services.BorhanDistributionProfileService;
import com.borhan.client.services.BorhanEntryDistributionService;
import com.borhan.client.services.BorhanDistributionProviderService;
import com.borhan.client.services.BorhanGenericDistributionProviderService;
import com.borhan.client.services.BorhanGenericDistributionProviderActionService;
import com.borhan.client.services.BorhanCuePointService;
import com.borhan.client.services.BorhanDropFolderService;
import com.borhan.client.services.BorhanDropFolderFileService;
import com.borhan.client.services.BorhanEventNotificationTemplateService;
import com.borhan.client.services.BorhanLikeService;
import com.borhan.client.services.BorhanShortLinkService;
import com.borhan.client.services.BorhanTagService;
import com.borhan.client.services.BorhanVarConsoleService;
import com.borhan.client.services.BorhanVirusScanProfileService;
import com.borhan.client.services.BorhanExternalMediaService;
import com.borhan.client.services.BorhanDrmPolicyService;
import com.borhan.client.services.BorhanDrmProfileService;
import com.borhan.client.services.BorhanWidevineDrmService;
import com.borhan.client.services.BorhanScheduledTaskProfileService;
import com.borhan.client.services.BorhanPlayReadyDrmService;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Borhan.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BorhanClient extends BorhanClientBase {
	
	protected String apiVersion = "3.1.6";
	
	public BorhanClient(BorhanConfiguration config) {
		super(config);
	}
	
	@Override
	public String getApiVersion(){
		return apiVersion;
	}
	
	protected BorhanAccessControlProfileService accessControlProfileService;
	public BorhanAccessControlProfileService getAccessControlProfileService() {
		if(this.accessControlProfileService == null)
			this.accessControlProfileService = new BorhanAccessControlProfileService(this);
	
		return this.accessControlProfileService;
	}
	
	protected BorhanAccessControlService accessControlService;
	public BorhanAccessControlService getAccessControlService() {
		if(this.accessControlService == null)
			this.accessControlService = new BorhanAccessControlService(this);
	
		return this.accessControlService;
	}
	
	protected BorhanAdminUserService adminUserService;
	public BorhanAdminUserService getAdminUserService() {
		if(this.adminUserService == null)
			this.adminUserService = new BorhanAdminUserService(this);
	
		return this.adminUserService;
	}
	
	protected BorhanBaseEntryService baseEntryService;
	public BorhanBaseEntryService getBaseEntryService() {
		if(this.baseEntryService == null)
			this.baseEntryService = new BorhanBaseEntryService(this);
	
		return this.baseEntryService;
	}
	
	protected BorhanBulkUploadService bulkUploadService;
	public BorhanBulkUploadService getBulkUploadService() {
		if(this.bulkUploadService == null)
			this.bulkUploadService = new BorhanBulkUploadService(this);
	
		return this.bulkUploadService;
	}
	
	protected BorhanCategoryEntryService categoryEntryService;
	public BorhanCategoryEntryService getCategoryEntryService() {
		if(this.categoryEntryService == null)
			this.categoryEntryService = new BorhanCategoryEntryService(this);
	
		return this.categoryEntryService;
	}
	
	protected BorhanCategoryService categoryService;
	public BorhanCategoryService getCategoryService() {
		if(this.categoryService == null)
			this.categoryService = new BorhanCategoryService(this);
	
		return this.categoryService;
	}
	
	protected BorhanCategoryUserService categoryUserService;
	public BorhanCategoryUserService getCategoryUserService() {
		if(this.categoryUserService == null)
			this.categoryUserService = new BorhanCategoryUserService(this);
	
		return this.categoryUserService;
	}
	
	protected BorhanConversionProfileAssetParamsService conversionProfileAssetParamsService;
	public BorhanConversionProfileAssetParamsService getConversionProfileAssetParamsService() {
		if(this.conversionProfileAssetParamsService == null)
			this.conversionProfileAssetParamsService = new BorhanConversionProfileAssetParamsService(this);
	
		return this.conversionProfileAssetParamsService;
	}
	
	protected BorhanConversionProfileService conversionProfileService;
	public BorhanConversionProfileService getConversionProfileService() {
		if(this.conversionProfileService == null)
			this.conversionProfileService = new BorhanConversionProfileService(this);
	
		return this.conversionProfileService;
	}
	
	protected BorhanDataService dataService;
	public BorhanDataService getDataService() {
		if(this.dataService == null)
			this.dataService = new BorhanDataService(this);
	
		return this.dataService;
	}
	
	protected BorhanDeliveryProfileService deliveryProfileService;
	public BorhanDeliveryProfileService getDeliveryProfileService() {
		if(this.deliveryProfileService == null)
			this.deliveryProfileService = new BorhanDeliveryProfileService(this);
	
		return this.deliveryProfileService;
	}
	
	protected BorhanDocumentService documentService;
	public BorhanDocumentService getDocumentService() {
		if(this.documentService == null)
			this.documentService = new BorhanDocumentService(this);
	
		return this.documentService;
	}
	
	protected BorhanEmailIngestionProfileService EmailIngestionProfileService;
	public BorhanEmailIngestionProfileService getEmailIngestionProfileService() {
		if(this.EmailIngestionProfileService == null)
			this.EmailIngestionProfileService = new BorhanEmailIngestionProfileService(this);
	
		return this.EmailIngestionProfileService;
	}
	
	protected BorhanFileAssetService fileAssetService;
	public BorhanFileAssetService getFileAssetService() {
		if(this.fileAssetService == null)
			this.fileAssetService = new BorhanFileAssetService(this);
	
		return this.fileAssetService;
	}
	
	protected BorhanFlavorAssetService flavorAssetService;
	public BorhanFlavorAssetService getFlavorAssetService() {
		if(this.flavorAssetService == null)
			this.flavorAssetService = new BorhanFlavorAssetService(this);
	
		return this.flavorAssetService;
	}
	
	protected BorhanFlavorParamsOutputService flavorParamsOutputService;
	public BorhanFlavorParamsOutputService getFlavorParamsOutputService() {
		if(this.flavorParamsOutputService == null)
			this.flavorParamsOutputService = new BorhanFlavorParamsOutputService(this);
	
		return this.flavorParamsOutputService;
	}
	
	protected BorhanFlavorParamsService flavorParamsService;
	public BorhanFlavorParamsService getFlavorParamsService() {
		if(this.flavorParamsService == null)
			this.flavorParamsService = new BorhanFlavorParamsService(this);
	
		return this.flavorParamsService;
	}
	
	protected BorhanLiveChannelSegmentService liveChannelSegmentService;
	public BorhanLiveChannelSegmentService getLiveChannelSegmentService() {
		if(this.liveChannelSegmentService == null)
			this.liveChannelSegmentService = new BorhanLiveChannelSegmentService(this);
	
		return this.liveChannelSegmentService;
	}
	
	protected BorhanLiveChannelService liveChannelService;
	public BorhanLiveChannelService getLiveChannelService() {
		if(this.liveChannelService == null)
			this.liveChannelService = new BorhanLiveChannelService(this);
	
		return this.liveChannelService;
	}
	
	protected BorhanLiveReportsService liveReportsService;
	public BorhanLiveReportsService getLiveReportsService() {
		if(this.liveReportsService == null)
			this.liveReportsService = new BorhanLiveReportsService(this);
	
		return this.liveReportsService;
	}
	
	protected BorhanStatsService statsService;
	public BorhanStatsService getStatsService() {
		if(this.statsService == null)
			this.statsService = new BorhanStatsService(this);
	
		return this.statsService;
	}
	
	protected BorhanLiveStreamService liveStreamService;
	public BorhanLiveStreamService getLiveStreamService() {
		if(this.liveStreamService == null)
			this.liveStreamService = new BorhanLiveStreamService(this);
	
		return this.liveStreamService;
	}
	
	protected BorhanMediaInfoService mediaInfoService;
	public BorhanMediaInfoService getMediaInfoService() {
		if(this.mediaInfoService == null)
			this.mediaInfoService = new BorhanMediaInfoService(this);
	
		return this.mediaInfoService;
	}
	
	protected BorhanMediaServerService mediaServerService;
	public BorhanMediaServerService getMediaServerService() {
		if(this.mediaServerService == null)
			this.mediaServerService = new BorhanMediaServerService(this);
	
		return this.mediaServerService;
	}
	
	protected BorhanMediaService mediaService;
	public BorhanMediaService getMediaService() {
		if(this.mediaService == null)
			this.mediaService = new BorhanMediaService(this);
	
		return this.mediaService;
	}
	
	protected BorhanMixingService mixingService;
	public BorhanMixingService getMixingService() {
		if(this.mixingService == null)
			this.mixingService = new BorhanMixingService(this);
	
		return this.mixingService;
	}
	
	protected BorhanNotificationService notificationService;
	public BorhanNotificationService getNotificationService() {
		if(this.notificationService == null)
			this.notificationService = new BorhanNotificationService(this);
	
		return this.notificationService;
	}
	
	protected BorhanPartnerService partnerService;
	public BorhanPartnerService getPartnerService() {
		if(this.partnerService == null)
			this.partnerService = new BorhanPartnerService(this);
	
		return this.partnerService;
	}
	
	protected BorhanPermissionItemService permissionItemService;
	public BorhanPermissionItemService getPermissionItemService() {
		if(this.permissionItemService == null)
			this.permissionItemService = new BorhanPermissionItemService(this);
	
		return this.permissionItemService;
	}
	
	protected BorhanPermissionService permissionService;
	public BorhanPermissionService getPermissionService() {
		if(this.permissionService == null)
			this.permissionService = new BorhanPermissionService(this);
	
		return this.permissionService;
	}
	
	protected BorhanPlaylistService playlistService;
	public BorhanPlaylistService getPlaylistService() {
		if(this.playlistService == null)
			this.playlistService = new BorhanPlaylistService(this);
	
		return this.playlistService;
	}
	
	protected BorhanReportService reportService;
	public BorhanReportService getReportService() {
		if(this.reportService == null)
			this.reportService = new BorhanReportService(this);
	
		return this.reportService;
	}
	
	protected BorhanSchemaService schemaService;
	public BorhanSchemaService getSchemaService() {
		if(this.schemaService == null)
			this.schemaService = new BorhanSchemaService(this);
	
		return this.schemaService;
	}
	
	protected BorhanSearchService searchService;
	public BorhanSearchService getSearchService() {
		if(this.searchService == null)
			this.searchService = new BorhanSearchService(this);
	
		return this.searchService;
	}
	
	protected BorhanSessionService sessionService;
	public BorhanSessionService getSessionService() {
		if(this.sessionService == null)
			this.sessionService = new BorhanSessionService(this);
	
		return this.sessionService;
	}
	
	protected BorhanStorageProfileService storageProfileService;
	public BorhanStorageProfileService getStorageProfileService() {
		if(this.storageProfileService == null)
			this.storageProfileService = new BorhanStorageProfileService(this);
	
		return this.storageProfileService;
	}
	
	protected BorhanSyndicationFeedService syndicationFeedService;
	public BorhanSyndicationFeedService getSyndicationFeedService() {
		if(this.syndicationFeedService == null)
			this.syndicationFeedService = new BorhanSyndicationFeedService(this);
	
		return this.syndicationFeedService;
	}
	
	protected BorhanSystemService systemService;
	public BorhanSystemService getSystemService() {
		if(this.systemService == null)
			this.systemService = new BorhanSystemService(this);
	
		return this.systemService;
	}
	
	protected BorhanThumbAssetService thumbAssetService;
	public BorhanThumbAssetService getThumbAssetService() {
		if(this.thumbAssetService == null)
			this.thumbAssetService = new BorhanThumbAssetService(this);
	
		return this.thumbAssetService;
	}
	
	protected BorhanThumbParamsOutputService thumbParamsOutputService;
	public BorhanThumbParamsOutputService getThumbParamsOutputService() {
		if(this.thumbParamsOutputService == null)
			this.thumbParamsOutputService = new BorhanThumbParamsOutputService(this);
	
		return this.thumbParamsOutputService;
	}
	
	protected BorhanThumbParamsService thumbParamsService;
	public BorhanThumbParamsService getThumbParamsService() {
		if(this.thumbParamsService == null)
			this.thumbParamsService = new BorhanThumbParamsService(this);
	
		return this.thumbParamsService;
	}
	
	protected BorhanUiConfService uiConfService;
	public BorhanUiConfService getUiConfService() {
		if(this.uiConfService == null)
			this.uiConfService = new BorhanUiConfService(this);
	
		return this.uiConfService;
	}
	
	protected BorhanUploadService uploadService;
	public BorhanUploadService getUploadService() {
		if(this.uploadService == null)
			this.uploadService = new BorhanUploadService(this);
	
		return this.uploadService;
	}
	
	protected BorhanUploadTokenService uploadTokenService;
	public BorhanUploadTokenService getUploadTokenService() {
		if(this.uploadTokenService == null)
			this.uploadTokenService = new BorhanUploadTokenService(this);
	
		return this.uploadTokenService;
	}
	
	protected BorhanUserRoleService userRoleService;
	public BorhanUserRoleService getUserRoleService() {
		if(this.userRoleService == null)
			this.userRoleService = new BorhanUserRoleService(this);
	
		return this.userRoleService;
	}
	
	protected BorhanUserService userService;
	public BorhanUserService getUserService() {
		if(this.userService == null)
			this.userService = new BorhanUserService(this);
	
		return this.userService;
	}
	
	protected BorhanWidgetService widgetService;
	public BorhanWidgetService getWidgetService() {
		if(this.widgetService == null)
			this.widgetService = new BorhanWidgetService(this);
	
		return this.widgetService;
	}
	
	protected BorhanXInternalService xInternalService;
	public BorhanXInternalService getXInternalService() {
		if(this.xInternalService == null)
			this.xInternalService = new BorhanXInternalService(this);
	
		return this.xInternalService;
	}
	
	protected BorhanMetadataService metadataService;
	public BorhanMetadataService getMetadataService() {
		if(this.metadataService == null)
			this.metadataService = new BorhanMetadataService(this);
	
		return this.metadataService;
	}
	
	protected BorhanMetadataProfileService metadataProfileService;
	public BorhanMetadataProfileService getMetadataProfileService() {
		if(this.metadataProfileService == null)
			this.metadataProfileService = new BorhanMetadataProfileService(this);
	
		return this.metadataProfileService;
	}
	
	protected BorhanDocumentsService documentsService;
	public BorhanDocumentsService getDocumentsService() {
		if(this.documentsService == null)
			this.documentsService = new BorhanDocumentsService(this);
	
		return this.documentsService;
	}
	
	protected BorhanAnnotationService annotationService;
	public BorhanAnnotationService getAnnotationService() {
		if(this.annotationService == null)
			this.annotationService = new BorhanAnnotationService(this);
	
		return this.annotationService;
	}
	
	protected BorhanAsperaService asperaService;
	public BorhanAsperaService getAsperaService() {
		if(this.asperaService == null)
			this.asperaService = new BorhanAsperaService(this);
	
		return this.asperaService;
	}
	
	protected BorhanAttachmentAssetService attachmentAssetService;
	public BorhanAttachmentAssetService getAttachmentAssetService() {
		if(this.attachmentAssetService == null)
			this.attachmentAssetService = new BorhanAttachmentAssetService(this);
	
		return this.attachmentAssetService;
	}
	
	protected BorhanAuditTrailService auditTrailService;
	public BorhanAuditTrailService getAuditTrailService() {
		if(this.auditTrailService == null)
			this.auditTrailService = new BorhanAuditTrailService(this);
	
		return this.auditTrailService;
	}
	
	protected BorhanBulkService bulkService;
	public BorhanBulkService getBulkService() {
		if(this.bulkService == null)
			this.bulkService = new BorhanBulkService(this);
	
		return this.bulkService;
	}
	
	protected BorhanCaptionAssetService captionAssetService;
	public BorhanCaptionAssetService getCaptionAssetService() {
		if(this.captionAssetService == null)
			this.captionAssetService = new BorhanCaptionAssetService(this);
	
		return this.captionAssetService;
	}
	
	protected BorhanCaptionParamsService captionParamsService;
	public BorhanCaptionParamsService getCaptionParamsService() {
		if(this.captionParamsService == null)
			this.captionParamsService = new BorhanCaptionParamsService(this);
	
		return this.captionParamsService;
	}
	
	protected BorhanCaptionAssetItemService captionAssetItemService;
	public BorhanCaptionAssetItemService getCaptionAssetItemService() {
		if(this.captionAssetItemService == null)
			this.captionAssetItemService = new BorhanCaptionAssetItemService(this);
	
		return this.captionAssetItemService;
	}
	
	protected BorhanDistributionProfileService distributionProfileService;
	public BorhanDistributionProfileService getDistributionProfileService() {
		if(this.distributionProfileService == null)
			this.distributionProfileService = new BorhanDistributionProfileService(this);
	
		return this.distributionProfileService;
	}
	
	protected BorhanEntryDistributionService entryDistributionService;
	public BorhanEntryDistributionService getEntryDistributionService() {
		if(this.entryDistributionService == null)
			this.entryDistributionService = new BorhanEntryDistributionService(this);
	
		return this.entryDistributionService;
	}
	
	protected BorhanDistributionProviderService distributionProviderService;
	public BorhanDistributionProviderService getDistributionProviderService() {
		if(this.distributionProviderService == null)
			this.distributionProviderService = new BorhanDistributionProviderService(this);
	
		return this.distributionProviderService;
	}
	
	protected BorhanGenericDistributionProviderService genericDistributionProviderService;
	public BorhanGenericDistributionProviderService getGenericDistributionProviderService() {
		if(this.genericDistributionProviderService == null)
			this.genericDistributionProviderService = new BorhanGenericDistributionProviderService(this);
	
		return this.genericDistributionProviderService;
	}
	
	protected BorhanGenericDistributionProviderActionService genericDistributionProviderActionService;
	public BorhanGenericDistributionProviderActionService getGenericDistributionProviderActionService() {
		if(this.genericDistributionProviderActionService == null)
			this.genericDistributionProviderActionService = new BorhanGenericDistributionProviderActionService(this);
	
		return this.genericDistributionProviderActionService;
	}
	
	protected BorhanCuePointService cuePointService;
	public BorhanCuePointService getCuePointService() {
		if(this.cuePointService == null)
			this.cuePointService = new BorhanCuePointService(this);
	
		return this.cuePointService;
	}
	
	protected BorhanDropFolderService dropFolderService;
	public BorhanDropFolderService getDropFolderService() {
		if(this.dropFolderService == null)
			this.dropFolderService = new BorhanDropFolderService(this);
	
		return this.dropFolderService;
	}
	
	protected BorhanDropFolderFileService dropFolderFileService;
	public BorhanDropFolderFileService getDropFolderFileService() {
		if(this.dropFolderFileService == null)
			this.dropFolderFileService = new BorhanDropFolderFileService(this);
	
		return this.dropFolderFileService;
	}
	
	protected BorhanEventNotificationTemplateService eventNotificationTemplateService;
	public BorhanEventNotificationTemplateService getEventNotificationTemplateService() {
		if(this.eventNotificationTemplateService == null)
			this.eventNotificationTemplateService = new BorhanEventNotificationTemplateService(this);
	
		return this.eventNotificationTemplateService;
	}
	
	protected BorhanLikeService likeService;
	public BorhanLikeService getLikeService() {
		if(this.likeService == null)
			this.likeService = new BorhanLikeService(this);
	
		return this.likeService;
	}
	
	protected BorhanShortLinkService shortLinkService;
	public BorhanShortLinkService getShortLinkService() {
		if(this.shortLinkService == null)
			this.shortLinkService = new BorhanShortLinkService(this);
	
		return this.shortLinkService;
	}
	
	protected BorhanTagService tagService;
	public BorhanTagService getTagService() {
		if(this.tagService == null)
			this.tagService = new BorhanTagService(this);
	
		return this.tagService;
	}
	
	protected BorhanVarConsoleService varConsoleService;
	public BorhanVarConsoleService getVarConsoleService() {
		if(this.varConsoleService == null)
			this.varConsoleService = new BorhanVarConsoleService(this);
	
		return this.varConsoleService;
	}
	
	protected BorhanVirusScanProfileService virusScanProfileService;
	public BorhanVirusScanProfileService getVirusScanProfileService() {
		if(this.virusScanProfileService == null)
			this.virusScanProfileService = new BorhanVirusScanProfileService(this);
	
		return this.virusScanProfileService;
	}
	
	protected BorhanExternalMediaService externalMediaService;
	public BorhanExternalMediaService getExternalMediaService() {
		if(this.externalMediaService == null)
			this.externalMediaService = new BorhanExternalMediaService(this);
	
		return this.externalMediaService;
	}
	
	protected BorhanDrmPolicyService drmPolicyService;
	public BorhanDrmPolicyService getDrmPolicyService() {
		if(this.drmPolicyService == null)
			this.drmPolicyService = new BorhanDrmPolicyService(this);
	
		return this.drmPolicyService;
	}
	
	protected BorhanDrmProfileService drmProfileService;
	public BorhanDrmProfileService getDrmProfileService() {
		if(this.drmProfileService == null)
			this.drmProfileService = new BorhanDrmProfileService(this);
	
		return this.drmProfileService;
	}
	
	protected BorhanWidevineDrmService widevineDrmService;
	public BorhanWidevineDrmService getWidevineDrmService() {
		if(this.widevineDrmService == null)
			this.widevineDrmService = new BorhanWidevineDrmService(this);
	
		return this.widevineDrmService;
	}
	
	protected BorhanScheduledTaskProfileService scheduledTaskProfileService;
	public BorhanScheduledTaskProfileService getScheduledTaskProfileService() {
		if(this.scheduledTaskProfileService == null)
			this.scheduledTaskProfileService = new BorhanScheduledTaskProfileService(this);
	
		return this.scheduledTaskProfileService;
	}
	
	protected BorhanPlayReadyDrmService playReadyDrmService;
	public BorhanPlayReadyDrmService getPlayReadyDrmService() {
		if(this.playReadyDrmService == null)
			this.playReadyDrmService = new BorhanPlayReadyDrmService(this);
	
		return this.playReadyDrmService;
	}
	
}
