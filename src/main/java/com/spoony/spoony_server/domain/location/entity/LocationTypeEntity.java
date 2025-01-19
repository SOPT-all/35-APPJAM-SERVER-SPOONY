package com.spoony.spoony_server.domain.location.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "location_type")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LocationTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationTypeId;
    private String locationTypeName;
    private Double scope;
}