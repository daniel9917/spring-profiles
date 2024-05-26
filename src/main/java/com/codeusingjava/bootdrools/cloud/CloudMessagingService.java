package com.codeusingjava.bootdrools.cloud;

import java.util.List;

public interface CloudMessagingService {
    void snitchProvider();
    void publishMessage ();
    List<String> retrieveLastMessages ();
}
