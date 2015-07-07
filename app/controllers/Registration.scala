package controllers

import play.api.libs.json.Json
import play.api.mvc._
/**
 * Created by ktoraskar on 7/6/15.
 */
class Registration extends Controller {

  var result :String =  null

  def index = Action {
    Ok(views.html.index("Hello Play"))
  }

  def registerClient(clientName:String) = Action {

    // lookup client name
    // register client

    // return a json response if registration was successful

    if(clientName == "kedar") {
      result = "status:registered"
    }
    else {
      result = "status:invalid"
    }

    Ok(Json.toJson(result))

  }

}