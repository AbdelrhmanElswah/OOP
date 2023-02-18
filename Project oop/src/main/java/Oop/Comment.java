package Oop;

import java.util.List;

public class Comment extends SocialData {
    private Post post;
    private List<Like>like;
    private User user;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public List<Like> getLike() {
        return like;
    }

    public void setLike(List<Like> like) {
        this.like = like;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
