package com.pbankpay.dao;

import com.pbankpay.model.Dict;

import java.util.List;

public interface IDictDao {
    
    /**
     * 根据字段获取字典
     * @param field
     * @return
     */
    public List<Dict> getDictByField(String field);
}