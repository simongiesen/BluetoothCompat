/*
 * Copyright 2017 Chaos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chaos.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.support.annotation.RequiresApi;

/**
 * @author Chaos
 *         05/03/2017
 */
@RequiresApi(19)
@TargetApi(19)
class BluetoothDeviceCompatKitKat {

    public static boolean createBond(BluetoothDevice device) {
        return device.createBond();
    }

    public static boolean setPin(BluetoothDevice device, byte[] pin) {
        return device.setPin(pin);
    }

    public static boolean setPairingConfirmation(BluetoothDevice device, boolean confirm) {
        return device.setPairingConfirmation(confirm);
    }
}
