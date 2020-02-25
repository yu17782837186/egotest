package com.ego.manage.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.pojo.TbItem;

public interface TbItemService {
    /**
     * 显示商品
     */
    EasyUIDataGrid show(int page,int rows);
    /**
     * 批量修改商品状态
     */
    int update(String ids,byte status);
    /**
     * 商品新增
     */
    int save(TbItem item ,String desc,String itemParams) throws Exception;
}
