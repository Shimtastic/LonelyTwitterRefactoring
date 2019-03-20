package ca.ualberta.cs.lonelytwitterrefactored;

import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends SuperClassExample implements Serializable {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public void setTweetBodyRefactored(String tweetBody) {
		this.tweetBody = tweetBody;
	}

}