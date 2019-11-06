/*
 * Licensed to DuraSpace under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * DuraSpace licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.persistence.ocfl;

import org.fcrepo.persistence.ocfl.impl.FedoraOCFLMapping;

/**
 * @author dbernstein
 * @since 6.0.0
 */
public interface FedoraToOCFLObjectIndex {

    /**
     * Retrieve the mapping of OCFL Object Id to parent Fedora resource identifier.
     * We say "parent" identifier because it refers to the Archival Group identifier for
     * the fedora resource associated with this mapping in the case that the resource was
     * part of an Archival Group.  In the case of binary descriptive metadata, this identifer
     * will correspond to "root" of the resource.
     *
     * So if you pass fedora identifier that is not part of an archival group such as
     * "my/fedora/binary/fcr:metadata"  the parent returned in the mapping will be "my/fedora/binary".
     *
     * Contrast this  with an Archival Group example:  if you pass in "my/archival-group/binary/fcr:metadata" the
     * parent returned in the mapping would be "my/archival-group".
     *
     * @param fedoraResourceIdentifier the fedora resource identifier
     * @return the mapping
     */
    FedoraOCFLMapping getMapping(final String fedoraResourceIdentifier);
}

