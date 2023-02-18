package Oop;

import java.util.List;

public class User {
    public class USER extends BasicEntity {
        private String name;
        private String password;
        private String address;
        private String email;
        private List<Role> r;

        private List<Friend> friend;
        private List<Chat>chat;
        private List<Message>message;

        public List<Message> getMessage() {
            return message;
        }

        public void setMessage(List<Message> message) {
            this.message = message;
        }

        public List<Chat> getChat() {
            return chat;
        }

        public void setChat(List<Chat> chat) {
            this.chat = chat;
        }

        public List<Friend> getFriend() {
            return friend;
        }

        public void setFriend(List<Friend> friend) {
            this.friend = friend;
        }

        public List<Role> getR() {
            return r;
        }

        public void setR(List<Role> r) {
            this.r = r;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

}
