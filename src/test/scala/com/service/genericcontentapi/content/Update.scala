package com.service.genericcontentapi.content

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Update {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val update = exec(http("PATCH /content/{id}")
      .patch("/content/{id}")
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
