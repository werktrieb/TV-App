/*
 * Copyright (C) 2019 The Android Open Source Project
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
package com.android.tv.tuner.sample.network.util;

import static com.google.common.truth.Truth.assertThat;

import android.content.ComponentName;
import androidx.test.core.app.ApplicationProvider;
import com.android.tv.testing.constants.ConfigConstants;
import com.android.tv.tuner.sample.network.tvinput.SampleNetworkTunerTvInputService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/** Tests for {@link SampleNetworkConstants}. */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = ConfigConstants.SDK)
public class SampleNetworkConstantsTest {

    @Test
    public void tunerInputId() {
        assertThat(ComponentName.unflattenFromString(SampleNetworkConstants.TUNER_INPUT_ID))
                .isEqualTo(
                        new ComponentName(
                                ApplicationProvider.getApplicationContext(),
                                SampleNetworkTunerTvInputService.class));
    }
}
