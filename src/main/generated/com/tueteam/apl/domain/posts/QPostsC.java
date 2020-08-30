package com.tueteam.apl.domain.posts;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostsC is a Querydsl query type for PostsC
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPostsC extends EntityPathBase<PostsC> {

    private static final long serialVersionUID = 156346378L;

    public static final QPostsC postsC = new QPostsC("postsC");

    public final StringPath cCode = createString("cCode");

    public final NumberPath<Long> postIdx = createNumber("postIdx", Long.class);

    public QPostsC(String variable) {
        super(PostsC.class, forVariable(variable));
    }

    public QPostsC(Path<? extends PostsC> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostsC(PathMetadata metadata) {
        super(PostsC.class, metadata);
    }

}

