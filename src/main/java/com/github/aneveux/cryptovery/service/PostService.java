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
package com.github.aneveux.cryptovery.service;

import com.github.aneveux.cryptovery.dao.PostDAO;
import com.github.aneveux.cryptovery.model.Post;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path("/api/post")
@Produces({"text/xml", "application/json"})
public class PostService {

    @EJB
    private PostDAO dao;

    @Path("/create")
    @PUT
    public Post create(@QueryParam("title") String title,
                       @QueryParam("content") String content,
                       @QueryParam("userId") long userId) {
        return dao.create(title, content, userId);
    }

    @Path("/list")
    @GET
    public List<Post> list(@QueryParam("first") @DefaultValue("0") int first,
                           @QueryParam("max") @DefaultValue("20") int max) {
        return dao.list(first, max);
    }

    @Path("/show/{id}")
    @GET
    public Post show(@PathParam("id") long id) {
        return dao.find(id);
    }

    @Path("/delete/{id}")
    @DELETE
    public void delete(@PathParam("id") long id) {
        dao.delete(id);
    }

    @Path("/update/{id}")
    @POST
    public Post update(@PathParam("id") long id,
                       @QueryParam("userId") long userId,
                       @QueryParam("title") String title,
                       @QueryParam("content") String content) {
        return dao.update(id, userId, title, content);
    }
}
