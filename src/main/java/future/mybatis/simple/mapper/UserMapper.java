package future.mybatis.simple.mapper;

import future.mybatis.simple.model.SysUser;

import java.util.List;

public interface UserMapper {
    /**
     * 通过ID查询用户
     * @param id
     * @return
     */
    SysUser selectById(Long id);

    /**
     * 查询全部用户
     * @return
     */

    List<SysUser> selectAll();
}
