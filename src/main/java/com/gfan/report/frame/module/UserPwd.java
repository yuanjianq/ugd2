package com.gfan.report.frame.module;

public class UserPwd {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column user_pwd.id
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column user_pwd.user_id
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    private Integer userId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column user_pwd.pwd_hash
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    private String pwdHash;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column user_pwd.pwd_salt
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    private String pwdSalt;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column user_pwd.id
     *
     * @return the value of user_pwd.id
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column user_pwd.id
     *
     * @param id the value for user_pwd.id
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column user_pwd.user_id
     *
     * @return the value of user_pwd.user_id
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column user_pwd.user_id
     *
     * @param userId the value for user_pwd.user_id
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column user_pwd.pwd_hash
     *
     * @return the value of user_pwd.pwd_hash
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    public String getPwdHash() {
        return pwdHash;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column user_pwd.pwd_hash
     *
     * @param pwdHash the value for user_pwd.pwd_hash
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    public void setPwdHash(String pwdHash) {
        this.pwdHash = pwdHash;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column user_pwd.pwd_salt
     *
     * @return the value of user_pwd.pwd_salt
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    public String getPwdSalt() {
        return pwdSalt;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column user_pwd.pwd_salt
     *
     * @param pwdSalt the value for user_pwd.pwd_salt
     *
     * @ibatorgenerated Wed Apr 29 15:46:44 CST 2015
     */
    public void setPwdSalt(String pwdSalt) {
        this.pwdSalt = pwdSalt;
    }
}