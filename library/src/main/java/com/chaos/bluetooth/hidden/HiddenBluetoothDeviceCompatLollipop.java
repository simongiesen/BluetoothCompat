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

package com.chaos.bluetooth.hidden;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import android.support.annotation.RequiresApi;

/**
 * @author Chaos
 *         05/03/2017
 */
@RequiresApi(21)
@TargetApi(21)
class HiddenBluetoothDeviceCompatLollipop {

    public static boolean isConnected(BluetoothDevice device) {
        return (boolean) new MethodInvoker(device, "isConnected").invoke();
    }

    public static BluetoothGatt connectGatt(BluetoothDevice device, Context context,
            boolean autoConnect, BluetoothGattCallback callback, int transport) {
        return (BluetoothGatt) new MethodInvoker(device, "connectGatt",
                new Class[]{Context.class, boolean.class, BluetoothGattCallback.class, int.class})
                .invoke(context, autoConnect, callback, transport);
    }
}
