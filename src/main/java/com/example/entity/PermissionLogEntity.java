package com.example.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the permission_log database table.
 * 
 */
@Entity
@Table(name="permission_log")
@NamedQuery(name="PermissionLog.findAll", query="SELECT p FROM PermissionLogEntity p")
public class PermissionLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int permissionId;

	private String permissionName;

	public PermissionLogEntity() {
	}

	public int getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return this.permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

}