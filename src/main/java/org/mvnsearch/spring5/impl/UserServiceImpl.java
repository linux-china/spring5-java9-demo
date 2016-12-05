package org.mvnsearch.spring5.impl;

import org.mvnsearch.spring5.UserService;

/**
 * user service implementation
 *
 * @author linux_china
 */
public class UserServiceImpl implements UserService {
    public String findNickById(Long id) {
        return "nick:" + id;
    }
}
