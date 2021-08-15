DROP TABLE IF EXISTS USER_ROLE_DETAIL;
DROP TABLE IF EXISTS COMMENT_ATTACHMENT_DETAIL;
DROP TABLE IF EXISTS ENTRY_ATTACHMENT_DETAIL;
DROP TABLE IF EXISTS CATEGORY;
DROP TABLE IF EXISTS COMMENT;
DROP TABLE IF EXISTS APP_USER;
DROP TABLE IF EXISTS ENTRY;
DROP TABLE IF EXISTS ROLE;
DROP TABLE IF EXISTS COMMENT_H;
DROP TABLE IF EXISTS ENTRY_H;
DROP TABLE IF EXISTS REVINFO;

CREATE TABLE ROLE (
       ROLE_ID VARCHAR(20) NOT NULL
     , DESCRIPTION VARCHAR(40)
     , PRIMARY KEY (ROLE_ID)
);

CREATE TABLE ENTRY (
       ID INT NOT NULL AUTO_INCREMENT
     , SUBJECT VARCHAR(50) NOT NULL
     , BODY VARCHAR(2000) NOT NULL
     , POST_DATE DATETIME NOT NULL
     , CATEGORY_ID VARCHAR(20)
     , SUB_CATEGORY_ID VARCHAR(20)
     , CREATED_BY VARCHAR(20) NOT NULL
     , CREATED_DATE DATETIME NOT NULL
     , LAST_MODIFIED_BY VARCHAR(20) NOT NULL
     , LAST_MODIFIED_DATE DATETIME NOT NULL
     , VERSION INT NOT NULL DEFAULT 0
     , PRIMARY KEY (ID)
);

CREATE TABLE APP_USER (
       USER_ID VARCHAR(20) NOT NULL
     , PASSWORD VARCHAR(20) NOT NULL
     , USER_NAME VARCHAR(40)
     , CREATED_BY VARCHAR(20) NOT NULL
     , CREATED_DATE DATETIME NOT NULL
     , LAST_MODIFIED_BY VARCHAR(20) NOT NULL
     , LAST_MODIFIED_DATE DATETIME NOT NULL
     , PRIMARY KEY (USER_ID)
);

CREATE TABLE COMMENT (
       ID INT NOT NULL AUTO_INCREMENT
     , SUBJECT VARCHAR(50) NOT NULL
     , BODY VARCHAR(2000) NOT NULL
     , POST_DATE DATETIME NOT NULL
     , ENTRY_ID INT NOT NULL
     , REPLY_TO VARCHAR(20)
     , POST_BY VARCHAR(20)
     , CREATED_BY VARCHAR(20) NOT NULL
     , CREATED_DATE DATETIME NOT NULL
     , LAST_MODIFIED_BY VARCHAR(20) NOT NULL
     , LAST_MODIFIED_DATE DATETIME NOT NULL
     , VERSION INT NOT NULL DEFAULT 0
     , PRIMARY KEY (ID)
     , CONSTRAINT FK_COMMENT_1 FOREIGN KEY (ENTRY_ID)
                  REFERENCES ENTRY (ID) ON DELETE CASCADE
);

CREATE TABLE CATEGORY (
       CATEGORY_ID VARCHAR(20) NOT NULL
     , PARENT_CATEGORY_ID VARCHAR(20)
     , PRIMARY KEY (CATEGORY_ID)
     , CONSTRAINT FK_CATEGORY_1 FOREIGN KEY (PARENT_CATEGORY_ID)
                  REFERENCES CATEGORY (CATEGORY_ID) ON DELETE CASCADE
);

CREATE TABLE ENTRY_ATTACHMENT_DETAIL (
       ID INT NOT NULL AUTO_INCREMENT
     , ENTRY_ID INT NOT NULL
     , FILE_NAME VARCHAR(255) NOT NULL
     , CONTENT_TYPE VARCHAR(50) NOT NULL
     , FILE_DATA BLOB
     , PRIMARY KEY (ID)
     , CONSTRAINT FK_ENTRY_ATTACHMENT_DETAIL_1 FOREIGN KEY (ENTRY_ID)
                  REFERENCES ENTRY (ID) ON DELETE CASCADE
);

CREATE TABLE COMMENT_ATTACHMENT_DETAIL (
       ID INT NOT NULL AUTO_INCREMENT
     , COMMENT_ID INT NOT NULL
     , FILE_NAME VARCHAR(255) NOT NULL
     , CONTENT_TYPE VARCHAR(50) NOT NULL
     , FILE_DATA BLOB
     , PRIMARY KEY (ID)
     , CONSTRAINT FK_COMMENT_ATTACHMENT_DETAIL_1 FOREIGN KEY (COMMENT_ID)
                  REFERENCES COMMENT (ID) ON DELETE CASCADE
);

CREATE TABLE USER_ROLE_DETAIL (
       USER_ID VARCHAR(20) NOT NULL
     , ROLE_ID VARCHAR(20) NOT NULL
     , PRIMARY KEY (USER_ID, ROLE_ID)
     , CONSTRAINT FK_USER_ROLE_DETAIL_1 FOREIGN KEY (USER_ID)
                  REFERENCES APP_USER (USER_ID)
     , CONSTRAINT FK_USER_ROLE_DETAIL_2 FOREIGN KEY (ROLE_ID)
                  REFERENCES ROLE (ROLE_ID)
);

CREATE TABLE ENTRY_H (
       ID INT NOT NULL
     , SUBJECT VARCHAR(50) NOT NULL
     , BODY VARCHAR(2000) NOT NULL
     , POST_DATE DATETIME NOT NULL
     , CATEGORY_ID VARCHAR(20)
     , SUB_CATEGORY_ID VARCHAR(20)
     , CREATED_BY VARCHAR(20) NOT NULL
     , CREATED_DATE DATETIME NOT NULL
     , LAST_MODIFIED_BY VARCHAR(20) NOT NULL
     , LAST_MODIFIED_DATE DATETIME NOT NULL
     , VERSION INT NOT NULL DEFAULT 0
	 , AUDIT_REVISION INT NOT NULL
	 , ACTION_TYPE INT
	 , AUDIT_REVISION_END INT
	 , AUDIT_REVISION_END_TS TIMESTAMP    
     , PRIMARY KEY (ID, AUDIT_REVISION)
);

CREATE TABLE COMMENT_H (
       ID INT NOT NULL
     , SUBJECT VARCHAR(50) NOT NULL
     , BODY VARCHAR(2000) NOT NULL
     , POST_DATE DATETIME NOT NULL
     , ENTRY_ID INT NOT NULL
     , REPLY_TO VARCHAR(20)
     , POST_BY VARCHAR(20)
     , CREATED_BY VARCHAR(20) NOT NULL
     , CREATED_DATE DATETIME NOT NULL
     , LAST_MODIFIED_BY VARCHAR(20) NOT NULL
     , LAST_MODIFIED_DATE DATETIME NOT NULL
     , VERSION INT NOT NULL DEFAULT 0
     , AUDIT_REVISION INT NOT NULL
     , ACTION_TYPE INT
     , AUDIT_REVISION_END INT
     , AUDIT_REVISION_END_TS TIMESTAMP     
     , PRIMARY KEY (ID, AUDIT_REVISION)
);

CREATE TABLE REVINFO (
       REVTSTMP BIGINT NOT NULL
     , REV INT NOT NULL AUTO_INCREMENT
     , PRIMARY KEY (REV)
);