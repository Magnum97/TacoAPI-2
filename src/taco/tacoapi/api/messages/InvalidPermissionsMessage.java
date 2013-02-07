package taco.tacoapi.api.messages;

import taco.tacoapi.api.TacoMessage;

/**
 * A message telling the user that they don't have permission to do something.
 * @author KILL3RTACO
 *
 */
public class InvalidPermissionsMessage extends TacoMessage {

	public InvalidPermissionsMessage(){
		this.message = "&cYou don't have permission";
	}
	
	public InvalidPermissionsMessage(String message){
		this.message = message;
	}
	
}
