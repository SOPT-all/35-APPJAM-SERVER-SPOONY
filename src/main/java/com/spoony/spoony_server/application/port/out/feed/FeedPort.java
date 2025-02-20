package com.spoony.spoony_server.application.port.out.feed;

import com.spoony.spoony_server.domain.feed.Feed;
import com.spoony.spoony_server.domain.post.Post;
import com.spoony.spoony_server.domain.user.Follow;

import java.util.List;

public interface FeedPort {
    List<Feed> findFeedByUserId(Long userId);
    void saveFollowersFeed(List<Follow> followList, Post post);
    void saveFollowerFeed(Long userId, Long postId);
    void deleteFeedByUserIdAndPostId(Long userId, Long postId);
}
