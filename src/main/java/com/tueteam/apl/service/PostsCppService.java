package com.tueteam.apl.service;

import com.tueteam.apl.domain.posts.Posts;
import com.tueteam.apl.domain.posts.PostsCpp;
import com.tueteam.apl.domain.posts.PostsQdslRepository;
import com.tueteam.apl.web.dto.posts.cpp.PostsCppDto;
import com.tueteam.apl.web.param.posts.cpp.PostsWriteParams;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class PostsCppService {

    private final EntityManager em;
    private final PostsQdslRepository postsQdslRepository;

    public PostsCppDto insertPostsCpp(PostsWriteParams param){

        Posts posts = new Posts(param);
        em.persist(posts);
        em.flush();

        Long postIdx = posts.getPostIdx();
        PostsCpp postsCpp = new PostsCpp(postIdx, param.getTag());
        em.persist(postsCpp);

        return postsQdslRepository.findPostsCppById(postIdx);
    }


}
