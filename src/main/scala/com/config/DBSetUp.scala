package com.config

import slick.driver.PostgresDriver
/**
 * Created by sachin on 7/8/2015.
 * MyProject
 */
object MyPostgresDriver extends PostgresDriver

object DBFiles {
  import MyPostgresDriver.api._
  val database:MyPostgresDriver.backend.DatabaseDef = Database.forURL("jdbc:postgresql://192.168.1.186:5432/ReactoreV0.4",user="postgres",password="admin", driver= "org.postgresql.Driver")
}