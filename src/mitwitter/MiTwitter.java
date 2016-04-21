package mitwitter;

import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class MiTwitter {

    public static void main(String[] args) throws TwitterException {
        
        //Twitter miTwitter= new TwitterFactory().getInstance();
        ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setDebugEnabled(true)
  .setOAuthConsumerKey("ynUDdkF6L4ul98GQeWeFARS9p")
  .setOAuthConsumerSecret("5ibEyyvsuLf1Zxmye6t9DMT7b38WnB6qUXehis2fJgDiYHIcxx")
  .setOAuthAccessToken("562356095-3heHhppXAbAXmiEBqZzLm8sRMvGeHMSBqWI3BUGV")
  .setOAuthAccessTokenSecret("iOAIk1ubWqBb939YtmdDmQ1rlmMxqFeAiXEtVjJBvpB5n");
TwitterFactory tf = new TwitterFactory(cb.build());
Twitter twitter = tf.getInstance();

//CODIGO CAMBIAR ESTADO
Status miStatus = twitter.updateStatus("Importar TwitterException");
System.out.println(miStatus.getText());

//CODIGO TIMELINE
List<Status> statuses = twitter.getHomeTimeline();
    System.out.println("Showing home timeline.");
    for (Status status : statuses) {
        System.out.println(status.getUser().getName() + ":" + status.getText());
    }







    }
    
}
