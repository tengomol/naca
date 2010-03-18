/*
 * NacaTrans - Naca Transcoder v1.2.0.
 *
 * Copyright (c) 2008-2009 Publicitas SA.
 * Licensed under GPL (GPL-LICENSE.txt) license.
 */
/*
 * NacaRTTests - Naca Tests for NacaRT support.
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Publicitas SA.
 * Licensed under GPL (GPL-LICENSE.txt) license.
 */
/*
 * Created on Jul 26, 2004
 *
 * To change the template for List generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package lexer.Cobol;

import lexer.CKeywordList;
import lexer.CReservedKeyword;

/**
 * @author U930CV
 *
 * To change the template for List generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class CCobolKeywordList extends CKeywordList
{
	public static CKeywordList List = new CCobolKeywordList() ;
	//public static CReservedKeyword  = new CReservedKeyword(List, "") ; 
	//public static CReservedKeyword  = new CReservedKeyword(List, "") ; 
	//public static CReservedKeyword  = new CReservedKeyword(List, "") ; 
	public static CReservedKeyword HOLD = new CReservedKeyword(List, "HOLD") ; 
	public static CReservedKeyword ENABLED = new CReservedKeyword(List, "ENABLED") ; 
	public static CReservedKeyword KEYLENGTH = new CReservedKeyword(List, "KEYLENGTH") ; 
	public static CReservedKeyword CLOSED = new CReservedKeyword(List, "CLOSED") ; 
	public static CReservedKeyword AID = new CReservedKeyword(List, "AID") ; 
	public static CReservedKeyword DATASET = new CReservedKeyword(List, "DATASET") ; 
	public static CReservedKeyword SECONDS = new CReservedKeyword(List, "SECONDS") ; 
	public static CReservedKeyword CONTROL = new CReservedKeyword(List, "CONTROL") ; 
	public static CReservedKeyword WAIT = new CReservedKeyword(List, "WAIT") ; 
	public static CReservedKeyword RESOURCE = new CReservedKeyword(List, "RESOURCE") ; 
	public static CReservedKeyword UCTRAN = new CReservedKeyword(List, "UCTRAN") ; 
	public static CReservedKeyword ALARM = new CReservedKeyword(List, "ALARM") ; 
	public static CReservedKeyword NOUCTRAN = new CReservedKeyword(List, "NOUCTRAN") ; 
	public static CReservedKeyword ERASE = new CReservedKeyword(List, "ERASE") ; 
	public static CReservedKeyword DATAONLY = new CReservedKeyword(List, "DATAONLY") ; 
	public static CReservedKeyword FREEKB = new CReservedKeyword(List, "FREEKB") ; 
	//public static CReservedKeyword MAPSET = new CReservedKeyword(List, "MAPSET") ; 
	//public static CReservedKeyword MAP = new CReservedKeyword(List, "MAP") ; 
	public static CReservedKeyword TRANSID = new CReservedKeyword(List, "TRANSID") ; 
	public static CReservedKeyword DATALENGTH = new CReservedKeyword(List, "DATALENGTH") ; 
	public static CReservedKeyword COMMAREA = new CReservedKeyword(List, "COMMAREA") ; 
	public static CReservedKeyword BIF = new CReservedKeyword(List, "BIF") ; 
	public static CReservedKeyword EQUAL = new CReservedKeyword(List, "EQUAL") ; 
	public static CReservedKeyword SQLWARNING = new CReservedKeyword(List, "SQLWARNING") ; 
	public static CReservedKeyword ENABLE = new CReservedKeyword(List, "ENABLE") ; 
	public static CReservedKeyword CONVERSE = new CReservedKeyword(List, "CONVERSE") ; 
	public static CReservedKeyword COMPUTATIONAL = new CReservedKeyword(List, "COMPUTATIONAL") ; 
	public static CReservedKeyword END_SUBTRACT = new CReservedKeyword(List, "END-SUBTRACT") ; 
	public static CReservedKeyword FREE = new CReservedKeyword(List, "FREE") ; 
	public static CReservedKeyword CONNECT = new CReservedKeyword(List, "CONNECT") ; 
	public static CReservedKeyword ALLOCATE = new CReservedKeyword(List, "ALLOCATE") ; 
	public static CReservedKeyword IMMEDIATE = new CReservedKeyword(List, "IMMEDIATE") ; 
	public static CReservedKeyword EXECUTE = new CReservedKeyword(List, "EXECUTE") ; 
	public static CReservedKeyword WORK = new CReservedKeyword(List, "WORK") ; 
	public static CReservedKeyword NUMERIC_EDITED = new CReservedKeyword(List, "NUMERIC-EDITED") ; 
	public static CReservedKeyword INDEX = new CReservedKeyword(List, "INDEX") ; 
	public static CReservedKeyword END_RETURN = new CReservedKeyword(List, "END-RETURN") ; 
	public static CReservedKeyword ALPHANUMERIC = new CReservedKeyword(List, "ALPHANUMERIC") ; 
	public static CReservedKeyword EXCLUSIVE = new CReservedKeyword(List, "EXCLUSIVE") ; 
	public static CReservedKeyword LOCK = new CReservedKeyword(List, "LOCK") ; 
	public static CReservedKeyword PREPARE = new CReservedKeyword(List, "PREPARE") ; 
	public static CReservedKeyword PICTURE = new CReservedKeyword(List, "PICTURE") ; 
	public static CReservedKeyword BINARY = new CReservedKeyword(List, "BINARY") ; 
	public static CReservedKeyword INITIAL = new CReservedKeyword(List, "INITIAL") ; 
	public static CReservedKeyword PREVIOUS = new CReservedKeyword(List, "PREVIOUS") ; 
	public static CReservedKeyword LESS = new CReservedKeyword(List, "LESS") ; 
	public static CReservedKeyword EQUALS = new CReservedKeyword(List, "EQUALS") ; 
	public static CReservedKeyword THAN = new CReservedKeyword(List, "THAN") ; 
	public static CReservedKeyword GREATER = new CReservedKeyword(List, "GREATER") ; 
	public static CReservedKeyword INVALID = new CReservedKeyword(List, "INVALID") ; 
	public static CReservedKeyword STATUS = new CReservedKeyword(List, "STATUS") ; 
	public static CReservedKeyword RANDOM = new CReservedKeyword(List, "RANDOM") ; 
	public static CReservedKeyword DYNAMIC = new CReservedKeyword(List, "DYNAMIC") ; 
	public static CReservedKeyword ACCESS = new CReservedKeyword(List, "ACCESS") ; 
	public static CReservedKeyword SEPARATE = new CReservedKeyword(List, "SEPARATE") ; 
	public static CReservedKeyword TRAILING = new CReservedKeyword(List, "TRAILING") ; 
	public static CReservedKeyword SIGN = new CReservedKeyword(List, "SIGN") ; 
	public static CReservedKeyword READPREV = new CReservedKeyword(List, "READPREV") ; 
	public static CReservedKeyword UNLOCK = new CReservedKeyword(List, "UNLOCK") ; 
	public static CReservedKeyword ENDBR = new CReservedKeyword(List, "ENDBR") ; 
	public static CReservedKeyword TRANSFORM = new CReservedKeyword(List, "TRANSFORM") ;
	public static CReservedKeyword SKIP1 = new CReservedKeyword(List, "SKIP1") ;
	public static CReservedKeyword SKIP2 = new CReservedKeyword(List, "SKIP2") ;
	public static CReservedKeyword SKIP3 = new CReservedKeyword(List, "SKIP3") ;
	public static CReservedKeyword DELIMITER = new CReservedKeyword(List, "DELIMITER") ; 
	public static CReservedKeyword COUNT = new CReservedKeyword(List, "COUNT") ; 
	public static CReservedKeyword RIGHT = new CReservedKeyword(List, "RIGHT") ; 
	public static CReservedKeyword POSITIONING = new CReservedKeyword(List, "POSITIONING") ;
	public static CReservedKeyword EJECT = new CReservedKeyword(List, "EJECT") ; 
	public static CReservedKeyword JUST = new CReservedKeyword(List, "JUST") ; 
	public static CReservedKeyword JUSTIFIED = new CReservedKeyword(List, "JUSTIFIED") ; 
	public static CReservedKeyword COMMA = new CReservedKeyword(List, "COMMA") ; 
	public static CReservedKeyword DECIMAL_POINT = new CReservedKeyword(List, "DECIMAL-POINT") ; 
	public static CReservedKeyword SPECIAL_NAMES = new CReservedKeyword(List, "SPECIAL-NAMES") ; 
	public static CReservedKeyword RELEASE = new CReservedKeyword(List, "RELEASE") ; 
	public static CReservedKeyword KEY = new CReservedKeyword(List, "KEY") ; 
	public static CReservedKeyword DESCENDING = new CReservedKeyword(List, "DESCENDING") ; 
	public static CReservedKeyword ASCENDING = new CReservedKeyword(List, "ASCENDING") ; 
	public static CReservedKeyword SORT = new CReservedKeyword(List, "SORT") ; 
	public static CReservedKeyword SD = new CReservedKeyword(List, "SD") ; 
	public static CReservedKeyword LINES = new CReservedKeyword(List, "LINES") ; 
	public static CReservedKeyword LINE = new CReservedKeyword(List, "LINE") ; 
	public static CReservedKeyword PAGE = new CReservedKeyword(List, "PAGE") ; 
	public static CReservedKeyword ADVANCING = new CReservedKeyword(List, "ADVANCING") ; 
	public static CReservedKeyword CURRENT_DATE = new CReservedKeyword(List, "CURRENT-DATE") ;
	public static CReservedKeyword CURRENT__DATE = new CReservedKeyword(List, "CURRENT_DATE") ;
	public static CReservedKeyword CURRENT__TIME = new CReservedKeyword(List, "CURRENT_TIME") ;
	public static CReservedKeyword CURRENT__TIMESTAMP = new CReservedKeyword(List, "CURRENT_TIMESTAMP") ;
	public static CReservedKeyword FUNCTION = new CReservedKeyword(List, "FUNCTION") ;
	public static CReservedKeyword REVERSE = new CReservedKeyword(List, "REVERSE") ;
	public static CReservedKeyword END_WRITE = new CReservedKeyword(List, "END-WRITE") ; 
	public static CReservedKeyword MODE = new CReservedKeyword(List, "MODE") ; 
	public static CReservedKeyword RECORDING = new CReservedKeyword(List, "RECORDING") ; 
	public static CReservedKeyword COMMIT = new CReservedKeyword(List, "COMMIT") ; 
	public static CReservedKeyword SEQUENTIAL = new CReservedKeyword(List, "SEQUENTIAL") ; 
	public static CReservedKeyword ORGANIZATION = new CReservedKeyword(List, "ORGANIZATION") ; 
	public static CReservedKeyword END_DIVIDE = new CReservedKeyword(List, "END-DIVIDE") ; 
	//public static CReservedKeyword ROLLBACK = new CReservedKeyword(List, "ROLLBACK") ; 
	public static CReservedKeyword EXTEND = new CReservedKeyword(List, "EXTEND") ; 
	public static CReservedKeyword I_O = new CReservedKeyword(List, "I-O") ; 
	public static CReservedKeyword OUTPUT = new CReservedKeyword(List, "OUTPUT") ; 
	public static CReservedKeyword INPUT = new CReservedKeyword(List, "INPUT") ; 
	public static CReservedKeyword TIME = new CReservedKeyword(List, "TIME") ;
	public static CReservedKeyword TIMESTAMP = new CReservedKeyword(List, "TIMESTAMP") ;
	public static CReservedKeyword DAY_OF_WEEK = new CReservedKeyword(List, "DAY-OF-WEEK") ; 
	public static CReservedKeyword DAY = new CReservedKeyword(List, "DAY") ; 
	public static CReservedKeyword DATE = new CReservedKeyword(List, "DATE") ; 
	public static CReservedKeyword ACCEPT = new CReservedKeyword(List, "ACCEPT");
	public static CReservedKeyword END_READ = new CReservedKeyword(List, "END-READ") ; 
	public static CReservedKeyword BLOCK = new CReservedKeyword(List, "BLOCK") ; 
	public static CReservedKeyword OMITTED = new CReservedKeyword(List, "OMITTED") ; 
	public static CReservedKeyword STANDARD = new CReservedKeyword(List, "STANDARD") ; 
	public static CReservedKeyword ARE = new CReservedKeyword(List, "ARE") ; 
	public static CReservedKeyword RECORDS = new CReservedKeyword(List, "RECORDS") ; 
	public static CReservedKeyword CHARACTERS = new CReservedKeyword(List, "CHARACTERS") ; 
	public static CReservedKeyword CONTAINS = new CReservedKeyword(List, "CONTAINS") ; 
	public static CReservedKeyword LABEL = new CReservedKeyword(List, "LABEL") ; 
	public static CReservedKeyword RECORD = new CReservedKeyword(List, "RECORD") ; 
	public static CReservedKeyword FD = new CReservedKeyword(List, "FD") ; 
	public static CReservedKeyword END_SEARCH = new CReservedKeyword(List, "END-SEARCH") ; 
	public static CReservedKeyword END = new CReservedKeyword(List, "END") ; 
	public static CReservedKeyword AT = new CReservedKeyword(List, "AT") ; 
	public static CReservedKeyword SEARCH = new CReservedKeyword(List, "SEARCH") ; 
	public static CReservedKeyword UP = new CReservedKeyword(List, "UP") ; 
	public static CReservedKeyword STARTBR = new CReservedKeyword(List, "STARTBR") ; 
	public static CReservedKeyword READNEXT = new CReservedKeyword(List, "READNEXT") ; 
	public static CReservedKeyword DELETEQ = new CReservedKeyword(List, "DELETEQ") ; 
	public static CReservedKeyword WRITEQ = new CReservedKeyword(List, "WRITEQ") ; 
	public static CReservedKeyword DEQ = new CReservedKeyword(List, "DEQ") ; 
	public static CReservedKeyword INQUIRE = new CReservedKeyword(List, "INQUIRE") ; 
	public static CReservedKeyword READ = new CReservedKeyword(List, "READ") ; 
	public static CReservedKeyword START = new CReservedKeyword(List, "START") ; 
	public static CReservedKeyword DELAY = new CReservedKeyword(List, "DELAY") ; 
	public static CReservedKeyword REWRITE = new CReservedKeyword(List, "REWRITE") ; 
	public static CReservedKeyword GETMAIN = new CReservedKeyword(List, "GETMAIN") ; 
	//public static CReservedKeyword ABEND = new CReservedKeyword(List, "ABEND") ; 
	public static CReservedKeyword WRITE = new CReservedKeyword(List, "WRITE") ; 
	public static CReservedKeyword SYNCPOINT = new CReservedKeyword(List, "SYNCPOINT") ; 
	public static CReservedKeyword SEND = new CReservedKeyword(List, "SEND") ; 
	public static CReservedKeyword ASSIGN = new CReservedKeyword(List, "ASSIGN") ; 
	public static CReservedKeyword ENQ = new CReservedKeyword(List, "ENQ") ; 
	public static CReservedKeyword RETURN = new CReservedKeyword(List, "RETURN") ; 
	public static CReservedKeyword READQ = new CReservedKeyword(List, "READQ") ; 
	public static CReservedKeyword ASKTIME = new CReservedKeyword(List, "ASKTIME") ;
	public static CReservedKeyword XCTL = new CReservedKeyword(List, "XCTL") ; 
	public static CReservedKeyword LINK = new CReservedKeyword(List, "LINK") ; 
	public static CReservedKeyword UPON = new CReservedKeyword(List, "UPON") ; 
	public static CReservedKeyword CONSOLE = new CReservedKeyword(List, "CONSOLE") ; 
	public static CReservedKeyword DISPLAY = new CReservedKeyword(List, "DISPLAY") ; 
	public static CReservedKeyword POINTER = new CReservedKeyword(List, "POINTER") ; 
	public static CReservedKeyword FOR = new CReservedKeyword(List, "FOR") ; 
	public static CReservedKeyword PROGRAM = new CReservedKeyword(List, "PROGRAM") ; 
	public static CReservedKeyword EXIT = new CReservedKeyword(List, "EXIT") ; 
	public static CReservedKeyword REMARKS = new CReservedKeyword(List, "REMARKS") ; 
	public static CReservedKeyword END_COMPUTE = new CReservedKeyword(List, "END-COMPUTE") ; 
	public static CReservedKeyword ERROR = new CReservedKeyword(List, "ERROR") ; 
	public static CReservedKeyword BLANK = new CReservedKeyword(List, "BLANK") ; 
	public static CReservedKeyword END_UNSTRING = new CReservedKeyword(List, "END-UNSTRING") ; 
	public static CReservedKeyword UNSTRING = new CReservedKeyword(List, "UNSTRING") ; 
	public static CReservedKeyword OVERFLOW = new CReservedKeyword(List, "OVERFLOW") ; 
	public static CReservedKeyword COPYREC = new CReservedKeyword(List, "COPYREC") ; 
	public static CReservedKeyword ALPHABETIC_UPPER = new CReservedKeyword(List, "ALPHABETIC-UPPER") ; 
	public static CReservedKeyword ALPHABETIC = new CReservedKeyword(List, "ALPHABETIC") ; 
//	public static CReservedKeyword EXISTS = new CReservedKeyword(List, "EXISTS") ; 
	public static CReservedKeyword END_STRING = new CReservedKeyword(List, "END-STRING") ; 
	public static CReservedKeyword RUN = new CReservedKeyword(List, "RUN") ; 
	public static CReservedKeyword STOP = new CReservedKeyword(List, "STOP") ; 
	public static CReservedKeyword MULTIPLY = new CReservedKeyword(List, "MULTIPLY") ; 
	public static CReservedKeyword REMAINDER = new CReservedKeyword(List, "REMAINDER") ; 
	public static CReservedKeyword GIVING = new CReservedKeyword(List, "GIVING") ; 
	public static CReservedKeyword DIVIDE = new CReservedKeyword(List, "DIVIDE") ; 
	public static CReservedKeyword ROUNDED = new CReservedKeyword(List, "ROUNDED") ; 
	public static CReservedKeyword THROUGH = new CReservedKeyword(List, "THROUGH") ; 
//	public static CReservedKeyword MIN = new CReservedKeyword(List, "MIN") ; 
	public static CReservedKeyword SIZE = new CReservedKeyword(List, "SIZE") ; 
	public static CReservedKeyword DELIMITED = new CReservedKeyword(List, "DELIMITED") ; 
	public static CReservedKeyword STRING = new CReservedKeyword(List, "STRING") ; 
	public static CReservedKeyword FILE = new CReservedKeyword(List, "FILE") ; 
//	public static CReservedKeyword BLOB = new CReservedKeyword(List, "BLOB") ; 
//	public static CReservedKeyword DIGITS = new CReservedKeyword(List, "DIGITS") ; 
	public static CReservedKeyword CORRESPONDING = new CReservedKeyword(List, "CORRESPONDING") ; 
	public static CReservedKeyword CORR = new CReservedKeyword(List, "CORR") ; 
	public static CReservedKeyword AFTER = new CReservedKeyword(List, "AFTER") ; 
	public static CReservedKeyword BEFORE = new CReservedKeyword(List, "BEFORE") ; 
	public static CReservedKeyword TEST = new CReservedKeyword(List, "TEST") ; 
	public static CReservedKeyword WITH = new CReservedKeyword(List, "WITH") ; 
	public static CReservedKeyword MOVE = new CReservedKeyword(List, "MOVE") ; 
	public static CReservedKeyword PERFORM = new CReservedKeyword(List, "PERFORM") ; 
	public static CReservedKeyword GOTO = new CReservedKeyword(List, "GOTO") ; 
	public static CReservedKeyword GO = new CReservedKeyword(List, "GO") ; 
	public static CReservedKeyword TO = new CReservedKeyword(List, "TO") ; 
	public static CReservedKeyword IDENTIFICATION = new CReservedKeyword(List, "IDENTIFICATION") ; 
	public static CReservedKeyword ID = new CReservedKeyword(List, "ID") ; 
	public static CReservedKeyword DIVISION = new CReservedKeyword(List, "DIVISION") ; 
	public static CReservedKeyword PROGRAM_ID = new CReservedKeyword(List, "PROGRAM-ID") ; 
	public static CReservedKeyword AUTHOR = new CReservedKeyword(List, "AUTHOR") ; 
	public static CReservedKeyword DATE_WRITTEN = new CReservedKeyword(List, "DATE-WRITTEN") ; 
	public static CReservedKeyword DATE_COMPILED = new CReservedKeyword(List, "DATE-COMPILED") ; 
	public static CReservedKeyword ENVIRONMENT = new CReservedKeyword(List, "ENVIRONMENT") ; 
	public static CReservedKeyword DATA = new CReservedKeyword(List, "DATA") ; 
	public static CReservedKeyword WORKING_STORAGE = new CReservedKeyword(List, "WORKING-STORAGE") ; 
	public static CReservedKeyword SECTION = new CReservedKeyword(List, "SECTION") ; 
	public static CReservedKeyword LABEL_SENTENCE = new CReservedKeyword(List, "LABEL_SENTENCE") ; 
	public static CReservedKeyword PIC = new CReservedKeyword(List, "PIC") ; 
	public static CReservedKeyword COMP_4 = new CReservedKeyword(List, "COMP-4") ; 
	public static CReservedKeyword COMP_3 = new CReservedKeyword(List, "COMP-3") ;
	public static CReservedKeyword COMPUTATIONAL_3 = new CReservedKeyword(List, "COMPUTATIONAL-3") ;	// PJD Added
	public static CReservedKeyword SYNC = new CReservedKeyword(List, "SYNC") ; 
	public static CReservedKeyword VALUE = new CReservedKeyword(List, "VALUE") ; 
	public static CReservedKeyword FILLER = new CReservedKeyword(List, "FILLER") ; 
	public static CReservedKeyword REDEFINES = new CReservedKeyword(List, "REDEFINES") ; 
	public static CReservedKeyword OCCURS = new CReservedKeyword(List, "OCCURS") ; 
	public static CReservedKeyword COMP = new CReservedKeyword(List, "COMP") ;
	public static CReservedKeyword COMP_5 = new CReservedKeyword(List, "COMP-5") ;
	public static CReservedKeyword COPY = new CReservedKeyword(List, "COPY") ; 
	public static CReservedKeyword EXEC = new CReservedKeyword(List, "EXEC") ; 
	public static CReservedKeyword SQL = new CReservedKeyword(List, "SQL") ; 
	public static CReservedKeyword INCLUDE = new CReservedKeyword(List, "INCLUDE") ; 
	public static CReservedKeyword END_EXEC = new CReservedKeyword(List, "END-EXEC") ; 
	public static CReservedKeyword SUPPRESS = new CReservedKeyword(List, "SUPPRESS") ; 
	public static CReservedKeyword LINKAGE = new CReservedKeyword(List, "LINKAGE") ; 
	public static CReservedKeyword PROCEDURE = new CReservedKeyword(List, "PROCEDURE") ;
	public static CReservedKeyword PROCEDURE_POINTER = new CReservedKeyword(List, "PROCEDURE-POINTER") ;	// PJD Added
	public static CReservedKeyword TIMES = new CReservedKeyword(List, "TIMES") ; 
	public static CReservedKeyword CICS = new CReservedKeyword(List, "CICS") ; 
	public static CReservedKeyword IF = new CReservedKeyword(List, "IF") ; 
	public static CReservedKeyword AND = new CReservedKeyword(List, "AND") ; 
	public static CReservedKeyword NOT = new CReservedKeyword(List, "NOT") ;
	public static CReservedKeyword FOUND = new CReservedKeyword(List, "FOUND") ;		// PJD Added for EXEC SQL    WHENEVER NOT FOUND CONTINUE           END-EXEC.
	public static CReservedKeyword ELSE = new CReservedKeyword(List, "ELSE") ; 
	public static CReservedKeyword ALSO = new CReservedKeyword(List, "ALSO") ; 
	public static CReservedKeyword IGNORE = new CReservedKeyword(List, "IGNORE") ; 
	public static CReservedKeyword HANDLE = new CReservedKeyword(List, "HANDLE") ; 
	public static CReservedKeyword CONDITION = new CReservedKeyword(List, "CONDITION") ; 
	public static CReservedKeyword RETRIEVE = new CReservedKeyword(List, "RETRIEVE") ; 
	public static CReservedKeyword INTO = new CReservedKeyword(List, "INTO") ; 
	public static CReservedKeyword END_IF = new CReservedKeyword(List, "END-IF") ; 
	public static CReservedKeyword OR = new CReservedKeyword(List, "OR") ; 
	public static CReservedKeyword RECEIVE = new CReservedKeyword(List, "RECEIVE") ; 
	public static CReservedKeyword CALL = new CReservedKeyword(List, "CALL") ;
	public static CReservedKeyword END_CALL = new CReservedKeyword(List, "END-CALL") ;
	public static CReservedKeyword USING = new CReservedKeyword(List, "USING") ; 
	public static CReservedKeyword WHEN = new CReservedKeyword(List, "WHEN") ; 
	public static CReservedKeyword END_EVALUATE = new CReservedKeyword(List, "END-EVALUATE") ; 
	public static CReservedKeyword EVALUATE = new CReservedKeyword(List, "EVALUATE") ; 
	public static CReservedKeyword BY = new CReservedKeyword(List, "BY") ; 
	public static CReservedKeyword INITIALIZE = new CReservedKeyword(List, "INITIALIZE") ; 
	public static CReservedKeyword COMPUTE = new CReservedKeyword(List, "COMPUTE") ; 
	public static CReservedKeyword OF = new CReservedKeyword(List, "OF") ; 
	public static CReservedKeyword IN = new CReservedKeyword(List, "IN") ; 
	public static CReservedKeyword THEN = new CReservedKeyword(List, "THEN") ; 
	public static CReservedKeyword NUMERIC = new CReservedKeyword(List, "NUMERIC") ;
	public static CReservedKeyword POSITIVE = new CReservedKeyword(List, "POSITIVE") ;
	public static CReservedKeyword NEGATIVE = new CReservedKeyword(List, "NEGATIVE") ;
	public static CReservedKeyword IS = new CReservedKeyword(List, "IS") ; 
	public static CReservedKeyword GOBACK = new CReservedKeyword(List, "GOBACK") ; 
	public static CReservedKeyword ANY = new CReservedKeyword(List, "ANY") ; 
	public static CReservedKeyword NEXT = new CReservedKeyword(List, "NEXT") ; 
	public static CReservedKeyword SENTENCE = new CReservedKeyword(List, "SENTENCE") ; 
	public static CReservedKeyword UNTIL = new CReservedKeyword(List, "UNTIL") ; 
	public static CReservedKeyword VARYING = new CReservedKeyword(List, "VARYING") ; 
	public static CReservedKeyword FROM = new CReservedKeyword(List, "FROM") ; 
	public static CReservedKeyword OTHER = new CReservedKeyword(List, "OTHER") ; 
	public static CReservedKeyword CONTENT = new CReservedKeyword(List, "CONTENT") ; 
	public static CReservedKeyword REFERENCE = new CReservedKeyword(List, "REFERENCE") ; 
	public static CReservedKeyword ADDRESS = new CReservedKeyword(List, "ADDRESS") ; 
	public static CReservedKeyword ENTRY = new CReservedKeyword(List, "ENTRY") ;
	public static CReservedKeyword LENGTH = new CReservedKeyword(List, "LENGTH") ; 
	public static CReservedKeyword END_PERFORM = new CReservedKeyword(List, "END-PERFORM") ; 
	public static CReservedKeyword ADD = new CReservedKeyword(List, "ADD") ; 
	public static CReservedKeyword CONTINUE = new CReservedKeyword(List, "CONTINUE") ; 
	public static CReservedKeyword ALL = new CReservedKeyword(List, "ALL") ; 
	public static CReservedKeyword DEPENDING = new CReservedKeyword(List, "DEPENDING") ; 
	public static CReservedKeyword ON = new CReservedKeyword(List, "ON") ; 
	public static CReservedKeyword THRU = new CReservedKeyword(List, "THRU") ; 
	public static CReservedKeyword WHENEVER = new CReservedKeyword(List, "WHENEVER") ; 
	public static CReservedKeyword SQLERROR = new CReservedKeyword(List, "SQLERROR") ; 
	public static CReservedKeyword USAGE = new CReservedKeyword(List, "USAGE") ; 
	public static CReservedKeyword DECLARE = new CReservedKeyword(List, "DECLARE") ;
	public static CReservedKeyword DROP = new CReservedKeyword(List, "DROP") ;
	public static CReservedKeyword UPDATE = new CReservedKeyword(List, "UPDATE") ; 
	public static CReservedKeyword DELETE = new CReservedKeyword(List, "DELETE") ; 
	public static CReservedKeyword INSERT = new CReservedKeyword(List, "INSERT") ; 
	public static CReservedKeyword SET = new CReservedKeyword(List, "SET") ; 
	public static CReservedKeyword BEGIN = new CReservedKeyword(List, "BEGIN") ;
	public static CReservedKeyword WHERE = new CReservedKeyword(List, "WHERE") ; 
	public static CReservedKeyword VALUES = new CReservedKeyword(List, "VALUES") ; 
	public static CReservedKeyword SELECT = new CReservedKeyword(List, "SELECT") ; 
	public static CReservedKeyword OPEN = new CReservedKeyword(List, "OPEN") ; 
//	public static CReservedKeyword FETCH = new CReservedKeyword(List, "FETCH") ; 
	public static CReservedKeyword CLOSE = new CReservedKeyword(List, "CLOSE") ; 
	public static CReservedKeyword CURRENT = new CReservedKeyword(List, "CURRENT") ; 
//	public static CReservedKeyword DATE = new CReservedKeyword(List, "DATE") ; 
//	public static CReservedKeyword TIME = new CReservedKeyword(List, "TIME") ; 
//	public static CReservedKeyword COUNT = new CReservedKeyword(List, "COUNT") ; 
	public static CReservedKeyword SUBTRACT = new CReservedKeyword(List, "SUBTRACT") ; 
	public static CReservedKeyword CONFIGURATION = new CReservedKeyword(List, "CONFIGURATION") ; 
	public static CReservedKeyword INPUT_OUTPUT = new CReservedKeyword(List, "INPUT-OUTPUT") ; 
	public static CReservedKeyword SOURCE_COMPUTER = new CReservedKeyword(List, "SOURCE-COMPUTER") ; 
	public static CReservedKeyword OBJECT_COMPUTER = new CReservedKeyword(List, "OBJECT-COMPUTER") ; 
	public static CReservedKeyword FILE_CONTROL = new CReservedKeyword(List, "FILE-CONTROL") ; 
	public static CReservedKeyword INDEXED = new CReservedKeyword(List, "INDEXED") ; 
	public static CReservedKeyword INSPECT = new CReservedKeyword(List, "INSPECT") ; 
	public static CReservedKeyword REPLACING = new CReservedKeyword(List, "REPLACING") ; 
	public static CReservedKeyword TALLYING = new CReservedKeyword(List, "TALLYING") ;
	public static CReservedKeyword CONVERTING = new CReservedKeyword(List, "CONVERTING") ; 
	public static CReservedKeyword LEADING = new CReservedKeyword(List, "LEADING") ; 
	public static CReservedKeyword FIRST = new CReservedKeyword(List, "FIRST") ; 
	public static CReservedKeyword DOWN = new CReservedKeyword(List, "DOWN") ;
	
	public static CReservedKeyword CURSOR = new CReservedKeyword(List, "CURSOR") ;  // PJD Isn't there a conflit with SQL and CICS cursors ?
	public static CReservedKeyword TABLE = new CReservedKeyword(List, "TABLE") ;
	public static CReservedKeyword NULL = new CReservedKeyword(List, "NULL") ;
	
	// PJD Added for Monaco
	public static CReservedKeyword I_O_CONTROL = new CReservedKeyword(List, "I-O-CONTROL") ;
	
}
