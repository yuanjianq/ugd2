package com.gfan.report.frame.dao;

import com.gfan.report.frame.module.UiFwFunction;
import com.gfan.report.frame.module.UiFwFunctionExample;
import java.util.List;

public interface UiFwFunctionDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    int countByExample(UiFwFunctionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    int deleteByExample(UiFwFunctionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    void insert(UiFwFunction record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    void insertSelective(UiFwFunction record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    List selectByExample(UiFwFunctionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    UiFwFunction selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    int updateByExampleSelective(UiFwFunction record, UiFwFunctionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    int updateByExample(UiFwFunction record, UiFwFunctionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    int updateByPrimaryKeySelective(UiFwFunction record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION
     *
     * @ibatorgenerated Thu Sep 25 15:11:46 CST 2014
     */
    int updateByPrimaryKey(UiFwFunction record);
    
    List selectByUserId(Integer userId);
}