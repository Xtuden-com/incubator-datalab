/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.epam.dlab.backendapi.service;

import com.epam.dlab.auth.UserInfo;
import com.epam.dlab.backendapi.domain.OdahuCreateDTO;
import com.epam.dlab.backendapi.domain.OdahuDTO;
import com.epam.dlab.dto.UserInstanceStatus;
import com.epam.dlab.dto.base.odahu.OdahuResult;

import java.util.List;
import java.util.Optional;

public interface OdahuService {
    List<OdahuDTO> findOdahu();

    Optional<OdahuDTO> get(String project, String endpoint);

    void create(String project, OdahuCreateDTO createOdahuDTO, UserInfo userInfo);

    void start(String name, String project, String endpoint, UserInfo user);

    void stop(String name, String project, String endpoint, UserInfo user);

    void terminate(String name, String project, String endpoint, UserInfo user);

    void updateStatus(OdahuResult odahuResult, UserInstanceStatus status);

    boolean inProgress(String project, String endpoint);
}
