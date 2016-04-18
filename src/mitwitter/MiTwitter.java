/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mitwitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author mmoureperez
 */
public class MiTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Twitter miTwitter= new TwitterFactory().getInstance();
        ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setDebugEnabled(true)
  .setOAuthConsumerKey("*********************")
  .setOAuthConsumerSecret("******************************************")
  .setOAuthAccessToken("**************************************************")
  .setOAuthAccessTokenSecret("******************************************");
TwitterFactory tf = new TwitterFactory(cb.build());
Twitter twitter = tf.getInstance();
    }
    
}
