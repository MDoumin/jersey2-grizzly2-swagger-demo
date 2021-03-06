package com.example.jersey2.grizzly2.swagger.demo;

import com.wordnik.swagger.annotations.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
@Api(value = "/myresource", description = "Example")
@Produces({"text/plain"})
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @ApiOperation(value = "A test operation", notes = "More notes about this method", response = MyResource.class)
    @ApiResponses(value = {
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 500, message = "Server is down!")
    })
    public String getIt() {
        return "Got it!";
    }
}
