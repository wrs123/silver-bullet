package com.silverbullet.auth.domain;

import java.util.Date;

public class SysAuthOrganization {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.parent_id
     *
     * @mbggenerated
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.path
     *
     * @mbggenerated
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.comments
     *
     * @mbggenerated
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.state
     *
     * @mbggenerated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.create_user
     *
     * @mbggenerated
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.modify_user
     *
     * @mbggenerated
     */
    private Integer modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_auth_organization.type
     *
     * @mbggenerated
     */
    private String type;

    private String organizationType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.id
     *
     * @return the value of sys_auth_organization.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.id
     *
     * @param id the value for sys_auth_organization.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.name
     *
     * @return the value of sys_auth_organization.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.name
     *
     * @param name the value for sys_auth_organization.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.parent_id
     *
     * @return the value of sys_auth_organization.parent_id
     *
     * @mbggenerated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.parent_id
     *
     * @param parentId the value for sys_auth_organization.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.path
     *
     * @return the value of sys_auth_organization.path
     *
     * @mbggenerated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.path
     *
     * @param path the value for sys_auth_organization.path
     *
     * @mbggenerated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.comments
     *
     * @return the value of sys_auth_organization.comments
     *
     * @mbggenerated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.comments
     *
     * @param comments the value for sys_auth_organization.comments
     *
     * @mbggenerated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.state
     *
     * @return the value of sys_auth_organization.state
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.state
     *
     * @param state the value for sys_auth_organization.state
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.sort
     *
     * @return the value of sys_auth_organization.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.sort
     *
     * @param sort the value for sys_auth_organization.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.create_user
     *
     * @return the value of sys_auth_organization.create_user
     *
     * @mbggenerated
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.create_user
     *
     * @param createUser the value for sys_auth_organization.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.create_time
     *
     * @return the value of sys_auth_organization.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.create_time
     *
     * @param createTime the value for sys_auth_organization.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.modify_user
     *
     * @return the value of sys_auth_organization.modify_user
     *
     * @mbggenerated
     */
    public Integer getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.modify_user
     *
     * @param modifyUser the value for sys_auth_organization.modify_user
     *
     * @mbggenerated
     */
    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.modify_time
     *
     * @return the value of sys_auth_organization.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.modify_time
     *
     * @param modifyTime the value for sys_auth_organization.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_auth_organization.type
     *
     * @return the value of sys_auth_organization.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_auth_organization.type
     *
     * @param type the value for sys_auth_organization.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType == null ? null : organizationType.trim();
    }
}