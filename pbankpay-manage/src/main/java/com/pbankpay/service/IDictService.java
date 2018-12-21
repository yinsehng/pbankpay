package com.pbankpay.service;

import com.pbankpay.model.Dict;

import java.util.List;

/**
 * 字典业务接口
 * @author lixiaoxi
 *
 */
public interface IDictService {
    
    /**
     * 根据字段获取字典
     * @param field
     * @return
     */
    public List<Dict> getDictByField(String field);
}