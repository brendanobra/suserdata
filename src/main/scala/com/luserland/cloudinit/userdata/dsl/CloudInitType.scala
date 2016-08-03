package com.luserland.cloudinit.userdata.dsl

/**
  * Created by brendan on 7/31/16.
  */
case object CloudInitType extends UserDataType {
  override def header: String = "#cloud-init"
}
