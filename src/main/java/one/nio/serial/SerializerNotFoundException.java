/*
 * Copyright 2025 VK
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

package one.nio.serial;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class SerializerNotFoundException extends IOException implements Externalizable {
    private long uid;

    public SerializerNotFoundException(long uid) {
        this.uid = uid;
    }

    public long getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + Long.toHexString(uid);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeLong(uid);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        this.uid = in.readLong();
    }
}
