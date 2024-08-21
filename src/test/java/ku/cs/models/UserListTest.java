package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList;
    @BeforeEach
    void init(){
        userList = new UserList();
    }
    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("Pan" , "1234");
        userList.addUser("test1" , "5678");
        userList.addUser("test2" , "1111");
        // TODO: find one of them
        User pan = userList.findUserByUsername("Pan");
        // TODO: assert that UserList found User
         String expected = "Pan";
         String actual = pan.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("Pan" , "1234");
        userList.addUser("test1" , "5678");
        userList.addUser("test2" , "1111");
        // TODO: change password of one user
        // TODO: assert that user can change password
         assertTrue(userList.changePassword("Pan" , "1234" , "5678"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Pan" , "1234");
        userList.addUser("test1" , "5678");
        userList.addUser("test2" , "1111");

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Pan" , "1234");
        userList.addUser("test1" , "5678");
        userList.addUser("test2" , "1111");
        // TODO: call login() with incorrect username or incorrect password
        // TODO: assert that the method return null
         assertNull(userList.login("Pan" , "2222"));
    }

}