package com.rongkecloud.chat.demo;

public class RKCloudChatUiHandlerMessage {
	private static final int MSG_BASE = 100000;
	
	public static final int SDCARD_NOT_EXIST = MSG_BASE + 1;// sd卡不存在
	public static final int SDCARD_ERROR = MSG_BASE + 2;// sd卡错误或者容量已满
	
	public static final int JUMP_LISTVIEW_TOP = MSG_BASE + 5;// 跳转到列表顶端
	public static final int JUMP_LISTVIEW_BOTTOM = MSG_BASE + 6;// 跳转到列表底端
		
	/********************* 成员选择 *******************************/
	public static final int SELECTED_CONTACT_GRIDVIEW_LAST = MSG_BASE + 20;// 已选择的成员定位到最后一个
		
	/********************* 会话列表页面相关的 *******************************/	
	public static final int GET_ALLCHATS_INFO_FINISHED = MSG_BASE + 51;// 会话信息获取完成
	public static final int QUERY_ALLCHATS_INFO_FINISHED = MSG_BASE + 52;// 会话信息搜索完成
	public static final int DELETE_SINGLE_CHAT = MSG_BASE + 53;// 删除单个会话
	public static final int DELETE_ALL_CHATS = MSG_BASE + 54;// 删除所有会话
	
	/********************* 消息列表页面相关的 *******************************/	
	public static final int MSG_LOAD_DATA_FINISHED = MSG_BASE + 101;// 查询完毕之后进行的数据列表刷新	
	public static final int MSG_LOAD_HISTROY_DATA_FINISHED = MSG_BASE + 102;// 查询完历史数据之后进行的会话列表刷新	
	
	public static final int HIDDEN_TIP_UNREADCNT = MSG_BASE + 104;// 隐藏未读条数提示
	public static final int HIDDEN_TIP_NEWMSG = MSG_BASE + 105;// 隐藏消息提示条	
	public static final int HIDDEN_TIP_NEWMSG_TIMER = MSG_BASE + 106;// 在某个时间后隐藏消息提示条	
	
	public static final int MSG_STATUS_HAS_CHANGED = MSG_BASE + 107;// 消息状态改变
	public static final int DRAFT_MAG_CHANGED = MSG_BASE + 108;// 草稿内容有变化
	
	public static final int ADD_MSG_TO_LOCALDB = MSG_BASE + 109;// 向本地数据库中添加消息
	
	public static final int IMAGE_CONTENT_UNNORMAL = MSG_BASE + 110;// 图片文件异常
	public static final int IMAGE_COMPRESS_SUCCESS = MSG_BASE + 111;// 图片压缩成功
	public static final int IMAGE_COMPRESS_FAILED = MSG_BASE + 112;// 图片压缩失败
	
	public static final int UNREAD_MSG_COUNT_CHANGED = MSG_BASE + 113;// 未读消息条数有变化
	
	/********************* 群成员管理页面相关的 ***************************/
	public static final int QUERY_GROUP_USERS_FINISH = MSG_BASE + 152;// 查询群成员信息完毕	
	
	/********************* 转发页面相关的 ***************************/
	public static final int FORWARD_GET_ALLCHATS_FINISH = MSG_BASE + 180;// 获取所有会话完成
	public static final int FORWARD_GET_ALLCONTACTS_FINISH = MSG_BASE + 181;// 获取所有联系人信息完成	
	public static final int FORWARD_QUERY_ALLCHATS_FINISH = MSG_BASE + 182;// 查询会话信息完成	
	public static final int FORWARD_QUERY_ALLCONTACTS_FINISH = MSG_BASE + 183;// 查询联系人信息完成
	
	/********************* 与http交互的类型 ***************************/
	public static final int RESPONSE_SEND_MMS = MSG_BASE + 201;// 发送消息
	public static final int RESPONSE_FORWARD_MMS = MSG_BASE + 202;// 转发消息
	public static final int RESPONSE_RESEND_MMS = MSG_BASE + 203;// 重新发送失败的消息
	
	public static final int CALLBACK_RECEIVED_MMS = MSG_BASE + 206;// // 接收一条消息
	public static final int CALLBACK_RECEIVED_MOREMMS =  MSG_BASE + 207;// 批量处理完收到的MMS消息
	public static final int RESPONSE_UPDATE_DOWNING_PROGRESS = MSG_BASE + 208;// 更新下载进度
	public static final int RESPONSE_MEDIAFILE_DOWNED = MSG_BASE + 209;// 文件下载完成
	public static final int RESPONSE_THUMBIMAGE_DOWNED = MSG_BASE + 210;// 缩略图下载完成
	
	public static final int RESPONSE_APPLY_GROUP = MSG_BASE + 220;// 建群
	public static final int RESPONSE_INVITE_USERS = MSG_BASE + 221;// 邀请成员入群
	public static final int RESPONSE_QUIT_GROUP = MSG_BASE + 222;// 退群
	public static final int RESPONSE_KICKUSER = MSG_BASE + 223;// 踢人
	public static final int CALLBACK_KICKOUT = MSG_BASE + 224;// 被踢出群
	public static final int CALLBACK_GROUP_DISSOLVED = MSG_BASE + 225;// 群被解散
	
	public static final int RESPONSE_MODIFY_GROUP_INVITEAUTH = MSG_BASE + 230;// 修改邀请权限
	public static final int CALLBACK_GROUP_INFO_CHANGED = MSG_BASE + 231;// 群信息有变更
	public static final int CALLBACK_GROUP_USERS_CHANGED = MSG_BASE + 232;// 群内成员有变化

	
	
	///////////////////推送消息相关的内容/////////////////////////////////////////////////////////
	public static final int SEND_USER_DEFINED_MMS = MSG_BASE + 501;// 发送应用自己定义的消息
	public static final int RECEIVED_USER_DEFINED_MMS = MSG_BASE + 502;// 收到应用自己定义的消息

	
	
	//////////////////以下是联系人相关的内容////////////////////////////////////////////
	public static final int ADDRESSLIST_LOAD_ALL_CONTACTS_FINISHED = MSG_BASE + 1001;// 获取所有联系人信息完成
	public static final int ADDRESSLIST_SEARCH_FINISHED = MSG_BASE + 1002;// 搜索完成
	
	public static final int GET_CONTACTSINFO_FINISHED = MSG_BASE + 1003;// 获取联系人信息完成
	
	public static final int CONTACTSINFO_CHANGED = MSG_BASE + 1004;// 联系人信息有变化
	public static final int CONTACT_HEADERIMAGE_CHANGED = MSG_BASE + 1005;// 联系人头像有变化
	
	public static final int GET_ALL_MY_CREATED_GROUPS_FINISHED = MSG_BASE + 1010;// 获取我创建的群完成
	public static final int GET_ALL_MY_ATTENDED_GROUPS_FINISHED = MSG_BASE + 1011;// 获取我参与的群完成
}
