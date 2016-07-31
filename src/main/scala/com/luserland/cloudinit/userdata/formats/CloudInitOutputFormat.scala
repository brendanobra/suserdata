package com.luserland.cloudinit.userdata.formats

/**
  * Created by brendan on 7/31/16.
  */
trait CloudInitOutputFormat {
  def render():String

}
