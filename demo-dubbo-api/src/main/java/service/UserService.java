package service;

import entity.UserDO;
import java.util.List;

/**
 * @类名称：UserService
 * @类描述：
 * @作者：Lv Ming
 * @日期：2018年6月17日
 * @版本：V1.0
 */
public interface UserService {

    /**
     * 通过id查询用户
     * @param id
     * @return T
     * @日期：2018年6月17日
     */
    public UserDO findById(Long id);

    /**
     * 查询用户列表
     * @return List<T>
     * @日期：2018年6月17日
     */
    public List<UserDO> listUser();

}