package com.mika.credit.facade.globalsearch.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.mika.credit.common.entity.BootGrid;
import com.mika.credit.facade.globalsearch.admin.dao.HelpCateMapper;
import com.mika.credit.facade.globalsearch.admin.dao.HelpMapper;
import com.mika.credit.facade.globalsearch.admin.model.Help;
import com.mika.credit.facade.globalsearch.admin.model.HelpCate;
import com.mika.credit.facade.globalsearch.admin.service.HelpService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helpService")
public class HelpServiceImpl implements HelpService {
    private static final Logger logger = Logger.getLogger(HelpServiceImpl.class);
    @Autowired
    private HelpCateMapper helpCateMapper;
    @Autowired
    private HelpMapper helpMapper;
    @Override
    public BootGrid<HelpCate> getHelpCates() {
        BootGrid<HelpCate> result = new BootGrid<>();
        result.setRows(helpCateMapper.queryAll());
        result.setResult(true);
        return result;
    }

    @Override
    public int removeHelpCate(Integer id) {
        logger.info("删除帮助类别方法开始...");
        return helpCateMapper.del(id);
    }

    @Override
    public int addHelpCate(HelpCate record) {
        logger.info("添加帮助类别方法开始...");
        return helpCateMapper.add(record);
    }

    @Override
    public int mergeHelpCate(HelpCate record) {
        logger.info("修改帮助类别方法开始...");
        if(record != null){
            if(record.getId() != null && record.getId() != 0){
                return helpCateMapper.mod(record);
            }else{
                return helpCateMapper.add(record);
            }
        }
        return 0;
    }

    @Override
    public BootGrid<Help> getHelps(Help record, BootGrid<Help> grid) {
        logger.info("查询帮助内容方法开始...");
        PageHelper.startPage(grid.getCurrent(), grid.getRowCount());
        grid.setRows(helpMapper.queryByCondition(record));
        grid.setTotal(helpMapper.queryCountByCondition(record));
        grid.setResult(true);
        return grid;
    }

    @Override
    public int removeHelp(Integer id) {
        logger.info("删除帮助内容方法开始...");
        return helpMapper.del(id);
    }

    @Override
    public int addHelp(Help record) {
        logger.info("添加帮助内容方法开始...");
        return helpMapper.add(record);
    }

    @Override
    public int mergeHelp(Help record) {
        logger.info("修改帮助内容方法开始...");
        if(record != null){
            if(record.getId() != null && record.getId() != 0){
                return helpMapper.mod(record);
            }else{
                return helpMapper.add(record);
            }
        }
        return 0;
    }

    @Override
    public int selectCountByCate(Integer cateId) {
        logger.info("根据id查询帮助内容总记录数方法开始...");
        return helpMapper.selectCountByCate(cateId);
    }

    @Override
    public Help getHelpById(Integer id) {
        logger.info("根据id查询帮助内容方法开始...");
        Help help = helpMapper.queryById(id);
        return help;
    }
}