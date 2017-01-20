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

import com.ingenic.iwds.remotedevice.IRemoteDeviceAppCallback;
import com.ingenic.iwds.remotedevice.IRemoteDeviceStatusCallback;
import com.ingenic.iwds.remotedevice.IRemoteDeviceProcessCallback;
import com.ingenic.iwds.remotedevice.IRemoteDeviceSettingCallback;

interface IRemoteDeviceService {
    boolean registerStatusListener(in String uuid, in IRemoteDeviceStatusCallback callback);
    void unregisterStatusListener(in IRemoteDeviceStatusCallback callback);
    boolean registerAppListener(in String uuid, in IRemoteDeviceAppCallback callback);
    void unregisterAppListener(in IRemoteDeviceAppCallback callback);
    boolean registerProcessListener(in String uuid, in IRemoteDeviceProcessCallback callback);
    void unregisterProcessListener(in IRemoteDeviceProcessCallback callback);
    boolean registerSettingListener(in String uuid, in IRemoteDeviceSettingCallback callback);
    void unregisterSettingListener(in IRemoteDeviceSettingCallback callback);

    void requestGetAppList(in String uuid);
    void requestGetStorageInfo(in String uuid);
    void requestInstallApp(in String uuid, in String apkFilePath, in boolean isInstalledInExternal);
    void requestDeleteApp(in String uuid, in String packageName);
    void requestPkgSizeInfo(in String uuid, in String packageName);
    void requestClearAppDataOrCache(in String uuid, in String packageName, in int requestType);
    void requestClearAllAppDataAndCache(in String uuid);

    void requestSystemMemoryInfo(in String uuid);
    void requestRunningAppProcessInfo(in String uuid);
    void requestKillProcess(in String uuid, in String packageName);

    void requestDoSetting(in String uuid, in int type, in int value);
    void requestGetSetting(in String uuid, in int type);
}
