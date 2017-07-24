package org.mvnsearch.spring5;

import org.springframework.lang.Nullable;

/**
 * user service
 *
 * @author linux_china
 */
public interface UserService {

    @Nullable
    public String findNickById(Long id);
}
