package com.luserland.cloudinit.userdata
import  org.scalatest._
/**
  * Created by brendan on 7/31/16.
  */
class UserDataTest extends FlatSpec with Matchers{

  "A UserData" should "render correctly" in {
    val uData = UserData()
   assert(uData.output().render().trim.size >0)
  }

}
