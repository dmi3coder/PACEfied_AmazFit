/*
 *  Copyright (C) 2014 Ingenic Semiconductor
 *
 *  ZhangYanMing <yamming.zhang@ingenic.com, jamincheung@126.com>
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
 */

package com.ingenic.iwds.smartsense;

import com.ingenic.iwds.smartsense.Sensor;
import com.ingenic.iwds.smartsense.IRemoteSensorCallback;
import com.ingenic.iwds.smartsense.IRemoteSensorEventCallback;

interface IRemoteSensorService {
    boolean registerRemoteSensorListener(in String uuid, in IRemoteSensorCallback callback);
    void unregisterRemoteSensorListener(in String uuid);
    List<Sensor> getSensorList();
    Sensor getDefaultSensor(int sensorType);
    boolean registerListener(in String uuid, in IRemoteSensorEventCallback callback, in Sensor sensor, int rate);
    void unregisterListener(in String uuid);
}