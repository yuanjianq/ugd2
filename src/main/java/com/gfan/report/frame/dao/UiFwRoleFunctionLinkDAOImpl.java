package com.gfan.report.frame.dao;

import com.gfan.report.frame.module.UiFwRoleFunctionLinkExample;
import com.gfan.report.frame.module.UiFwRoleFunctionLinkKey;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class UiFwRoleFunctionLinkDAOImpl extends SqlMapClientDaoSupport implements UiFwRoleFunctionLinkDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    public UiFwRoleFunctionLinkDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    public int countByExample(UiFwRoleFunctionLinkExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("UI_FW_ROLE_FUNCTION_LINK.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    public int deleteByExample(UiFwRoleFunctionLinkExample example) {
        int rows = getSqlMapClientTemplate().delete("UI_FW_ROLE_FUNCTION_LINK.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    public int deleteByPrimaryKey(UiFwRoleFunctionLinkKey key) {
        int rows = getSqlMapClientTemplate().delete("UI_FW_ROLE_FUNCTION_LINK.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    public void insert(UiFwRoleFunctionLinkKey record) {
        getSqlMapClientTemplate().insert("UI_FW_ROLE_FUNCTION_LINK.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    public void insertSelective(UiFwRoleFunctionLinkKey record) {
        getSqlMapClientTemplate().insert("UI_FW_ROLE_FUNCTION_LINK.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    public List selectByExample(UiFwRoleFunctionLinkExample example) {
        List list = getSqlMapClientTemplate().queryForList("UI_FW_ROLE_FUNCTION_LINK.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    public int updateByExampleSelective(UiFwRoleFunctionLinkKey record, UiFwRoleFunctionLinkExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("UI_FW_ROLE_FUNCTION_LINK.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    public int updateByExample(UiFwRoleFunctionLinkKey record, UiFwRoleFunctionLinkExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("UI_FW_ROLE_FUNCTION_LINK.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table UI_FW_ROLE_FUNCTION_LINK
     *
     * @ibatorgenerated Mon May 11 16:32:54 CST 2015
     */
    private static class UpdateByExampleParms extends UiFwRoleFunctionLinkExample {
        private Object record;

        public UpdateByExampleParms(Object record, UiFwRoleFunctionLinkExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}