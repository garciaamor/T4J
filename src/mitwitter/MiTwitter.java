package mitwitter;

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class MiTwitter {

    public static void main(String[] args) throws TwitterException {
        
       

Twitter twitter = new TwitterFactory().getInstance();

//CODIGO CAMBIAR ESTADO
 /*Status miStatus = twitter.updateStatus("Segundo ejemplo");//Comentario para no cambiar el estado constantemente
System.out.println(miStatus.getText());*/

//CODIGO TIMELINE
List<Status> statuses = twitter.getHomeTimeline();
    System.out.println("Showing home timeline.");
    for (Status status : statuses) {
        System.out.println(status.getUser().getName() + ":" + status.getText());
    }

//CODIGO BUSCAR TAGS
    Query query = new Query("Chelsea"); //Dentro del String va el tag que quieres buscar
    QueryResult result = twitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
    }






    }
    
}
