databaseChangeLog = {

	changeSet(author: "light (generated)", id: "1414942737804-1") {
		createIndex(indexName: "FK_it77eq964jhfqtu54081ebtio", tableName: "user_role") {
			column(name: "role_id")
		}
	}
}
