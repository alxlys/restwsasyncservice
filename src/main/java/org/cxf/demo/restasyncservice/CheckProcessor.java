package org.cxf.demo.restasyncservice;

import org.cxf.demo.restasyncservice.model.ChecksList;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

@Path("/checksprocessingservice")
public interface CheckProcessor {

   @POST
   @Path("/checks")
   void process(@Suspended AsyncResponse response, ChecksList checksList);

}
