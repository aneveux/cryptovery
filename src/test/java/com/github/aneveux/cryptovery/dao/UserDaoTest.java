/*
 *     Licensed to the Apache Software Foundation (ASF) under one or more
 *     contributor license agreements.  See the NOTICE file distributed with
 *     this work for additional information regarding copyright ownership.
 *     The ASF licenses this file to You under the Apache License, Version 2.0
 *     (the "License"); you may not use this file except in compliance with
 *     the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package com.github.aneveux.cryptovery.dao;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.github.aneveux.cryptovery.model.User;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class UserDaoTest {

    private static EJBContainer container;


    @BeforeAll
    public static void start() {
        container = EJBContainer.createEJBContainer();
    }


    @AfterAll
    public static void stop() {
        if(container != null) {
            container.close();
        }
    }


    @Test
    public void create()
        throws NamingException {
        final UserDAO dao = (UserDAO) container.getContext()
                                               .lookup("java:global/cryptovery/UserDAO");
        final User user = dao.create("foo", "dummy", "foo@bar.org");
        assertNotNull(dao.find(user.getId()));
    }
}
