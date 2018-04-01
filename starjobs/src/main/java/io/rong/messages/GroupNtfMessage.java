/**
 * 
 */
package io.rong.messages;

import java.util.HashMap;
import java.util.Map;

import io.rong.util.GsonUtil;

/**
 * <p>Title:GroupNtfMessage</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年6月29日上午10:14:37
 */
public class GroupNtfMessage extends BaseMessage{

	private String operatorUserId = "";
	private String operation = "";
	private Map<String,Object> data = new HashMap<String,Object>();
	
	private String extra = "";
	
	private String message = "";
	
	private transient static final String TYPE = "RC:GrpNtf";
	
	public GroupNtfMessage(String operatorUserId, String operation, Map<String, Object> data, String extra,
			String message) {
		super();
		this.operatorUserId = operatorUserId;
		this.operation = operation;
		this.data = data;
		this.extra = extra;
		this.message = message;
	}

	public String getOperatorUserId() {
		return operatorUserId;
	}

	public String getOperation() {
		return operation;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public String getExtra() {
		return extra;
	}

	public String getMessage() {
		return message;
	}

	public void setOperatorUserId(String operatorUserId) {
		this.operatorUserId = operatorUserId;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/* (non-Javadoc)
	 * @see io.rong.messages.BaseMessage#getType()
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	/* (non-Javadoc)
	 * @see io.rong.messages.BaseMessage#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return GsonUtil.toJson(this, GroupNtfMessage.class);
	}
	public static void main(String[] args) {
		Map<String,Object> data = new HashMap<String,Object>();
		String[] ids = {"id1"};
		data.put("operatorNickname", "operatorNickname");
		data.put("targetUserIds", ids);
		GroupNtfMessage m = new GroupNtfMessage("operatorUserId", "operation", data, "extra",
			"message");
		System.out.println(m);
	}
}
