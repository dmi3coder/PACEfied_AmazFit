/*
 *  Copyright (C) 2014 Ingenic Semiconductor
 *
 *  SunWenZhong(Fighter) <wenzhong.sun@ingenic.com, wanmyqawdr@126.com>
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

package com.ingenic.iwds.app;

import com.ingenic.iwds.app.INotificationServiceBackend;
import com.ingenic.iwds.app.Note;

interface INotificationProxyService {
    boolean notify(in String packageName, in int id, in Note note);
    void cancel(in String packageName, in int id);
    void cancelAll(in String packageName);

    boolean registerBackend(in INotificationServiceBackend backend, in String packageName, in String uuid);
    boolean unregisterBackend(in String packageName, in String uuid);
}
