package com.pbankpay.service.impl;

import java.util.List;

import com.pbankpay.dao.IDictDao;
import com.pbankpay.model.Dict;
import com.pbankpay.service.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictServiceImpl implements IDictService {
    
    /**
     * 自动装配
     */
    @Autowired
    private IDictDao dictDao;
    /**
     * 根据字段获取字典
     * @param field
     * @return
     */
    public List<Dict> getDictByField(String field){
        return dictDao.getDictByField(field);
    }

}