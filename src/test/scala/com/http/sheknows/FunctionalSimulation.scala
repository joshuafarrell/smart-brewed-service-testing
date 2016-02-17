package com.http.sheknows

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class FunctionalSimulation extends Simulation {

  var userTotal : Int = 21

  val httpProtocol = http.baseURL("http://staging.sheknows.com")
    //.proxy(Proxy("127.0.0.1", 59753).httpsPort(59753))

  /*
  80% read
  10% update
  10% search
   */
  val templateTest = scenario("templates").exec(
    Templates.get
  )

  setUp(
    templateTest.inject(atOnceUsers(userTotal))
  ).protocols(httpProtocol)
}