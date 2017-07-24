package org.mvnsearch.spring5.impl;

import org.mvnsearch.spring5.UserService;
import org.springframework.lang.Nullable;

/**
 * user service implementation
 *
 * @author linux_china
 */
public class UserServiceImpl implements UserService {
    @Nullable
    public String findNickById(Long id) {
        return "nick:" + id;
    }
}
