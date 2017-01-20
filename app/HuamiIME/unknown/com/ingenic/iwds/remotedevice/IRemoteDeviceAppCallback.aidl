/*
 *  Copyright (C) 2014 Ingenic Semiconductor
 *
 *  Huanglihong(Regen) <lihong.huang@ingenic.com>
 *
 *  Elf/IDWS Project
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the
 *  Free Software Foundation; either version 2 of the License, or (at your
 *  option) any later version.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  675 Mass Ave, Cambridge, MA 02139, USA.
 *
 */

package com.ingenic.iwds.remotedevice;

import com.ingenic.iwds.remotedevice.RemoteApplicationInfoList;
import com.ingenic.iwds.remotedevice.RemoteStorageInfo;
import com.ingenic.iwds.remotedevice.RemotePackageStats;

interface IRemoteDeviceAppCallback {
    void onRemoteAppInfoListAvailable(in RemoteApplicationInfoList appInfoList);
    void onRemoteStorageInfoAvailable(in RemoteStorageInfo storageInfo);
    void onSendFileProgressForInstall(in String packageName, int progress);
    void onDoneInstallApp(in String packageName, in int returnCode);
    void onDoneDeleteApp(in String packageName, in int returnCode);
    void onResponsePkgSizeInfo(in RemotePackageStats stats, in int returnCode);
    void onResponseClearAppDataOrCache(in String packageName, in int requestType, 
            in int returnCode);
    void onResponseClearAllAppDataAndCache(in int totalClearCount, in int index, 
            in String packageName, in int typeOfIndex, in int returnCode);
}
