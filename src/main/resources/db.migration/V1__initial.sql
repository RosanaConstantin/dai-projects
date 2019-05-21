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

CREATE TABLE USERS(
id                BIGINT                 PRIMARY KEY,
 name           CHARACTER VARYING(100) UNIQUE NOT NULL,
username           CHARACTER VARYING(100) UNIQUE NOT NULL,
password           CHARACTER VARYING(100) UNIQUE NOT NULL,
)


INSERT into projects (id, acronym, statusname, programme, title, startdate, enddate, objective, totalcost, maxcontribution,fundingscheme,coordinator, coordinatorcountry,participants,participantsCountry) values(193161, 'MyOcean FO', 'CLOSED', 'H2020-EU.2.1.6', 'INDUSTRIAL LEADERSHIP - Leadership in enabling and industrial technologies – Space', '2014-10-01','2015-05-31', 'The main objective of the MyOcean Follow On project will be to operate a rigorous, robust and sustainable Ocean Monitoring and Forecasting component of the pre-operational Copernicus Marine Service  delivering ocean physical state and ecosystem information to intermediate and downstream users in the areas of marine safety, marine resources, marine and coastal environment and weather, climate and seasonal forecasting.', '6000000', '6000000', '/CSA', 'ERCATOR OCEAN', 'FR', 'INRH', 'MA');