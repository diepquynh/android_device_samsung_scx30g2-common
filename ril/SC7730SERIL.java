/*
 * Copyright (c) 2014, The CyanogenMod Project. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.internal.telephony;

import static com.android.internal.telephony.RILConstants.*;

import android.content.Context;
import android.telephony.Rlog;
import android.os.AsyncResult;
import android.os.Message;
import android.os.RemoteException;

/**
 * Custom RIL class for SC7730SE platform
 */

public class SC7730SERIL extends SamsungSPRDRIL implements CommandsInterface {

    public SC7730SERIL(Context context, int preferredNetworkType, int cdmaSubscription) {
        this(context, preferredNetworkType, cdmaSubscription, null);
    }

    public SC7730SERIL(Context context, int preferredNetworkType,
            int cdmaSubscription, Integer instanceId) {
        super(context, preferredNetworkType, cdmaSubscription, instanceId);
    }

    // This thing... it causes lots of headaches due to RIL crashes
    @Override
    public void
    getHardwareConfig (Message result) {
        riljLog("Ignoring call to 'getHardwareConfig'");
        if (result != null) {
            CommandException ex = new CommandException(
                CommandException.Error.REQUEST_NOT_SUPPORTED);
            AsyncResult.forMessage(result, null, ex);
            result.sendToTarget();
        }
    }

    @Override
    public void startLceService(int reportIntervalMs, boolean pullMode, Message response) {
        riljLog("Link Capacity Estimate (LCE) service is not supported!");
        if (response != null) {
            AsyncResult.forMessage(response, null, new CommandException(
                    CommandException.Error.REQUEST_NOT_SUPPORTED));
            response.sendToTarget();
        }
    }
}
