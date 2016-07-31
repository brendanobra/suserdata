package com.luserland.cloudinit.userdata

import com.luserland.cloudinit.userdata.formats.{TextOutputFormat, CloudInitOutputFormat}
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream

/**
  * Created by brendan on 7/31/16.
  */
class UserData extends Format {

  def output():CloudInitOutputFormat = {
    TextOutputFormat()

  }

}
object UserData{
  def apply() = {
    new UserData
  }
}
