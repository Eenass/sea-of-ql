module template::PHP

import IO;
import syntax::AbstractSyntax;

/** Method to create a code snippet in PHP to create a variable and get the value of the form
* @param formId the name of the questionaire
* @varName the name of the question
* @author Philipp
*/
public void createPostValuePHP(str formId, str varName){
	str result = "$<varName> = $_POST[\'<varName>\'];
	if(isset($<varName>)){	
	echo \'{ \"message\": \"\' . $_POST[\'<varName>\'] . \'\" }\';
	};";
	appendToPHPFile(formId, result);
}

/** Method to generate the database and the table
* @param formId the name of the questionaire
* @author Philipp
*/
public void generateDatabaseCode(str formId){
	createDataBaseCode(formId);
	createTableCode(formId);
}

/** Method to generate the PHP code to create the database
* @param formId the name of the questionaire
* @author Philipp
*/
void createDataBaseCode(str formId){
	str result = "$dbhost = \'localhost\'; $dbuser = \'root\'; $dbpass = \'\'; $conn = mysql_connect($dbhost, $dbuser, $dbpass);
		if(! $conn ) { die(\'Could not connect: \' . mysql_error()); }
		echo \'Connected successfully\';
		$sqlDatabase = \'CREATE Database <formId>\'; $retval = mysql_query( $sqlDatabase, $conn );
		if(! $retval ) { die(\'Could not create database: \' . mysql_error()); }
		echo \"Database <formId> created successfully\n\"; ";
	appendToPHPFile(formId, result);
}

/** Method to generate the PHP code to create the database table
* @param formId the name of the questionaire
* @author Philipp
*/
void createTableCode(str formId){
	str result = "$sqlTable = \'CREATE TABLE <formId>( \'.
       \'emp_id INT NOT NULL AUTO_INCREMENT, \'.
       \'primary key ( emp_id ))\';
		mysql_select_db(\'<formId>\');
		$retval = mysql_query( $sqlTable, $conn );
		if(! $retval ) { die(\'Could not create table: \' . mysql_error()); }
		echo \"Table <formId> created successfully\n\";  ";
	appendToPHPFile(formId, result);
}

/** Method generate PHP code to create a colum in a database table
* @param formId the name of the questionaire
* @param id the name of the question
* @param tp the type of the question
* @author Philipp
*/
public void createColumnInTable(str formId, str id, Type tp){
	str result = "";
	if(tp == money()){
		result = "$insert<id> = \'ALTER TABLE <formId> ADD <id> REAL\';
		mysql_query( $insert<id>, $conn ); ";
	}else if(tp == integer()){
		result = "$insert<id> = \'ALTER TABLE <formId> ADD <id> INT\';
		mysql_query( $insert<id>, $conn ); ";
	}else if(tp == boolean()){
		result = "$insert<id> = \'ALTER TABLE <formId> ADD <id> BOOL\';
		mysql_query( $insert<id>, $conn ); ";
	}
	appendToPHPFile(formId, result);
}

/** Method to generate PHP to insert the form values in the database table
* @param formId the name of the questionaire
* @param body
* @author Philipp
*/
public void insertValueInDatabase(str formId,  list[Body] body){   //  list[str] ids, i need to get the id of all questions
	println("BBBB : <body>");
	for(s <- body){
		bottom-up visit(s){
			case Expression e : {
				println("Case with ID : <e>");
			}
		}
	}
	//$sql5 = 'INSERT INTO Box1 VALUES ('NULL', 'NULL', 'NULL', '$sellingPrice' , '$privateDebt', '$valueResidue') ';
	//$retval = mysql_query( $sql5, $conn ); 
	//
	//str result = "$query<varName> = \'INSERT INTO <formId> (<for(i <- ids) { > <i>, < }>)
	//VALUES(<for(i <- ids) { > \'\".$<i>.\", < }>)";
	//appendToPHP(formId,result);
}

/** Method to append PHP code to a PHP file
* @param formId the name of the JavaScript file
* @param text the PHP code to append
* @author Philipp
*/
public void appendToPHPFile(str formId, str text){
	l = |file:///wamp/www/<formId>/<formId>.php|;
	appendToFile(l, "\n <text>");
}