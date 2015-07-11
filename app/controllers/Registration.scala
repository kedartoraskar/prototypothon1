package controllers

import play.api.libs.json.Json
import play.api.libs.json.JsObject
import play.api.mvc._
import utils.Util;


/**
 * Created by ktoraskar on 7/6/15.
 */
class Registration extends Controller {

  var result :JsObject =  null

  def registerClient(clientName:String) = Action {

    // lookup client name
    // register client

    // return a json response if registration was successful

    if(clientName == "client1") {
      result = Json.obj("status" -> "registered",
                        "id" -> 1)
    }
    else {
      result = Json.obj("status" -> "invalid")
    }

    Ok(Util.jsonCreator(result))

  }

}