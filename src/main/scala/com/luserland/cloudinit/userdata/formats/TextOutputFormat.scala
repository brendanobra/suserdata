package com.luserland.cloudinit.userdata.formats

import com.luserland.cloudinit.userdata.formats.CloudInitOutputFormat

/**
  * Created by brendan on 7/31/16.
  */
class TextOutputFormat extends  CloudInitOutputFormat{
  override def render(): String = {
    ""
  }
}
object  TextOutputFormat{
  def apply() = {
    new TextOutputFormat()
  }

}
