package ca.ualberta.cs.lonelytwitterrefactored;

import java.io.IOException;
import java.util.Date;

public abstract class SuperClassExample {
    private static final long serialVersionUID = 1L;
    protected Date tweetDate;
    protected String tweetBody;

    public Date getTweetDateRefactored() {
        return tweetDate;
    }

    public void setTweetDateRefactored(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public String getTweetBodyRefactored() {
        return tweetBody;
    }

    public abstract void setTweetBodyRefactored(String tweetBody);

    private void writeObjectRefactored(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObjectRefactored(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public boolean isValidRefactored() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return getTweetDateRefactored() + " | " + getTweetBodyRefactored() ;
    }
}
