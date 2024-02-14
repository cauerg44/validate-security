package com.devsuperior.demo.dto;

import java.time.LocalDate;

import com.devsuperior.demo.entities.Event;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EventDTO {
	
	private Long id;
	
	@NotBlank(message = "Event name cannot be empty")
	private String name;
	
	@NotNull(message = "Date must not be null.")
	@FutureOrPresent(message = "Date cannot be in the past.")
	private LocalDate date;
	private String url;
	
	@NotNull(message = "City must not null.")
	private Long cityId;
	
	public EventDTO() {
	}

	public EventDTO(Long id, String name, LocalDate date, String url, Long cityId) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.url = url;
		this.cityId = cityId;
	}
	
	public EventDTO(Event entity) {
		id = entity.getId();
		name = entity.getName();
		date = entity.getDate();
		url = entity.getUrl();
		cityId = entity.getCity().getId();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getUrl() {
		return url;
	}

	public Long getCityId() {
		return cityId;
	}
}
