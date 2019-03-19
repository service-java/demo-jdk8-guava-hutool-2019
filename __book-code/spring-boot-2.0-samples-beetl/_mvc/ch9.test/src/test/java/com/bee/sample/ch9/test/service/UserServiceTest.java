package com.bee.sample.ch9.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bee.sample.ch9.entity.User;
import com.bee.sample.ch9.service.CreditSystemService;
import com.bee.sample.ch9.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserServiceTest {

    @Autowired
    UserService userService;

    @MockBean
    private CreditSystemService creditSystemService;

    @Test
    public void testService() {


        int userId = 10;
        int expectedCredit = 100;
        given(this.creditSystemService.getUserCredit(anyInt())).willReturn(expectedCredit);
        int credit = userService.getCredit(10);
        assertEquals(expectedCredit, credit);
    }

    @Test
    public void testUpdateUser() {

        User user = new User();
        user.setId(1);
        user.setName("ok22223343");
        boolean ret = userService.updateUser(user);
        assertTrue(ret);

    }
}
