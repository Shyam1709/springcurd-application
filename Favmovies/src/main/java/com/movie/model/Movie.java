package com.movie.model;

import org.springframework.data.annotation.Id;

public class Movie {
	 @Id
	    private String id;
	    private String description;
	    private String title;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}

	    
}
