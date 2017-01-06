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
public enum BorhanUiConfObjType implements BorhanEnumAsInt {
    PLAYER (1),
    CONTRIBUTION_WIZARD (2),
    SIMPLE_EDITOR (3),
    ADVANCED_EDITOR (4),
    PLAYLIST (5),
    APP_STUDIO (6),
    KRECORD (7),
    PLAYER_V3 (8),
    BMC_ACCOUNT (9),
    BMC_ANALYTICS (10),
    BMC_CONTENT (11),
    BMC_DASHBOARD (12),
    BMC_LOGIN (13),
    PLAYER_SL (14),
    CLIENTSIDE_ENCODER (15),
    BMC_GENERAL (16),
    BMC_ROLES_AND_PERMISSIONS (17),
    CLIPPER (18),
    KSR (19),
    KUPLOAD (20);

    public int hashCode;

    BorhanUiConfObjType(int hashCode) {
        this.hashCode = hashCode;
    }

    public int getHashCode() {
        return this.hashCode;
    }

    public static BorhanUiConfObjType get(int hashCode) {
        switch(hashCode) {
            case 1: return PLAYER;
            case 2: return CONTRIBUTION_WIZARD;
            case 3: return SIMPLE_EDITOR;
            case 4: return ADVANCED_EDITOR;
            case 5: return PLAYLIST;
            case 6: return APP_STUDIO;
            case 7: return KRECORD;
            case 8: return PLAYER_V3;
            case 9: return BMC_ACCOUNT;
            case 10: return BMC_ANALYTICS;
            case 11: return BMC_CONTENT;
            case 12: return BMC_DASHBOARD;
            case 13: return BMC_LOGIN;
            case 14: return PLAYER_SL;
            case 15: return CLIENTSIDE_ENCODER;
            case 16: return BMC_GENERAL;
            case 17: return BMC_ROLES_AND_PERMISSIONS;
            case 18: return CLIPPER;
            case 19: return KSR;
            case 20: return KUPLOAD;
            default: return PLAYER;
        }
    }
}
