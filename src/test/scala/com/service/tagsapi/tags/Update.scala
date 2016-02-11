package com.service.tagsapi.tags

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Update {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val update = exec(http("PUT /tags/{tagId}")
    .put("/tags/1")
    .headers(headers)
    .body(StringBody(
      """{
          "name": "testme"
        }""")).asJSON
    .check(status.is(200))

  )
}
