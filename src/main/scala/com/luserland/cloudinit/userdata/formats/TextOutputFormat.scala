package com.luserland.cloudinit.userdata.formats

import com.luserland.cloudinit.userdata.dsl.{CloudInitType, UserDataType}
import com.luserland.cloudinit.userdata.formats.CloudInitOutputFormat
import net.jcazevedo.moultingyaml._
import net.jcazevedo.moultingyaml.DefaultYamlProtocol._

/**
  * Created by brendan on 7/31/16.
  */
class TextOutputFormat(userDataType: UserDataType) extends  CloudInitOutputFormat{
  override def render(): String = {
    userDataType match {
      case CloudInitType =>
        /*
        render model as Yaml
         */
        "some".toYaml.prettyPrint
      case _ =>
        ""

    }
  }
}
object  TextOutputFormat{
  def apply(userDataType:UserDataType = CloudInitType) = {
    new TextOutputFormat(userDataType)
  }

}
