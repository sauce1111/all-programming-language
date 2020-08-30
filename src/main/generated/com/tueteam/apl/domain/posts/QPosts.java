package com.tueteam.apl.domain.posts;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPosts is a Querydsl query type for Posts
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPosts extends EntityPathBase<Posts> {

    private static final long serialVersionUID = -410598567L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPosts posts = new QPosts("posts");

    public final com.tueteam.apl.domain.QBaseTimeEntity _super = new com.tueteam.apl.domain.QBaseTimeEntity(this);

    public final StringPath attachedFile = createString("attachedFile");

    public final NumberPath<Long> boardIdx = createNumber("boardIdx", Long.class);

    public final StringPath contents = createString("contents");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final DateTimePath<org.joda.time.DateTime> deletedDate = createDateTime("deletedDate", org.joda.time.DateTime.class);

    public final NumberPath<Integer> hits = createNumber("hits", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final NumberPath<Long> postIdx = createNumber("postIdx", Long.class);

    public final QPostsC postsC;

    public final QPostsCpp postsCpp;

    public final QPostsJava postsJava;

    public final QPostsPython postsPython;

    public final NumberPath<Integer> statusCode = createNumber("statusCode", Integer.class);

    public final StringPath title = createString("title");

    public final NumberPath<Long> writeMemberIdx = createNumber("writeMemberIdx", Long.class);

    public QPosts(String variable) {
        this(Posts.class, forVariable(variable), INITS);
    }

    public QPosts(Path<? extends Posts> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPosts(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPosts(PathMetadata metadata, PathInits inits) {
        this(Posts.class, metadata, inits);
    }

    public QPosts(Class<? extends Posts> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.postsC = inits.isInitialized("postsC") ? new QPostsC(forProperty("postsC")) : null;
        this.postsCpp = inits.isInitialized("postsCpp") ? new QPostsCpp(forProperty("postsCpp")) : null;
        this.postsJava = inits.isInitialized("postsJava") ? new QPostsJava(forProperty("postsJava"), inits.get("postsJava")) : null;
        this.postsPython = inits.isInitialized("postsPython") ? new QPostsPython(forProperty("postsPython")) : null;
    }

}

