package org.cxf.demo.restasyncservice;

import org.cxf.demo.restasyncservice.model.ChecksList;
import org.springframework.stereotype.Service;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.container.AsyncResponse;

/**
 * @author olysenko
 */
@Service
public class CheckProcessorImpl implements CheckProcessor {
   @Override
   public void process(AsyncResponse response, ChecksList checksList) {
      new Thread(() -> {
         try {
            Thread.sleep(5000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
//         response.resume(new BadRequestException());
         response.resume(true);
      }).start();
   }
}
