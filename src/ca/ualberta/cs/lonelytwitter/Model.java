package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Model implements Interface {
	private String text;
	private Date timestamp;

	public void setText(String text) {
		this.text = text;
	}

	public Date getTimestamp() {
		return timestamp;
	}
	
	public String getText() {
		return text;
	}
	public abstract String toString();
	
	public Model(String text) {
		super();
		this.text = text;
		timestamp = new Date();
	}

	public Model(String text, Date timestamp) {
		super();
		this.text = text;
		this.timestamp = timestamp;
	}

}