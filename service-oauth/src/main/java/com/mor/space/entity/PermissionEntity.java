package com.mor.space.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "permission")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PermissionEntity extends BaseEntity implements Serializable {
}
