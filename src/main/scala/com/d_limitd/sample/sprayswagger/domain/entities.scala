package com.d_limitd.sample.sprayswagger.domain

case class User(username: String, status: String)

case class Pet(id: Int, name: String, birthDate: java.util.Date) {
  require(id.isInstanceOf[Int], "id param must be of type Int!")
}