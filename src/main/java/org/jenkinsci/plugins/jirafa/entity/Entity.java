/**
 * PerfRepo
 * <p>
 * Copyright (C) 2015 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.jenkinsci.plugins.jirafa.entity;

import java.io.Serializable;

/**
 * Base class for all entities in DB.
 *
 * @author Jiri Holusa (jholusa@redhat.com)
 */
public interface Entity extends Serializable {
   /**
    * @return Entity ID.
    */
   Long getId();
}
