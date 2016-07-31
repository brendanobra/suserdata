package com.luserland.cloudinit.userdata

import com.luserland.cloudinit.userdata.formats.CloudInitOutputFormat

/**
  * Created by brendan on 7/31/16.
  */
trait Format {
  def output():CloudInitOutputFormat
}
