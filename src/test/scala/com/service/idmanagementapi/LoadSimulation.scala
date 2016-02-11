package com.service.idmanagementapi

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class LoadSimulation extends Simulation {

  var userTotal : Double = 100

  var readUsers: Int = Math.floor(userTotal*.80).toInt
  var updateUsers: Int = Math.floor(userTotal*.10).toInt
  var searchUsers: Int = (userTotal - readUsers - updateUsers).toInt

  val httpProtocol = http
    .baseURL("http://sk-connect-ivan1-connec.elasticbeanstalk.com:8080")

  /*
  80% read
  10% update
  10% search
   */
  val read = scenario("Read").exec(users.Get.get, extras.Get.get)

  val update = scenario("update").exec(
    users.Create.create,
    extras.Create.create,
    users.Update.update,
    extras.Delete.deleteAll,
    users.Delete.delete
  )

  val search = scenario("search").exec(users.Get.get)

  setUp(
    update.inject(atOnceUsers(updateUsers))
  ).protocols(httpProtocol)
}