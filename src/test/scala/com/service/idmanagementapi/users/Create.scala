package com.service.idmanagementapi.users

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Create {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )
  val feeder = csv("newUserData.csv").circular

  val create = feed(feeder)
    .exec(http("POST /connect/users")
    .post("/connect/users")
    .headers(headers)
    .body(StringBody(
      """{
        	"firstname": "${firstname}",
        	"lastname": "${lastname}",
        	"username": "${username}",
        	"email": "${email}",
        	"password": "123456",
        	"enabled": "true",
        	"birthdate": "1995-02-15",
        	"username_canonical": "Test",
        	"email_canonical": "${emailcanonical}",
        	"algorithm": "123",
        	"salt": "12345",
        	"locked": "false",
        	"expired": "false",
        	"expiresAt": "2015-01-01",
        	"confirmation_token": "1",
        	"roles": "0",
        	"credentials_expired": "false",
        	"credentials_expire_at": "2016-01-01",
        	"provider_account": "false",
        	"extras":[
        	{"namespace": "test","name": "testfield", "value": "yep"}
        	]
        }""")).asJSON
    .check(
      jsonPath("$.id").ofType[Int].saveAs("userId")
    )

  )
}
