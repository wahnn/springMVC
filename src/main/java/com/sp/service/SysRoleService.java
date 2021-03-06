package com.sp.service;

import java.util.List;
import java.util.Map;

import com.sp.entity.SysRole;
import com.sp.utils.Page;

/**
 * 
 * @ClassName SysRoleService
 * @Description 角色service
 * @author:Gaoxueyong  http://blog.csdn.net/fenfenguai
 * @Date 2016年12月2日 上午11:13:15
 * @version 1.0.0
 */
public interface SysRoleService {
	
	/**
	 * 
	 * @Description 插入角色对象
	 * @param sysRole
	 * @return
	 * @author: Gaoxueyong  http://blog.csdn.net/fenfenguai
	 * Create at: 2016年12月2日 上午11:14:46
	 */
	int insertSysRole(SysRole sysRole);
	
	/**
	 * 
	 * @Description 删除(物理删除)
	 * @param id
	 * @return
	 * @author: Gaoxueyong  http://blog.csdn.net/fenfenguai
	 * Create at: 2016年12月2日 上午11:08:20
	 */
    int deleteSysRoleByPrimaryKeyReal(String id);

    /**
     * 
     * @Description 删除(逻辑删除)
     * @param paramerMap
     * @return
     * @author: Gaoxueyong  http://blog.csdn.net/fenfenguai
     * Create at: 2016年12月2日 上午11:08:48
     */
    int deleteSysRoleByPrimaryKey(Map<String, Object> paramerMap);
    
    /**
     * 
     * @Description 更新角色对象
     * @param sysRole
     * @return
     * @author: Gaoxueyong  http://blog.csdn.net/fenfenguai
     * Create at: 2016年12月2日 上午11:14:31
     */
    int updateSysRole(SysRole sysRole);
    
    /**
     * 
     * @Description 根据主键ID获取角色对象
     * @param id
     * @return
     * @author: Gaoxueyong  http://blog.csdn.net/fenfenguai
     * Create at: 2016年12月2日 上午11:13:52
     */
    SysRole selectSysRoleByPrimaryKey(String id);

    /**
     * 
     * @Description 获取角色列表
     * @param paramerMap
     * @return
     * @author: Gaoxueyong  http://blog.csdn.net/fenfenguai
     * Create at: 2016年11月21日 上午10:43:33
     */
    List<SysRole> getSysRoleList(Map<String, Object> paramerMap);
    
    
    /**
     * 
     * @Description 获取角色列表
     * @param paramerMap
     * @return
     * @author: Gaoxueyong  http://blog.csdn.net/fenfenguai
     * Create at: 2016年11月21日 上午10:43:33
     */
    public Page<SysRole> getSysRoleListPage(Page<SysRole> page,Map<String, Object> paramerMap);
    
    /**
     * 
     * @Description 获取角色列表总数
     * @param paramerMap
     * @return
     * @author: Gaoxueyong  http://blog.csdn.net/fenfenguai
     * Create at: 2016年11月21日 上午10:43:38
     */
    public int getSysRoleListTotalNum(Map<String, Object> paramerMap);
    
    /**
     * 
     * @Description  根据用户id获取其角色信息
     * @author: Gaoxueyong  http://blog.csdn.net/fenfenguai
     * @param paramerMap userId
     * @return
     * Create at: 2017年1月3日 下午3:09:14
     */
    List<SysRole>  getSysRoleListByUserId(Map<String, Object> paramerMap);
}
