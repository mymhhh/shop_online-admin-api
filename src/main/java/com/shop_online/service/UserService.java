package com.shop_online.service;

import com.shop_online.common.model.Query;
import com.shop_online.common.result.PageResult;
import com.shop_online.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop_online.vo.UserVO;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zero
 * @since 2023-11-28
 */
public interface UserService extends IService<User> {

    /**
     * 获取用户记录
     *
     * @param query
     * @return PageResult
     */
    PageResult<UserVO> getPage(Query query);

    /**
     * 导出用户记录
     *
     * @param query
     * @param response
     */
    void exportUserInfo(Query query, HttpServletResponse response);

}
