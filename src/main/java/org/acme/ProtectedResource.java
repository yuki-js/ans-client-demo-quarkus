package org.acme;

import org.eclipse.microprofile.jwt.JsonWebToken;

import io.quarkus.oidc.IdToken;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.SecurityContext;

@Path("/protected")
public class ProtectedResource {
    @Inject
    @IdToken
    JsonWebToken idToken;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("**")
    public String getProtectedResource(@Context SecurityContext securityContext) {
        return "{\"hello\": \"world\", \"nonce\": \"" + idToken.getClaim("nonce") + "\", \"raw_token\": \""
                + idToken.getRawToken() + "\", \"principal\": \"" + securityContext.getUserPrincipal().getName()
                + "\"}";

    }
}
