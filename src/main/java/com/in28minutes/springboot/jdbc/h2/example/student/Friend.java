package com.in28minutes.springboot.jdbc.h2.example.student;

public class Friend {
	private Long id;
	private String emailID;
	private String friendList;
	private String subscriptionList;
	private String message;
	
	public Friend() {
		super();
	}
	
	public Friend(Long id, String emailID, String friendList,String subscriptionList,String message) {
		super();
		this.id = id;
		this.emailID = emailID;
		this.friendList = friendList;
		this.subscriptionList=subscriptionList;
		this.message=message;
	}

	public Friend(Long id, String emailID) {
		super();
		this.id = id;
		this.emailID = emailID;
	}

	public Friend(Long id,String emailID, String friendList) {
		super();
		this.id = id;
		this.emailID = emailID;
		this.friendList=friendList;
	}
	
	/*public Friend(Long id, String emailID,String subscriptionList) {
		super();
		this.id = id;
		this.emailID = emailID;
		this.subscriptionList=subscriptionList;
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public String getFriendList() {
		return friendList;
	}

	public void setFriendList(String friendList) {
		this.friendList = friendList;
	}
	public String getSubscriptionList() {
		return subscriptionList;
	}

	public void setSubscriptionList(String subscriptionList) {
		this.subscriptionList = subscriptionList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return String.format("Friend [id=%s, emailID=%s, friendList=%s]", id, emailID, friendList);
	}

}
