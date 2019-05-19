CREATE TABLE PROJECTS (
  id                BIGINT                 PRIMARY KEY,
  acronym           CHARACTER VARYING(100) UNIQUE NOT NULL,
  statusName        CHARACTER VARYING(100) NOT NULL,
  programme         CHARACTER VARYING(100)                 NOT NULL
  title             CHARACTER VARYING(100)              NOT NULL,
startDate             CHARACTER VARYING(100)              NOT NULL,
endDate             CHARACTER VARYING(100)              NOT NULL,
objective             CHARACTER VARYING(100)              NOT NULL,
totalCost             CHARACTER VARYING(100)              NOT NULL,
maxContribution             CHARACTER VARYING(100)              NOT NULL,
call             CHARACTER VARYING(100)              NOT NULL,
fundingScheme             CHARACTER VARYING(100)              NOT NULL,
coordinator             CHARACTER VARYING(100)              NOT NULL,
coordinatorCountry             CHARACTER VARYING(100)              NOT NULL,
participants             CHARACTER VARYING(100)              NOT NULL,
participantsCountry             CHARACTER VARYING(100)              NOT NULL,
);


