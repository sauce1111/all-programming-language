package com.tueteam.apl.domain.posts;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostsCpp is a Querydsl query type for PostsCpp
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPostsCpp extends EntityPathBase<PostsCpp> {

    private static final long serialVersionUID = -74982518L;

    public static final QPostsCpp postsCpp = new QPostsCpp("postsCpp");

    public final StringPath cppCode = createString("cppCode");

    public final NumberPath<Long> postIdx = createNumber("postIdx", Long.class);

    public QPostsCpp(String variable) {
        super(PostsCpp.class, forVariable(variable));
    }

    public QPostsCpp(Path<? extends PostsCpp> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostsCpp(PathMetadata metadata) {
        super(PostsCpp.class, metadata);
    }

}

