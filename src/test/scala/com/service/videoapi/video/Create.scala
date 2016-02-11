package com.service.videoapi.video

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Create {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val create = exec(http("POST_create")
    .post("/videos")
    .headers(headers)
    .body(StringBody(
      """{
          "name": "testthis"
          "slug": "testthis"
          "brand_id": "1"
          "description": "here's a description"
        }""")).asJSON
    .check(status.is(201))

  )
}
