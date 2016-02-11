package com.service.tagsapi.tags

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Create {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val create = exec(http("POST /tags")
    .post("/tags")
    .headers(headers)
    .body(StringBody(
      """{
          "name": "testthis"
        }""")).asJSON
    .check(status.is(201))

  )
}
