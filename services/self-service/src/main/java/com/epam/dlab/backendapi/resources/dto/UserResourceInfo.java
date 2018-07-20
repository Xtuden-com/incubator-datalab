/*
 *
 *  * Copyright (c) 2018, EPAM SYSTEMS INC
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.epam.dlab.backendapi.resources.dto;

import com.epam.dlab.dto.UserInstanceStatus;
import com.epam.dlab.dto.computational.UserComputationalResource;
import com.epam.dlab.model.ResourceEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResourceInfo {

	@JsonProperty("resource_type")
	private ResourceEnum resourceType;

	@JsonProperty("resource_name")
	private String resourceName;

	@JsonProperty("status")
	private UserInstanceStatus resourceStatus;

	@JsonProperty("computational_resources")
	private List<UserComputationalResource> computationalResources = Collections.emptyList();

	@JsonProperty
	private String user;


	public UserResourceInfo withResourceType(ResourceEnum resourceType) {
		setResourceType(resourceType);
		return this;
	}

	public UserResourceInfo withResourceName(String resourceName) {
		setResourceName(resourceName);
		return this;
	}

	public UserResourceInfo withResourceStatus(UserInstanceStatus resourceStatus) {
		setResourceStatus(resourceStatus);
		return this;
	}

	public UserResourceInfo withCompResources(List<UserComputationalResource> compResources) {
		setComputationalResources(compResources);
		return this;
	}

	public UserResourceInfo withUser(String user) {
		setUser(user);
		return this;
	}
}
