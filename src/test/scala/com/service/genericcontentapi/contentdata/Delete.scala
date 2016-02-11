package com.service.genericcontentapi.contentdata

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Delete {
  var path: String = "/content/extra"

  val headers = Map(
    "content-type" -> "application/json; charset=utf-8"
  )

  val deleteById = exec(http("DELETE ${path}/{id}")
    .delete("${path}/1")
    .headers(headers)
    .check(status.is(200))
  )

  val deleteByNamespace = exec(http("DELETE ${path}/{id}/{namespace}")
    .delete("${path}/1/test")
    .headers(headers)
    .check(status.is(200))
  )

  val deleteByNamespaceAndName = exec(http("DELETE ${path}/{id}/{namespace}/{name}")
    .delete("${path}/1/test/name")
    .headers(headers)
    .check(status.is(200))
  )
}
