Securing RESTful webservices with Spring Security

Playground to test REST security

localhost:8080/oauth/token
{
    "access_token": "954e3761-c912-4577-96d9-8cc64f3c495a",
    "token_type": "bearer",
    "expires_in": 3599,
    "scope": "read write"
}

localhost:8080/message/admin?access_token=954e3761-c912-4577-96d9-8cc64f3c495a