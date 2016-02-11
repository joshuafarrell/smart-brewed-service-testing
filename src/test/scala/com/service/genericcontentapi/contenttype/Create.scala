package com.service.genericcontentapi.contenttype

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Create {
  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val create = exec(http("POST /content/type")
    .post("/content/type")
    .headers(headers)
    .body(StringBody(
      """{
          "created_by" : "
        }""")).asJSON
    .check(
      jsonPath("$.id").ofType[Int].saveAs("userId")
    )

  )
}
