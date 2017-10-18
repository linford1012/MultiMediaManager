package com.bjb.model;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component(value="mUser")
public class MUser extends BasicModel {

	private static final long serialVersionUID = 1;
	
	/**
	 * ID
	 */
	private Integer id;
	
	/**
	 * 账号
	 */
	private String account;
	
	/**
	 * 密码
	 */
	private String pwd;
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 手机
	 */
	private String phone;
	
	/**
	 * 角色
	 */
	private Integer role;
	
	/**
	 * 状态
	 */
	private Integer status;
	
	/**
	 * 删除标示
	 */
	private Integer del_flg;
	
	/**
	 * 创建日时
	 */
	private Timestamp create_datetime;
	
	/**
	 * 创建者ID
	 */
	private Integer create_user_id;
	
	/**
	 * 更新日时
	 */
	private Timestamp update_datetime;
	
	/**
	 * 更新者ID
	 */
	private Integer update_user_id;
	
	/**
	 * Empty constructor
	 */
	public MUser() {
		super();
	}
	
	/**
	 * 获取 ID
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * 设置 ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * 获取 账号
	 */
	public String getAccount() {
		return account;
	}
	
	/**
	 * 设置 账号
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	
	/**
	 * 获取 密码
	 */
	public String getPwd() {
		return pwd;
	}
	
	/**
	 * 设置 密码
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	/**
	 * 获取 姓名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 设置 姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取 手机
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * 设置 手机
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * 获取 角色
	 */
	public Integer getRole() {
		return role;
	}
	
	/**
	 * 设置 角色
	 */
	public void setRole(Integer role) {
		this.role = role;
	}
	
	/**
	 * 获取 状态
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * 设置 状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 获取 删除标示
	 */
	public Integer getDelFlg() {
		return del_flg;
	}
	
	/**
	 * 设置 删除标示
	 */
	public void setDelFlg(Integer del_flg) {
		this.del_flg = del_flg;
	}
	
	/**
	 * 获取 创建日时
	 */
	public Timestamp getCreateDatetime() {
		return create_datetime;
	}
	
	/**
	 * 设置 创建日时
	 */
	public void setCreateDatetime(Timestamp create_datetime) {
		this.create_datetime = create_datetime;
	}
	
	/**
	 * 获取 创建者ID
	 */
	public Integer getCreateUserId() {
		return create_user_id;
	}
	
	/**
	 * 设置 创建者ID
	 */
	public void setCreateUserId(Integer create_user_id) {
		this.create_user_id = create_user_id;
	}
	
	/**
	 * 获取 更新日时
	 */
	public Timestamp getUpdateDatetime() {
		return update_datetime;
	}
	
	/**
	 * 设置 更新日时
	 */
	public void setUpdateDatetime(Timestamp update_datetime) {
		this.update_datetime = update_datetime;
	}
	
	/**
	 * 获取 更新者ID
	 */
	public Integer getUpdateUserId() {
		return update_user_id;
	}
	
	/**
	 * 设置 更新者ID
	 */
	public void setUpdateUserId(Integer update_user_id) {
		this.update_user_id = update_user_id;
	}
}
