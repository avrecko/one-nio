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

package one.nio.server;

import one.nio.config.Config;
import one.nio.config.Converter;
import one.nio.net.SslConfig;

@Config
public class AcceptorConfig {
    public int threads = 1;
    public String address = "0.0.0.0";
    public int port;
    @Converter(method = "size")
    public int recvBuf;
    @Converter(method = "size")
    public int sendBuf;
    public int tos;
    public int backlog = 128;
    @Converter(method = "size")
    public int notsentLowat;
    public boolean keepAlive = true;
    public boolean noDelay = true;
    public boolean tcpFastOpen = true;
    public boolean deferAccept;
    public boolean reusePort;
    public boolean thinLto;
    public SslConfig ssl;
}
