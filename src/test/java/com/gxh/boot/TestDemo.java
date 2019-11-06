package com.gxh.boot;

import com.gxh.DemoApplication;
import com.gxh.mapper.MyUserMapper;
import com.gxh.pojo.MyUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TestDemo {
    //junit测试
    @Autowired
    private MyUserMapper myUserMapper;

    @Test
    public void getUserList(){
        List<MyUser> userList = myUserMapper.getUserList();
        for(MyUser user : userList){
            System.out.println(user);
        }
    }

    //SpringBoot整合Redis
    //1.获取RedisTemplate对象
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void getRedis(){
        redisTemplate.opsForValue().set("Hello","ni hao");
        String hello = (String)redisTemplate.opsForValue().get("Hello");
        System.out.println(hello);

        MyUser myUser = new MyUser();
        myUser.setId(3);
        myUser.setName("哈哈");
        myUser.setPassword("123456");
        myUser.setUsername("haha");
        redisTemplate.opsForValue().set("myUser",myUser);
        MyUser myUser1 = (MyUser)redisTemplate.opsForValue().get("myUser");
        System.out.println(myUser1);


    }


}
