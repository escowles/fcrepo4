/**
 * Copyright 2013 DuraSpace, Inc.
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
/**
 This package provides functionality for auditing Fedora events. An <code> Auditor</code> records auditable Fedora events.
 Currently the implementation registers itself to Google Guava
 <a href="http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/eventbus/EventBus.html">EventBus</a>
 and uses Logback framework.
 */

package org.fcrepo.audit;