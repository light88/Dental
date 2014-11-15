databaseChangeLog = {

	changeSet(author: "light (generated)", id: "1414939469993-1") {
		createTable(tableName: "address") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "addressPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "city_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "country_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-2") {
		createTable(tableName: "city") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "cityPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "city", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-3") {
		createTable(tableName: "country") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "countryPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "country", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-4") {
		createTable(tableName: "dentist") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "dentistPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "profile_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "rating_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-5") {
		createTable(tableName: "mouth") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "mouthPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-6") {
		createTable(tableName: "notify") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "notifyPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "created_on", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)")

			column(name: "mail", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "notified", type: "bit") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-7") {
		createTable(tableName: "patient") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "patientPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "address_id", type: "bigint")

			column(name: "date_of_birth", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "dentist_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "firstname", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "gender", type: "tinyint") {
				constraints(nullable: "false")
			}

			column(name: "lastname", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "mouth_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "patronimic", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "phone", type: "varchar(255)")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-8") {
		createTable(tableName: "profile") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "profilePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "address_id", type: "bigint")

			column(name: "date_of_birth", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "firstname", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "gender", type: "tinyint") {
				constraints(nullable: "false")
			}

			column(name: "lastname", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "patronimic", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "phone", type: "varchar(255)")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-9") {
		createTable(tableName: "rating") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "ratingPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "points", type: "integer") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-10") {
		createTable(tableName: "role") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "rolePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "authority", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-11") {
		createTable(tableName: "tooth") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "toothPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "color", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "exist", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "mouth_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-12") {
		createTable(tableName: "tooth_treatment") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "tooth_treatmePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "dentist_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "tooth_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "treatment", type: "text") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-13") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "account_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "account_locked", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "enabled", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "password", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "password_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "profile_id", type: "bigint")

			column(name: "username", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-14") {
		createTable(tableName: "user_role") {
			column(name: "role_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-15") {
		addPrimaryKey(columnNames: "role_id, user_id", constraintName: "user_rolePK", tableName: "user_role")
	}

	changeSet(author: "light (generated)", id: "1414939469993-30") {
		createIndex(indexName: "FK_fglr19v76iy4kjip6nf33q99b", tableName: "address") {
			column(name: "city_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-31") {
		createIndex(indexName: "FK_nyyg5dlcs74rm1girctd3mubi", tableName: "address") {
			column(name: "country_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-32") {
		createIndex(indexName: "city_uniq_1414939469875", tableName: "city", unique: "true") {
			column(name: "city")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-33") {
		createIndex(indexName: "country_uniq_1414939469882", tableName: "country", unique: "true") {
			column(name: "country")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-34") {
		createIndex(indexName: "FK_f0bevjjy8w0hgr43bihts57lq", tableName: "dentist") {
			column(name: "rating_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-35") {
		createIndex(indexName: "FK_gy8isr2retye7n1g9p44ta6sd", tableName: "dentist") {
			column(name: "profile_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-36") {
		createIndex(indexName: "FK_76ve2aa11e92716yw2l43vlax", tableName: "patient") {
			column(name: "dentist_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-37") {
		createIndex(indexName: "FK_j8b4al0gjt5lj9f979r2sf9kf", tableName: "patient") {
			column(name: "address_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-38") {
		createIndex(indexName: "FK_r942ln0cs97gnetcmoied2mu3", tableName: "patient") {
			column(name: "mouth_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-39") {
		createIndex(indexName: "FK_h4lfia6yb55m850jjmcftwn2p", tableName: "profile") {
			column(name: "address_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-40") {
		createIndex(indexName: "authority_uniq_1414939469895", tableName: "role", unique: "true") {
			column(name: "authority")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-41") {
		createIndex(indexName: "FK_rqk9cx1eesyomuqxqo05fyofa", tableName: "tooth") {
			column(name: "mouth_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-42") {
		createIndex(indexName: "FK_gso7mht0i3akocoiyic9w8ifg", tableName: "tooth_treatment") {
			column(name: "dentist_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-43") {
		createIndex(indexName: "FK_hecow5tjshgx1t852ijb98p45", tableName: "tooth_treatment") {
			column(name: "tooth_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-44") {
		createIndex(indexName: "FK_1mcjtpxmwom9h9bf2q0k412e0", tableName: "user") {
			column(name: "profile_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-45") {
		createIndex(indexName: "username_uniq_1414939469902", tableName: "user", unique: "true") {
			column(name: "username")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-46") {
		createIndex(indexName: "FK_apcc8lxk2xnug8377fatvbn04", tableName: "user_role") {
			column(name: "user_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-47") {
		createIndex(indexName: "FK_it77eq964jhfqtu54081ebtio", tableName: "user_role") {
			column(name: "role_id")
		}
	}

	changeSet(author: "light (generated)", id: "1414939469993-16") {
		addForeignKeyConstraint(baseColumnNames: "city_id", baseTableName: "address", constraintName: "FK_fglr19v76iy4kjip6nf33q99b", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-17") {
		addForeignKeyConstraint(baseColumnNames: "country_id", baseTableName: "address", constraintName: "FK_nyyg5dlcs74rm1girctd3mubi", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "country", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-18") {
		addForeignKeyConstraint(baseColumnNames: "profile_id", baseTableName: "dentist", constraintName: "FK_gy8isr2retye7n1g9p44ta6sd", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "profile", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-19") {
		addForeignKeyConstraint(baseColumnNames: "rating_id", baseTableName: "dentist", constraintName: "FK_f0bevjjy8w0hgr43bihts57lq", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "rating", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-20") {
		addForeignKeyConstraint(baseColumnNames: "address_id", baseTableName: "patient", constraintName: "FK_j8b4al0gjt5lj9f979r2sf9kf", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "address", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-21") {
		addForeignKeyConstraint(baseColumnNames: "dentist_id", baseTableName: "patient", constraintName: "FK_76ve2aa11e92716yw2l43vlax", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "dentist", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-22") {
		addForeignKeyConstraint(baseColumnNames: "mouth_id", baseTableName: "patient", constraintName: "FK_r942ln0cs97gnetcmoied2mu3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "mouth", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-23") {
		addForeignKeyConstraint(baseColumnNames: "address_id", baseTableName: "profile", constraintName: "FK_h4lfia6yb55m850jjmcftwn2p", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "address", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-24") {
		addForeignKeyConstraint(baseColumnNames: "mouth_id", baseTableName: "tooth", constraintName: "FK_rqk9cx1eesyomuqxqo05fyofa", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "mouth", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-25") {
		addForeignKeyConstraint(baseColumnNames: "dentist_id", baseTableName: "tooth_treatment", constraintName: "FK_gso7mht0i3akocoiyic9w8ifg", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "dentist", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-26") {
		addForeignKeyConstraint(baseColumnNames: "tooth_id", baseTableName: "tooth_treatment", constraintName: "FK_hecow5tjshgx1t852ijb98p45", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "tooth", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-27") {
		addForeignKeyConstraint(baseColumnNames: "profile_id", baseTableName: "user", constraintName: "FK_1mcjtpxmwom9h9bf2q0k412e0", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "profile", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-28") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK_it77eq964jhfqtu54081ebtio", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1414939469993-29") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK_apcc8lxk2xnug8377fatvbn04", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}
}
