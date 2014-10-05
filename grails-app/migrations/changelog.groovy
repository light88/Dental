databaseChangeLog = {

	changeSet(author: "light (generated)", id: "1412441384739-1") {
		createTable(tableName: "address") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "city_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "country_id", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-2") {
		createTable(tableName: "city") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "city", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-3") {
		createTable(tableName: "country") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "country", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-4") {
		createTable(tableName: "mouth") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-5") {
		createTable(tableName: "mouth_tooth") {
			column(name: "mouth_teeth_id", type: "BIGINT")

			column(name: "tooth_id", type: "BIGINT")
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-6") {
		createTable(tableName: "patient") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "address_id", type: "BIGINT")

			column(name: "dob", type: "DATETIME") {
				constraints(nullable: "false")
			}

			column(name: "firstname", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "gender", type: "INT") {
				constraints(nullable: "false")
			}

			column(name: "lastname", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "patronimic", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "phone", type: "VARCHAR(255)")
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-7") {
		createTable(tableName: "profile") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "address_id", type: "BIGINT")

			column(name: "firstname", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "lastname", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "patronimic", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "phone", type: "VARCHAR(255)")

			column(name: "rating_id", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-8") {
		createTable(tableName: "rating") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "points", type: "INT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-9") {
		createTable(tableName: "role") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "authority", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-10") {
		createTable(tableName: "tooth") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-11") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "account_expired", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "account_locked", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "enabled", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "password", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "password_expired", type: "BIT") {
				constraints(nullable: "false")
			}

			column(name: "profile_id", type: "BIGINT")

			column(name: "username", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-12") {
		createTable(tableName: "user_role") {
			column(name: "role_id", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-13") {
		addPrimaryKey(columnNames: "role_id, user_id", tableName: "user_role")
	}

	changeSet(author: "light (generated)", id: "1412441384739-24") {
		createIndex(indexName: "UK_9s1n56j4o997fpcp1do8juel1", tableName: "city", unique: "true") {
			column(name: "city")
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-25") {
		createIndex(indexName: "UK_3s51q344kj9jse05r86moo9ka", tableName: "country", unique: "true") {
			column(name: "country")
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-26") {
		createIndex(indexName: "UK_irsamgnera6angm0prq1kemt2", tableName: "role", unique: "true") {
			column(name: "authority")
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-27") {
		createIndex(indexName: "UK_sb8bbouer5wak8vyiiy4pf2bx", tableName: "user", unique: "true") {
			column(name: "username")
		}
	}

	changeSet(author: "light (generated)", id: "1412441384739-14") {
		addForeignKeyConstraint(baseColumnNames: "city_id", baseTableName: "address", baseTableSchemaName: "dental_dev", constraintName: "FK_fglr19v76iy4kjip6nf33q99b", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "city", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1412441384739-15") {
		addForeignKeyConstraint(baseColumnNames: "country_id", baseTableName: "address", baseTableSchemaName: "dental_dev", constraintName: "FK_nyyg5dlcs74rm1girctd3mubi", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "country", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1412441384739-16") {
		addForeignKeyConstraint(baseColumnNames: "mouth_teeth_id", baseTableName: "mouth_tooth", baseTableSchemaName: "dental_dev", constraintName: "FK_45173t3qcml0cywfj7ah4hmm9", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "mouth", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1412441384739-17") {
		addForeignKeyConstraint(baseColumnNames: "tooth_id", baseTableName: "mouth_tooth", baseTableSchemaName: "dental_dev", constraintName: "FK_msu5wvvt22b9psmcxpl5jx2s5", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "tooth", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1412441384739-18") {
		addForeignKeyConstraint(baseColumnNames: "address_id", baseTableName: "patient", baseTableSchemaName: "dental_dev", constraintName: "FK_j8b4al0gjt5lj9f979r2sf9kf", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "address", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1412441384739-19") {
		addForeignKeyConstraint(baseColumnNames: "address_id", baseTableName: "profile", baseTableSchemaName: "dental_dev", constraintName: "FK_h4lfia6yb55m850jjmcftwn2p", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "address", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1412441384739-20") {
		addForeignKeyConstraint(baseColumnNames: "rating_id", baseTableName: "profile", baseTableSchemaName: "dental_dev", constraintName: "FK_bhvb1dy2i1mw8ctkna9xlkyb4", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "rating", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1412441384739-21") {
		addForeignKeyConstraint(baseColumnNames: "profile_id", baseTableName: "user", baseTableSchemaName: "dental_dev", constraintName: "FK_1mcjtpxmwom9h9bf2q0k412e0", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "profile", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1412441384739-22") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", baseTableSchemaName: "dental_dev", constraintName: "FK_it77eq964jhfqtu54081ebtio", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "role", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}

	changeSet(author: "light (generated)", id: "1412441384739-23") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", baseTableSchemaName: "dental_dev", constraintName: "FK_apcc8lxk2xnug8377fatvbn04", deferrable: "false", initiallyDeferred: "false", onDelete: "NO ACTION", onUpdate: "NO ACTION", referencedColumnNames: "id", referencedTableName: "user", referencedTableSchemaName: "dental_dev", referencesUniqueColumn: "false")
	}
}
