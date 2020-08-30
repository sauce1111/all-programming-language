package com.tueteam.apl.domain.posts;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostsPython is a Querydsl query type for PostsPython
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPostsPython extends EntityPathBase<PostsPython> {

    private static final long serialVersionUID = -40486507L;

    public static final QPostsPython postsPython = new QPostsPython("postsPython");

    public final NumberPath<Long> postIdx = createNumber("postIdx", Long.class);

    public final StringPath pythonCode = createString("pythonCode");

    public QPostsPython(String variable) {
        super(PostsPython.class, forVariable(variable));
    }

    public QPostsPython(Path<? extends PostsPython> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostsPython(PathMetadata metadata) {
        super(PostsPython.class, metadata);
    }

}

