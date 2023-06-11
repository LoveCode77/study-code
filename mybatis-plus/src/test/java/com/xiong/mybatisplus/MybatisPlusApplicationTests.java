package com.xiong.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiong.mybatisplus.entity.User;
import com.xiong.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    void test(){
        User user = new User();
        user.setAge(18);
        user.setName("logicDelete");
        user.setEmail("995931576@qq.com");
        int result = userMapper.insert(user);

        System.out.println(result); //影响的行数
        System.out.println(user); //id自动回填

    }
    @Test
    void testInsert(){
        User user = new User();
        user.setId(1474366076954370051L);
        user.setAge(23);
        user.setName("熊都");
        user.setEmail("995931576@qq.com");
        int i = userMapper.updateById(user);

        System.out.println(i); //影响的行数
        System.out.println(user); //id自动回填
    }
    @Test
    void testLock(){
        User user = userMapper.selectById(1474366076954370052L);
        user.setEmail("1822649761@qq.com");
        user.setVersion(user.getVersion()-1);
        int i = userMapper.updateById(user);
        System.out.println(i);
        System.out.println(user);
    }
    @Test
    void testPage(){
        Page<User>  userPage= new Page<>(1, 2);
        userMapper.selectPage(userPage,null);
        userPage.getRecords().forEach(System.out::println);
    }
    @Test
    void testPage1(){
        Page<User>  userPage= new Page<>(1, 2);
        IPage<Map<String, Object>> page = userMapper.selectMapsPage(userPage, null);

        userPage.getRecords().forEach(System.out::println);
        //java.lang.ClassCastException: java.util.HashMap cannot be cast to com.xiong.mybatisplus.entity.User

        page.getRecords().forEach(System.out::println);

    }
    @Test
    void testLogicalDeleted(){
//        int i = userMapper.deleteById(1474366076954370053L);
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    /**
     * 测试 性能分析插件
     */
    @Test
    public void testPerformance() {
        User user = new User();
        user.setName("我是Helen");
        user.setEmail("helen@sina.com");
        user.setAge(18);
        userMapper.insert(user);
    }

    @Test
    public void w1(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNotNull("name").ge("id",10);

        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
        Integer count = userMapper.selectCount(queryWrapper);
        System.out.println("count = " + count);

    }



}
