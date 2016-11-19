package com.extr.domain.question;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 题库管理
 * 
 * @author longxy
 * @date 2016年11月16日 下午3:47:25
 * @version V1.0
 */
@XmlRootElement
public class Field {

	private int fieldId;	// id
	
	private String fieldName;	// 题库名称
	
	private String memo;	// 描述
	
	private boolean state;	// 状态(0:可删除; 1:不可删除. 为物理删除)
	
	private boolean removeable;	// 
	
	public boolean isRemoveable() {
		return removeable;
	}
	
	public void setRemoveable(boolean removeable) {
		this.removeable = removeable;
	}
	
	public int getFieldId() {
		return fieldId;
	}
	
	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public boolean isState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
}
