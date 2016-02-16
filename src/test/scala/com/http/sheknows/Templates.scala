package com.http.sheknows

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Templates {
  val feeder = csv("templates.csv").circular

  val get = feed(feeder)
    .exec(http("${template} - ${url}")
    .get("${url}")
    .check(
      css("#sf-resetcontent > h1")
      .notExists
    )

  )
}
