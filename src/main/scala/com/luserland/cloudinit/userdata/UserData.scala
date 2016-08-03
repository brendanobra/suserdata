package com.luserland.cloudinit.userdata

import com.luserland.cloudinit.userdata.dsl.{CloudInitType, UserDataType}
import com.luserland.cloudinit.userdata.formats.{TextOutputFormat, CloudInitOutputFormat}
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream

/**
  * Created by brendan on 7/31/16.
  */
class UserData(userDataType:UserDataType) extends Format {

  /*
  Detects #!
   */
  def willExecute() = {

 }
  def isBash() = {

  }

  /*
  starts with #cloud-config
   */
  def isCloudConfig() = {

  }
  def output():CloudInitOutputFormat = {
    TextOutputFormat(userDataType)
  }
}
object UserData{
  def apply() = {
    new UserData(CloudInitType)
  }
}
