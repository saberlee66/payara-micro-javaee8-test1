package com.saber.services.dto;

import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
public class VersionResourceV2 {
    @GET
    public Response getV2() {
        JsonObject jsonObject = Json.createObjectBuilder().add("version", "v2").build();
        return Response.ok(jsonObject).build();
    }
}
