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

package org.fcrepo.api.rdf;

import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.sparql.core.Quad;

import java.util.Comparator;

public class QuadOrdering implements Comparator<Quad> {

    private final PrefixMapping prefixMapping;

    public QuadOrdering(final PrefixMapping prefixMapping) {
        super();

        this.prefixMapping = prefixMapping;
    }

    @Override
    public int compare(com.hp.hpl.jena.sparql.core.Quad left,
            com.hp.hpl.jena.sparql.core.Quad right) {

        final int s =
                left.getSubject().toString(prefixMapping, false).compareTo(
                        right.getSubject().toString(prefixMapping, false));

        if (s != 0) {
            return s;
        }

        final int p =
                left.getPredicate().toString(prefixMapping, false).compareTo(
                        right.getPredicate().toString(prefixMapping, false));

        if (p != 0) {
            return p;
        }

        return left.getObject().toString(false).compareTo(
                right.getObject().toString(false));

    }

}
