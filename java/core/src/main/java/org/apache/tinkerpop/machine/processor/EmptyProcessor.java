/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tinkerpop.machine.processor;

import org.apache.tinkerpop.machine.traversers.Traverser;
import org.apache.tinkerpop.util.FastNoSuchElementException;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public final class EmptyProcessor<C, S, E> implements Processor<C, S, E> {

    private static final EmptyProcessor INSTANCE = new EmptyProcessor();

    private EmptyProcessor() {
    }

    @Override
    public void addStart(Traverser<C, S> traverser) {

    }

    @Override
    public Traverser<C, E> next() {
        throw FastNoSuchElementException.instance();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void reset() {

    }

    public static <C, S, E> EmptyProcessor<C, S, E> instance() {
        return INSTANCE;
    }
}