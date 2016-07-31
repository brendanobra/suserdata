package com.luserland.cloudinit.userdata.dsl

/**
  * Created by brendan on 7/31/16.
  */
class Packages extends  Cmd with Yaml{
  override def tag: String = "packages"

  override def yaml: Unit = {
    import net.jcazevedo.moultingyaml._
    import net.jcazevedo.moultingyaml.DefaultYamlProtocol._
    List("one","two").toYaml
    val thing = "not yaml"
  }
}
