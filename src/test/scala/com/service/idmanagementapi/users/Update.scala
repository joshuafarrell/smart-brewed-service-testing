package com.service.idmanagementapi.users

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Update {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val update = exec(http("POST /connect/users/${userId}")
      .put("/connect/users")
      .headers(headers)
      .body(StringBody(
        """{
            "id": "${userId}",
            "firstname": "Scala",
            "lastname": "Gatling",
            "username": "scalaGatling",
            "email": "scala@test.com"
           }""")).asJSON
    )
}
