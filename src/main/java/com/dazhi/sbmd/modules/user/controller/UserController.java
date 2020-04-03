package com.dazhi.sbmd.modules.user.controller;


import com.dazhi.sbmd.modules.user.entity.User;
import com.dazhi.sbmd.modules.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 列出所有User
     * @return
     */
    @GetMapping("/list")
    private Map<Object, Object> list() {
        Map<Object, Object> result = new HashMap<>();
        List<User> list = userService.list();
        result.put("status", 200);
        result.put("data", list);

        return result;
    }

    /**
     * 新增User
     * @return
     */
    @PostMapping("/add")
    private Map<Object, Object> add() {
        Map<Object, Object> result = new HashMap<>();
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        userService.add(user);
        result.put("status", 200);
        result.put("msg", "ok");
        return result;
    }
}
