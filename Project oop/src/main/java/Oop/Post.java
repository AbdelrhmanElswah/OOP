package Oop;

import java.util.List;

public class Post extends SocialData {

    private User user;
    private List<Comment>comment;
    private List<Like>like;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public List<Like> getLike() {
        return like;
    }

    public void setLike(List<Like> like) {
        this.like = like;
    }
}
