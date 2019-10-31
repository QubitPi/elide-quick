/*
 * Copyright 刘珈奇
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
package com.github.QubitPi.elidequick.models;

import com.yahoo.elide.annotation.Include;

import net.jcip.annotations.NotThreadSafe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The domain model that represents a blog post.
 */
@Entity
@Include(rootLevel = true)
@NotThreadSafe
public class Post {

    /**
     * The surrogate key of Post entity.
     */
    private long id;

    /**
     * The blog content texts.
     */
    private String content;

    /**
     * Returns the surrogate key of this {@link Post}.
     *
     * @return entity surrogate key
     */
    @Id
    public long getId() {
        return id;
    }

    /**
     * Sets the surrogate key of this {@link Post}.
     *
     * @param id  The assigned surrogate key
     */
    public void setId(final long id) {
        this.id = id;
    }

    /**
     * Returns the blog content texts of this {@link Post}.
     *
     * @return blog contents
     */
    @Column(nullable = false)
    public String getContent() {
        return content;
    }

    /**
     * Sets the blog content texts of this {@link Post}.
     *
     * @param content  The blog contents
     */
    public void setContent(final String content) {
        this.content = content;
    }
}
