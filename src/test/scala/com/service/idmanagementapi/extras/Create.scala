package com.service.idmanagementapi.extras

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Create {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val create = exec(http("POST /connect/users/${userId}/extra")
    .post("/connect/users/${userId}/extra")
    .headers(headers)
    .body(StringBody(
      """{
          "namespace": "namespace1",
          "value": "value",
          "name": "name"
          }""")).asJSON
  )
}
