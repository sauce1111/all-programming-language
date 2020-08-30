package com.tueteam.apl.domain.posts;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPostsJava is a Querydsl query type for PostsJava
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPostsJava extends EntityPathBase<PostsJava> {

    private static final long serialVersionUID = 1970703643L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPostsJava postsJava = new QPostsJava("postsJava");

    public final StringPath javaCode = createString("javaCode");

    public final NumberPath<Long> postIdx = createNumber("postIdx", Long.class);

    public final QPosts posts;

    public QPostsJava(String variable) {
        this(PostsJava.class, forVariable(variable), INITS);
    }

    public QPostsJava(Path<? extends PostsJava> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPostsJava(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPostsJava(PathMetadata metadata, PathInits inits) {
        this(PostsJava.class, metadata, inits);
    }

    public QPostsJava(Class<? extends PostsJava> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.posts = inits.isInitialized("posts") ? new QPosts(forProperty("posts"), inits.get("posts")) : null;
    }

}

