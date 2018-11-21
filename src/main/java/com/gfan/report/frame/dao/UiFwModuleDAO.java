package com.gfan.report.frame.dao;

import com.gfan.report.frame.module.UiFwModule;
import com.gfan.report.frame.module.UiFwModuleExample;
import java.util.List;

public interface UiFwModuleDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    int countByExample(UiFwModuleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    int deleteByExample(UiFwModuleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    void insert(UiFwModule record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    void insertSelective(UiFwModule record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    List selectByExample(UiFwModuleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    UiFwModule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    int updateByExampleSelective(UiFwModule record, UiFwModuleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    int updateByExample(UiFwModule record, UiFwModuleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    int updateByPrimaryKeySelective(UiFwModule record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    int updateByPrimaryKey(UiFwModule record);
    
    List selectByUserId(Integer userId);
}