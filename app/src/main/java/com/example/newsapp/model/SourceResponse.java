package com.example.newsapp.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SourceResponse{

	@SerializedName("sources")
	private List<SourcesItem> sources;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private String status;

	public void setSources(List<SourcesItem> sources){
		this.sources = sources;
	}

	public List<SourcesItem> getSources(){
		return sources;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"SourceResponse{" + 
			"sources = '" + sources + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}