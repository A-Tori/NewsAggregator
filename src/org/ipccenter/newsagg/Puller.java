package org.ipccenter.newsagg;

import java.io.IOException;
import java.util.Date;



/**
 * Created with IntelliJ IDEA.
 * User: darya
 * Date: 24.10.13
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */
public interface Puller {
    enum KEYWORDS {ФРТК, МФТИ, Физтех, РТ, паяльник, радио}

    long getLastUpdateTime();

    void checkFeed() throws IOException;
    void findPosts() throws IOException;
    //void parsePost(Object item); //make new DB element, set up all the fields by parsing html(?)

}